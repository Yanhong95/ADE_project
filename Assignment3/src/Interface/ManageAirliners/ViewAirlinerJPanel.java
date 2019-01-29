/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.ManageAirliners;

import Business.Flight;
import Business.Airliner;
import javax.swing.JPanel;
import java.awt.CardLayout;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author yanhongchen
 */
public class ViewAirlinerJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewAirlinerJPanel
     */
    JPanel userProcessContainer;
    Airliner airliner;
    ViewAirlinerJPanel(JPanel userProcessContainer, Airliner s) {
        initComponents();
        this.airliner=s;
        this.userProcessContainer=userProcessContainer;
        refreshTable();
    }
    
    private void refreshTable() {
        int rowCount = airlinerTable.getRowCount();
        DefaultTableModel model = (DefaultTableModel)airlinerTable.getModel();
        for(int i=rowCount-1;i>=0;i--) {
            model.removeRow(i);
        }
            for(Flight f : airliner.getFlightDirectory().getFlightDir()) {
            Object row[] = new Object[model.getColumnCount()];
            row[0] = f;
            row[1] = f.getDate();
            row[2] = f.getDateSection();
            row[3] = f.getOrigin();
            row[4] = f.getDestination();
            row[5] = f.getSeat();
            model.addRow(row);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        airlinerTable = new javax.swing.JTable();
        AirlinerNameLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("<< Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 300, 113, -1));

        airlinerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Flight Name", "Flight Date", "Date Section", "Origin", "Destination"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(airlinerTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 530, 184));

        AirlinerNameLabel.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        AirlinerNameLabel.setText("Example");
        add(AirlinerNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, -1, -1));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("Detail");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel2.setText("Airliner");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AirlinerNameLabel;
    private javax.swing.JTable airlinerTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
