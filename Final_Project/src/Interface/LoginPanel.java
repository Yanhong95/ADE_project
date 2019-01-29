/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Organization.Organization;
import Business.UserAccount.User;
import Interface.Administrator.AdminOverviewPanel;
import Interface.ControllerPanel.AdminControlPanel;
import Interface.ControllerPanel.CustomerControlPanel;
import Interface.ControllerPanel.EmployeeControlPanel;
import Interface.ControllerPanel.SystemAdminControlPanel;
import Interface.Customer.CustomerHomePanel;
import Interface.Employee.BookManagerWorkArea;
import Interface.Employee.BookSupplierWorkArea;
import Interface.Employee.CommunityManagerWorkArea;
import Interface.Employee.SHCheckerWorkArea;
import Interface.Employee.SHManagerWorkArea;
import Interface.SystemAdmin.SystemAdminOverviewPanel;
import java.awt.CardLayout;
import javax.swing.JOptionPane;

/**
 *
 * @author chenchen
 */
public class LoginPanel extends javax.swing.JPanel {

    private javax.swing.JPanel rightPanel;
    private javax.swing.JSplitPane jSplitPane1;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    private EcoSystem system;
    private String type = "customer";
    /**
     * Creates new form LoginPanel
     */
    public LoginPanel(EcoSystem system, javax.swing.JPanel rightPanel) {
        initComponents();
        this.system = system;
        this.rightPanel = rightPanel;
    }
    
    public void setControlPanel(javax.swing.JSplitPane jSplitPane1){
        this.jSplitPane1 = jSplitPane1;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ptxtPd = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        lbLogin = new javax.swing.JLabel();
        btnCustomer = new javax.swing.JButton();
        btnSupplier = new javax.swing.JButton();
        lbUserID = new javax.swing.JLabel();
        txtUserID = new javax.swing.JTextField();
        lbPd = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        btnLogin.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        lbLogin.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbLogin.setText("Customer Login");

        btnCustomer.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnCustomer.setText("Customer Login");
        btnCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustomerActionPerformed(evt);
            }
        });

        btnSupplier.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnSupplier.setText("Employee Login");
        btnSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupplierActionPerformed(evt);
            }
        });

        lbUserID.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lbUserID.setText("UserID: ");

        lbPd.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lbPd.setText("Password: ");

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setText("Administrator Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(btnCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbUserID, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbPd, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtUserID, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ptxtPd, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(229, 229, 229)
                        .addComponent(lbLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 81, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(292, 292, 292)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCustomer)
                    .addComponent(btnSupplier)
                    .addComponent(jButton1))
                .addGap(29, 29, 29)
                .addComponent(lbLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUserID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbUserID))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPd)
                    .addComponent(ptxtPd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addComponent(btnLogin)
                .addContainerGap(95, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        String userID = txtUserID.getText();
        char[] passwordCharArray = ptxtPd.getPassword();
        String password = String.valueOf(passwordCharArray);

        if(userID==null||userID.equals("")){
            JOptionPane.showMessageDialog(null,"UserID Field can not be empty", "Alert", JOptionPane.ERROR_MESSAGE);
            return;
        }
        long id = 0;
        try{
            id = Long.parseLong(userID);
        } catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Wrong input type of UserID", "Alert", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(password==null||password.equals("")){
            JOptionPane.showMessageDialog(null,"Password Field can not be empty", "Alert", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if(type.equals("employee")){
            Employee employee = system.getEmployeeDirectory().authenticate(id, password);
            if(employee == null){
                JOptionPane.showMessageDialog(null,"Wrong ID or Password!", "Alert", JOptionPane.ERROR_MESSAGE);
                return;
            }
            rightPanel.removeAll();
            EmployeeControlPanel control = new EmployeeControlPanel(system,employee,jSplitPane1,rightPanel);
            jSplitPane1.setLeftComponent(control);
            if(employee.getOrg().getType().equals(Organization.Type.BookManage)){
                BookManagerWorkArea panel = new BookManagerWorkArea(system,employee,rightPanel);
                rightPanel.add("BookManagerWorkArea", panel);
            }
            else if(employee.getOrg().getType().equals(Organization.Type.Community)){
                CommunityManagerWorkArea panel = new CommunityManagerWorkArea(system,employee,rightPanel);
                rightPanel.add("CommunityManagerWorkArea", panel);
            }
            else if(employee.getOrg().getType().equals(Organization.Type.Sales)){
                BookSupplierWorkArea panel = new BookSupplierWorkArea(system,employee,rightPanel);
                rightPanel.add("BookSupplierWorkArea", panel);
            }
            else if(employee.getOrg().getType().equals(Organization.Type.Pricing)){
                SHCheckerWorkArea panel = new SHCheckerWorkArea(system,employee,rightPanel);
                rightPanel.add("SHCheckerWorkArea", panel);
            }
            else{
                SHManagerWorkArea panel = new SHManagerWorkArea(system,employee,rightPanel);
                rightPanel.add("SHManagerWorkArea", panel);
            }
            CardLayout cl = (CardLayout) rightPanel.getLayout();
            cl.next(rightPanel);
        }
        else{
            User user = system.getUserAccountDirectory().authenticateUser(id, password);
            System.out.println(user);
            if(user == null||!type.equals(user.getType())){
                JOptionPane.showMessageDialog(null,"Wrong UserID or Password!", "Alert", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if(type.equals("customer")){
                rightPanel.removeAll();
                CustomerControlPanel control = new CustomerControlPanel(system,user,jSplitPane1,rightPanel);
                jSplitPane1.setLeftComponent(control);
                CustomerHomePanel panel = new CustomerHomePanel(system,user,rightPanel);
                rightPanel.add("CustomerHomePanel", panel);
                CardLayout cl = (CardLayout) rightPanel.getLayout();
                cl.next(rightPanel);
            }
            else{
                rightPanel.removeAll();
                if(id==0000000){
                    SystemAdminControlPanel control = new SystemAdminControlPanel(system,jSplitPane1,rightPanel);
                    jSplitPane1.setLeftComponent(control);
                    SystemAdminOverviewPanel panel = new SystemAdminOverviewPanel(system,rightPanel);
                    rightPanel.add("SystemAdminOverviewPanel", panel);
                }
                else{
                    AdminControlPanel control = new AdminControlPanel(system, user, jSplitPane1,rightPanel);
                    jSplitPane1.setLeftComponent(control);
                    AdminOverviewPanel panel = new AdminOverviewPanel(system, user,rightPanel);
                    rightPanel.add("AdminOverviewPanel", panel);
                }
                CardLayout cl = (CardLayout) rightPanel.getLayout();
                cl.next(rightPanel);
            }
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomerActionPerformed
        // TODO add your handling code here:
        type = "customer";
        lbLogin.setText("Customer Login");
    }//GEN-LAST:event_btnCustomerActionPerformed

    private void btnSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupplierActionPerformed
        // TODO add your handling code here:
        type = "employee";
        lbLogin.setText("Employee Login");
    }//GEN-LAST:event_btnSupplierActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        type = "administrator";
        lbLogin.setText("Administrator Login");
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCustomer;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnSupplier;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lbLogin;
    private javax.swing.JLabel lbPd;
    private javax.swing.JLabel lbUserID;
    private javax.swing.JPasswordField ptxtPd;
    private javax.swing.JTextField txtUserID;
    // End of variables declaration//GEN-END:variables
}
