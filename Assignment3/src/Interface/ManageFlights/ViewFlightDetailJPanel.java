/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.ManageFlights;

import Business.Flight;
import javax.swing.JPanel;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
/**
 *
 * @author yanhongchen
 */
public class ViewFlightDetailJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SearchNewFlightJPanel
     */
    JPanel userProcessContainer;
    Flight flight;
    ViewFlightDetailJPanel(JPanel userProcessContainer, Flight f) {
          initComponents();
          this.flight=f;
          this.userProcessContainer=userProcessContainer;
          nameTxtField.setText(f.getFlightName());
          dateTxtField.setText(f.getDate());
          dateSectionTxtField.setText(f.getDateSection());
          originTxtField.setText(f.getOrigin());
          destinationTxtField.setText(f.getDestination());
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
        updateBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        saveBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        dateTxtField = new javax.swing.JTextField();
        Origin = new javax.swing.JLabel();
        originTxtField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        nameTxtField = new javax.swing.JTextField();
        Origin1 = new javax.swing.JLabel();
        destinationTxtField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        dateSectionTxtField = new javax.swing.JTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("View  flight  Detail");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, -1, -1));

        updateBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });
        add(updateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 330, 176, -1));

        backBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        backBtn.setText("<< Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 150, -1));

        saveBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        saveBtn.setText("SAVE");
        saveBtn.setEnabled(false);
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });
        add(saveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 380, 180, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Flight Date:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 100, 40));

        dateTxtField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        dateTxtField.setEnabled(false);
        dateTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateTxtFieldActionPerformed(evt);
            }
        });
        add(dateTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 210, -1));

        Origin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Origin.setText("Origin:");
        add(Origin, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 110, 30));

        originTxtField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        originTxtField.setEnabled(false);
        add(originTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 210, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Flight Name:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, -1, 30));

        nameTxtField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nameTxtField.setEnabled(false);
        add(nameTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 210, -1));

        Origin1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Origin1.setText("Destination");
        add(Origin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 110, 30));

        destinationTxtField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        destinationTxtField.setEnabled(false);
        add(destinationTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, 210, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Date Section:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 100, 40));

        dateSectionTxtField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        dateSectionTxtField.setEnabled(false);
        dateSectionTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateSectionTxtFieldActionPerformed(evt);
            }
        });
        add(dateSectionTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, 210, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // TODO add your handling code here:
        nameTxtField.setEnabled(true);
        dateTxtField.setEnabled(true);
        dateSectionTxtField.setEnabled(true);
        originTxtField.setEnabled(true);
        destinationTxtField.setEnabled(true);
        saveBtn.setEnabled(true);
        updateBtn.setEnabled(false);
    }//GEN-LAST:event_updateBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        MangeFlightCatalogJPanel mangeFlightCatalogJPanel = (MangeFlightCatalogJPanel) component;
        mangeFlightCatalogJPanel.refreshTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        // TODO add your handling code here:
        flight.setFlightName(nameTxtField.getText());
        flight.setDate(dateTxtField.getText());
        flight.setDateSection(dateSectionTxtField.getText());
        flight.setOrigin(originTxtField.getText());
        flight.setDestination(destinationTxtField.getText());
        JOptionPane.showMessageDialog(null, "flight successfully uppdate", "Warning", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_saveBtnActionPerformed

    private void dateTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateTxtFieldActionPerformed

    private void dateSectionTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateSectionTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateSectionTxtFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Origin;
    private javax.swing.JLabel Origin1;
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField dateSectionTxtField;
    private javax.swing.JTextField dateTxtField;
    private javax.swing.JTextField destinationTxtField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField nameTxtField;
    private javax.swing.JTextField originTxtField;
    private javax.swing.JButton saveBtn;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
