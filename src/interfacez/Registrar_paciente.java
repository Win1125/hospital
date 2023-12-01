package interfacez;

import java.awt.HeadlessException;
import java.awt.Image;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import laboratorio_clinico.conexion_MYSQL;

public class Registrar_paciente extends javax.swing.JFrame {

    // Esrtablecer conexion a MYSQL
    conexion_MYSQL c = new conexion_MYSQL();
    Connection conectar = c.obtener_conexion();

    public final void llenar_combo(String tabla, String valor, JComboBox combo, String order) {
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

    public Registrar_paciente() {
        initComponents();
        this.setLocationRelativeTo(null);
        Image icon = new ImageIcon(getClass().getResource("/images/icon.png")).getImage();
        setIconImage(icon);
        //desabilitar botones
        btn_update.setEnabled(false);
        btn_delete.setEnabled(false);
        llenar_combo("lugaresnacimiento", "NombreLugar", cmb_nacimiento, "NombreLugar");
        llenar_combo("estratos", "ID_Estrato", cmb_estrato, "ID_Estrato");
        llenar_combo("ciudadesresidencia", "NombreCiudadResidencia", cmb_residencia, "NombreCiudadResidencia");
        llenar_combo("ciudades", "NombreCiudad", cmb_eps, "NombreCiudad");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_cedula = new javax.swing.JTextField();
        txt_name = new javax.swing.JTextField();
        txt_lastname = new javax.swing.JTextField();
        txt_address = new javax.swing.JTextField();
        txt_cellphone = new javax.swing.JTextField();
        btn_register = new javax.swing.JButton();
        btn_calcel = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cmb_nacimiento = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        txt_phone = new javax.swing.JTextField();
        txt_address2 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        cmb_estrato = new javax.swing.JComboBox<>();
        cmb_eps = new javax.swing.JComboBox<>();
        cmb_residencia = new javax.swing.JComboBox<>();
        cb_si = new javax.swing.JCheckBox();
        cb_no = new javax.swing.JCheckBox();
        jc_date_p = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registro de Pacientes", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 18))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("LugarNacimiento:");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Nombres:");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Apellidos:");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("FechaNacimiento:");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("DireccionResidencia:");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("TelefonoCelular");

        btn_register.setBackground(new java.awt.Color(51, 204, 0));
        btn_register.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_register.setForeground(new java.awt.Color(255, 255, 255));
        btn_register.setText("Registrar");
        btn_register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registerActionPerformed(evt);
            }
        });

        btn_calcel.setBackground(new java.awt.Color(0, 0, 0));
        btn_calcel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_calcel.setForeground(new java.awt.Color(255, 255, 255));
        btn_calcel.setText("Cancelar");
        btn_calcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_calcelActionPerformed(evt);
            }
        });

        btn_update.setBackground(new java.awt.Color(255, 255, 0));
        btn_update.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_update.setText("Actualizar");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        btn_delete.setBackground(new java.awt.Color(255, 0, 0));
        btn_delete.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_delete.setForeground(new java.awt.Color(255, 255, 255));
        btn_delete.setText("Eliminar");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("Cédula:");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setText("DireccionCorrespondencia:");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setText("Correo:");

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setText("CiudadResidencia:");

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setText("Estrato:");

        jLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel12.setText("Adulto Mayor:");

        jLabel13.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel13.setText("TelefonoFijo");

        jLabel14.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel14.setText("CiudadAfiliación:");

        cb_si.setText("Si");

        cb_no.setText("No");

        jc_date_p.setBackground(new java.awt.Color(255, 255, 255));
        jc_date_p.setDateFormatString("yyyy/MM/dd");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_lastname, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1)
                            .addComponent(jLabel6)
                            .addComponent(jLabel13))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_register)
                                .addGap(39, 39, 39)
                                .addComponent(btn_update)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_cellphone, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                                    .addComponent(txt_phone, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                                    .addComponent(cmb_nacimiento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jc_date_p, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel5)
                            .addComponent(jLabel9)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10)
                            .addComponent(jLabel14)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txt_address2, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                                .addComponent(txt_address, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                                .addComponent(txt_email)
                                .addComponent(cmb_estrato, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cb_si)
                                .addGap(18, 18, 18)
                                .addComponent(cb_no))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(cmb_eps, javax.swing.GroupLayout.Alignment.LEADING, 0, 176, Short.MAX_VALUE)
                                .addComponent(cmb_residencia, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(btn_calcel, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(txt_address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txt_address2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_lastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jLabel11)
                        .addComponent(cmb_estrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jc_date_p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel1)
                    .addComponent(cmb_nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_residencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_cellphone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(cmb_eps, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txt_phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(cb_si)
                    .addComponent(cb_no))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_register)
                    .addComponent(btn_update)
                    .addComponent(btn_delete)
                    .addComponent(btn_calcel))
                .addContainerGap(18, Short.MAX_VALUE))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_calcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_calcelActionPerformed
        dispose();

        Buscar_paciente a = new Buscar_paciente();
        a.mostrar_pacientes();//llamamos metodos
        a.setVisible(true);//hacemos visible al metodo
    }//GEN-LAST:event_btn_calcelActionPerformed

    int adultoMayor = 0;
    int lugarnacimiento;
    int estrato;
    int ciudadesresidencia;
    int ciudadEps;

    private void btn_registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registerActionPerformed

        if (cb_si.isSelected()) {
            adultoMayor = 1;
        } else if (cb_no.isSelected()) {
            adultoMayor = 0;
        }

        lugarnacimiento = cmb_nacimiento.getSelectedIndex();
        estrato = cmb_estrato.getSelectedIndex();
        ciudadesresidencia = cmb_residencia.getSelectedIndex();
        ciudadEps = cmb_eps.getSelectedIndex();

        try {
            //llamado del stored procedures de MYSQL

            CallableStatement insert = conectar.prepareCall("{call IngresarPaciente(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
            insert.setString(1, txt_cedula.getText());
            insert.setString(2, txt_name.getText());
            insert.setString(3, txt_lastname.getText());
            insert.setString(4, ((JTextField) jc_date_p.getDateEditor().getUiComponent()).getText());
            insert.setInt(5, lugarnacimiento);
            insert.setString(6, txt_cellphone.getText());
            insert.setString(7, txt_phone.getText());
            insert.setString(8, txt_address2.getText());
            insert.setString(9, txt_address.getText());
            insert.setString(10, txt_email.getText());
            insert.setInt(11, estrato);
            insert.setInt(12, ciudadesresidencia);
            insert.setInt(13, ciudadEps);
            insert.setInt(14, adultoMayor);
            insert.setInt(15, 0);

            insert.execute();

            JOptionPane.showMessageDialog(null, "Paciente registrado con exito");
            this.dispose();

            Buscar_paciente a = new Buscar_paciente();
            a.mostrar_pacientes();//llamamos metodos
            a.setVisible(true);//hacemos visible al metodo

        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Registro Fallido!!!\n" + e);
        }
    }//GEN-LAST:event_btn_registerActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        
        if (cb_si.isSelected()) {
            adultoMayor = 1;
        } else if (cb_no.isSelected()) {
            adultoMayor = 0;
        }

        lugarnacimiento = cmb_nacimiento.getSelectedIndex();
        estrato = cmb_estrato.getSelectedIndex();
        ciudadesresidencia = cmb_residencia.getSelectedIndex();
        ciudadEps = cmb_eps.getSelectedIndex();
        
        try {
            //llamado del stored procedures update_paciente de MYSQL
            CallableStatement update = conectar.prepareCall("{call ActualizarPaciente(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
            update.setString(1, txt_cedula.getText());
            update.setString(2, txt_name.getText());
            update.setString(3, txt_lastname.getText());
            update.setString(4, ((JTextField) jc_date_p.getDateEditor().getUiComponent()).getText());
            update.setInt(5, lugarnacimiento);
            update.setString(6, txt_cellphone.getText());
            update.setString(7, txt_phone.getText());
            update.setString(8, txt_address2.getText());
            update.setString(9, txt_address.getText());
            update.setString(10, txt_email.getText());
            update.setInt(11, estrato);
            update.setInt(12, ciudadesresidencia);
            update.setInt(13, ciudadEps);
            update.setInt(14, adultoMayor);
            update.setInt(15, 0);

            //ejecutamos query
            update.execute();
            //presentamos mensaje de registro
            JOptionPane.showMessageDialog(null, "Datos del paciente actualizado");

            this.dispose();

            //llamado de un metodo de otra interfaz
            Buscar_paciente a = new Buscar_paciente();
            a.mostrar_pacientes();//llamamos metodos
            a.setVisible(true);//hacemos visible al metodo

        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Actualizacion de datos fallida!!!\n" + e);
        }
    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        try {
            //Preparacion de un Query para eliminar datos
            PreparedStatement pps = conectar.prepareStatement("DELETE FROM pacientes WHERE ID_Paciente='" + txt_cedula.getText() + "'");
            //ejecutamos query
            pps.execute();
            //Mensaje 
            JOptionPane.showMessageDialog(null, "Paciente eliminado");
            this.dispose();

            //llamado de un metodo de otra interfaz
            Buscar_paciente a = new Buscar_paciente();
            a.mostrar_pacientes();//llamamos metodos
            a.setVisible(true);//hacemos visible al metodo

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar paciente.\n" + e);
        }
    }//GEN-LAST:event_btn_deleteActionPerformed

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
            java.util.logging.Logger.getLogger(Registrar_paciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registrar_paciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registrar_paciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registrar_paciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Registrar_paciente().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btn_calcel;
    public static javax.swing.JButton btn_delete;
    public static javax.swing.JButton btn_register;
    public static javax.swing.JButton btn_update;
    private javax.swing.JCheckBox cb_no;
    private javax.swing.JCheckBox cb_si;
    private javax.swing.JComboBox<String> cmb_eps;
    private javax.swing.JComboBox<String> cmb_estrato;
    private javax.swing.JComboBox<String> cmb_nacimiento;
    private javax.swing.JComboBox<String> cmb_residencia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    public static com.toedter.calendar.JDateChooser jc_date_p;
    public static javax.swing.JTextField txt_address;
    public static javax.swing.JTextField txt_address2;
    public static javax.swing.JTextField txt_cedula;
    public static javax.swing.JTextField txt_cellphone;
    public static javax.swing.JTextField txt_email;
    public static javax.swing.JTextField txt_lastname;
    public static javax.swing.JTextField txt_name;
    public static javax.swing.JTextField txt_phone;
    // End of variables declaration//GEN-END:variables
}
