import org.graphstream.ui.view.Viewer;
import org.graphstream.graph.implementations.*;
import org.graphstream.graph.Node;
import org.graphstream.graph.Graph;
import org.graphstream.graph.Edge;
import java.util.Iterator;
import java.util.ArrayList;
public class Grafos {
    public Graph G = new SingleGraph("Grafo");
    public double[][] Lados;
    
    public Grafos(){}
    public Graph getG() {
        return G;
    }
    public void setG(Graph G) {
        this.G = G;
    }
    public double[][] getLados() {
        
        return Lados;
    }
    public void setLados(double[][] Lados) {
        this.Lados = Lados;
    }
    //Metodos de gran importancia
    public double[][] Adyacentes(int Movimiento){
        ArrayList<String> ID = new ArrayList();
        double[][] R = new double[G.getNodeCount()][G.getNodeCount()];
        for (int i = 0; i < R.length; i++) {
            for (int j = 0; j < R.length; j++) {
                R[i][j] = 0.00;
            }
        }
        for (int i = 0; i < G.getNodeCount(); i++) {
            ID.add(G.getNode(i).getId());
        }
        int X = 0;
        int Y= 0;
        for (Node node : G) {
            Iterator<? extends Edge> E = node.getLeavingEdgeIterator();
            while(E.hasNext()){
                Edge aristas = E.next();
                Node origen = aristas.getSourceNode();
                Node destino = aristas.getTargetNode();
                if(Movimiento == 4){
                    Y = ID.indexOf(destino.getId());
                    R[X][Y] = aristas.getNumber("Valor");
                }
                else if(Movimiento == 3){
                    if((node.getId().equals(origen.getId()))){
                        Y = ID.indexOf(destino.getId());
                        R[X][Y] = aristas.getNumber("Valor");
                    }else if ((node.getId().equals(destino.getId()))) {
                        Y = ID.indexOf(origen.getId());
                        R[X][Y] = aristas.getNumber("Valor");
                    }
                }
            }
            X++;
        }
        Lados=R;
        return R;
    }
    public int Distancia(int[] D, boolean[] YaVisitados){
        int Menor = 99999;
        int Menor2 = 0;
        for (int i = 0; i < G.getNodeCount(); i++) {
            if(YaVisitados[i] == false){
                if(D[i]<=Menor){
                    Menor = D[i];
                    Menor2 = i;
                }
            }
        }
        return Menor2;
    }
    public Viewer Demostrar(){
        if(G.hasAttribute("ui.quality")){
            G.clearAttributes();
        }
        G.addAttribute("ui.quality");
        G.addAttribute("ui.antialias");
        G.addAttribute("ui.stylesheet",
                "edge { fill-color: grey;}");
        for (Node node : G) {
            node.setAttribute("ui.label", node.getId());
            node.addAttribute("ui.size",10);
        }
        for (Edge edge : G.getEachEdge()) {
            edge.setAttribute("ui.label", edge.getNumber("Valor"));
        }
        return G.display();
    }
    
}
