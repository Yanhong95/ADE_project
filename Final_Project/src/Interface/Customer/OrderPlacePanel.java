/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Customer;

import Business.Address.Address;
import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.BookStoreEnterprise;
import Business.Order.Order;
import Business.Order.OrderItem;
import Business.Organization.Organization;
import Business.Organization.SalesOrganization;
import Business.Role.Customer;
import Business.UserAccount.User;
import java.awt.CardLayout;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author chenchen
 */
public class OrderPlacePanel extends javax.swing.JPanel {

    private javax.swing.JPanel rightPanel;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    private EcoSystem system;
    private User user;
    private Customer customer;
    private List<OrderItem> list;
    private Address a = null;
    private double total = 0;
    /**
     * Creates new form OrderPlacePanel
     */
    public OrderPlacePanel(EcoSystem system, User user, ArrayList<OrderItem> list, javax.swing.JPanel rightPanel) {
        initComponents();
        this.system = system;
        this.user = user;
        this.customer = (Customer)user;
        this.list = list;
        this.rightPanel = rightPanel;
        lbTop.setText("Edit your order,  "+user.getUsername());
        showTable();
        showAddress();
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
        tbItems = new javax.swing.JTable();
        lbTop = new javax.swing.JLabel();
        lbQuan = new javax.swing.JLabel();
        txtQuan = new javax.swing.JTextField();
        btnQuan = new javax.swing.JButton();
        lbTotal = new javax.swing.JLabel();
        lbAddr = new javax.swing.JLabel();
        cbAddr = new javax.swing.JComboBox();
        txtAddr = new javax.swing.JTextField();
        btnApply = new javax.swing.JButton();
        btnSubmit = new javax.swing.JButton();

        btnBack.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        tbItems.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Book Name", "Author", "Quantity", "Item Price"
            }
        ));
        jScrollPane1.setViewportView(tbItems);

        lbTop.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbTop.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTop.setText("Edit your order, ");

        lbQuan.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lbQuan.setText("Quantity: ");

        btnQuan.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnQuan.setText("Save");
        btnQuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuanActionPerformed(evt);
            }
        });

        lbTotal.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTotal.setText("Total Price: ");

        lbAddr.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbAddr.setText("Please Select Your Address:");

        cbAddr.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        txtAddr.setEditable(false);
        txtAddr.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        btnApply.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnApply.setText("Apply");
        btnApply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApplyActionPerformed(evt);
            }
        });

        btnSubmit.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(lbTop, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 622, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbQuan)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtQuan, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnQuan)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbAddr)
                                .addGap(18, 18, 18)
                                .addComponent(cbAddr, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(btnApply))
                            .addComponent(txtAddr))))
                .addContainerGap(42, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(208, 208, 208))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbQuan, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnQuan)
                    .addComponent(lbTotal))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbAddr)
                    .addComponent(cbAddr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnApply))
                .addGap(35, 35, 35)
                .addComponent(txtAddr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btnSubmit)
                .addContainerGap(41, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        rightPanel.remove(this);
        CardLayout cl = (CardLayout) rightPanel.getLayout();
        cl.previous(rightPanel);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnQuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuanActionPerformed
        // TODO add your handling code here:
        int selectedRow = tbItems.getSelectedRow();
        OrderItem selectedItem;
        if(selectedRow>=0){
            selectedItem = (OrderItem) tbItems.getValueAt(selectedRow, 0);
        }
        else{
            JOptionPane.showMessageDialog(null, "Please select an item!", "Alert", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String strquan = txtQuan.getText();
        int numquan;
        try{
            numquan = Integer.parseInt(strquan);
        } catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please input an Integer!", "Alert", JOptionPane.ERROR_MESSAGE);
            return;
        }
        selectedItem.setSaleQuantity(numquan);
        if(numquan == 0){
            list.remove(selectedItem);
        }
        showTable();
    }//GEN-LAST:event_btnQuanActionPerformed

    private void btnApplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApplyActionPerformed
        // TODO add your handling code here:
        a = (Address)cbAddr.getSelectedItem();
        if(a == null){
            JOptionPane.showMessageDialog(null, "You have not set address.\nPlease set Address before place order", "Alert", JOptionPane.ERROR_MESSAGE);
            return;
        }
        txtAddr.setText(a.getStreet()+", "+a.getCity()+", "+a.getState()+", "+a.getZip());
    }//GEN-LAST:event_btnApplyActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        if(a ==null){
            JOptionPane.showMessageDialog(null, "You have not set address.\nPlease set Address before place order", "Alert", JOptionPane.ERROR_MESSAGE);
            return;
        }
        for(OrderItem m : list){
            if(m.getItem().getQuantity()<m.getSaleQuantity()){
                JOptionPane.showMessageDialog(null, "Sorry, only "+m.getItem().getQuantity()+" "+m+" stored in inventory.\nYou can try to search in another store", "Alert", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
        long oid = getOrderID();
        long cid = customer.getUserID();
        String s = "MM-dd-yyyy";
        Date now = new Date();
        SimpleDateFormat format = new SimpleDateFormat(s);
        String date = format.format(now);
        
        Order order = new Order(oid,cid);
        order.setAddress(a);
        order.setDate(date);
        order.setTotalPrice(total);
        order.setStatus("Ordered");
        order.setOrderItemList(list);
        
        for(OrderItem oim : list){
            for(Organization or : oim.getItem().getEnterprise().getOrganizationDirectory().getOrganizationList()){
                if(or.getType().equals(Organization.Type.Sales)){
                    BookStoreEnterprise be = (BookStoreEnterprise)oim.getItem().getEnterprise();
                    be.getOrderList().add(order);
                    SalesOrganization so = (SalesOrganization)or;
                    so.getOrderList().add(order);
                }
            }
        }
        
        customer.getOrderList().add(order);
        customer.getCartList().removeAll(list);
        for(OrderItem om : list){
            int qu = om.getItem().getQuantity();
            om.getItem().setQuantity(qu-om.getSaleQuantity());
        }
        dB4OUtil.storeSystem(system);
        
        int selectionButton = JOptionPane.YES_NO_OPTION;
        int selectionResult = JOptionPane.showConfirmDialog(null, "Do you want to continue shopping?","Warning",selectionButton);
        if(selectionResult == JOptionPane.YES_OPTION){
            rightPanel.removeAll();
            CustomerHomePanel panel = new CustomerHomePanel(system,user,rightPanel);
            rightPanel.add("CustomerHomePanel", panel);
            CardLayout cl = (CardLayout) rightPanel.getLayout();
            cl.next(rightPanel);
        }
        else{
            btnQuan.setEnabled(false);
            btnApply.setEnabled(false);
            btnSubmit.setEnabled(false);
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    public void showTable(){
        DefaultTableModel dtm = (DefaultTableModel) tbItems.getModel();
        dtm.setRowCount(0);
        total = 0;
        for(OrderItem m : list){
            Object row[] = new Object[4];
            row[0] = m;
            row[1] = m.getItem().getBook().getAuthor();
            row[2] = m.getSaleQuantity();
            row[3] = m.getItem().getPrice()*m.getSaleQuantity();
            dtm.addRow(row);
            total = total+m.getItem().getPrice()*m.getSaleQuantity();
        }
        lbTotal.setText("Total Price: $"+total);
    }
    
    public void showAddress(){
        cbAddr.removeAllItems();
        for(Address ad : customer.getAddressDirectory()){
            cbAddr.addItem(ad);
        }
        if(customer.getAddressDirectory().size()<1){
            JOptionPane.showMessageDialog(null, "You have not set address.\nPlease set Address before place order", "Alert", JOptionPane.ERROR_MESSAGE);
            return;
        }
        a = customer.getAddressDirectory().get(0);
        txtAddr.setText(a.getStreet()+", "+a.getCity()+", "+a.getState()+", "+a.getZip());
    }
    
    public long getOrderID(){
        String sformat = "MMddhh";
         
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat(sformat);
        String dateString = formatter.format(currentTime);
        String preid = dateString + String.valueOf(customer.getUserID());
        long id = Long.valueOf(preid);
        return id;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApply;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnQuan;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox cbAddr;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbAddr;
    private javax.swing.JLabel lbQuan;
    private javax.swing.JLabel lbTop;
    private javax.swing.JLabel lbTotal;
    private javax.swing.JTable tbItems;
    private javax.swing.JTextField txtAddr;
    private javax.swing.JTextField txtQuan;
    // End of variables declaration//GEN-END:variables
}
