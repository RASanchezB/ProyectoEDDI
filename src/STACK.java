import java.util.ArrayList;
public class STACK {
    private ArrayList<Nodo> Algo = new ArrayList();
    private int size;
    private int Cap;
    public STACK(ArrayList<Nodo> Algo, int size, int Cap) {
        this.Algo = Algo;
        this.size = size;
        this.Cap = Cap;
    }
    public STACK() {
    }
    public void Clear(int Cap){
        Algo = new ArrayList();
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public boolean push(Nodo data){
        if (size<Cap){
            Algo.add(data);
            size--;
            return true;
        }else{
            return false;
        }
    }
    public Nodo pop(){//cambiar el void por data    
        if(Algo.size()> 0){
            Nodo temp = Algo.get(0);
            Algo.remove(0);
            return temp;
        }else{
            return null;
        }
    }
    public Nodo top(){//cambiar el void por data
        if(size>0){
            return Algo.get(0);
        }else{
            return null;
        }
    }
    public void print(){
        
    }
    public ArrayList<Nodo> getArry(){
        return Algo;
    }
    public void SetArry(ArrayList<Nodo> temp){
        Algo = temp;
    }
}   
    

