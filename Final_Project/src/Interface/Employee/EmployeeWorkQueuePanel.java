/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Employee;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Organization.Organization;
import Business.WorkQueue.WorkRequest;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author chenchen
 */
public class EmployeeWorkQueuePanel extends javax.swing.JPanel {

    private javax.swing.JPanel rightPanel;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    private EcoSystem system;
    private Employee employee;
    private Organization organization;
    /**
     * Creates new form EmployeeWorkQueuePanel
     */
    public EmployeeWorkQueuePanel(EcoSystem system, Employee employee, javax.swing.JPanel rightPanel) {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tbQueue = new javax.swing.JTable();
        txtReply = new javax.swing.JTextField();
        lbReply = new javax.swing.JLabel();
        btnCheck = new javax.swing.JButton();
        txtMessage = new javax.swing.JTextField();
        btnDelete = new javax.swing.JButton();
        btnProcess = new javax.swing.JButton();

        tbQueue.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sent Date", "Message", "Sender", "Reply Date", "Statue", "Reply"
            }
        ));
        jScrollPane1.setViewportView(tbQueue);

        lbReply.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbReply.setText("Reply: ");

        btnCheck.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnCheck.setText("Check Message");
        btnCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckActionPerformed(evt);
            }
        });

        txtMessage.setEditable(false);

        btnDelete.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnProcess.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnProcess.setText("Process");
        btnProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbReply, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtReply, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(btnProcess, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtMessage))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCheck)
                    .addComponent(btnDelete))
                .addGap(34, 34, 34)
                .addComponent(txtMessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbReply)
                    .addComponent(txtReply, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProcess))
                .addContainerGap(51, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckActionPerformed
        // TODO add your handling code here:
        int selectedRow = tbQueue.getSelectedRow();
        WorkRequest selectedItem;
        if(selectedRow>=0){
            selectedItem = (WorkRequest) tbQueue.getValueAt(selectedRow, 0);
        }
        else{
            JOptionPane.showMessageDialog(null, "Please select a work request!", "Alert", JOptionPane.ERROR_MESSAGE);
            return;
        }
        txtMessage.setText(selectedItem.getMessage());
    }//GEN-LAST:event_btnCheckActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = tbQueue.getSelectedRow();
        WorkRequest selectedItem;
        if(selectedRow>=0){
            selectedItem = (WorkRequest) tbQueue.getValueAt(selectedRow, 0);
        }
        else{
            JOptionPane.showMessageDialog(null, "Please select a work request!", "Alert", JOptionPane.ERROR_MESSAGE);
            return;
        }
        organization.getWorkQueue().getWorkRequestList().remove(selectedItem);
        dB4OUtil.storeSystem(system);
        JOptionPane.showMessageDialog(null, "Remove Work Request Successfully");
        populateTable();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessActionPerformed
        // TODO add your handling code here:
        int selectedRow = tbQueue.getSelectedRow();
        WorkRequest selectedItem;
        if(selectedRow>=0){
            selectedItem = (WorkRequest) tbQueue.getValueAt(selectedRow, 0);
        }
        else{
            JOptionPane.showMessageDialog(null, "Please select a work request!", "Alert", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(selectedItem.getStatus().equals("Completed")){
            JOptionPane.showMessageDialog(null, "The work request has Completed!", "Alert", JOptionPane.ERROR_MESSAGE);
            return;
        }
        selectedItem.setStatus("Processing...");
        if(!selectedItem.isIsAble()){
            JOptionPane.showMessageDialog(null, "The work request can not be completed now!", "Alert", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String reply = txtReply.getText();
        selectedItem.setReply(reply);
        Date now = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("MM-dd-yyyy");
        String date = formatter.format(now);
        selectedItem.setResolveDate(date);
        selectedItem.setStatus("Completed");
        dB4OUtil.storeSystem(system);
        JOptionPane.showMessageDialog(null, "Process Successfully");
        populateTable();
    }//GEN-LAST:event_btnProcessActionPerformed

    public void populateTable(){
        DefaultTableModel dtm = (DefaultTableModel) tbQueue.getModel();
        dtm.setRowCount(0);
        if(organization.getWorkQueue().getWorkRequestList().size()>0){
            for(WorkRequest request : organization.getWorkQueue().getWorkRequestList()){
                if(organization.equals(request.getReceiver())){
                    Object row[] = new Object[6];
                    row[0] = request;
                    row[1] = request.getMessage();
                    row[2] = request.getSender();
                    row[3] = request.getResolveDate();
                    row[4] = request.getStatus();
                    row[5] = request.getReply();
                    dtm.addRow(row);
                }
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCheck;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnProcess;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbReply;
    private javax.swing.JTable tbQueue;
    private javax.swing.JTextField txtMessage;
    private javax.swing.JTextField txtReply;
    // End of variables declaration//GEN-END:variables
}
