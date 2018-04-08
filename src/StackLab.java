
import java.util.ArrayList;

public class StackLab {
    private ArrayList<NodoLab> lista = new ArrayList();
    private int PosX;
    private int PosY;

    public StackLab() {
    }
    public StackLab(int PosX, int PosY) {
        this.PosX = PosX;
        this.PosY = PosY;
    }
    public boolean push(NodoLab nod){
        if(lista.get(0)==null){
            lista.add(new NodoLab(PosX,PosY));
        } else{
            NodoLab data = (new NodoLab(PosX,PosY));
            lista.add(0, data);
        }
        return true;
    }
}
