
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.MutableTreeNode;
import org.graphstream.graph.*;
import org.graphstream.graph.implementations.*;
import org.graphstream.ui.view.Viewer;

public class Main extends javax.swing.JFrame {

    Node<String> Root = null;
    int cont = 0;

    public Main() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Menu = new javax.swing.JPopupMenu();
        jm_hijo = new javax.swing.JMenuItem();
        JD_Arboles = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Arbol = new javax.swing.JTree();
        boton_jefe = new javax.swing.JButton();
        jb_Actualizar = new javax.swing.JButton();
        JD_Calculadora = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jt_pantalla = new javax.swing.JTextField();
        jb_7 = new javax.swing.JButton();
        jb_8 = new javax.swing.JButton();
        jb_9 = new javax.swing.JButton();
        jb_DEL = new javax.swing.JButton();
        jb_AC = new javax.swing.JButton();
        jb_4 = new javax.swing.JButton();
        jb_5 = new javax.swing.JButton();
        jb_6 = new javax.swing.JButton();
        jb_x = new javax.swing.JButton();
        jb_division = new javax.swing.JButton();
        jb_1 = new javax.swing.JButton();
        jb_2 = new javax.swing.JButton();
        jb_3 = new javax.swing.JButton();
        jb_suma = new javax.swing.JButton();
        jb_resta = new javax.swing.JButton();
        jb_0 = new javax.swing.JButton();
        jb_total = new javax.swing.JButton();
        JD_Compresion = new javax.swing.JDialog();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TA_Buscado = new javax.swing.JTextArea();
        jt_direccion = new javax.swing.JTextField();
        bt_BuscarArchivo = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        TA_Binario = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        JD_GrafoBipartido = new javax.swing.JDialog();
        JD_Laberinto = new javax.swing.JDialog();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TA_L = new javax.swing.JTextArea();
        jButton13 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        JD_Calculo = new javax.swing.JDialog();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jTextField4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        Creacion_Grafos = new javax.swing.JDialog();
        jPanel11 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton14 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        TF_IdNodo = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        JL_LNodo1 = new javax.swing.JList<>();
        jScrollPane6 = new javax.swing.JScrollPane();
        JL_LNodo2 = new javax.swing.JList<>();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        JD_MenorCostoOrigenes = new javax.swing.JDialog();
        jPanel12 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        bt_AgregarNodo = new javax.swing.JButton();
        jScrollPane9 = new javax.swing.JScrollPane();
        ta_Matriz = new javax.swing.JTextArea();
        jScrollPane10 = new javax.swing.JScrollPane();
        ta_rutas = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        bt_CalcularRutasMasCortas = new javax.swing.JButton();
        bt_EnseñarMatriz = new javax.swing.JButton();
        JD_Dijkstra = new javax.swing.JDialog();
        jPanel13 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        bt_AgregarNodo1 = new javax.swing.JButton();
        jScrollPane11 = new javax.swing.JScrollPane();
        ta_Matriz1 = new javax.swing.JTextArea();
        jScrollPane12 = new javax.swing.JScrollPane();
        ta_rutas1 = new javax.swing.JTextArea();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        bt_CalcularRutasMasCortas1 = new javax.swing.JButton();
        bt_EnseñarMatriz1 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();

