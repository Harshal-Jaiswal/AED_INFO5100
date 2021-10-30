/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import Model.Encounter;
import Model.MedSystem;
import Model.Patient;
import Model.Person;
import Model.VitalSigns;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author harshaljaiswal
 */
public class ViewPatient extends javax.swing.JPanel {

    /**
     * Creates new form ViewPatient
     */
   
    MedSystem ms;
    public ViewPatient(MedSystem ms) {
        initComponents();
        this.ms =ms;
        btnAddPatient.setEnabled(false);
        displayPatient();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtTemp = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtBP = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TxtPulse = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        diag = new javax.swing.JTextField();
        btnAddPatient = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "gender", "Address", "Encounter times"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("Existing Patients");

        jButton1.setText("Add vitals");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Temperature");

        jLabel2.setText("Blood Pressure");

        jLabel4.setText("Pulse Rate");

        jLabel5.setText("Diagnosis");

        btnAddPatient.setText("Add patient");
        btnAddPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPatientActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxtPulse, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(diag)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnAddPatient)
                                        .addGap(17, 17, 17))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(txtBP, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(28, 28, 28)
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtTemp, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(26, 26, 26))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(347, 347, 347)
                                    .addComponent(jButton1))))))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtBP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtTemp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(TxtPulse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(diag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddPatient))
                .addContainerGap(64, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int selectedRow = jTable1.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please Select a row to Add Vital stats.");
            return;
        }

        btnAddPatient.setEnabled(true);
        //         Date resultdate = new Date(System.currentTimeMillis());
        //        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        //
        //        Person p = ms.searchUser((int) model.getValueAt(selectedRow, 0));
        //
        //        System.out.println("temp: "+txtTemp.getText() +" "+TxtPulse.getText() +" "+ txtBP.getText());
        //        VitalSigns vs = new VitalSigns(Integer.valueOf(txtTemp.getText()) , Integer.valueOf(TxtPulse.getText()), Integer.valueOf(txtBP.getText()));
        //        Encounter enc = new Encounter(vs , resultdate, diag.getText());
        //        //fullName, residence, gender, dob, id
        //        Patient pat = new Patient(p.getFullName(), p.getResidence(), p.getGender(), p.getDob(), p.getId(), enc);
        //        int bodyTemp,
        //int pulseRate,
        //int respRate,
        //int bloodPressure
        //        ms.deleteByLicencePlate(model.getValueAt(selectedRow, 8).toString());

    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnAddPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPatientActionPerformed
        // TODO add your handling code here:
        //////

        int selectedRow = jTable1.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please Select a row to Add Vital stats.");
            return;
        }

        btnAddPatient.setEnabled(true);
        Date resultdate = new Date(System.currentTimeMillis());
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        Person p = ms.searchUser((int) model.getValueAt(selectedRow, 0));

        System.out.println("temp: "+txtTemp.getText() +" "+TxtPulse.getText() +" "+ txtBP.getText());
        VitalSigns vs = new VitalSigns(Integer.valueOf(txtTemp.getText()) , Integer.valueOf(TxtPulse.getText()), Integer.valueOf(txtBP.getText()));
        Encounter enc = new Encounter(vs , resultdate, diag.getText());
 
        ms.encounterPatient( p.getId(), enc);
        
        displayPatient();
        btnAddPatient.setEnabled(false);
    }//GEN-LAST:event_btnAddPatientActionPerformed


    
    private void displayPatient() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
       model.setRowCount(0);
        for (Patient v : ms.getPatientList().getPatients()) {
          
            Object[] row = new Object[5];
            row[0] = v.getId();
            row[1] = v.getFullName();
            row[2] = v.getGender();
            row[3] = v.getResidence().getAddress();
            row[4] = v.getEncounterHistory().getEncounterHistory().size();

            model.addRow(row);
        }

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TxtPulse;
    private javax.swing.JButton btnAddPatient;
    private javax.swing.JTextField diag;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtBP;
    private javax.swing.JTextField txtTemp;
    // End of variables declaration//GEN-END:variables
}