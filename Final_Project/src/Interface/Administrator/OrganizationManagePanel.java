/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Administrator;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Role.Administrator;
import Business.UserAccount.User;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author chenchen
 */
public class OrganizationManagePanel extends javax.swing.JPanel {

    private javax.swing.JPanel rightPanel;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    private EcoSystem system;
    private Enterprise enterprise;
    private User user;
    private Administrator admin;
    /**
     * Creates new form OrganizationManagePanel
     */
    public OrganizationManagePanel(EcoSystem system, User user, javax.swing.JPanel rightPanel) {
        initComponents();
        this.system = system;
        this.user = user;
        this.admin = (Administrator)user;
        this.rightPanel = rightPanel;
        setOrgType();
        populateTable();
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
        tbOrg = new javax.swing.JTable();
        lbName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lbType = new javax.swing.JLabel();
        cbType = new javax.swing.JComboBox();
        btnAdd = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        btnBack1 = new javax.swing.JButton();

        tbOrg.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Organization", "Employee Number"
            }
        ));
        jScrollPane1.setViewportView(tbOrg);

        lbName.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbName.setText("Organization Name: ");

        lbType.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbType.setText("Organization Type: ");

        cbType.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        btnAdd.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnAdd.setText("Add New Organization");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnRemove.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnRemove.setText("Remove Organization");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        btnBack1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnBack1.setText("back");
        btnBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 624, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbType)
                        .addGap(18, 18, 18)
                        .addComponent(cbType, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnBack1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRemove)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbType)
                    .addComponent(cbType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRemove)
                    .addComponent(btnAdd)
                    .addComponent(btnBack1))
                .addContainerGap(89, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        String name = txtName.getText();
        if(name==null || name.equals("")){
            JOptionPane.showMessageDialog(null, "The Name of organization can not be empty!", "Alert", JOptionPane.ERROR_MESSAGE);
            return;
        }
        Organization.Type type = (Organization.Type)cbType.getSelectedItem();
        for(Organization og : admin.getEnterprise().getOrganizationDirectory().getOrganizationList()){
            System.out.println(type);
            System.out.println(og.getType());
            if(type.equals(og.getType())){
                JOptionPane.showMessageDialog(null, "This organization has already exist!", "Alert", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
        Organization o = admin.getEnterprise().getOrganizationDirectory().createOrganization(type);
        o.setType(type);
        dB4OUtil.storeSystem(system);
        JOptionPane.showMessageDialog(null, "Create Organization Successfully");
        populateTable();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        // TODO add your handling code here:
        int selectedRow = tbOrg.getSelectedRow();
        Organization selectedItem;
        if(selectedRow>=0){
            selectedItem = (Organization) tbOrg.getValueAt(selectedRow, 0);
        }
        else{
            JOptionPane.showMessageDialog(null, "Please select an organization!", "Alert", JOptionPane.ERROR_MESSAGE);
            return;
        }
        admin.getEnterprise().getOrganizationDirectory().getOrganizationList().remove(selectedItem);
        dB4OUtil.storeSystem(system);
        JOptionPane.showMessageDialog(null, "Remove Organization Successfully");
        populateTable();
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack1ActionPerformed
        // TODO add your handling code here:
        AdminOverviewPanel panel = new AdminOverviewPanel(system,user,rightPanel);
        rightPanel.add("AdminOverviewPanel", panel);
        CardLayout cl = (CardLayout) rightPanel.getLayout();
        cl.next(rightPanel);
    }//GEN-LAST:event_btnBack1ActionPerformed

    public void populateTable(){
        DefaultTableModel dtm = (DefaultTableModel) tbOrg.getModel();
        dtm.setRowCount(0);
        if(admin.getEnterprise().getOrganizationDirectory().getOrganizationList().size()>0){
            for(Organization or : admin.getEnterprise().getOrganizationDirectory().getOrganizationList()){
                Object row[] = new Object[2];
                row[0] = or;
                row[1] = or.getEmployeeDirectory().getEmployeeList().size();
                dtm.addRow(row);
            }
        }
    }
    
    public void setOrgType(){
        cbType.removeAllItems();
        if(admin.getEnterprise().getEnterpriseType().equals(Enterprise.EnterpriseType.BookStore)){
            cbType.addItem(Organization.Type.BookManage);
            cbType.addItem(Organization.Type.Community);
            cbType.addItem(Organization.Type.Sales);
        }
        else{
            cbType.addItem(Organization.Type.Recycling);
            cbType.addItem(Organization.Type.Pricing);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBack1;
    private javax.swing.JButton btnRemove;
    private javax.swing.JComboBox cbType;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbName;
    private javax.swing.JLabel lbType;
    private javax.swing.JTable tbOrg;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
