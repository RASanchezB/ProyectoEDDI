import javax.swing.JOptionPane;
import java.util.ArrayList;
import org.graphstream.graph.Node;
import org.graphstream.ui.view.Viewer;
public class Bicoloreado  extends Grafos{
    int Color = 0;

    public Bicoloreado(){
    }
    public ArrayList<Node> Conectados(Node O){
        int X = -1;
        ArrayList<Node> conectado = new ArrayList();
        for (int i = 0; i < G.getNodeCount(); i++) {
            if((G.getNode(i)).equals(O)){
                X = i;
            }
        }
        if(X != -1){
            for (int i = 0; i < Lados[X].length; i++){
                if(Lados[X][i] != 0){
                    if(Lados[X][i] != Double.POSITIVE_INFINITY){
                        conectado.add(G.getNode(i));
                    }
                }
            }
        }
        return conectado;
    }
    public String getC(){
        int pos = -1;
        ArrayList<Node> temp;
        String R = "";
        for (int i = 0; i < G.getNodeCount(); i++) {
            Node n = G.getNode(i);
            temp = Conectados(n);
            pos = i+1;
            R+= pos + "." + n.getId() + "/" + temp.toString();
            R+="\n";
        }
        return R;
    }
    public void predecesor(){
        for (Node n : G) {
            n.addAttribute("Visto", false);
            G.addAttribute("ui.quality");
            G.addAttribute("ui.antialias");
            G.addAttribute("ui.stylesheet","node{fill-color:grey}");
        }
    }
    public void Proceso(Node O){
        boolean b = false;
        if(Color == 1){
            O.setAttribute("ui.style","fill-color: rgb(50,205,50);");
            Color = 2;
        }else{
            O.setAttribute("ui.style","fill-color: rgb(75,0,130);");
            Color = 1;
        }
        ArrayList<Node> V = Conectados(O);
        O.setAttribute("Visto", true);
        for (Node node : V) {
            b = (boolean)node.getAttribute("Visto");
            if(node != null && b == false){
                Proceso(node);
            }
        }
    }
    public boolean Colorear(){
        boolean colorear = true;
        for (Node node : G) {
            ArrayList<Node> N = Conectados(node);
            for (Node node1 : N) {
                if(node.getAttribute("ui.style")==node1.getArray("ui.style")){
                    colorear = false;
                }
            }
        }
        return colorear;
    }
    public int Precursor(int O){
        boolean color = false;
        if(O>=0 && O<G.getNodeCount()){
            Proceso(G.getNode(O));
            color = Colorear();
            if(color){
                JOptionPane.showMessageDialog(null,"Este grafo se puede colorear");
                Viewer D = Demostrar();
                D.setCloseFramePolicy(Viewer.CloseFramePolicy.HIDE_ONLY);
                return 1;
            }else{
                JOptionPane.showMessageDialog(null, "No logro ser coloreable");
                Viewer D = Demostrar();
                D.setCloseFramePolicy(Viewer.CloseFramePolicy.HIDE_ONLY);
                return 2;
            }
        }else{
            System.out.println("No fue posible");
            return 3;
        }
    }
    public void Limpiar(){
        Color = 1;
        for (Node node : G) {
            node.setAttribute("Visto", false);
            node.setAttribute("ui.style", "fill-color: grey;");
        }
    }
}
