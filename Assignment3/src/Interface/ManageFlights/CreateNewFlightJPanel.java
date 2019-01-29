/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.ManageFlights;

import Business.Airliner;
import Business.Flight;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author yanhongchen
 */
public class CreateNewFlightJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateNewFlightJPanel
     */
    JPanel userProcessContainer;
    Airliner airliner; 
    CreateNewFlightJPanel(JPanel userProcessContainer, Airliner airliner) {
        initComponents();
        this.airliner=airliner;
        this.userProcessContainer=userProcessContainer;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        dateTxtField = new javax.swing.JTextField();
        Origin = new javax.swing.JLabel();
        originTxtField = new javax.swing.JTextField();
        createBtn = new javax.swing.JButton();
        backButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        nameTxtField = new javax.swing.JTextField();
        Origin1 = new javax.swing.JLabel();
        destinationTxtField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        dateSectionTxtField = new javax.swing.JTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Create New Flight");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Flight Date:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 100, 40));

        dateTxtField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        dateTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateTxtFieldActionPerformed(evt);
            }
        });
        add(dateTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 210, -1));

        Origin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Origin.setText("Origin:");
        add(Origin, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 110, 30));

        originTxtField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add(originTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, 210, 30));

        createBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        createBtn.setText("Create Flight");
        createBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtnActionPerformed(evt);
            }
        });
        add(createBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, 200, -1));

        backButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        backButton1.setText("<< Back");
        backButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButton1ActionPerformed(evt);
            }
        });
        add(backButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, 120, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Flight Name:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, -1, 30));

        nameTxtField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add(nameTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 210, -1));

        Origin1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Origin1.setText("Destination");
        add(Origin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 110, 30));

        destinationTxtField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add(destinationTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 210, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Date Section:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 100, 40));

        dateSectionTxtField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        dateSectionTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateSectionTxtFieldActionPerformed(evt);
            }
        });
        add(dateSectionTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 210, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed
        // TODO add your handling code here:
        
        Flight flight= airliner.getFlightDirectory().addFlight();
        if(nameTxtField.getText().isEmpty()||dateTxtField.getText().isEmpty()||originTxtField.getText().isEmpty()||
                destinationTxtField.getText().isEmpty()||dateSectionTxtField.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Empty content, Please recreate!");
            return;
        }
        flight.setFlightName(nameTxtField.getText());
        flight.setDate(dateTxtField.getText());
        flight.setDateSection(dateSectionTxtField.getText());
        flight.setOrigin(originTxtField.getText());
        flight.setDestination(destinationTxtField.getText());
        JOptionPane.showMessageDialog(null, "Product successfully added", "Warning", JOptionPane.INFORMATION_MESSAGE);
        nameTxtField.setText("");
        dateTxtField.setText("");
        dateSectionTxtField.setText("");
        originTxtField.setText("");
        destinationTxtField.setText("");
    }//GEN-LAST:event_createBtnActionPerformed

    private void backButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        MangeFlightCatalogJPanel manageProductCatalogJPanel = (MangeFlightCatalogJPanel) component;
        manageProductCatalogJPanel.refreshTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backButton1ActionPerformed

    private void dateTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateTxtFieldActionPerformed

    private void dateSectionTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateSectionTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateSectionTxtFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Origin;
    private javax.swing.JLabel Origin1;
    private javax.swing.JButton backButton1;
    private javax.swing.JButton createBtn;
    private javax.swing.JTextField dateSectionTxtField;
    private javax.swing.JTextField dateTxtField;
    private javax.swing.JTextField destinationTxtField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField nameTxtField;
    private javax.swing.JTextField originTxtField;
    // End of variables declaration//GEN-END:variables
}