        jm_hijo.setText("AñadirHijo");
        jm_hijo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jm_hijoMouseClicked(evt);
            }
        });
        jm_hijo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jm_hijoActionPerformed(evt);
            }
        });
        Menu.add(jm_hijo);

        jPanel2.setToolTipText("Arbol");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("root");
        Arbol.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        Arbol.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ArbolMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Arbol);

        boton_jefe.setText("Añadir Jefe Principal");
        boton_jefe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_jefeMouseClicked(evt);
            }
        });

        jb_Actualizar.setText("Actualizar");
        jb_Actualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_ActualizarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(boton_jefe, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                    .addComponent(jb_Actualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(boton_jefe, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97)
                .addComponent(jb_Actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout JD_ArbolesLayout = new javax.swing.GroupLayout(JD_Arboles.getContentPane());
        JD_Arboles.getContentPane().setLayout(JD_ArbolesLayout);
        JD_ArbolesLayout.setHorizontalGroup(
            JD_ArbolesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 743, Short.MAX_VALUE)
            .addGroup(JD_ArbolesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JD_ArbolesLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        JD_ArbolesLayout.setVerticalGroup(
            JD_ArbolesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 404, Short.MAX_VALUE)
            .addGroup(JD_ArbolesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(JD_ArbolesLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 422, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 323, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jt_pantalla.setEditable(false);

        jb_7.setText("7");
        jb_7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_7MouseClicked(evt);
            }
        });

        jb_8.setText("8");
        jb_8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_8MouseClicked(evt);
            }
        });

        jb_9.setText("9");
        jb_9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_9MouseClicked(evt);
            }
        });

        jb_DEL.setText("DEL");
        jb_DEL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_DELMouseClicked(evt);
            }
        });
        jb_DEL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_DELActionPerformed(evt);
            }
        });

        jb_AC.setText("AC");
        jb_AC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_ACMouseClicked(evt);
            }
        });

        jb_4.setText("4");
        jb_4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_4MouseClicked(evt);
            }
        });

        jb_5.setText("5");
        jb_5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_5MouseClicked(evt);
            }
        });

        jb_6.setText("6");
        jb_6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_6MouseClicked(evt);
            }
        });

        jb_x.setText("x");
        jb_x.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_xMouseClicked(evt);
            }
        });

        jb_division.setText("/");
        jb_division.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_divisionMouseClicked(evt);
            }
        });

        jb_1.setText("1");
        jb_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_1MouseClicked(evt);
            }
        });

        jb_2.setText("2");
        jb_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_2MouseClicked(evt);
            }
        });

        jb_3.setText("3");
        jb_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_3MouseClicked(evt);
            }
        });

        jb_suma.setText("+");
        jb_suma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_sumaMouseClicked(evt);
            }
        });

        jb_resta.setText("-");
        jb_resta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_restaMouseClicked(evt);
            }
        });

        jb_0.setText("0");
        jb_0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_0MouseClicked(evt);
            }
        });

        jb_total.setText("=");
        jb_total.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_totalMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(jt_pantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jb_1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jb_2))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jb_4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jb_5))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jb_7)
                                .addGap(26, 26, 26)
                                .addComponent(jb_8)))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jb_9)
                            .addComponent(jb_6)
                            .addComponent(jb_3)))
                    .addComponent(jb_0))
                .addGap(36, 36, 36)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jb_DEL)
                            .addComponent(jb_x)
                            .addComponent(jb_suma))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jb_resta)
                            .addComponent(jb_division)
                            .addComponent(jb_AC)))
                    .addComponent(jb_total, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jt_pantalla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_7)
                    .addComponent(jb_8)
                    .addComponent(jb_9)
                    .addComponent(jb_DEL)
                    .addComponent(jb_AC))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_4)
                    .addComponent(jb_5)
                    .addComponent(jb_6)
                    .addComponent(jb_x)
                    .addComponent(jb_division))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_1)
                    .addComponent(jb_2)
                    .addComponent(jb_3)
                    .addComponent(jb_suma)
                    .addComponent(jb_resta))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_0)
                    .addComponent(jb_total))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout JD_CalculadoraLayout = new javax.swing.GroupLayout(JD_Calculadora.getContentPane());
        JD_Calculadora.getContentPane().setLayout(JD_CalculadoraLayout);
        JD_CalculadoraLayout.setHorizontalGroup(
            JD_CalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(JD_CalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JD_CalculadoraLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        JD_CalculadoraLayout.setVerticalGroup(
            JD_CalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JD_CalculadoraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
            .addGroup(JD_CalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JD_CalculadoraLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel4.setText("El archivo a comprimir es:");

        TA_Buscado.setEditable(false);
        TA_Buscado.setColumns(20);
        TA_Buscado.setRows(5);
        TA_Buscado.setWrapStyleWord(true);
        jScrollPane3.setViewportView(TA_Buscado);

        jt_direccion.setEditable(false);

        bt_BuscarArchivo.setText("Buscar Archivo");
        bt_BuscarArchivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_BuscarArchivoMouseClicked(evt);
            }
        });

        TA_Binario.setEditable(false);
        TA_Binario.setColumns(20);
        TA_Binario.setRows(5);
        TA_Binario.setWrapStyleWord(true);
        jScrollPane4.setViewportView(TA_Binario);

        jLabel10.setText("Texto Buscado");

        jLabel11.setText("Texto a Binario");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(bt_BuscarArchivo)))
                        .addGap(0, 60, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(199, 199, 199))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(200, 200, 200))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(27, 27, 27)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_BuscarArchivo))
                .addGap(10, 10, 10)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout JD_CompresionLayout = new javax.swing.GroupLayout(JD_Compresion.getContentPane());
        JD_Compresion.getContentPane().setLayout(JD_CompresionLayout);
        JD_CompresionLayout.setHorizontalGroup(
            JD_CompresionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 495, Short.MAX_VALUE)
            .addGroup(JD_CompresionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(JD_CompresionLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        JD_CompresionLayout.setVerticalGroup(
            JD_CompresionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 361, Short.MAX_VALUE)
            .addGroup(JD_CompresionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(JD_CompresionLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout JD_GrafoBipartidoLayout = new javax.swing.GroupLayout(JD_GrafoBipartido.getContentPane());
        JD_GrafoBipartido.getContentPane().setLayout(JD_GrafoBipartidoLayout);
        JD_GrafoBipartidoLayout.setHorizontalGroup(
            JD_GrafoBipartidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        JD_GrafoBipartidoLayout.setVerticalGroup(
            JD_GrafoBipartidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        TA_L.setColumns(20);
        TA_L.setRows(5);
        TA_L.setText("Laberinto\n");
        jScrollPane2.setViewportView(TA_L);

        jButton13.setText("Laberinto ");
        jButton13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton13MouseClicked(evt);
            }
        });

        jButton15.setText("Resolver");
        jButton15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton15MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jButton13)
                        .addGap(18, 18, 18)
                        .addComponent(jButton15)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton13)
                    .addComponent(jButton15))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout JD_LaberintoLayout = new javax.swing.GroupLayout(JD_Laberinto.getContentPane());
        JD_Laberinto.getContentPane().setLayout(JD_LaberintoLayout);
        JD_LaberintoLayout.setHorizontalGroup(
            JD_LaberintoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JD_LaberintoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        JD_LaberintoLayout.setVerticalGroup(
            JD_LaberintoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JD_LaberintoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextField4.setText("jTextField1");

        jLabel5.setText("Ingrese la expresion");

        jButton12.setText("Resolver");

        jLabel6.setText("Respuesta");

        jTextField5.setEditable(false);
        jTextField5.setText("jTextField2");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6)
                    .addComponent(jButton12)
                    .addComponent(jLabel5)
                    .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                    .addComponent(jTextField5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jButton12)
                .addGap(38, 38, 38)
                .addComponent(jLabel6)
                .addGap(28, 28, 28)
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout JD_CalculoLayout = new javax.swing.GroupLayout(JD_Calculo.getContentPane());
        JD_Calculo.getContentPane().setLayout(JD_CalculoLayout);
        JD_CalculoLayout.setHorizontalGroup(
            JD_CalculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
            .addGroup(JD_CalculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(JD_CalculoLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        JD_CalculoLayout.setVerticalGroup(
            JD_CalculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(JD_CalculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(JD_CalculoLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel2.setText("Creacion de Grafos");

        jButton14.setText("Agregar Nodo");
        jButton14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton14MouseClicked(evt);
            }
        });

        jLabel3.setText("Id del nodo:");

        JL_LNodo1.setModel(new DefaultListModel());
        JL_LNodo1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane5.setViewportView(JL_LNodo1);

        JL_LNodo2.setModel(new DefaultListModel());
        JL_LNodo2.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane6.setViewportView(JL_LNodo2);

        jButton10.setText("Crear Arista");
        jButton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton10MouseClicked(evt);
            }
        });

        jButton11.setText("Revisar grafo");
        jButton11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton11MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TF_IdNodo, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton14))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton10)
                            .addComponent(jButton11)))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(31, 31, 31)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TF_IdNodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton14))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jButton11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton10))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 9, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout Creacion_GrafosLayout = new javax.swing.GroupLayout(Creacion_Grafos.getContentPane());
        Creacion_Grafos.getContentPane().setLayout(Creacion_GrafosLayout);
        Creacion_GrafosLayout.setHorizontalGroup(
            Creacion_GrafosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        Creacion_GrafosLayout.setVerticalGroup(
            Creacion_GrafosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel7.setText("Creacion de Grafos");

        bt_AgregarNodo.setText("Enseñar Grafica");
        bt_AgregarNodo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_AgregarNodoMouseClicked(evt);
            }
        });

        ta_Matriz.setColumns(20);
        ta_Matriz.setRows(5);
        jScrollPane9.setViewportView(ta_Matriz);

        ta_rutas.setColumns(20);
        ta_rutas.setRows(5);
        jScrollPane10.setViewportView(ta_rutas);

        jLabel9.setText("Matriz De adyacencia");

        jLabel12.setText("Rutas mas Cortas");

        bt_CalcularRutasMasCortas.setText("Calcular");
        bt_CalcularRutasMasCortas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_CalcularRutasMasCortasMouseClicked(evt);
            }
        });

        bt_EnseñarMatriz.setText("Enseñar Matriz");
        bt_EnseñarMatriz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_EnseñarMatrizMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel9)
                        .addGap(208, 208, 208)
                        .addComponent(jLabel12))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bt_AgregarNodo)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bt_EnseñarMatriz)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_CalcularRutasMasCortas))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(229, 229, 229)
                        .addComponent(jLabel7)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addGap(47, 47, 47)
                .addComponent(bt_AgregarNodo)
                .addGap(2, 2, 2)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel12))
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bt_EnseñarMatriz)
                        .addGap(83, 83, 83))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(bt_CalcularRutasMasCortas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );

        javax.swing.GroupLayout JD_MenorCostoOrigenesLayout = new javax.swing.GroupLayout(JD_MenorCostoOrigenes.getContentPane());
        JD_MenorCostoOrigenes.getContentPane().setLayout(JD_MenorCostoOrigenesLayout);
        JD_MenorCostoOrigenesLayout.setHorizontalGroup(
            JD_MenorCostoOrigenesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        JD_MenorCostoOrigenesLayout.setVerticalGroup(
            JD_MenorCostoOrigenesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel8.setText("Creacion de Grafos Dijkstra");

        bt_AgregarNodo1.setText("Enseñar Grafica");
        bt_AgregarNodo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_AgregarNodo1MouseClicked(evt);
            }
        });

        ta_Matriz1.setColumns(20);
        ta_Matriz1.setRows(5);
        jScrollPane11.setViewportView(ta_Matriz1);

        ta_rutas1.setColumns(20);
        ta_rutas1.setRows(5);
        jScrollPane12.setViewportView(ta_rutas1);

        jLabel13.setText("Matriz De adyacencia");

        jLabel14.setText("Rutas mas Cortas");

        bt_CalcularRutasMasCortas1.setText("Calcular");
        bt_CalcularRutasMasCortas1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_CalcularRutasMasCortas1MouseClicked(evt);
            }
        });

        bt_EnseñarMatriz1.setText("Enseñar Matriz");
        bt_EnseñarMatriz1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_EnseñarMatriz1MouseClicked(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setText("Origen es 2");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(243, 243, 243)
                .addComponent(bt_AgregarNodo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addGap(132, 132, 132))
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addGap(198, 198, 198))
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bt_EnseñarMatriz1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_CalcularRutasMasCortas1))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(jLabel8)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addGap(34, 34, 34)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_AgregarNodo1)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16))
                .addGap(15, 15, 15)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                                .addComponent(bt_EnseñarMatriz1)
                                .addGap(85, 85, 85))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                                .addComponent(bt_CalcularRutasMasCortas1)
                                .addGap(70, 70, 70))))))
        );

        javax.swing.GroupLayout JD_DijkstraLayout = new javax.swing.GroupLayout(JD_Dijkstra.getContentPane());
        JD_Dijkstra.getContentPane().setLayout(JD_DijkstraLayout);
        JD_DijkstraLayout.setHorizontalGroup(
            JD_DijkstraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JD_DijkstraLayout.createSequentialGroup()
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        JD_DijkstraLayout.setVerticalGroup(
            JD_DijkstraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Proyecto de Estructura");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel1.setText("Menu");

        jButton1.setText("Laberinto");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton2.setText("Calculo de evaluaciones");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jButton3.setText("Resolucion matematica");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        jButton4.setText("Compresion de archivo");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        jButton5.setText("Determinar Grafos");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });

        jButton6.setText("Menor costo Origenes");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });

        jButton7.setText("Menor costo Origen");
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });

        jButton8.setText("Arboles");
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton8MouseClicked(evt);
            }
        });

        jButton9.setText("Crear Grafo");
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton9MouseClicked(evt);
            }
        });

        jButton17.setText("Reiniciar Grafo");
        jButton17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton17MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jLabel1)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        JD_Laberinto.setEnabled(true);
        JD_Laberinto.setVisible(true);
        JD_Laberinto.pack();
    }//GEN-LAST:event_jButton1MouseClicked
    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        JD_Arboles.setEnabled(true);
        JD_Arboles.setSize(800, 500);
        JD_Arboles.setLocationRelativeTo(null);
        JD_Arboles.setVisible(true);
    }//GEN-LAST:event_jButton2MouseClicked
    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        JD_Calculadora.setSize(200, 200);
        JD_Calculadora.setLocationRelativeTo(null);
        JD_Calculadora.setVisible(true);

        JD_Calculadora.pack();
    }//GEN-LAST:event_jButton3MouseClicked
    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        JD_Compresion.setSize(600, 500);
        JD_Compresion.setLocationRelativeTo(null);
        JD_Compresion.setEnabled(true);
        JD_Compresion.setVisible(true);
        JD_Compresion.pack();
    }//GEN-LAST:event_jButton4MouseClicked
    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        JD_GrafoBipartido.setEnabled(true);
        JD_GrafoBipartido.setVisible(true);
        JD_GrafoBipartido.pack();
    }//GEN-LAST:event_jButton5MouseClicked
    private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseClicked

    }//GEN-LAST:event_jButton8MouseClicked
    private void jButton15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton15MouseClicked
        for (int i = 0; i < 10; i++) {
            System.out.println("");
            for (int j = 0; j < 10; j++) {
                System.out.print(Lab[i][j]);
            }
        }
        StackLab SL = new StackLab();
        NodoLab NA, Si;
        SL.push(NA = new NodoLab(1, 0));
        int cont = 0;
        do {
            System.out.println(NA.getPosX() + ", " + NA.getPosY());
            NA = (NodoLab) SL.pop();
            System.out.println(NA.getPosX() + ", " + NA.getPosY());
            if (NA.getPosX() < 10 && NA.getPosY() < 10) {
                Lab[NA.getPosX()][NA.getPosY()] = '@';
                Si = new NodoLab(NA.getPosX() - 1, NA.getPosY());//Arriba del nodo actual
                if ((Si.getPosX() >= 0 && Si.getPosX() < 10) && (Si.getPosY() >= 0 && Si.getPosY() < 10) && (Lab[Si.getPosX()][Si.getPosY()] == '.')) {
                    SL.push(Si);
                    System.out.println("Entro 1 if");
                }
                Si = new NodoLab(NA.getPosX(), NA.getPosY() + 1);//Derecha del nodo actual
                if ((Si.getPosX() >= 0 && Si.getPosX() < 10) && (Si.getPosY() >= 0 && Si.getPosY() < 10) && (Lab[Si.getPosX()][Si.getPosY()] == '.')) {
                    SL.push(Si);
                    System.out.println("Entro 2 if");
                }
                Si = new NodoLab(NA.getPosX() + 1, NA.getPosY());//Abajo del nodo actual
                if ((Si.getPosX() >= 0 && Si.getPosX() < 10) && (Si.getPosY() >= 0 && Si.getPosY() < 10) && (Lab[Si.getPosX()][Si.getPosY()] == '.')) {
                    SL.push(Si);
                    System.out.println("Entro 3 if");
                }
                Si = new NodoLab(NA.getPosX(), NA.getPosY() - 1);//Izquierda del nodo actual
                if ((Si.getPosX() >= 0 && Si.getPosX() < 10) && (Si.getPosY() >= 0 && Si.getPosY() < 10) && (Lab[Si.getPosX()][Si.getPosY()] == '.')) {
                    SL.push(Si);
                    System.out.println("Entro 4 if");
                }
            }
            System.out.println(NA.getPosX() + ", " + NA.getPosY());
        } while (!SL.IsEmpty());
        String Laber = "";
        for (int i = 0; i < 10; i++) {
            System.out.println("");
            for (int j = 0; j < 10; j++) {
                System.out.print(Lab[i][j]);
                Laber += Lab[i][j];
            }
            Laber += "\n";
        }
        TA_L.setText("");
        TA_L.setText(Laber);

    }//GEN-LAST:event_jButton15MouseClicked
    private void jButton13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton13MouseClicked
        File fichero = null;
        FileReader fr = null;
        BufferedReader br = null;
        TA_L.setText("");
        try {
            JFileChooser jcf = new JFileChooser();
            FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivo de Texto", "txt");
            FileNameExtensionFilter filtro2 = new FileNameExtensionFilter("Imagenes", "jpg", "png", "bmp");
            jcf.setFileFilter(filtro);
            jcf.addChoosableFileFilter(filtro2);
            int seleccion = jcf.showOpenDialog(this);
            if (seleccion == JFileChooser.APPROVE_OPTION) {
                fichero = jcf.getSelectedFile();
                fr = new FileReader(fichero);
                br = new BufferedReader(fr);
                String linea;
                TA_L.setText("");
                int cont = 0;
                int cont2 = 0;
                while ((linea = br.readLine()) != null) {
                    TA_L.append(linea);
                    TA_L.append("\n");
                    int tam = linea.length();
                    ////////////////////////////////////
                    if (cont % 1 == 0) {
                        for (int i = 0; i < tam; i++) {
                            Lab[cont2][i] = linea.charAt(i);
                        }
                        cont2++;
                    }
                    cont++;
                    ////////////////////////////////////
                }
            }
        } catch (Exception e) {
            System.out.println("Paso algo");
        }

    }//GEN-LAST:event_jButton13MouseClicked
    private void jb_DELActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_DELActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jb_DELActionPerformed
    private void jb_7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_7MouseClicked
        jt_pantalla.setText(jt_pantalla.getText() + "7");
    }//GEN-LAST:event_jb_7MouseClicked
    private void jb_8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_8MouseClicked
        jt_pantalla.setText(jt_pantalla.getText() + "8");
    }//GEN-LAST:event_jb_8MouseClicked
    private void jb_9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_9MouseClicked
        jt_pantalla.setText(jt_pantalla.getText() + "9");
    }//GEN-LAST:event_jb_9MouseClicked
    private void jb_4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_4MouseClicked
        jt_pantalla.setText(jt_pantalla.getText() + "4");
    }//GEN-LAST:event_jb_4MouseClicked
    private void jb_5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_5MouseClicked
        jt_pantalla.setText(jt_pantalla.getText() + "5");
    }//GEN-LAST:event_jb_5MouseClicked
    private void jb_6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_6MouseClicked
        jt_pantalla.setText(jt_pantalla.getText() + "6");
    }//GEN-LAST:event_jb_6MouseClicked
    private void jb_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_1MouseClicked
        jt_pantalla.setText(jt_pantalla.getText() + "1");
    }//GEN-LAST:event_jb_1MouseClicked
    private void jb_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_2MouseClicked
        jt_pantalla.setText(jt_pantalla.getText() + "2");
    }//GEN-LAST:event_jb_2MouseClicked
    private void jb_3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_3MouseClicked
        jt_pantalla.setText(jt_pantalla.getText() + "3");
    }//GEN-LAST:event_jb_3MouseClicked
    private void jb_0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_0MouseClicked
        jt_pantalla.setText(jt_pantalla.getText() + "0");
    }//GEN-LAST:event_jb_0MouseClicked
    private void jb_xMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_xMouseClicked
        jt_pantalla.setText(jt_pantalla.getText() + "*");
    }//GEN-LAST:event_jb_xMouseClicked
    private void jb_divisionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_divisionMouseClicked
        jt_pantalla.setText(jt_pantalla.getText() + "/");
    }//GEN-LAST:event_jb_divisionMouseClicked
    private void jb_sumaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_sumaMouseClicked
        jt_pantalla.setText(jt_pantalla.getText() + "+");
    }//GEN-LAST:event_jb_sumaMouseClicked
    private void jb_restaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_restaMouseClicked
        jt_pantalla.setText(jt_pantalla.getText() + "-");
    }//GEN-LAST:event_jb_restaMouseClicked
    private void jb_DELMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_DELMouseClicked
        jt_pantalla.setText("");
    }//GEN-LAST:event_jb_DELMouseClicked
    private void jb_ACMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_ACMouseClicked
        jt_pantalla.setText("");
    }//GEN-LAST:event_jb_ACMouseClicked
    private void jb_totalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_totalMouseClicked
        String calculo = jt_pantalla.getText();
        int cont = 0;
        ArrayList numeros = new ArrayList();
        ArrayList operaciones = new ArrayList();

        String numero = "";
        for (int i = 0; i < calculo.length(); i++) {
            if (Character.isDigit(calculo.charAt(i))) {
                numero += calculo.charAt(i);
            }
            if (!Character.isDigit(calculo.charAt(i))) {
                numeros.add(numero);
                numero = "";
                operaciones.add(calculo.charAt(i));
            }
        }
        numeros.add(numero);
        cont = 0;
        do {
            do {
                for (int i = 0; i < operaciones.size(); i++) {
                    if (operaciones.get(i).equals('*')) {
                        String num1, num2;
                        num1 = numeros.get(i).toString();
                        num2 = numeros.get(i + 1).toString();
                        double n1, n2, nuevo;
                        n1 = Double.parseDouble(num1);
                        n2 = Double.parseDouble(num2);
                        nuevo = n1 * n2;
                        numeros.set(i, nuevo);
                        numeros.remove(i + 1);
                        operaciones.remove(i);
                    }
                }
                for (int i = 0; i < operaciones.size(); i++) {
                    if (operaciones.get(i).equals('/')) {
                        String num1, num2;
                        num1 = numeros.get(i).toString();
                        num2 = numeros.get(i + 1).toString();
                        double n1, n2, nuevo;
                        n1 = Double.parseDouble(num1);
                        n2 = Double.parseDouble(num2);
                        nuevo = n1 / n2;
                        numeros.set(i, nuevo);
                        numeros.remove(i + 1);
                        operaciones.remove(i);
                    }
                }
                cont++;
            } while (cont != 3);
            for (int i = 0; i < operaciones.size(); i++) {
                if (operaciones.get(i).equals('+')) {
                    String num1, num2;
                    num1 = numeros.get(i).toString();
                    num2 = numeros.get(i + 1).toString();
                    double n1, n2, nuevo;
                    n1 = Double.parseDouble(num1);
                    n2 = Double.parseDouble(num2);
                    nuevo = n1 + n2;
                    numeros.set(i, nuevo);
                    numeros.remove(i + 1);
                    operaciones.remove(i);
                }
            }
            for (int i = 0; i < operaciones.size(); i++) {
                if (operaciones.get(i).equals('-')) {
                    String num1, num2;
                    num1 = numeros.get(i).toString();
                    num2 = numeros.get(i + 1).toString();
                    double n1, n2, nuevo;
                    n1 = Double.parseDouble(num1);
                    n2 = Double.parseDouble(num2);
                    nuevo = n1 - n2;
                    numeros.set(i, nuevo);
                    numeros.remove(i + 1);
                    operaciones.remove(i);
                }
            }
            for (int i = 0; i < numeros.size(); i++) {
                System.out.println(numeros.get(i));
            }
        } while (numeros.size() != 1);
        jt_pantalla.setText(numeros.get(0).toString());
    }//GEN-LAST:event_jb_totalMouseClicked
    private void boton_jefeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_jefeMouseClicked
        String root = JOptionPane.showInputDialog(this, "Introduzca su nombre");
        Root = new Node<>(root + "-");

        DefaultTreeModel model = (DefaultTreeModel) Arbol.getModel();
        DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) model.getRoot();

        DefaultMutableTreeNode n = new DefaultMutableTreeNode(Root.getData());

        model.setRoot(n);
        model.reload();
        boton_jefe.setEnabled(false);
        boton_jefe.setVisible(false);
    }//GEN-LAST:event_boton_jefeMouseClicked
    private void ArbolMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ArbolMouseClicked
        if (SwingUtilities.isRightMouseButton(evt)) {
            int row = Arbol.getClosestRowForLocation(evt.getX(), evt.getY());
            Arbol.setSelectionRow(row);

            Menu.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_ArbolMouseClicked
    private void jm_hijoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jm_hijoMouseClicked

    }//GEN-LAST:event_jm_hijoMouseClicked
    private void jm_hijoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jm_hijoActionPerformed
        Node n = new Node();
        String empleado = "";

        empleado = JOptionPane.showInputDialog(this, "Introduzca su nombre");
        System.out.println("Desempeño");
        String prom = JOptionPane.showInputDialog(this, "Introduzca su desempeño");
        empleado = empleado + "-" + prom;
        Node<String> Empleado = null;
        //System.out.println(empleado);
        DefaultMutableTreeNode selectedElement
                = (DefaultMutableTreeNode) Arbol.getSelectionPath().getLastPathComponent();
        System.out.println(selectedElement);
        if (Root.getData().equals(selectedElement.toString())) {
            Empleado = Root.addChild(new Node<>(empleado));
        } else {

            JOptionPane.showMessageDialog(Menu, "NO se puede");
        }
        try {
            DefaultTreeModel model = (DefaultTreeModel) Arbol.getModel();
            DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) model.getRoot();
            raiz.add(new DefaultMutableTreeNode(Empleado.getData()));
            model.reload();
        } catch (Exception e) {
        }

    }//GEN-LAST:event_jm_hijoActionPerformed
    private void jButton14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton14MouseClicked
        DefaultListModel lista1 = (DefaultListModel) JL_LNodo1.getModel();
        DefaultListModel lista2 = (DefaultListModel) JL_LNodo2.getModel();
        grafo.addNode(TF_IdNodo.getText());
        lista1.addElement(TF_IdNodo.getText());
        lista2.addElement(TF_IdNodo.getText());
    }//GEN-LAST:event_jButton14MouseClicked
    private void jButton17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton17MouseClicked
        Stack = new STACK();
        grafo = new SingleGraph("Grafo");
        System.out.println("Reiniciado");
    }//GEN-LAST:event_jButton17MouseClicked
    private void jButton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseClicked
        Creacion_Grafos.setEnabled(true);
        Creacion_Grafos.setVisible(true);
        Creacion_Grafos.pack();
    }//GEN-LAST:event_jButton9MouseClicked
    private void bt_BuscarArchivoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_BuscarArchivoMouseClicked
        String texto, binario;

        JFileChooser jf = new JFileChooser();
        jf.setFileFilter(new FileNameExtensionFilter("Text files", "txt"));
        int retorno = jf.showOpenDialog(this);
        if (retorno == 0) {
            File f = jf.getSelectedFile();
            try {
                texto = readfile(f.getAbsolutePath());
                jt_direccion.setText(f.getAbsolutePath());
                TA_Buscado.setText(texto);
                Huffman hf = new Huffman(texto);
                binario = hf.compresion();
                TA_Binario.setText(binario);
            } catch (Exception e) {
            }
        }

    }//GEN-LAST:event_bt_BuscarArchivoMouseClicked
    private void jb_ActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_ActualizarMouseClicked
        DefaultTreeModel model = (DefaultTreeModel) Arbol.getModel();
        DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) model.getRoot();

        double acum = 0, total = 0;
        int cont = 0;
        String temp, numero;
        for (int i = 0; i < Root.getChildren().size(); i++) {
            temp = Root.getChildren().get(i).getData();
            int index = temp.indexOf("-");
            numero = temp.substring(index + 1, Root.getChildren().get(i).getData().length());
            acum += Double.parseDouble(numero);
            cont++;
        }
        total = acum / cont;
        numero = Double.toString(total);
        temp = Root.getData();
        Root.setData(temp + "/" + numero);
        //
        DefaultMutableTreeNode n = new DefaultMutableTreeNode(Root.getData());
        int algo = model.getChildCount(raiz);
        ArrayList hijos = new ArrayList();
        for (int i = 0; i < algo; i++) {
            hijos.add(model.getChild(raiz, i));
        }
        model.setRoot(n);
        model.reload();
        model = (DefaultTreeModel) Arbol.getModel();
        raiz = (DefaultMutableTreeNode) model.getRoot();
        for (int i = 0; i < hijos.size(); i++) {
            raiz.add((MutableTreeNode) hijos.get(i));
        }
        model.reload();
    }//GEN-LAST:event_jb_ActualizarMouseClicked
    private void jButton10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MouseClicked
        DefaultListModel lista1 = (DefaultListModel) JL_LNodo1.getModel();
        DefaultListModel lista2 = (DefaultListModel) JL_LNodo2.getModel();
        String N1 = JL_LNodo1.getSelectedValue();
        String N2 = JL_LNodo2.getSelectedValue();
        String N3 = "" + N1 + N2;
        if (!(N1).equals(N2)) {
            grafo.addEdge(N3, N1, N2);
            JOptionPane.showMessageDialog(Menu, "Se ha unido: " + N1 + " con" + N2 + "EXITOSAMENTE");
        } else {
            JOptionPane.showMessageDialog(Menu, "No se puede crear una arista hacia el mismo nodo");
        }
    }//GEN-LAST:event_jButton10MouseClicked
    private void jButton11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton11MouseClicked
        grafo.display();
    }//GEN-LAST:event_jButton11MouseClicked

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        JD_MenorCostoOrigenes.setEnabled(true);
        JD_MenorCostoOrigenes.setVisible(true);
        JD_MenorCostoOrigenes.pack();
    }//GEN-LAST:event_jButton6MouseClicked

    private void bt_AgregarNodoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_AgregarNodoMouseClicked
        try {
            floyd.duro();
            floyd.End();

            Viewer viewer = floyd.Demostrar();
            viewer.setCloseFramePolicy(Viewer.CloseFramePolicy.HIDE_ONLY);

        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bt_AgregarNodoMouseClicked

    private void bt_EnseñarMatrizMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_EnseñarMatrizMouseClicked
        ta_Matriz.setText(floyd.MatrizFloyd());

    }//GEN-LAST:event_bt_EnseñarMatrizMouseClicked

    private void bt_CalcularRutasMasCortasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_CalcularRutasMasCortasMouseClicked
        floyd.Start();

        ta_rutas.setText(floyd.MatrizFloyd(floyd.Distance));
    }//GEN-LAST:event_bt_CalcularRutasMasCortasMouseClicked

    private void bt_AgregarNodo1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_AgregarNodo1MouseClicked
        try {
            //floyd.duro();
            //floyd.End();
            Dis.duro();
            
            
            Viewer viewer = Dis.Demostrar();
            viewer.setCloseFramePolicy(Viewer.CloseFramePolicy.HIDE_ONLY);

        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bt_AgregarNodo1MouseClicked

    private void bt_CalcularRutasMasCortas1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_CalcularRutasMasCortas1MouseClicked
        ta_rutas1.setText(Dis.MatrizDis(Dis.Disstrack()));
        
    }//GEN-LAST:event_bt_CalcularRutasMasCortas1MouseClicked

    private void bt_EnseñarMatriz1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_EnseñarMatriz1MouseClicked
        ta_Matriz1.setText(Dis.MatrizDis());
    }//GEN-LAST:event_bt_EnseñarMatriz1MouseClicked

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
        JD_Dijkstra.setEnabled(true);
        JD_Dijkstra.setVisible(true);
        JD_Dijkstra.pack();
    }//GEN-LAST:event_jButton7MouseClicked
    public static String readfile(String path) throws FileNotFoundException, IOException {
        String acum, line;
        BufferedReader br = new BufferedReader(new FileReader(path));
        acum = "";
        while ((line = br.readLine()) != null) {
            acum += line;
        }
        return acum;
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTree Arbol;
    private javax.swing.JDialog Creacion_Grafos;
    private javax.swing.JDialog JD_Arboles;
    private javax.swing.JDialog JD_Calculadora;
    private javax.swing.JDialog JD_Calculo;
    private javax.swing.JDialog JD_Compresion;
    private javax.swing.JDialog JD_Dijkstra;
    private javax.swing.JDialog JD_GrafoBipartido;
    private javax.swing.JDialog JD_Laberinto;
    private javax.swing.JDialog JD_MenorCostoOrigenes;
    private javax.swing.JList<String> JL_LNodo1;
    private javax.swing.JList<String> JL_LNodo2;
    private javax.swing.JPopupMenu Menu;
    private javax.swing.JTextArea TA_Binario;
    private javax.swing.JTextArea TA_Buscado;
    private javax.swing.JTextArea TA_L;
    private javax.swing.JTextField TF_IdNodo;
    private javax.swing.JButton boton_jefe;
    private javax.swing.JButton bt_AgregarNodo;
    private javax.swing.JButton bt_AgregarNodo1;
    private javax.swing.JButton bt_BuscarArchivo;
    private javax.swing.JButton bt_CalcularRutasMasCortas;
    private javax.swing.JButton bt_CalcularRutasMasCortas1;
    private javax.swing.JButton bt_EnseñarMatriz;
    private javax.swing.JButton bt_EnseñarMatriz1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JButton jb_0;
    private javax.swing.JButton jb_1;
    private javax.swing.JButton jb_2;
    private javax.swing.JButton jb_3;
    private javax.swing.JButton jb_4;
    private javax.swing.JButton jb_5;
    private javax.swing.JButton jb_6;
    private javax.swing.JButton jb_7;
    private javax.swing.JButton jb_8;
    private javax.swing.JButton jb_9;
    private javax.swing.JButton jb_AC;
    private javax.swing.JButton jb_Actualizar;
    private javax.swing.JButton jb_DEL;
    private javax.swing.JButton jb_division;
    private javax.swing.JButton jb_resta;
    private javax.swing.JButton jb_suma;
    private javax.swing.JButton jb_total;
    private javax.swing.JButton jb_x;
    private javax.swing.JMenuItem jm_hijo;
    private javax.swing.JTextField jt_direccion;
    private javax.swing.JTextField jt_pantalla;
    private javax.swing.JTextArea ta_Matriz;
    private javax.swing.JTextArea ta_Matriz1;
    private javax.swing.JTextArea ta_rutas;
    private javax.swing.JTextArea ta_rutas1;
    // End of variables declaration//GEN-END:variables
    char[][] Lab = new char[10][10];
    STACK Stack = new STACK();
    Dijkstra Dis=new Dijkstra();
    ArrayList<Aristas> AA = new ArrayList();
    Graph grafo = new SingleGraph("Grafo");
    Floyd floyd = new Floyd();
}
