/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Employee;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.BookRecycleEnterprise;
import Business.Enterprise.Enterprise;
import Business.Item.SecondItem;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.PricingOrganization;
import Business.Organization.RecyclingOrganization;
import Business.WorkQueue.RecyclePricingWorkRequest;
import java.awt.CardLayout;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author chenchen
 */
public class RecyclingChckingPanel extends javax.swing.JPanel {

    private javax.swing.JPanel rightPanel;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    private EcoSystem system;
    private Employee employee;
    private Organization organization;
    private BookRecycleEnterprise b;
    ArrayList<SecondItem> seList = new ArrayList<>();
    /**
     * Creates new form RecyclingChckingPanel
     */
    public RecyclingChckingPanel(EcoSystem system, Employee employee, javax.swing.JPanel rightPanel) {
        initComponents();
        this.system = system;
        this.employee = employee;
        this.organization = employee.getOrg();
        this.rightPanel = rightPanel;
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

        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbBook = new javax.swing.JTable();
        btnReceive = new javax.swing.JButton();
        btnRefuse = new javax.swing.JButton();
        btnPrice = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();

        btnBack.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        tbBook.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title", "Author", "Quantity", "Customer", "Status"
            }
        ));
        jScrollPane1.setViewportView(tbBook);

        btnReceive.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnReceive.setText("Receive");
        btnReceive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReceiveActionPerformed(evt);
            }
        });

        btnRefuse.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnRefuse.setText("Refuse");
        btnRefuse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefuseActionPerformed(evt);
            }
        });

        btnPrice.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnPrice.setText("Send To Pricing");
        btnPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPriceActionPerformed(evt);
            }
        });

        btnClear.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnReceive, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnRefuse, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(btnBack)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReceive)
                    .addComponent(btnRefuse))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPrice)
                    .addComponent(btnClear))
                .addContainerGap(70, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        rightPanel.remove(this);
        CardLayout cl = (CardLayout) rightPanel.getLayout();
        cl.previous(rightPanel);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnReceiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReceiveActionPerformed
        // TODO add your handling code here:
        int selectedRow = tbBook.getSelectedRow();
        SecondItem selectedItem;
        if(selectedRow>=0){
            selectedItem = (SecondItem) tbBook.getValueAt(selectedRow, 0);
        }
        else{
            JOptionPane.showMessageDialog(null, "Please select a row!", "Alert", JOptionPane.ERROR_MESSAGE);
            return;
        }
        selectedItem.setStatus("Received");
        dB4OUtil.storeSystem(system);
        JOptionPane.showMessageDialog(null, "Receive Successfully");
        populateTable();
    }//GEN-LAST:event_btnReceiveActionPerformed

    private void btnRefuseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefuseActionPerformed
        // TODO add your handling code here:
        int selectedRow = tbBook.getSelectedRow();
        SecondItem selectedItem;
        if(selectedRow>=0){
            selectedItem = (SecondItem) tbBook.getValueAt(selectedRow, 0);
        }
        else{
            JOptionPane.showMessageDialog(null, "Please select a row!", "Alert", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(selectedItem.getPrice()!=0){
            JOptionPane.showMessageDialog(null, "Already Pricing. You can not refuse it now!", "Alert", JOptionPane.ERROR_MESSAGE);
            return;
        }
        selectedItem.setStatus("Refused");
        dB4OUtil.storeSystem(system);
        JOptionPane.showMessageDialog(null, "Refuse Successfully");
        populateTable();
    }//GEN-LAST:event_btnRefuseActionPerformed

    private void btnPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPriceActionPerformed
        // TODO add your handling code here:
        int num =0;
        if(seList.size()>0){
            for(SecondItem s : seList){
                if(s.getStatus().equals("Received")){
                    if(s.getPrice()==0){
                        num++;
                    }
                }
            }
        }
        if(num==0){
            JOptionPane.showMessageDialog(null, "No book to be priced!", "Alert", JOptionPane.ERROR_MESSAGE);
            return;
        }
        RecyclePricingWorkRequest re = new RecyclePricingWorkRequest();
        re.setMessage("set price for books");
        re.setNumber(num);
        re.setSender(organization);
        PricingOrganization og =null;
        for(Organization o : b.getOrganizationDirectory().getOrganizationList()){
            if(o.getType().equals(Organization.Type.Pricing)){
                og = (PricingOrganization)o;
            }
        }
        if(og==null){
            JOptionPane.showMessageDialog(null, "Function Not Available Now!", "Alert", JOptionPane.ERROR_MESSAGE);
            return;
        }
        re.setReceiver(og);
        Date now = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("MM-dd-yyyy");
        String date = formatter.format(now);
        re.setRequestDate(date);
        organization.getWorkQueue().getWorkRequestList().add(re);
        og.getWorkQueue().getWorkRequestList().add(re);
        dB4OUtil.storeSystem(system);
        JOptionPane.showMessageDialog(null, "Send Pricing Request Successfully");
    }//GEN-LAST:event_btnPriceActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        boolean isExist = false;
        if(seList.size()>0){
            for(SecondItem si : b.getReItemList()){
                if(si.getPrice()>0 || si.getStatus().equals("Refused")){
                    b.getReItemList().remove(si);
                    isExist = true;
                }
            }
        }
        if(!isExist){
            JOptionPane.showMessageDialog(null, "No item can be clear!", "Alert", JOptionPane.ERROR_MESSAGE);
            return;
        }
        dB4OUtil.storeSystem(system);
        JOptionPane.showMessageDialog(null, "Clear Successfully");
        populateTable();
    }//GEN-LAST:event_btnClearActionPerformed

    public void populateTable(){
        DefaultTableModel dtm = (DefaultTableModel) tbBook.getModel();
        dtm.setRowCount(0);
        for(Network net : system.getNetworkList()){
            for(Enterprise en : net.getEnterpriseDirectory().getEnterpriseList()){
                for(Organization or : en.getOrganizationDirectory().getOrganizationList()){
                    if(or.equals(organization)){
                        b = (BookRecycleEnterprise)en;
                        if(b.getReItemList().size()>0){
                            for(SecondItem sei : b.getReItemList()){
                                seList.add(sei);
                                Object row[] = new Object[5];
                                row[0] = sei;
                                row[1] = sei.getAuthor();
                                row[2] = sei.getQuantity();
                                row[3] = sei.getOwnerID();
                                row[4] = sei.getStatus();
                                dtm.addRow(row);
                            }
                        }
                    }
                }
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnPrice;
    private javax.swing.JButton btnReceive;
    private javax.swing.JButton btnRefuse;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbBook;
    // End of variables declaration//GEN-END:variables
}
