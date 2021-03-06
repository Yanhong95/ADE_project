/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.ManageCustomer;

import Business.Flight;
import java.awt.CardLayout;
import javax.swing.JPanel;
import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author yanhongchen
 */
public class ViewTicketJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewTicketJPanel
     */
   JPanel userProcessContainer;
   Flight flight;
   ViewTicketJPanel(JPanel userProcessContainer, Flight f){
        initComponents();
        this.flight= f;
        this.userProcessContainer=userProcessContainer;
        nameTxtField.setText(f.getFlightName());
        dateTxtField.setText(f.getDate());
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
        bookBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        dateTxtField = new javax.swing.JTextField();
        Origin = new javax.swing.JLabel();
        originTxtField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        nameTxtField = new javax.swing.JTextField();
        Origin1 = new javax.swing.JLabel();
        destinationTxtField = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("View  flight  Detail");

        bookBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bookBtn.setText("Book tickets>>");
        bookBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookBtnActionPerformed(evt);
            }
        });

        backBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        backBtn.setText("<< Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Flight Date:");

        dateTxtField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        dateTxtField.setEnabled(false);
        dateTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateTxtFieldActionPerformed(evt);
            }
        });

        Origin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Origin.setText("Origin:");

        originTxtField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        originTxtField.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Flight Name:");

        nameTxtField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nameTxtField.setEnabled(false);

        Origin1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Origin1.setText("Destination");

        destinationTxtField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        destinationTxtField.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 639, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 139, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(100, 100, 100)
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(jLabel5)
                            .addGap(52, 52, 52)
                            .addComponent(nameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(30, 30, 30)
                            .addComponent(dateTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(Origin, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(20, 20, 20)
                            .addComponent(originTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(Origin1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(20, 20, 20)
                            .addComponent(destinationTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(20, 20, 20)
                            .addComponent(bookBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 140, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 411, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 51, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(28, 28, 28)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(6, 6, 6)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dateTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(10, 10, 10)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Origin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(originTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(20, 20, 20)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Origin1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(destinationTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(60, 60, 60)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(backBtn)
                        .addComponent(bookBtn))
                    .addGap(0, 51, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bookBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookBtnActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_bookBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:   
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    private void dateTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateTxtFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Origin;
    private javax.swing.JLabel Origin1;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton bookBtn;
    private javax.swing.JTextField dateTxtField;
    private javax.swing.JTextField destinationTxtField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField nameTxtField;
    private javax.swing.JTextField originTxtField;
    // End of variables declaration//GEN-END:variables
}
