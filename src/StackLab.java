
import java.util.ArrayList;

public class StackLab {
    private ArrayList<NodoLab> lista = new ArrayList();
    private int Size;

    public StackLab() {
        Size = lista.size();
    }
    
    public boolean push(NodoLab nod){
        lista.add(0,nod);
        return true;
    }
    
    public NodoLab top(){
        if(lista.size()>0){
            return lista.get(lista.size()-1);
        }else{
            return null;
        }
    }
    public NodoLab pop(){
        if(lista.size()> 0){
            NodoLab temp = lista.get(0);
            lista.remove(0);
            return temp;
        }else{
            return null;
        }
    }
    public void clear(){
        lista = new ArrayList();
    }
    public boolean IsEmpty(){
        return lista.isEmpty();
    }
}
