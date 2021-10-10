/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Vehicle;
import model.VehicleList;

/**
 *
 * @author harshaljaiswal
 */
public class AddCarPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddCarPanel
     */
    VehicleList vehicleList;

    public AddCarPanel(VehicleList vehicleList) {
        initComponents();
        this.vehicleList = vehicleList;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtMake = new javax.swing.JTextField();
        chBoxAvaliable = new javax.swing.JCheckBox();
        jLabel10 = new javax.swing.JLabel();
        txtModel = new javax.swing.JTextField();
        txtYearOfMan = new javax.swing.JTextField();
        txtMaxSeats = new javax.swing.JTextField();
        txtSerialNo = new javax.swing.JTextField();
        txtMntnceDate = new javax.swing.JTextField();
        txtLicencePlate = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();

        jButton1.setText("add car");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Make");

        jLabel2.setText("Model");

        jLabel3.setText("Year of Manufacture");

        jLabel4.setText("Maximum Seats");

        jLabel5.setText("Serial Number");

        jLabel6.setText("Maintainane Date");

        jLabel7.setText("Licence Plate");

        jLabel8.setText("Avaliable");

        jLabel9.setText("City");

        txtMake.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        txtMake.setMinimumSize(new java.awt.Dimension(11, 29));

        chBoxAvaliable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chBoxAvaliableActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Add Details of the Car");
        jLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        txtModel.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        txtModel.setMinimumSize(new java.awt.Dimension(11, 29));

        txtYearOfMan.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        txtYearOfMan.setMinimumSize(new java.awt.Dimension(11, 29));

        txtMaxSeats.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        txtMaxSeats.setMinimumSize(new java.awt.Dimension(11, 29));

        txtSerialNo.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        txtSerialNo.setMinimumSize(new java.awt.Dimension(11, 29));

        txtMntnceDate.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        txtMntnceDate.setMinimumSize(new java.awt.Dimension(11, 29));

        txtLicencePlate.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        txtLicencePlate.setMinimumSize(new java.awt.Dimension(11, 29));
        txtLicencePlate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLicencePlateActionPerformed(evt);
            }
        });

        txtCity.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        txtCity.setMinimumSize(new java.awt.Dimension(11, 29));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(230, 230, 230))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8))
                                .addGap(222, 222, 222)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCity, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(chBoxAvaliable)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(239, 239, 239)
                                .addComponent(txtMake, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(153, 153, 153)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtLicencePlate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtMntnceDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtSerialNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtMaxSeats, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtYearOfMan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtModel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap())
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMake, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(txtModel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(txtYearOfMan, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtMaxSeats, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtSerialNo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtMntnceDate, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtLicencePlate, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(chBoxAvaliable))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jButton1)
                .addContainerGap(51, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        boolean valid = validateData();

        if (valid) {

            vehicleList.addVehicle(
                    txtMake.getText(),
                    txtModel.getText(),
                    Integer.parseInt(txtYearOfMan.getText()),
                    Integer.parseInt(txtMaxSeats.getText()),
                    txtSerialNo.getText(),
                    txtCity.getText(),
                    txtMntnceDate.getText(),
                    System.currentTimeMillis(),
                    chBoxAvaliable.isSelected(),
                    txtLicencePlate.getText()
            );

            JOptionPane.showMessageDialog(this, "Information Saved!");
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtLicencePlateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLicencePlateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLicencePlateActionPerformed

    private void chBoxAvaliableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chBoxAvaliableActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chBoxAvaliableActionPerformed

    private boolean validateData() {

        if (txtCity.getText().length() < 2 || !txtCity.getText().matches("[a-zA-Z]+")) {
            JOptionPane.showMessageDialog(this, "Enter proper City name.");
            return false;
        }

        if (txtMake.getText().length() < 2 || !txtMake.getText().matches("[a-zA-Z]+")) {
            JOptionPane.showMessageDialog(this, "Enter proper Make name.");
            return false;
        }

        if (txtModel.getText().length() < 1) {
            JOptionPane.showMessageDialog(this, "Enter proper Model name.");
            return false;
        }

        if (Integer.parseInt(txtMaxSeats.getText()) < 1 || Integer.parseInt(txtMaxSeats.getText()) > 10) {
            JOptionPane.showMessageDialog(this, "Not sure about the seats if that exists, please input a different max seat number.");
            return false;
        }

        if (txtModel.getText().length() < 1) {
            JOptionPane.showMessageDialog(this, "Enter proper Model name.");
            return false;
        }

        if (!isValidDate(txtMntnceDate.getText())) {
            JOptionPane.showMessageDialog(this, "Enter proper date in mm/dd/yyyy format");
            return false;
        }

        if (!txtSerialNo.getText().matches("[0-9]+") || txtSerialNo.getText().length() != 10) {
            JOptionPane.showMessageDialog(this, "Enter proper 10 digit Serial Number");
            return false;
        }

        if (!txtYearOfMan.getText().matches("[0-9]+") || txtYearOfMan.getText().length() != 4 || Integer.parseInt(txtYearOfMan.getText()) > 2021 || Integer.parseInt(txtYearOfMan.getText()) < 2000) {
            JOptionPane.showMessageDialog(this, "Enter proper 4 digit Year of Manufacture");
            return false;
        }

        if (!chBoxAvaliable.isSelected()) {
            JOptionPane.showMessageDialog(this, "Enter check the avaliblity bheck box");
            return false;
        }
        if (!chBoxAvaliable.isSelected()) {
            JOptionPane.showMessageDialog(this, "Enter check the avaliblity bheck box");
            return false;
        }

        if (txtLicencePlate.getText().length() != 6) {

            JOptionPane.showMessageDialog(this, "Enter proper licence plate");
            return false;
        }

        for (Vehicle v : vehicleList.getVehicleList()) {
            if (v.getLicencePlate().matches(txtLicencePlate.getText())) {
                JOptionPane.showMessageDialog(this, "Enter unique licence plate");
                return false;
            }
        }

        return true;
    }

    public static boolean isValidDate(String strDate) {
        if (strDate.trim().equals("")) {
            return true;
        } else {

            SimpleDateFormat sdfrmt = new SimpleDateFormat("MM/dd/yyyy");
            sdfrmt.setLenient(false);

            try {
                Date javaDate = sdfrmt.parse(strDate);
            } catch (ParseException e) {
                return false;
            }
            return true;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox chBoxAvaliable;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtLicencePlate;
    private javax.swing.JTextField txtMake;
    private javax.swing.JTextField txtMaxSeats;
    private javax.swing.JTextField txtMntnceDate;
    private javax.swing.JTextField txtModel;
    private javax.swing.JTextField txtSerialNo;
    private javax.swing.JTextField txtYearOfMan;
    // End of variables declaration//GEN-END:variables

}
