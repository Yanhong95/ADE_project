/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Customer.Process;

import Business.Address.Address;
import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Role.Customer;
import Business.UserAccount.User;
import Interface.Customer.CustomerHomePanel;
import java.awt.CardLayout;
import javax.swing.JOptionPane;

/**
 *
 * @author chenchen
 */
public class CustomerInfoManagePanel extends javax.swing.JPanel {

    private javax.swing.JPanel rightPanel;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    private EcoSystem system;
    private User user;
    /**
     * Creates new form CustomerInfoManagePanel
     */
    public CustomerInfoManagePanel(EcoSystem system, User user, javax.swing.JPanel rightPanel) {
        initComponents();
        this.system = system;
        this.user = user;
        this.rightPanel = rightPanel;
        showInfo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbName = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        lbID = new javax.swing.JLabel();
        lbAddress = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtStreet = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        txtState = new javax.swing.JTextField();
        txtZip = new javax.swing.JTextField();
        btnAddr = new javax.swing.JButton();
        btnNameMo = new javax.swing.JButton();
        btnPwd = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        lbAddress1 = new javax.swing.JLabel();
        lbAddress2 = new javax.swing.JLabel();
        lbAddress3 = new javax.swing.JLabel();

        lbName.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbName.setText("Username: ");

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lbID.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbID.setText("User ID: ");

        lbAddress.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbAddress.setText("Main Address: ");

        txtID.setEditable(false);

        txtName.setEditable(false);

        txtStreet.setEditable(false);

        txtCity.setEditable(false);

        txtState.setEditable(false);

        txtZip.setEditable(false);

        btnAddr.setText("Edit Addresses");
        btnAddr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddrActionPerformed(evt);
            }
        });

        btnNameMo.setText("Modify Username");
        btnNameMo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNameMoActionPerformed(evt);
            }
        });

        btnPwd.setText("Change Password ");
        btnPwd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPwdActionPerformed(evt);
            }
        });

        btnSave.setText("Save All");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        lbAddress1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbAddress1.setText("City:");

        lbAddress2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbAddress2.setText("Zip:");

        lbAddress3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbAddress3.setText("State:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(lbName, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lbID, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(431, 431, 431)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnNameMo, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnAddr, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(77, 77, 77)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnPwd, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                                    .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lbAddress2)
                                        .addComponent(lbAddress1))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtCity, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                                        .addComponent(txtZip))
                                    .addGap(24, 24, 24)
                                    .addComponent(lbAddress3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtState, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                                    .addGap(6, 6, 6))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(lbAddress)
                                    .addGap(19, 19, 19)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtID, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                                        .addComponent(txtName)
                                        .addComponent(txtStreet)))))
                        .addContainerGap(149, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbID, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbName, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtStreet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbAddress1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbAddress3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtZip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbAddress2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNameMo)
                    .addComponent(btnPwd))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddr)
                    .addComponent(btnSave))
                .addGap(51, 51, 51))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        rightPanel.removeAll();
        CustomerHomePanel panel = new CustomerHomePanel(system,user,rightPanel);
        rightPanel.add("CustomerHomePanel", panel);
        CardLayout cl = (CardLayout) rightPanel.getLayout();
        cl.previous(rightPanel);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnNameMoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNameMoActionPerformed
        // TODO add your handling code here:
        txtName.setEditable(true);
        txtName.setBackground(new java.awt.Color(204, 255, 204));
    }//GEN-LAST:event_btnNameMoActionPerformed

    private void btnPwdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPwdActionPerformed
        // TODO add your handling code here:
        ChangePasswordPanel panel = new ChangePasswordPanel(system,user,rightPanel);
        rightPanel.add("ChangePasswordPanel", panel);
        CardLayout cl = (CardLayout) rightPanel.getLayout();
        cl.next(rightPanel);
    }//GEN-LAST:event_btnPwdActionPerformed

    private void btnAddrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddrActionPerformed
        // TODO add your handling code here:
        EditAddressPanel panel = new EditAddressPanel(system,user,rightPanel);
        rightPanel.add("EditAddressPanel",panel);
        CardLayout cl = (CardLayout) rightPanel.getLayout();
        cl.next(rightPanel);
    }//GEN-LAST:event_btnAddrActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        String newname = txtName.getText();
        user.setUsername(newname);
        dB4OUtil.storeSystem(system);
        JOptionPane.showMessageDialog(null, "Save Successfully");
        showInfo();
    }//GEN-LAST:event_btnSaveActionPerformed

    public void showInfo(){
        long id = user.getUserID();
        String name = user.getUsername();
        Customer cus = (Customer)user;
        Address mainAddr = null;
        if(cus.getAddressDirectory().size()>0){
            mainAddr = cus.getAddressDirectory().get(0);
        }
        
        txtID.setText(String.valueOf(id));
        txtName.setText(name);
        if(mainAddr!=null){
            txtStreet.setText(mainAddr.getStreet());
            txtCity.setText(mainAddr.getCity());
            txtState.setText(mainAddr.getState());
            txtZip.setText(String.valueOf(mainAddr.getZip()));
        }
        else{
            txtStreet.setText("");
            txtCity.setText("");
            txtState.setText("");
            txtZip.setText("");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddr;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnNameMo;
    private javax.swing.JButton btnPwd;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel lbAddress;
    private javax.swing.JLabel lbAddress1;
    private javax.swing.JLabel lbAddress2;
    private javax.swing.JLabel lbAddress3;
    private javax.swing.JLabel lbID;
    private javax.swing.JLabel lbName;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtState;
    private javax.swing.JTextField txtStreet;
    private javax.swing.JTextField txtZip;
    // End of variables declaration//GEN-END:variables
}
