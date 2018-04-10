/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dam_9
 */
public class Floyd extends Grafos {

    public double[][] trayecto;
    public double[][] Distance;

    public Floyd() {
    }

    public void Start() {
        if (G.getNodeCount() > 0) {
            for (int i = 0; i < G.getNodeCount(); i++) {
                for (int j = 0; j < G.getNodeCount(); j++) {
                    for (int k = 0; k < G.getNodeCount(); k++) {
                        double aux = Distance[i][k] + Distance[k][j];
                        if (aux < Distance[i][j]) {
                            Distance[i][j] = aux;
                            trayecto[i][j] = k;
                        }
                    }
                }
            }
        }
    }

    public void End() {
        
        this.Distance = super.Lados.clone();
        //camino new
        trayecto = new double[Distance.length][Distance.length];
        for (int i = 0; i < Distance.length; i++) {
            for (int j = 0; j < Distance.length; j++) {
                if (j != i) {
                    if (Distance[i][j] == 0) {
                        Distance[i][j] = Double.POSITIVE_INFINITY;
                    }
                    trayecto[i][j] = j;
                } else {
                    trayecto[i][j] = 0;
                }
            }
        }
    }

    public String MatrizFloyd() {
        String matriz = null;
        for (int i = 0; i < G.getNodeCount(); i++) {
            for (int j = 0; j < G.getNodeCount(); j++) {
                if (i == 0 && j == 0) {
                    matriz += "{ }";
                } else if (i == 0) {
                    matriz += "  " + j + "  ";
                } else if (j == 0) {
                    matriz += "  " + i + "  ";
                } else {
                    matriz+=" "+Lados[i-1][j-1]+" ";
                }
            }
            matriz+='\n';
        }
        return matriz;
    }
    public String MatrizFloyd(double[][] matriz) {
        String retorno = "";
        for (int i = 0; i < G.getNodeCount() + 1; i++) {
            for (int j = 0; j < G.getNodeCount() + 1; j++) {
                if (i == 0 && j == 0) {
                    retorno += "{ }";
                } else if (i == 0) {
                    retorno += "  " + j + "  ";
                } else if (j == 0) {
                    retorno += " " + i + " ";
                } else if (matriz[i - 1][j - 1] == Double.POSITIVE_INFINITY) {
                    retorno += " +∞ ";
                } else {
                    retorno += " " + matriz[i - 1][j - 1] + " ";
                }
            }
            retorno += '\n';

        }
        return retorno;
    }
    
}
