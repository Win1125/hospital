package interfacez;

import java.awt.Image;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import laboratorio_clinico.conexion_MYSQL;

public class Reportes extends javax.swing.JFrame {

    // Esrtablecer conexion a MYSQL
    conexion_MYSQL c = new conexion_MYSQL();
    Connection conectar = c.obtener_conexion();

    DefaultTableModel model;

    String[] Campos_tabla_1 = {"Mes", "CantidadPacientes", "Modalidad"};
    String[] Campos_tabla_2 = {"Mes", "CantidadPacientes", "Sede", "Modalidad"};
    String[] Campos_tabla_3 = {"Mes", "Sede", "Modalidad", "Nombre", "Descripcion"};
    String[] Campos_tabla_4 = {"Mes", "Sede", "Modalidad", "Nombre", "Fecha"};
    String[] Campos_tabla_5 = {"Mes", "Sede", "Modalidad", "Nombre", "Fecha"};
    String[] informacion = new String[50];

    public Reportes() {
        initComponents();
        this.setLocationRelativeTo(null);

        Image icon = new ImageIcon(getClass().getResource("/images/icon.png")).getImage();
        setIconImage(icon);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        table_diagnosticos = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_r = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btn_cancelar = new javax.swing.JButton();
        btn_reporte1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_pacientes = new javax.swing.JTable();
        btn_cancelar1 = new javax.swing.JButton();
        btn_reporte2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        btn_cancelar2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        cmb_diagnosticos = new javax.swing.JComboBox<>();
        jScrollPane6 = new javax.swing.JScrollPane();
        table_r1 = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        cmb_examenes = new javax.swing.JComboBox<>();
        btn_cancelar5 = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        table_r2 = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        cmb_inasistencias = new javax.swing.JComboBox<>();
        btn_cancelar6 = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        table_r3 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "REPORTES", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 18))); // NOI18N

        table_diagnosticos.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        table_r.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mes", "Cantidad", "Pacientes", "Modalidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table_r);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Generar reporte:");

        btn_cancelar.setBackground(new java.awt.Color(255, 0, 0));
        btn_cancelar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_cancelar.setForeground(new java.awt.Color(255, 255, 255));
        btn_cancelar.setText("Salir");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        btn_reporte1.setBackground(new java.awt.Color(102, 0, 102));
        btn_reporte1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_reporte1.setForeground(new java.awt.Color(255, 255, 255));
        btn_reporte1.setText("Generar");
        btn_reporte1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reporte1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_reporte1)
                        .addGap(18, 18, 18)
                        .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btn_reporte1)
                    .addComponent(btn_cancelar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        table_diagnosticos.addTab("Consolidado Modalidad", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Generar Reporte");

        table_pacientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mes", "CantidadPacientes ", "Sede ", "Modalidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(table_pacientes);

        btn_cancelar1.setBackground(new java.awt.Color(255, 0, 0));
        btn_cancelar1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_cancelar1.setForeground(new java.awt.Color(255, 255, 255));
        btn_cancelar1.setText("Salir");
        btn_cancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelar1ActionPerformed(evt);
            }
        });

        btn_reporte2.setBackground(new java.awt.Color(0, 102, 204));
        btn_reporte2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_reporte2.setForeground(new java.awt.Color(255, 255, 255));
        btn_reporte2.setText("Generar");
        btn_reporte2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reporte2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_reporte2)
                        .addGap(18, 18, 18)
                        .addComponent(btn_cancelar1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cancelar1)
                    .addComponent(btn_reporte2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        table_diagnosticos.addTab("Pacientes Sede", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        btn_cancelar2.setBackground(new java.awt.Color(255, 0, 0));
        btn_cancelar2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_cancelar2.setForeground(new java.awt.Color(255, 255, 255));
        btn_cancelar2.setText("Salir");
        btn_cancelar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelar2ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Selecccione un mes");

        cmb_diagnosticos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        cmb_diagnosticos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_diagnosticosActionPerformed(evt);
            }
        });

        table_r1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mes ", "Sede ", "Modalidad ", "Nombre ", "Descripcion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(table_r1);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 624, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(45, 45, 45)
                        .addComponent(cmb_diagnosticos, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_cancelar2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_diagnosticos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cancelar2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        table_diagnosticos.addTab("Diagnostico Pacientes", jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Selecccione un mes");

        cmb_examenes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        cmb_examenes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_examenesActionPerformed(evt);
            }
        });

        btn_cancelar5.setBackground(new java.awt.Color(255, 0, 0));
        btn_cancelar5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_cancelar5.setForeground(new java.awt.Color(255, 255, 255));
        btn_cancelar5.setText("Salir");
        btn_cancelar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelar5ActionPerformed(evt);
            }
        });

        table_r2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mes", "Sede", "Modalidad", "Nombre", "Examenes"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane7.setViewportView(table_r2);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane7)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(45, 45, 45)
                        .addComponent(cmb_examenes, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 226, Short.MAX_VALUE)
                        .addComponent(btn_cancelar5, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_examenes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cancelar5))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        table_diagnosticos.addTab("Examenes Solicitados", jPanel5);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("Selecccione un mes");

        cmb_inasistencias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        cmb_inasistencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_inasistenciasActionPerformed(evt);
            }
        });

        btn_cancelar6.setBackground(new java.awt.Color(255, 0, 0));
        btn_cancelar6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_cancelar6.setForeground(new java.awt.Color(255, 255, 255));
        btn_cancelar6.setText("Salir");
        btn_cancelar6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelar6ActionPerformed(evt);
            }
        });

        table_r3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mes", "Sede", "Modalidad", "Nombre", "Fecha"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane8.setViewportView(table_r3);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane8)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(45, 45, 45)
                        .addComponent(cmb_inasistencias, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 226, Short.MAX_VALUE)
                        .addComponent(btn_cancelar6, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_inasistencias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cancelar6))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        table_diagnosticos.addTab("Inasistencias Pacientes", jPanel6);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(table_diagnosticos, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(table_diagnosticos, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelar1ActionPerformed
        dispose();
    }//GEN-LAST:event_btn_cancelar1ActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void btn_reporte1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reporte1ActionPerformed

        //REPORTE Consolidado mensual de la cantidad de pacientes ingresados a medicina general, especialidad o urgencias.
        String Query = "SELECT MONTH(citas.FechaCita) AS Mes, COUNT(*) AS CantidadPacientes, modalidadesconsulta.NombreModalidad FROM citas "
                + "JOIN modalidadesconsulta ON citas.ID_ModalidadConsulta = modalidadesconsulta.ID_ModalidadConsulta "
                + "GROUP BY Mes, modalidadesconsulta.NombreModalidad;";

        try {
            Statement st = conectar.createStatement();
            ResultSet rs = st.executeQuery(Query);

            model = new DefaultTableModel(null, Campos_tabla_1);

            while (rs.next()) {
                informacion[0] = rs.getString("Mes");
                informacion[1] = rs.getString("CantidadPacientes");
                informacion[2] = rs.getString("NombreModalidad");
                model.addRow(informacion);
            }
            table_r.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(Reportes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_reporte1ActionPerformed

    private void btn_cancelar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelar2ActionPerformed
        dispose();
    }//GEN-LAST:event_btn_cancelar2ActionPerformed

    private void btn_reporte2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reporte2ActionPerformed
        //REPORTE Número de pacientes ingresados en una sede específica para cada modalidad de consulta expresado por mes.

        String Query = "SELECT MONTH(citas.FechaCita) AS Mes, COUNT(*) AS CantidadPacientes, sedes.NombreSede, modalidadesconsulta.NombreModalidad FROM citas "
                + "JOIN sedes ON citas.ID_Sede = sedes.ID_Sede "
                + "JOIN modalidadesconsulta ON citas.ID_ModalidadConsulta = modalidadesconsulta.ID_ModalidadConsulta "
                + "GROUP BY Mes, sedes.NombreSede, modalidadesconsulta.NombreModalidad;";

        try {
            Statement st = conectar.createStatement();
            ResultSet rs = st.executeQuery(Query);

            model = new DefaultTableModel(null, Campos_tabla_2);

            while (rs.next()) {
                informacion[0] = rs.getString("Mes");
                informacion[1] = rs.getString("CantidadPacientes");
                informacion[2] = rs.getString("NombreSede");
                informacion[3] = rs.getString("NombreModalidad");
                model.addRow(informacion);
            }
            table_pacientes.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(Reportes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_reporte2ActionPerformed

    private void btn_cancelar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelar5ActionPerformed
        dispose();
    }//GEN-LAST:event_btn_cancelar5ActionPerformed

    private void btn_cancelar6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelar6ActionPerformed
        dispose();
    }//GEN-LAST:event_btn_cancelar6ActionPerformed

    //COMBOBOX DE LOS REPORTES DIAGNOSTICAS, EXAMENES E INASISTENCIAS

    private void cmb_diagnosticosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_diagnosticosActionPerformed

        int i = cmb_diagnosticos.getSelectedIndex()+1;
        
        try {
            String Query = "SELECT MONTH(citas.FechaCita) AS Mes, sedes.NombreSede, modalidadesconsulta.NombreModalidad, CONCAT(pacientes.Nombres, ' ', pacientes.Apellidos) AS NombreCompleto, diagnosticocita.Descripcion FROM citas "
                    + "JOIN sedes ON citas.ID_Sede = sedes.ID_Sede "
                    + "JOIN modalidadesconsulta ON citas.ID_ModalidadConsulta = modalidadesconsulta.ID_ModalidadConsulta "
                    + "JOIN pacientes ON citas.ID_Paciente = pacientes.ID_Paciente "
                    + "LEFT JOIN diagnosticocita ON citas.ID_Cita = diagnosticocita.ID_Cita "
                    + "WHERE MONTH(citas.FechaCita) =" +i;

            model = new DefaultTableModel(null, Campos_tabla_3);
            
            Statement st = (Statement) conectar.createStatement();
            ResultSet rs = st.executeQuery(Query);
            
            while (rs.next()) {			
                informacion[0] = rs.getString("Mes");
                informacion[1] = rs.getString("NombreSede");
                informacion[2] = rs.getString("NombreModalidad");
                informacion[3] = rs.getString("NombreCompleto");
                informacion[4] = rs.getString("Descripcion");
                model.addRow(informacion);
            }
            table_r1.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(Reportes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cmb_diagnosticosActionPerformed

    private void cmb_examenesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_examenesActionPerformed
        int i = cmb_examenes.getSelectedIndex()+1;
        
        try {
            String Query = "SELECT MONTH(c.FechaCita) AS Mes, s.NombreSede, mc.NombreModalidad, CONCAT(p.Nombres, ' ', p.Apellidos) AS NombreCompleto, c.Examen FROM citas c JOIN sedes s ON c.ID_Sede = s.ID_Sede JOIN modalidadesconsulta mc ON c.ID_ModalidadConsulta = mc.ID_ModalidadConsulta JOIN pacientes p ON c.ID_Paciente = p.ID_Paciente WHERE MONTH(c.FechaCita) = "+i;

            model = new DefaultTableModel(null, Campos_tabla_3);
            
            Statement st = (Statement) conectar.createStatement();
            ResultSet rs = st.executeQuery(Query);
            
            while (rs.next()) {			
                informacion[0] = rs.getString("Mes");
                informacion[1] = rs.getString("NombreSede");
                informacion[2] = rs.getString("NombreModalidad");
                informacion[3] = rs.getString("NombreCompleto");
                informacion[4] = rs.getString("Examen");
                model.addRow(informacion);
            }
            table_r2.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(Reportes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cmb_examenesActionPerformed

    private void cmb_inasistenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_inasistenciasActionPerformed
        int i = cmb_inasistencias.getSelectedIndex()+1;
        
        System.out.println("i: "+i);
        
        try {
            String Query = "SELECT MONTH(citas.FechaCita) AS Mes, sedes.NombreSede, modalidadesconsulta.NombreModalidad, CONCAT(pacientes.Nombres, ' ', pacientes.Apellidos) AS NombreCompleto, citas.FechaCita FROM citas "
                    + "JOIN sedes ON citas.ID_Sede = sedes.ID_Sede "
                    + "JOIN modalidadesconsulta ON citas.ID_ModalidadConsulta = modalidadesconsulta.ID_ModalidadConsulta "
                    + "JOIN pacientes ON citas.ID_Paciente = pacientes.ID_Paciente "
                    + "WHERE MONTH(citas.FechaCita) = "+i+" AND citas.ID_EstadoCita = 0;";

            System.out.println("query: "+Query);
            
            model = new DefaultTableModel(null, Campos_tabla_5);
            
            Statement st = (Statement) conectar.createStatement();
            ResultSet rs = st.executeQuery(Query);
            
            while (rs.next()) {	
                informacion[0] = rs.getString("Mes");
                informacion[1] = rs.getString("NombreSede");
                informacion[2] = rs.getString("NombreModalidad");
                informacion[3] = rs.getString("NombreCompleto");
                informacion[4] = rs.getString("FechaCita");
                model.addRow(informacion);
            }
            table_r3.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(Reportes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cmb_inasistenciasActionPerformed

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
            java.util.logging.Logger.getLogger(Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Reportes().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_cancelar1;
    private javax.swing.JButton btn_cancelar2;
    private javax.swing.JButton btn_cancelar5;
    private javax.swing.JButton btn_cancelar6;
    private javax.swing.JButton btn_reporte1;
    private javax.swing.JButton btn_reporte2;
    private javax.swing.JComboBox<String> cmb_diagnosticos;
    private javax.swing.JComboBox<String> cmb_examenes;
    private javax.swing.JComboBox<String> cmb_inasistencias;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTabbedPane table_diagnosticos;
    private javax.swing.JTable table_pacientes;
    private javax.swing.JTable table_r;
    private javax.swing.JTable table_r1;
    private javax.swing.JTable table_r2;
    private javax.swing.JTable table_r3;
    // End of variables declaration//GEN-END:variables
}
