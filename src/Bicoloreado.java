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
    public int Precursor(int O){
        boolean color = false;
        if(O>=0 && O<G.getNodeCount()){
            Proceso(G.getNode(O));
            color = Colorear();
            if(color){
                JOptionPane.showMessageDialog(null,"Este grafo se puede colorear");
              
            }else{
                JOptionPane.showMessageDialog(null, "No logro ser coloreable");
            }
        }
    }
}
