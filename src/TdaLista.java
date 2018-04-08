
import java.lang.reflect.Array;
import java.util.ArrayList;

public class TdaLista {
    private ArrayList<Letras> lista = new ArrayList();
    private int AvailPos;
    private int Size;

    public boolean insert(int pos, Letras data){
        if(pos>=1){
            if(pos==AvailPos){
                lista.add(data);
                AvailPos++;
            }else{
                lista.add(pos,data);
            }
        }
        return true;
    }
    public Letras get(int pos){
        if(pos>=1 && pos<=AvailPos){
            return lista.get(pos);
        }else{
            return null;
        }
    }
    public boolean delete(int pos){
        if(pos>=1 && pos<=AvailPos){
            lista.remove(pos);
        }
        return true;
    }
    public Letras first(){
        return lista.get(0);
    }
    public int find(Letras data){
        int aqui = -1;
        for (int i = 0; i < lista.size(); i++) {
            if(lista.get(i).equals(data))
                aqui = i;
        }
        return aqui;
    }
    public void clear(){
        lista = new ArrayList();
    }
    public void print(){
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(i+") "+lista.get(i));
        }
    }
}
