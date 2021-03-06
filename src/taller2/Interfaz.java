package taller2;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Interfaz extends javax.swing.JFrame {

    int aux = 0;
    int Aux = 0;
    Estudiante E = new Estudiante();
    Profesor P = new Profesor();
    ArrayList<Profesor> ListaProfesores = new ArrayList<Profesor>();
    ArrayList<Materias> ListaMaterias = new ArrayList<Materias>();
    

    public Interfaz() {
        this.setUndecorated(true);
        this.setResizable(false);
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtCedulaProfesor = new javax.swing.JTextField();
        txtNombreProfesor = new javax.swing.JTextField();
        txtNumeroEstudiantes = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        LabelErrorNombreProfesor = new javax.swing.JLabel();
        LabelErrorNumeroEstudiantes = new javax.swing.JLabel();
        BotonIngresarProfesor = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txtCedulaEstudiante = new javax.swing.JTextField();
        txtNombreEstudiante = new javax.swing.JTextField();
        txtPromedioEstuadiante = new javax.swing.JTextField();
        txtSemestreEstuadiante = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        LabeErrorCedulaEstuadinte = new javax.swing.JLabel();
        LabelErrorNombre = new javax.swing.JLabel();
        LabelErrorPromedioEstudiante = new javax.swing.JLabel();
        LabelErrorSemestre = new javax.swing.JLabel();
        BotonIngresarEstudiante = new javax.swing.JButton();
        ComboProfesorEnEstudiante = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtNombreMateria = new javax.swing.JTextField();
        LabelErrorNombreMateria = new javax.swing.JLabel();
        BotonIngresarMaterias = new javax.swing.JButton();
        ComboProfesoresEnMaterias = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabla2 = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        ComboInformacion = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 255));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTabbedPane1AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setText("Cedula");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 23, 98, -1));

        jLabel6.setText("Nombre");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 52, 98, -1));

        jLabel7.setText("Numero Estudiantes");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 77, 98, -1));

        txtCedulaProfesor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel2.add(txtCedulaProfesor, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 20, 170, 20));

        txtNombreProfesor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel2.add(txtNombreProfesor, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 49, 170, 20));

        txtNumeroEstudiantes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel2.add(txtNumeroEstudiantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 74, 170, 20));

        jLabel10.setText("*");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, 20, 20));

        LabelErrorNombreProfesor.setText("*");
        jPanel2.add(LabelErrorNombreProfesor, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, 20, 20));

        LabelErrorNumeroEstudiantes.setText("*");
        jPanel2.add(LabelErrorNumeroEstudiantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 77, 20, 20));

        BotonIngresarProfesor.setBackground(new java.awt.Color(204, 204, 204));
        BotonIngresarProfesor.setForeground(new java.awt.Color(255, 255, 255));
        BotonIngresarProfesor.setText("Ingresar");
        BotonIngresarProfesor.setBorder(null);
        BotonIngresarProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonIngresarProfesorActionPerformed(evt);
            }
        });
        jPanel2.add(BotonIngresarProfesor, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 110, 20));

        jTabbedPane1.addTab("Profesor", jPanel2);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCedulaEstudiante.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel1.add(txtCedulaEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 200, 20));

        txtNombreEstudiante.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel1.add(txtNombreEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 39, 200, 20));

        txtPromedioEstuadiante.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel1.add(txtPromedioEstuadiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 68, 200, 20));

        txtSemestreEstuadiante.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel1.add(txtSemestreEstuadiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 97, 200, 20));

        jLabel1.setText("Cedula");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 16, 62, -1));

        jLabel2.setText("Nombre");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 42, 62, -1));

        jLabel3.setText("Promedio");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 71, 62, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Semestre");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 100, 62, -1));

        LabeErrorCedulaEstuadinte.setText("*");
        jPanel1.add(LabeErrorCedulaEstuadinte, new org.netbeans.lib.awtextra.AbsoluteConstraints(378, 13, 20, -1));

        LabelErrorNombre.setText("*");
        jPanel1.add(LabelErrorNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(378, 42, 20, -1));

        LabelErrorPromedioEstudiante.setText("*");
        jPanel1.add(LabelErrorPromedioEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(378, 71, 20, -1));

        LabelErrorSemestre.setText("*");
        jPanel1.add(LabelErrorSemestre, new org.netbeans.lib.awtextra.AbsoluteConstraints(378, 100, 20, -1));

        BotonIngresarEstudiante.setBackground(new java.awt.Color(204, 204, 204));
        BotonIngresarEstudiante.setForeground(new java.awt.Color(255, 255, 255));
        BotonIngresarEstudiante.setText("Ingresar");
        BotonIngresarEstudiante.setBorder(null);
        BotonIngresarEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonIngresarEstudianteActionPerformed(evt);
            }
        });
        jPanel1.add(BotonIngresarEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 110, 20));

        jPanel1.add(ComboProfesorEnEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 200, 20));

        jLabel11.setText("Profesor ");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 60, 20));

        jButton2.setText("Agregar Profesor");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, 120, -1));

        jTabbedPane1.addTab("Estudiante", jPanel1);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setText("NombreMateria");

        LabelErrorNombreMateria.setText("*");

        BotonIngresarMaterias.setBackground(new java.awt.Color(204, 204, 204));
        BotonIngresarMaterias.setForeground(new java.awt.Color(255, 255, 255));
        BotonIngresarMaterias.setText("Ingresar");
        BotonIngresarMaterias.setBorder(null);
        BotonIngresarMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonIngresarMateriasActionPerformed(evt);
            }
        });

        jLabel12.setText("Profesor ");

        jLabel13.setText("*");

        Tabla2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(Tabla2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(txtNombreMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(LabelErrorNombreMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(ComboProfesoresEnMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(BotonIngresarMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane2)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombreMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(LabelErrorNombreMateria))))
                .addGap(11, 11, 11)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboProfesoresEnMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel13)))
                .addGap(10, 10, 10)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(BotonIngresarMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Materias", jPanel3);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        Tabla.setBackground(new java.awt.Color(153, 255, 255));
        Tabla.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(Tabla);

        jLabel8.setText("Profesor");

        ComboInformacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jButton3.setBackground(new java.awt.Color(153, 153, 153));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Ver");
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(ComboInformacion, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 595, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboInformacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Informacion", jPanel6);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 101, 600, 240));

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 370, 60, -1));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(153, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 190, 400));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void BotonIngresarMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonIngresarMateriasActionPerformed
        if (txtNombreMateria.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor ingrese el nombre de la materia");
        } else {
            String NombreMateria = txtNombreMateria.getText();
            int Aux2 = ComboProfesorEnEstudiante.getSelectedIndex();
            Profesor ProfesorEstudiante = ListaProfesores.get(Aux2);
            Materias EntradaM = new Materias(NombreMateria, ProfesorEstudiante);
            ListaMaterias.add(EntradaM);
        String[] Col = {"Profesor", "Materia"};
        String[][]DataTmp={{" "}};
        String[] Data = {ListaProfesores.get(Aux2).getnombre(),txtNombreMateria.getText()};
        DefaultTableModel model = (DefaultTableModel) Tabla2.getModel();
        model.setDataVector(DataTmp, Col);
        model.addRow(Data);
        
        }
    }//GEN-LAST:event_BotonIngresarMateriasActionPerformed

    private void BotonIngresarProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonIngresarProfesorActionPerformed

        int Cedula = Integer.parseInt(txtCedulaProfesor.getText());
        String Nombre = txtNombreProfesor.getText();
        int NumeroEstudiantes = Integer.parseInt(txtNumeroEstudiantes.getText());
        Profesor x = new Profesor(Cedula, aux, Nombre);
        Materias M = new Materias(txtNombreMateria.getText(), x);
        ListaProfesores.add(x);
        ComboProfesoresEnMaterias.addItem(ListaProfesores.get(Aux).getnombre());
        ComboProfesorEnEstudiante.addItem(ListaProfesores.get(Aux).getnombre());
        ComboInformacion.addItem(ListaProfesores.get(Aux).getnombre());
        Aux++;
    }//GEN-LAST:event_BotonIngresarProfesorActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void BotonIngresarEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonIngresarEstudianteActionPerformed
        int CedulaEstudiante = Integer.parseInt(txtCedulaEstudiante.getText());
        String NombreEstudiante = txtNombreEstudiante.getText();
        float Promedio = Float.parseFloat(txtPromedioEstuadiante.getText());
        int Semestre = Integer.parseInt(txtSemestreEstuadiante.getText());
        int Aux2 = ComboProfesorEnEstudiante.getSelectedIndex();
        Profesor ProfesorEstudiante = ListaProfesores.get(Aux2);
        Estudiante E = new Estudiante(Promedio, Semestre, CedulaEstudiante, NombreEstudiante, ProfesorEstudiante);
        P.getListaEstudiantes().add(E);

    }//GEN-LAST:event_BotonIngresarEstudianteActionPerformed

    private void jTabbedPane1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTabbedPane1AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jTabbedPane1AncestorAdded

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // VERR 
        String[] Col = {"Estudiante", "Promedio"};
        String[][] DataTMP = {{"  "}};
        DefaultTableModel model = (DefaultTableModel) Tabla.getModel();
        model.setDataVector(DataTMP, Col);
        for (int x = 0; x < P.getListaEstudiantes().size(); x++) {
            int Aux3 = ComboProfesorEnEstudiante.getSelectedIndex();
            if (ListaProfesores.get(Aux3).getcedula()==P.getListaEstudiantes().get(x).getprofesor().getcedula()) {
                String[] Data = {P.getListaEstudiantes().get(x).getnombre().toString(), Float.toString(P.getListaEstudiantes().get(x).getPromedio())};
                model.addRow(Data);
            } else {
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonIngresarEstudiante;
    private javax.swing.JButton BotonIngresarMaterias;
    private javax.swing.JButton BotonIngresarProfesor;
    private javax.swing.JComboBox<String> ComboInformacion;
    private javax.swing.JComboBox<String> ComboProfesorEnEstudiante;
    private javax.swing.JComboBox<String> ComboProfesoresEnMaterias;
    private javax.swing.JLabel LabeErrorCedulaEstuadinte;
    private javax.swing.JLabel LabelErrorNombre;
    private javax.swing.JLabel LabelErrorNombreMateria;
    private javax.swing.JLabel LabelErrorNombreProfesor;
    private javax.swing.JLabel LabelErrorNumeroEstudiantes;
    private javax.swing.JLabel LabelErrorPromedioEstudiante;
    private javax.swing.JLabel LabelErrorSemestre;
    private javax.swing.JTable Tabla;
    private javax.swing.JTable Tabla2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField txtCedulaEstudiante;
    private javax.swing.JTextField txtCedulaProfesor;
    private javax.swing.JTextField txtNombreEstudiante;
    private javax.swing.JTextField txtNombreMateria;
    private javax.swing.JTextField txtNombreProfesor;
    private javax.swing.JTextField txtNumeroEstudiantes;
    private javax.swing.JTextField txtPromedioEstuadiante;
    private javax.swing.JTextField txtSemestreEstuadiante;
    // End of variables declaration//GEN-END:variables
}
