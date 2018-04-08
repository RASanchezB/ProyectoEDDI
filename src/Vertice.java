
import java.awt.Color;

public class Vertice {
    private Color color;
    private int Pos;
    private Vertice vecino;

    public Vertice() {
    }

    public Vertice(Color color, int Pos, Vertice vecino) {
        this.color = color;
        this.Pos = Pos;
        this.vecino = vecino;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getPos() {
        return Pos;
    }

    public void setPos(int Pos) {
        this.Pos = Pos;
    }

    public Vertice getVecino() {
        return vecino;
    }

    public void setVecino(Vertice vecino) {
        this.vecino = vecino;
    }
    
}
