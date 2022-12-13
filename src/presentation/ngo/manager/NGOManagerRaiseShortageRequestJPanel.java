/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation.ngo.manager;

import business.enterprise.Enterprise;
import business.enterprise.NGOEnterprise;
import business.network.Network;
import business.organization.Organization;
import business.organization.ngo.NGOManagerOrganization;
import business.role.Role;
import business.userAccount.UserAccount;
import business.util.request.RequestStatus;
import business.workQueue.ShortageWorkRequest;
import business.workQueue.WorkRequest;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Shubham Idekar
 */
public class NGOManagerRaiseShortageRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RegionRequestJPanel
     */
    private JPanel userProcessContainer;
    private NGOEnterprise enterprise;
    private UserAccount account;
    private Network network;
    private boolean hasShortage = false;

    public NGOManagerRaiseShortageRequestJPanel(JPanel userProcessContainer, UserAccount account, NGOEnterprise enterprise, Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.account = account;
        this.network = network;
        populateEmployeeDropDown();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRaise = new javax.swing.JButton();
        cmbEmployee = new javax.swing.JComboBox();
        lblEmployee = new javax.swing.JLabel();
        jScrollPane = new javax.swing.JScrollPane();
        txtMessage = new javax.swing.JTextArea();
        lblMessage = new javax.swing.JLabel();
        lblHeader = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnBack1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 153, 153));

        btnRaise.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        btnRaise.setText("Raise Request");
        btnRaise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRaiseActionPerformed(evt);
            }
        });

        cmbEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEmployeeActionPerformed(evt);
            }
        });

        lblEmployee.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblEmployee.setText("Select Employee:");

        txtMessage.setColumns(20);
        txtMessage.setRows(5);
        jScrollPane.setViewportView(txtMessage);

        lblMessage.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblMessage.setText("Message:");

        lblHeader.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeader.setText("Shortage Request");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentation/ngo/manager/res/lack (1).png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentation/ngo/manager/res/request.png"))); // NOI18N

        btnBack1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnBack1.setForeground(new java.awt.Color(51, 51, 255));
        btnBack1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentation/res/back-button.png"))); // NOI18N
        btnBack1.setText("Back");
        btnBack1.setBorder(null);
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(94, 94, 94)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnRaise, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(lblMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblEmployee)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(cmbEmployee, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblMessage)
                        .addGap(92, 92, 92))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRaise, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(449, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRaiseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRaiseActionPerformed
        // TODO add your handling code here:
        if (txtMessage.getText() == "" || txtMessage.getText() == null) {
            JOptionPane.showMessageDialog(null, "Please enter a message");
            return;
        }
        if (cmbEmployee.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(null, "Please select an employee to assign the request to");
            return;
        }
        for (WorkRequest wr : account.getWorkQueue().getWorkRequestList()) {
            if (wr instanceof ShortageWorkRequest) {
                ShortageWorkRequest sr = (ShortageWorkRequest) wr;
                if (sr.getStatus().equals(RequestStatus.getShortageStatusMessage(1))) {
                    hasShortage = true;
                    break;
                }
            }
        }
        if (hasShortage == false) {
            ShortageWorkRequest swr = new ShortageWorkRequest();
            swr.setSender(account);
            swr.setMessage(txtMessage.getText());
            swr.setStatus(RequestStatus.getShortageStatusMessage(1));
            swr.setNgoName(enterprise.getName());
            swr.setAssignToEmployee((UserAccount) cmbEmployee.getSelectedItem());

            for (Enterprise e : network.getEnterpriseDirectory().getEnterpriseList()) {
                if (!e.getName().equals(enterprise.getName())) {
                    for (Organization o : e.getOrganizationDirectory().getOrganizationList()) {
                        if (o instanceof NGOManagerOrganization) {
                            o.getWorkQueue().getWorkRequestList().add(swr);
                        }
                    }
                }
            }

            JOptionPane.showMessageDialog(null, "Shortage request sucessfully raised");
            account.getWorkQueue().getWorkRequestList().add(swr);
            txtMessage.setText("");

        } else {
            JOptionPane.showMessageDialog(null, "Already sent a request");
            txtMessage.setText("");
            return;
        }
    }//GEN-LAST:event_btnRaiseActionPerformed

    private void btnBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack1ActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBack1ActionPerformed

    private void cmbEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEmployeeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbEmployeeActionPerformed
    public void populateEmployeeDropDown() {
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            for (UserAccount user : organization.getUserAccountDirectory().getUserAccountList()) {
                if (user.getRole().getRoleType().getValue().equals(Role.RoleType.NGOWorker.getValue())) {
                    cmbEmployee.addItem(user);
                }
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack1;
    private javax.swing.JButton btnRaise;
    private javax.swing.JComboBox cmbEmployee;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JLabel lblEmployee;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JTextArea txtMessage;
    // End of variables declaration//GEN-END:variables
}
