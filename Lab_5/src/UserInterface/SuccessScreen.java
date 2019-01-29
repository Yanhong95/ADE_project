/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import Business.Abstract.User;
import java.awt.CardLayout;
import java.util.List;
import javax.swing.JPanel;

/**
 *
 * @author harshalneelkamal
 */
public class SuccessScreen extends javax.swing.JPanel {

    /**
     * Creates new form SuccessScreen
     */
    private User user; 
    private List<User> list;
    private JPanel panelRight;
    private int num;
    public SuccessScreen(List<User> list, User user, JPanel panelRight, int n) {
        initComponents();
        this.user = user;
        this.list = list;
        this.panelRight= panelRight;
        this.num = n;
        initialize();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();

        jLabel1.setText("Success !!!!!");

        jLabel2.setText("Welcome ");

        backBtn.setText("<<Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(backBtn)))
                .addContainerGap(165, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addGap(72, 72, 72)
                .addComponent(backBtn)
                .addContainerGap(79, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        panelRight.removeAll();
        LoginScreen panel = new LoginScreen(panelRight,list,num);
        panelRight.add("LoginScreen", panel);
        CardLayout cl = (CardLayout) panelRight.getLayout();
        cl.previous(panelRight);
    }//GEN-LAST:event_backBtnActionPerformed


    private void initialize(){
        jLabel2.setText(jLabel2.getText()+" "+user.getUserName()+" !!!");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
