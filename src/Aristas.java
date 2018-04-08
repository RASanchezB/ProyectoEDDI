public class Aristas {
    private char origen;
    private char destino;
    private int peso;

    public Aristas() {
    }

    public Aristas(char origen, char destino, int peso) {
        this.origen = origen;
        this.destino = destino;
        this.peso = peso;
    }

    
    public char getOrigen() {
        return origen;
    }

    public void setOrigen(char origen) {
        this.origen = origen;
    }

    public char getDestino() {
        return destino;
    }

    public void setDestino(char destino) {
        this.destino = destino;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
}
