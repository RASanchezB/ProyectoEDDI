import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class ArchivoComprimido {
    
    
    public void escribir(String titulo){
        FileWriter w = null;
        File archivo = null;
        BufferedWriter bw = null;
        try {
            archivo = new File("./"+titulo+".txt");
            w = new FileWriter(archivo,true);
            bw = new BufferedWriter(w);
            String i,n,e, c ="s";
            while(c.equalsIgnoreCase("s")){
            i = JOptionPane.showInputDialog("Ingrese el ID");
            n = JOptionPane.showInputDialog("Ingrese el nombre");
            e = JOptionPane.showInputDialog("Ingrese el edad");
            bw.write(i +"," + n + "," + e + ";");
            bw.newLine();
            bw.flush();
            c = JOptionPane.showInputDialog("Continue?");
            }
            
            bw.close();
            w.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
