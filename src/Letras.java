public class Letras {
    private char letra;
    private int frequencia;

    public Letras() {
    }
    public Letras(char letra, int frequencia) {
        this.letra = letra;
        this.frequencia = frequencia;
    }
    public char getLetra() {
        return letra;
    }
    public void setLetra(char letra) {
        this.letra = letra;
    }
    public int getFrequencia() {
        return frequencia;
    }
    public void setFrequencia(int frequencia) {
        this.frequencia = frequencia;
    }
    
}
