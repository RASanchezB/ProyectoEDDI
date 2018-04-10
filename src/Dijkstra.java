/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dam_9
 */
public class Dijkstra extends Grafos {

   

    public int[] Disstrack() {
        int origen = 2 - 1;
        int[] distance = new int[G.getNodeCount()];
        boolean[] visited = new boolean[G.getNodeCount()];
        distance = distance();
        visited = Visited();
        if (origen < Lados.length && origen >= 0) {
            distance[origen] = 0;
            for (int i = 0; i < G.getNodeCount() - 1; i++) {
                int menor = minimo(distance, visited);
                visited[menor] = true;
                for (int j = 0; j < G.getNodeCount(); j++) {
                    if (!visited[j] && Lados[menor][j] > 0) {
                        if (distance[menor] != ((int) Double.POSITIVE_INFINITY)) {
                            if (distance[menor] + Lados[menor][j] < distance[j]) {
                                distance[j] = distance[menor] + (int) Lados[menor][j];
                            }
                        }
                    }
                }
            }
            return distance;
        } else {
            System.out.println("ERROR");
        }
        return null;
    }

    public int[] distance() {
        int[] x = new int[G.getNodeCount()];
        for (int i = 0; i < G.getNodeCount(); i++) {
            x[i] = (int) Double.POSITIVE_INFINITY;;
        }
        return x;
    }

    public boolean[] Visited() {
        boolean[] x = new boolean[G.getNodeCount()];
        for (int i = 0; i < G.getNodeCount(); i++) {
            x[i] = false;
        }
        return x;
    }
     public int minimo(int[] distance, boolean[] visited) {
        int min = (int) Double.POSITIVE_INFINITY;
        int min_index = 0;
        for (int i = 0; i < G.getNodeCount(); i++) {
            if (visited[i] == false && distance[i] <= min) {
                min = distance[i];
                min_index = i;
            }
        }
        return min_index;
    }
     
     public String MatrizDis() {
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
    public String MatrizDis(int[] distancias) {
        String retorno = "";
        if (distancias != null) {
            for (int i = 0; i < distancias.length; i++) {
                if(distancias[i]==(int)Double.POSITIVE_INFINITY){
                    retorno += " +∞ ";
                }else{
                    retorno += " " + distancias[i] + " ";
                }
            }
        }
        return retorno;
    }
}
