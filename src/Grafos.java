
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.graphstream.ui.view.Viewer;
import org.graphstream.graph.implementations.*;
import org.graphstream.graph.Node;
import org.graphstream.graph.Graph;
import org.graphstream.graph.Edge;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Grafos {

    public Graph G = new SingleGraph("Grafo");
    public double[][] Lados;
    public static Random random=new Random();
    public static Scanner sc = new Scanner(System.in);
    String line;

    public Grafos() {
    }

    public Graph getG() {
        return G;
    }

    public void setG(Graph G) {
        this.G = G;
    }

    public double[][] getLados() {

        return Lados;
    }

    public void setLados(double[][] Lados) {
        this.Lados = Lados;
    }

    //Metodos de gran importancia
    public double[][] Adyacentes(int Movimiento) {
        ArrayList<String> ID = new ArrayList();
        double[][] R = new double[G.getNodeCount()][G.getNodeCount()];
        for (int i = 0; i < R.length; i++) {
            for (int j = 0; j < R.length; j++) {
                R[i][j] = 0.00;
            }
        }
        for (int i = 0; i < G.getNodeCount(); i++) {
            ID.add(G.getNode(i).getId());
        }
        int X = 0;
        int Y = 0;
        for (Node node : G) {
            Iterator<? extends Edge> E = node.getLeavingEdgeIterator();
            while (E.hasNext()) {
                Edge aristas = E.next();
                Node origen = aristas.getSourceNode();
                Node destino = aristas.getTargetNode();
                if (Movimiento == 4) {
                    Y = ID.indexOf(destino.getId());
                    R[X][Y] = aristas.getNumber("Valor");
                } else if (Movimiento == 3) {
                    if ((node.getId().equals(origen.getId()))) {
                        Y = ID.indexOf(destino.getId());
                        R[X][Y] = aristas.getNumber("Valor");
                    } else if ((node.getId().equals(destino.getId()))) {
                        Y = ID.indexOf(origen.getId());
                        R[X][Y] = aristas.getNumber("Valor");
                    }
                }
            }
            X++;
        }
        Lados = R;
        return R;
    }

    public int Distancia(int[] D, boolean[] YaVisitados) {
        int Menor = 99999;
        int Menor2 = 0;
        for (int i = 0; i < G.getNodeCount(); i++) {
            if (YaVisitados[i] == false) {
                if (D[i] <= Menor) {
                    Menor = D[i];
                    Menor2 = i;
                }
            }
        }
        return Menor2;
    }

    public Viewer Demostrar() {
        if (G.hasAttribute("ui.quality")) {
            G.clearAttributes();
        }
        G.addAttribute("ui.quality");
        G.addAttribute("ui.antialias");
        G.addAttribute("ui.stylesheet",
                "edge { fill-color: grey;}");
        for (Node node : G) {
            node.setAttribute("ui.label", node.getId());
            node.addAttribute("ui.size", 10);
        }
        for (Edge edge : G.getEachEdge()) {
            edge.setAttribute("ui.label", edge.getNumber("Weight"));
        }
        return G.display();
    }

    public void duro() {
        //"0,1,5,3/1,0,2,0/5,2,0,4/3,0,4,0/"

        G.clear();
        int cont = 0;
        //String line = "0,1,3,0,4/1,0,2,7,8/3,2,0,5,0/0,7,5,0,0/4,8,0,0,0/";
        line="0,1,5,3/1,0,2,0/5,2,0,4/3,0,4,0/";
        boolean creado = false;
        double weight;
        int fila = 0, arista = 0;
        String[] auxiliar;
        auxiliar = line.split("/");
        for (int i = 0; i < auxiliar.length; i++) {
            int alpha = i + 1;
            G.addNode(alpha + "");
        }
        do {
            String o = (fila + 1) + "";
            String numeros = auxiliar[cont];
            numeros = numeros.replaceAll(",", "");
            //auxiliar = line.split(",");
            if (creado == false) {
                creado = true;
                Lados = new double[auxiliar.length][auxiliar.length];
            }
            for (int i = 0; i < auxiliar.length; i++) {
                weight = numeros.charAt(i) - 48;
                if (i != fila) {
                    Lados[fila][i] = (numeros.charAt(i)) - 48;
                    if (weight != 0) {
                        String d = (i + 1) + "";
                        String id = o + i;
                        G.addEdge(id, o, d, true);
                        G.getEdge(id).addAttribute("Weight", weight);
                    }
                } else {
                    Lados[fila][i] = 0;
                }
            }
            fila++;
            cont++;
        } while ((cont != auxiliar.length));
    }
    
    public void random(){
        int azar=0+random.nextInt(2);
        if (azar==0) {
            line="0,1,5,3/1,0,2,0/5,2,0,4/3,0,4,0/";
        }else if (azar==1) {
            line="0,1,2,3/1,0,3,0/4,1,0,3/4,0,2,0/";
        } else{
            line = "0,1,3,0,4/1,0,2,7,8/3,2,0,5,0/0,7,5,0,0/4,8,0,0,0/";
        }
    }
}
