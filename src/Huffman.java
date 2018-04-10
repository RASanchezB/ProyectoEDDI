
import java.util.ArrayList;

public class Huffman {

    static Node node;
    static Node newRoot;
    static String CodigoFinal = "";
    String mensaje;

    public Huffman(String mensaje) {
        this.mensaje = mensaje;
    }

    public Huffman() {
    }

    public String compresion() {
        char[] menChar = mensaje.toCharArray();
        ArrayList<Character> caracteres = new ArrayList<Character>();
        for (int i = 0; i < menChar.length; i++) {
            if (!(caracteres.contains(menChar[i]))) {
                caracteres.add(menChar[i]);
            }
        }
        System.out.println(caracteres);
        int[] cuentaCar = new int[caracteres.size()];
        for (int i = 0; i < cuentaCar.length; i++) {
            cuentaCar[i] = 0;
        }
        //contar los caracteres
        for (int i = 0; i < caracteres.size(); i++) {
            char revisar = caracteres.get(i);
            for (int j = 0; j < menChar.length; j++) {
                if (revisar == menChar[j]) {
                    cuentaCar[i]++;
                }
            }
        }
        //en orden decendiente
        for (int i = 0; i < cuentaCar.length - 1; i++) {
            for (int j = 0; j < cuentaCar.length - 1; j++) {
                if (cuentaCar[j] < cuentaCar[j + 1]) {
                    int temp = cuentaCar[j];
                    cuentaCar[j] = cuentaCar[j + 1];
                    cuentaCar[j + 1] = temp;

                    char temporal = caracteres.get(j);
                    caracteres.set(j, caracteres.get(j + 1));
                    caracteres.set(j + 1, temporal);
                }
            }
        }
        for (int x = 0; x < cuentaCar.length; x++) {
            System.out.println(caracteres.get(x) + " - " + cuentaCar[x]);
        }
        //armar el arbol
        Node root = null;
        Node current = null;
        Node end = null;

        for (int i = 0; i < cuentaCar.length; i++) {
            Node node = new Node(caracteres.get(i).toString(), cuentaCar[i]);
            if (root == null) {
                root = node;
                end = node;
            } else {
                current = root;
                while (current.linker != null) {
                    current = current.linker;
                }
                current.linker = node;
                current.linker.linkerBack = current;
                end = node;
            }
        }
        //recursiva
        ArbolMaker(root, end);

        //orden
        inOrden(node);

        //
        preOrden(node);

        char[] mensajeArreglo = mensaje.toCharArray();
        char check;

        for (int i = 0; i < mensajeArreglo.length; i++) {
            current = node;
            check = mensajeArreglo[i];
            String code = "";
            while (true) {
                if (current.izquierda.value.toCharArray()[0] == check) {
                    code += "0";
                    break;
                } else {
                    code += "1";
                    if (current.derecha != null) {
                        if (current.derecha.value.toCharArray()[0] == caracteres.get(cuentaCar.length - 1)) {
                            break;
                        }
                        current = current.derecha;
                    } else {
                        break;
                    }
                }
            }
            CodigoFinal += code;
        }
        System.out.println("codigofinal:" + CodigoFinal);
        return CodigoFinal;

    }

    public static void preOrden(Node root) {

        if (root != null) {
            System.out.print(root.value + "->");
            preOrden(root.izquierda);
            preOrden(root.derecha);

        }

    }

    public static void inOrden(Node root) {

        if (root != null) {
            System.out.print(root.value + "->");
            inOrden(root.izquierda);
            inOrden(root.derecha);
        }

    }

    public static void ArbolMaker(Node root, Node end) {
        node = new Node(end.linkerBack.value + end.value, end.linkerBack.count + end.count);
        node.izquierda = end.linkerBack;
        node.derecha = end;
        end.linkerBack.linkerBack.linker = node;
        node.linkerBack = end.linkerBack.linkerBack;
        end = node;
        end.linker = null;
        Node current = root;

        while (current.linker != null) {
            current = current.linker;
        }

        if (root.linker == end) {
            node = new Node(root.value + end.value, root.count + end.count);
            node.izquierda = root;
            node.derecha = end;
            node.linker = null;
            node.linkerBack = null;
            newRoot = node;
        } else {
            ArbolMaker(root, end);
        }
    }
}
