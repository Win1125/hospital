package interfacez;

import java.awt.HeadlessException;
import java.awt.Image;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import laboratorio_clinico.conexion_MYSQL;
import laboratorio_clinico.datos;

public class Agendar_cita extends javax.swing.JFrame {

    // Esrtablecer conexion a MYSQL
    conexion_MYSQL c = new conexion_MYSQL();
    Connection conectar = c.obtener_conexion();

    DefaultComboBoxModel modelExam_types, modelExam;
    
    //Llenar los combos con la base de datos
    public final void llenar_combo(String tabla, String valor, JComboBox combo, String order){
        String Query = "SELECT * FROM " + tabla + " ORDER BY " + order + " ASC;";
        try {
            Statement st = conectar.createStatement();
            ResultSet rs = st.executeQuery(Query);

            while (rs.next()) {
                combo.addItem(rs.getString(valor));
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    //metodo para llenar en combo box de tipo de examenes
    public void llenar_combo_types_E() {
        String[] t_exams = {"Seleccionar", "Bioquimicos", "Hematologicos", "Hormonas", "Inmunologicos"};
        modelExam_types = new DefaultComboBoxModel(t_exams);
        combo_tipos.setModel(modelExam_types);
    }

    //llenar combo box de los examenes de acuerdo al tipo
    public void llenar_combo_Exams() {
        String[] seleccionar = {"Seleccionar"};
        String[] bioquimicos = {"Seleccionar", "Glucosa", "Ácido Urico", "Creatinina", "Urea", "Colesterol", "Trigliceridos", "Hierro"};
        String[] hematologicos = {"Seleccionar", "Hemogramas C+ Plaquetas", "Plaquetas", "Ácido Fólico"};
        String[] hormonas = {"Seleccionar", "HGG (Prueba Embarazo)"};
        String[] inmunologicos = {"Seleccionar", "VIH / SIDA"};

        String Exam_types = combo_tipos.getSelectedItem().toString();
        switch (Exam_types) {
            case "Seleccionar":
                modelExam = new DefaultComboBoxModel(seleccionar);
                combo_examen.setModel(modelExam);
                break;
            case "Bioquimicos":
                modelExam = new DefaultComboBoxModel(bioquimicos);
                combo_examen.setModel(modelExam);
                break;
            case "Hematologicos":
                modelExam = new DefaultComboBoxModel(hematologicos);
                combo_examen.setModel(modelExam);
                break;
            case "Hormonas":
                modelExam = new DefaultComboBoxModel(hormonas);
                combo_examen.setModel(modelExam);
                break;
            case "Inmunologicos":
                modelExam = new DefaultComboBoxModel(inmunologicos);
                combo_examen.setModel(modelExam);
                break;
            default:
                break;
        }
    }

    
    public Agendar_cita() {
        initComponents();
        this.setLocationRelativeTo(null);

        Image icon = new ImageIcon(getClass().getResource("/images/icon.png")).getImage();
        setIconImage(icon);

        llenar_combo("medicos","Nombre",cmb_medico,"Nombre");
        llenar_combo("especialidadesmedicas","NombreEspecialidad",cmb_especialidad,"NombreEspecialidad");
        llenar_combo("modalidadesconsulta","NombreModalidad",cmb_modalidad,"NombreModalidad");
        llenar_combo("sedes","NombreSede",cmb_sede,"NombreSede");
        llenar_combo_types_E();
        btn_update.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_save = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_client = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jc_date = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        combo_examen = new javax.swing.JComboBox<>();
        combo_hora = new javax.swing.JComboBox<>();
        combo_tipos = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        btn_cancel = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_turn = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cmb_sede = new javax.swing.JComboBox<>();
        cmb_especialidad = new javax.swing.JComboBox<>();
        cmb_modalidad = new javax.swing.JComboBox<>();
        cmb_medico = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        cb_si = new javax.swing.JCheckBox();
        cb_no = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Agendar Cita", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 18))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_save.setBackground(new java.awt.Color(0, 255, 0));
        btn_save.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_save.setForeground(new java.awt.Color(255, 255, 255));
        btn_save.setText("Agregar");
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });
        jPanel1.add(btn_save, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 520, -1, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("# Cita");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Modalidad:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        txt_client.setEditable(false);
        txt_client.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txt_client, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 200, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Fecha Cita:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, 29));

        jc_date.setBackground(new java.awt.Color(255, 255, 255));
        jc_date.setDateFormatString("yyyy/MM/dd");
        jPanel1.add(jc_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 198, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Tipo Examen:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, 35));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Examen:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, 30));

        combo_examen.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        combo_examen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        jPanel1.add(combo_examen, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 200, -1));

        combo_hora.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        combo_hora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "08:00:00", "09:00:00", "10:00:00", "11:00:00", "12:00:00", "13:00:00", "14:00:00", "15:00:00", "16:00:00" }));
        jPanel1.add(combo_hora, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, 190, -1));

        combo_tipos.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        combo_tipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_tiposActionPerformed(evt);
            }
        });
        jPanel1.add(combo_tipos, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 200, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("Asistio?:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, -1, 29));

        btn_cancel.setBackground(new java.awt.Color(255, 0, 0));
        btn_cancel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_cancel.setForeground(new java.awt.Color(255, 255, 255));
        btn_cancel.setText("Cancelar");
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });
        jPanel1.add(btn_cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 520, -1, -1));

        btn_update.setBackground(new java.awt.Color(0, 153, 255));
        btn_update.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_update.setForeground(new java.awt.Color(255, 255, 255));
        btn_update.setText("Reagendar");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });
        jPanel1.add(btn_update, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 520, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/searc.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, 30, 30));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setText("Hora Cita:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, -1, 29));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("Cliente:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 76, -1, -1));
        jPanel1.add(txt_turn, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 82, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setText("Medico:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setText("Especialidad:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jPanel1.add(cmb_sede, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 410, 190, -1));

        jPanel1.add(cmb_especialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 200, -1));

        cmb_modalidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_modalidadActionPerformed(evt);
            }
        });
        jPanel1.add(cmb_modalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 200, -1));

        jPanel1.add(cmb_medico, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 200, -1));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setText("Sede:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, -1, 29));

        cb_si.setText("Si");
        jPanel1.add(cb_si, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 450, -1, -1));

        cb_no.setText("No");
        jPanel1.add(cb_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 450, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 572, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed

        int asistio = 0;
        int medico;
        int especialidad;
        int modalidad;
        int sede;
        
        //------------------------------------------------------------------------
        if(cb_si.isSelected()){
            asistio = 1;
        }else if(cb_no.isSelected()){
            asistio = 0;
        }
        
        String cita = txt_turn.getText();
        String cliente = txt_client.getText();
        medico = cmb_medico.getSelectedIndex();
        especialidad = cmb_especialidad.getSelectedIndex();
        modalidad = cmb_modalidad.getSelectedIndex();
        String fecha = ((JTextField) jc_date.getDateEditor().getUiComponent()).getText();
        String hora = combo_hora.getSelectedItem().toString();
        sede = cmb_sede.getSelectedIndex();
        String descripcion = "Al paciente se le diagnostica "
                + "el tipo de examen: "+combo_tipos.getSelectedItem().toString()+" y el examen: "+combo_examen.getSelectedItem().toString();
        String examen = combo_examen.getSelectedItem().toString();
        String tipoExamen = combo_tipos.getSelectedItem().toString();
        
                
        System.out.println("cita: "+cita);
        System.out.println("paciente: "+cliente);
        System.out.println("medico: "+medico);
        System.out.println("especialidad: "+especialidad);
        System.out.println("modalidad: "+modalidad);
        System.out.println("asistio: "+asistio);
        System.out.println("fecha: "+fecha);
        System.out.println("hora: "+hora);
        System.out.println("sede: "+sede);
        System.out.println("Decripcion: "+descripcion);
        
        try {
            CallableStatement insert = conectar.prepareCall("{call IngresarCita(?,?,?,?,?,?,?,?,?,?,?,?)}");
            insert.setString(1, cita);
            insert.setString(2, cliente);
            insert.setInt(3, medico);
            insert.setInt(4, especialidad);
            insert.setInt(5, modalidad);
            insert.setInt(6, asistio);
            insert.setString(7, fecha);
            insert.setString(8, hora);
            insert.setInt(9, sede);
            insert.setString(10, descripcion);
            insert.setString(11, examen);
            insert.setString(12, tipoExamen);
            
            
            insert.execute();
            
            //presentamos mensaje de registro, lo llamamos de la clase datos
            datos d = new datos();
            d.capturar_datos();
            d.mostrar_datos();
            this.dispose();

        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR INTENTE NUEVAMENTE!!!\n" + e);
        }
    }//GEN-LAST:event_btn_saveActionPerformed

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
        dispose();
    }//GEN-LAST:event_btn_cancelActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed

        try {
            CallableStatement update = conectar.prepareCall("{call update_cites(?,?,?,?,?,?,?)}");
            //update.setString(1, txt_modalidad.getText());
            update.setString(2, txt_client.getText());
            update.setString(3, ((JTextField) jc_date.getDateEditor().getUiComponent()).getText());
            update.setString(4, combo_hora.getSelectedItem().toString());
            update.setString(5, combo_tipos.getSelectedItem().toString());
            update.setString(6, combo_examen.getSelectedItem().toString());
            //ejecutamos query
            update.execute();
            //presentamos mensaje de registro
            JOptionPane.showMessageDialog(null, "Cita reagendada");
            this.dispose();

        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR INTENTE NUEVAMENTE!!!\n" + e);
        }

    }//GEN-LAST:event_btn_updateActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Pacientes mc = new Pacientes();
        mc.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void combo_tiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_tiposActionPerformed
        llenar_combo_Exams();
    }//GEN-LAST:event_combo_tiposActionPerformed

    private void cmb_modalidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_modalidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_modalidadActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Agendar_cita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agendar_cita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agendar_cita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agendar_cita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Agendar_cita().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancel;
    public static javax.swing.JButton btn_save;
    public static javax.swing.JButton btn_update;
    private javax.swing.JCheckBox cb_no;
    private javax.swing.JCheckBox cb_si;
    public static javax.swing.JComboBox<String> cmb_especialidad;
    public static javax.swing.JComboBox<String> cmb_medico;
    public static javax.swing.JComboBox<String> cmb_modalidad;
    public static javax.swing.JComboBox<String> cmb_sede;
    public static javax.swing.JComboBox<String> combo_examen;
    public static javax.swing.JComboBox<String> combo_hora;
    public static javax.swing.JComboBox<String> combo_tipos;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    public static com.toedter.calendar.JDateChooser jc_date;
    public static javax.swing.JTextField txt_client;
    public static javax.swing.JTextField txt_turn;
    // End of variables declaration//GEN-END:variables
}
