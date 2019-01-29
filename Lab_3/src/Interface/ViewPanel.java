/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.Product;
import javax.swing.JOptionPane;
import Business.ProductDirectory;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;
/**
 *
 * @author info
 */
public class ViewPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewPanel
     */
    private ProductDirectory prodDir;
    private Product product;
    private JPanel rightPanel;
    ViewPanel(JPanel rightPanel ,Product prod, ProductDirectory prodDir) {
        initComponents();
        this.product=prod;
        this.prodDir = prodDir;
        this.rightPanel=rightPanel;
        txtAvailablity.setText(String.valueOf(prod.getAvailNum()));
        txtPrice.setText(String.valueOf(prod.getPrice()));
        txtProdName.setText(prod.getName());
        txtDesc.setText(prod.getDescription());
        btnSave.setEnabled(false);
        btnUpdate.setEnabled(true);
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtPrice = new javax.swing.JTextField();
        txtProdName = new javax.swing.JTextField();
        txtAvailablity = new javax.swing.JTextField();
        lblBankName = new javax.swing.JLabel();
        lblRoutingNo = new javax.swing.JLabel();
        lblAccNo = new javax.swing.JLabel();
        lblHead = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtDesc = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 153, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtPrice.setEnabled(false);
        add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 151, 88, -1));

        txtProdName.setEnabled(false);
        add(txtProdName, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 59, 88, -1));

        txtAvailablity.setEnabled(false);
        add(txtAvailablity, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 105, 88, -1));

        lblBankName.setText("Price");
        add(lblBankName, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 157, -1, -1));

        lblRoutingNo.setText("Product Name");
        add(lblRoutingNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 65, -1, -1));

        lblAccNo.setText("Availablity");
        add(lblAccNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 112, 88, 14));

        lblHead.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblHead.setText("View Product");
        add(lblHead, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 19, -1, -1));

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 245, -1, -1));

        btnSave.setText("Save");
        btnSave.setEnabled(false);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 245, 88, -1));

        jLabel1.setText("Description");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 203, -1, -1));

        txtDesc.setEnabled(false);
        add(txtDesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 197, 88, -1));

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 286, 221, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
            txtAvailablity.setEnabled(true);
            txtPrice.setEnabled(true);
            txtProdName.setEnabled(true);
            txtDesc.setEnabled(true);
            btnSave.setEnabled(true);
            btnUpdate.setEnabled(false);
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
            try{
            Double.parseDouble(txtPrice.getText());
            Integer.parseInt(txtAvailablity.getText());       
            }
            catch(NumberFormatException e){    
            JOptionPane.showMessageDialog(null, "The price and availiblity of the item must be number !");  
            return;
             }
            product.setName(txtProdName.getText());
            product.setPrice(Double.parseDouble(txtPrice.getText()));
            product.setAvailNum(Integer.parseInt(txtAvailablity.getText()));
            product.setDescription(txtDesc.getText());
            txtAvailablity.setEnabled(false);
            txtPrice.setEnabled(false);
            txtProdName.setEnabled(false);
            txtDesc.setEnabled(false);
            btnSave.setEnabled(false);
            btnUpdate.setEnabled(true);
            JOptionPane.showMessageDialog(null, "Account updated successfully");        
        
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
//            rightPanel.remove(this);
//            CardLayout layout=(CardLayout) rightPanel.getLayout();
//            layout.previous(rightPanel);
        this.rightPanel.remove(this);
        CardLayout layout =(CardLayout)this.rightPanel.getLayout();
        Component[] comps = this.rightPanel.getComponents();
        for (Component comp: comps){
            if(comp instanceof ManageProdPanel){
                ManageProdPanel manageP = (ManageProdPanel)comp;
                manageP.populate();
            }
        }
        layout.previous(rightPanel);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblAccNo;
    private javax.swing.JLabel lblBankName;
    private javax.swing.JLabel lblHead;
    private javax.swing.JLabel lblRoutingNo;
    private javax.swing.JTextField txtAvailablity;
    private javax.swing.JTextField txtDesc;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtProdName;
    // End of variables declaration//GEN-END:variables
}
