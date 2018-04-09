import java.util.ArrayList;
public class Nodo {
    int NumNodo;
    private ArrayList<Aristas> aristas = new ArrayList();
    
    public Nodo() {
    }
    public Nodo(int NumNodo) {
        this.NumNodo = NumNodo;
    }
    public Nodo(int NumNodo, ArrayList<Aristas> aristas){
        this.NumNodo = NumNodo;
        this.aristas = aristas;
    }
    public ArrayList<Aristas> getAristas() {
        return aristas;
    }
    public void setAristas(ArrayList<Aristas> aristas) {
        this.aristas = aristas;
    }
    public int getNumNodo() {
        return NumNodo;
    }
    public void setNumNodo(int NumNodo) {
        this.NumNodo = NumNodo;
    }
    
}
