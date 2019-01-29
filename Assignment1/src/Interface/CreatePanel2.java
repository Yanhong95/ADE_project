/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;
import Business.Person;
import javax.swing.JOptionPane;
/**
 *
 * @author yanhongchen
 */
public class CreatePanel2 extends javax.swing.JPanel {

    /**
     * Creates new form CreatePanel2
     */
    private Person person = new Person();
    public CreatePanel2(Person person) {
        initComponents();
        this.person=person; 
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        zipTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        stateTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        createBtn = new javax.swing.JButton();
        streetTextField = new javax.swing.JTextField();
        cityTextField = new javax.swing.JTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel2.setText("StreetAddress :");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, -1));

        zipTextField.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        add(zipTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, 164, -1));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 25)); // NOI18N
        jLabel1.setText("Create Address Info");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, -1, -1));

        stateTextField.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        add(stateTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 164, -1));

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel8.setText("State :");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, -1, -1));

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel6.setText("City :");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, -1, -1));

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel10.setText("ZipCode :");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, -1, -1));

        createBtn.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        createBtn.setText("Create");
        createBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtnActionPerformed(evt);
            }
        });
        add(createBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, -1, -1));

        streetTextField.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        add(streetTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 164, -1));

        cityTextField.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        add(cityTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 164, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed
        // TODO add your handling code here:
        
        person.getAddress().setStreet(streetTextField.getText());
        person.getAddress().setCity(cityTextField.getText());
        person.getAddress().setState(stateTextField.getText());
        person.getAddress().setZip(zipTextField.getText());
        JOptionPane.showMessageDialog(null,"Create Address Info succesfully!");
    }//GEN-LAST:event_createBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cityTextField;
    private javax.swing.JButton createBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField stateTextField;
    private javax.swing.JTextField streetTextField;
    private javax.swing.JTextField zipTextField;
    // End of variables declaration//GEN-END:variables
}
