
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JD_Arboles = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
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
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TA_A = new javax.swing.JTextArea();
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

        jPanel2.setToolTipText("Arbol");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("root");
        jTree1.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane1.setViewportView(jTree1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(260, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
                .addContainerGap())
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
            .addGap(0, 687, Short.MAX_VALUE)
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

        jButton10.setText("Examinar");
        jButton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton10MouseClicked(evt);
            }
        });

        jButton11.setText("Comprimir");

        jLabel4.setText("El archivo a comprimir es:");

        TA_A.setColumns(20);
        TA_A.setRows(5);
        jScrollPane3.setViewportView(TA_A);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jButton10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addComponent(jButton11)
                .addGap(103, 103, 103))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton11)
                    .addComponent(jButton10))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout JD_CompresionLayout = new javax.swing.GroupLayout(JD_Compresion.getContentPane());
        JD_Compresion.getContentPane().setLayout(JD_CompresionLayout);
        JD_CompresionLayout.setHorizontalGroup(
            JD_CompresionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(JD_CompresionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(JD_CompresionLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        JD_CompresionLayout.setVerticalGroup(
            JD_CompresionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
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

        jButton7.setText("Menor costo Origen");

        jButton8.setText("Arboles");
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                .addContainerGap(19, Short.MAX_VALUE))
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
                .addGap(0, 18, Short.MAX_VALUE))
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
        JD_Calculadora.setEnabled(true);
        JD_Calculadora.setVisible(true);
        JD_Calculadora.pack();
    }//GEN-LAST:event_jButton2MouseClicked
    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        JD_Calculadora.setSize(200,200);
        JD_Calculadora.setLocationRelativeTo(null);
        JD_Calculadora.setVisible(true);
        
        JD_Calculadora.pack();
    }//GEN-LAST:event_jButton3MouseClicked
    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
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
        JD_Arboles.setEnabled(true);
        JD_Arboles.setVisible(true);
        JD_Arboles.pack();
    }//GEN-LAST:event_jButton8MouseClicked
    private void jButton15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton15MouseClicked
        String Laberinto = TA_L.getText();
        for (int i = 0; i < 10; i++) {
            System.out.println("");
            for (int j = 0; j < 10; j++) {
                System.out.print(Lab[i][j]);
            }
        }

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
                    if (cont % 2 == 0) {
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
    private void jButton10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MouseClicked
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
                TA_A.setText("");
                while ((linea = br.readLine()) != null) {
                    TA_A.append("\n");
                }
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton10MouseClicked

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
        int cont=0;
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
    private javax.swing.JDialog JD_Arboles;
    private javax.swing.JDialog JD_Calculadora;
    private javax.swing.JDialog JD_Calculo;
    private javax.swing.JDialog JD_Compresion;
    private javax.swing.JDialog JD_GrafoBipartido;
    private javax.swing.JDialog JD_Laberinto;
    private javax.swing.JTextArea TA_A;
    private javax.swing.JTextArea TA_L;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTree jTree1;
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
    private javax.swing.JButton jb_DEL;
    private javax.swing.JButton jb_division;
    private javax.swing.JButton jb_resta;
    private javax.swing.JButton jb_suma;
    private javax.swing.JButton jb_total;
    private javax.swing.JButton jb_x;
    private javax.swing.JTextField jt_pantalla;
    // End of variables declaration//GEN-END:variables
    char[][] Lab = new char[10][10];
}
