/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.ManageCustomer;

import Business.Airliner;
import Business.Customer;
import Business.Flight;
import Business.Ticket;
import javax.swing.JPanel;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author yanhongchen
 */
public class TicketJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ticketJPanel
     */
    JPanel userProcessContainer;
    Flight flight;
    Customer customer;
    TicketJPanel(JPanel userProcessContainer, Flight f, Customer customer) {
       initComponents();
       this.flight=f;
       this.userProcessContainer=userProcessContainer;
       this.customer=customer;
       nameTxtField.setText(f.getFlightName());
       dateTxtField.setText(f.getDate());
       dateSectionTxtField.setText(f.getDateSection());
       originTxtField.setText(f.getOrigin());
       destinationTxtField.setText(f.getDestination());
       populateTable();
    }



    public void populateTable() {
        int rowCount = ticketTable.getRowCount();
        DefaultTableModel model = (DefaultTableModel)ticketTable.getModel();
        for(int i = rowCount - 1; i >=0; i--) {
            model.removeRow(i);
        }
        for(Ticket t : customer.getTicketDirectory().getTicketDir()) {
            Object[] row = new Object[model.getColumnCount()];
            row[0] = t;
            row[1] = t.getFlightId();
            row[2] = t.getRow();
            row[3] = t.getColumn();
            model.addRow(row);
        }
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        jLabel3 = new javax.swing.JLabel();
        dateSectionTxtField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        rowTxt = new javax.swing.JTextField();
        columnTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ticketTable = new javax.swing.JTable();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bookBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bookBtn.setText("Book");
        bookBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookBtnActionPerformed(evt);
            }
        });
        add(bookBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 370, 176, -1));

        backBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        backBtn.setText("<< Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 370, 150, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Flight Date:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 100, 40));

        dateTxtField.setEditable(false);
        dateTxtField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        dateTxtField.setEnabled(false);
        dateTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateTxtFieldActionPerformed(evt);
            }
        });
        add(dateTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 150, -1));

        Origin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Origin.setText("Origin:");
        add(Origin, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 110, 30));

        originTxtField.setEditable(false);
        originTxtField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        originTxtField.setEnabled(false);
        add(originTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 150, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Flight Name:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, 30));

        nameTxtField.setEditable(false);
        nameTxtField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nameTxtField.setEnabled(false);
        add(nameTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 150, -1));

        Origin1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Origin1.setText("Destination");
        add(Origin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 110, 30));

        destinationTxtField.setEditable(false);
        destinationTxtField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        destinationTxtField.setEnabled(false);
        add(destinationTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 150, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Date Section:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 100, 40));

        dateSectionTxtField.setEditable(false);
        dateSectionTxtField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        dateSectionTxtField.setEnabled(false);
        dateSectionTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateSectionTxtFieldActionPerformed(evt);
            }
        });
        add(dateSectionTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 150, -1));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("Book Ticket");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, -1, -1));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel4.setText("Ticket");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, 60, 20));
        add(rowTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 100, -1));
        add(columnTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 320, 90, -1));

        jLabel6.setText("Row : (<26)");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, -1, 30));

        jLabel7.setText("Column:(<7)");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 320, -1, 30));

        ticketTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer", "Flight Name", "Row", "Column"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(ticketTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 310, 190));
    }// </editor-fold>//GEN-END:initComponents

    private void bookBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookBtnActionPerformed
        // TODO add your handling code here:
        nameTxtField.setEnabled(false);
        dateTxtField.setEnabled(false);
        dateSectionTxtField.setEnabled(false);
        originTxtField.setEnabled(false);
        destinationTxtField.setEnabled(false);  
        try{int a = Integer.parseInt(rowTxt.getText());
            int b = Integer.parseInt(columnTxt.getText());
        }catch(NumberFormatException e){
        JOptionPane.showMessageDialog(null, "Please inpute correct seat number!");
        rowTxt.setText("");
        columnTxt.setText("");
        return;
        }
        int c = Integer.parseInt(rowTxt.getText());
        int d = Integer.parseInt(columnTxt.getText());
        if( c>25||c<1||d>6||c<1){
        JOptionPane.showMessageDialog(null, "Please inpute seat number in the range!");
        rowTxt.setText("");
        columnTxt.setText("");
        return;
        }
        
        int row = Integer.parseInt(rowTxt.getText());
        int column = Integer.parseInt(columnTxt.getText());
        if(flight.getSeat()[row-1][column-1].equals("none")){
            flight.getSeat()[row-1][column-1]=customer.getName();
            Ticket ticket = customer.getTicketDirectory().addTicket();
            ticket.setName(customer.getName());
            ticket.setFlightId(flight.getFlightName());
            ticket.setRow(row);
            ticket.setColumn(column);
            JOptionPane.showMessageDialog(null, "Book tickets succesfully");
            populateTable();
         }else{
            JOptionPane.showMessageDialog(null, "This seat is chosen by other People");
    }
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

    private void dateSectionTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateSectionTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateSectionTxtFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Origin;
    private javax.swing.JLabel Origin1;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton bookBtn;
    private javax.swing.JTextField columnTxt;
    private javax.swing.JTextField dateSectionTxtField;
    private javax.swing.JTextField dateTxtField;
    private javax.swing.JTextField destinationTxtField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameTxtField;
    private javax.swing.JTextField originTxtField;
    private javax.swing.JTextField rowTxt;
    private javax.swing.JTable ticketTable;
    // End of variables declaration//GEN-END:variables
}
