public class STACK {
    private Nodo[] Algo;
    private int size;
    private int Cap;

    public STACK(Nodo[] Algo, int size, int Cap) {
        this.Algo = Algo;
        this.size = size;
        this.Cap = Cap;
    }
    public STACK() {
    }
    public void Clear(int Cap){
        Algo = new Nodo[Cap];
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public boolean push(Nodo data){
        if (size<Cap){
            Algo[size] = data;
            size--;
            return true;
        }else{
            return false;
        }
    }
    public Nodo pop(){//cambiar el void por data    
        if(size>0){
            size--;
            Nodo temp = Algo[size];
            Algo[size] = null;
            return temp;
        }else{
            return null;
        }
    }
    public Nodo top(){//cambiar el void por data
        if(size>0){
            return Algo[size -1];
        }else{
            return null;
        }
    }
    public void print(){
        for (int i = 0; i < size; i++) {
            System.out.println(i+") "+Algo[i]);
        }
    }
}   
    

