/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation.restaurant.worker;

import business.util.request.RequestItem;
import business.workQueue.CollectionWorkRequest;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;


public class RestaurantWorkerViewLogItemJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private CollectionWorkRequest collectionWorkRequest;

    /**
     * Creates new form RestaurantWorkerViewLogItemJPanel
     */
    public RestaurantWorkerViewLogItemJPanel(JPanel userProcessContainer, CollectionWorkRequest collectionWorkRequest) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.collectionWorkRequest = collectionWorkRequest;
        populateItemTable();
        populateData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblHeader = new javax.swing.JLabel();
        jScrollPane = new javax.swing.JScrollPane();
        tblFoodItems = new javax.swing.JTable();
        lblRequestStatus = new javax.swing.JLabel();
        lblNGOVal = new javax.swing.JLabel();
        lblQuantityVal = new javax.swing.JLabel();
        lblNGO = new javax.swing.JLabel();
        lblRequestStatusVal = new javax.swing.JLabel();
        lblLogistics = new javax.swing.JLabel();
        lblRequestDateVal = new javax.swing.JLabel();
        lblLogisticsVal = new javax.swing.JLabel();
        lblRequestDate = new javax.swing.JLabel();
        lblQuantity = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnBack1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(102, 204, 255));

        lblHeader.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblHeader.setText("Restaurant Worker Work Area - Collection Request");

        tblFoodItems.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Food Type", "Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane.setViewportView(tblFoodItems);
        if (tblFoodItems.getColumnModel().getColumnCount() > 0) {
            tblFoodItems.getColumnModel().getColumn(0).setResizable(false);
            tblFoodItems.getColumnModel().getColumn(1).setResizable(false);
        }

        lblRequestStatus.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblRequestStatus.setText("Request status:");

        lblNGOVal.setText("<ngo>");

        lblQuantityVal.setText("<quantity>");

        lblNGO.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNGO.setText("NGO delivered to:");

        lblRequestStatusVal.setText("<request_status>");

        lblLogistics.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblLogistics.setText("Logistics");

        lblRequestDateVal.setText("<request_date>");

        lblLogisticsVal.setText("<logistics>");

        lblRequestDate.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblRequestDate.setText("Request Date:");

        lblQuantity.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblQuantity.setText("Food Quantity:");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RestaurantAdmin/restaurantWorker/res/diet.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RestaurantAdmin/restaurantWorker/res/diet.png"))); // NOI18N

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
                        .addGap(237, 237, 237)
                        .addComponent(jLabel1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblRequestDate)
                                        .addGap(35, 35, 35)
                                        .addComponent(lblRequestDateVal))
                                    .addComponent(lblQuantity)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblRequestStatus)
                                        .addGap(29, 29, 29)
                                        .addComponent(lblRequestStatusVal))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(116, 116, 116)
                                        .addComponent(lblQuantityVal))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblNGO)
                                            .addComponent(lblLogistics))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblLogisticsVal)
                                            .addComponent(lblNGOVal)))))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(445, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                        .addGap(118, 118, 118))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblRequestDate)
                            .addComponent(lblRequestDateVal))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblRequestStatus)
                            .addComponent(lblRequestStatusVal))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblQuantity)
                            .addComponent(lblQuantityVal))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNGO)
                            .addComponent(lblNGOVal))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLogistics)
                            .addComponent(lblLogisticsVal))
                        .addGap(65, 65, 65)))
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(203, 203, 203))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack1ActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBack1ActionPerformed

    public void populateItemTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblFoodItems.getModel();
        dtm.setRowCount(0);

        for (RequestItem ri : collectionWorkRequest.getRequestItems()) {
            Object row[] = new Object[2];
            row[0] = ri;
            row[1] = ri.getQuantity();

            dtm.addRow(row);
        }
    }

    public void populateData() {

        lblRequestDateVal.setText(collectionWorkRequest.getRequestDate() + "");
        lblRequestStatusVal.setText(collectionWorkRequest.getStatus());
        lblQuantityVal.setText(collectionWorkRequest.getTotalQuantity() + " pounds");

        String ngo = collectionWorkRequest.getDeliverToNGO() == null ? "Undelivered" : collectionWorkRequest.getDeliverToNGO();
        lblNGOVal.setText(ngo);

        String logistics = collectionWorkRequest.getDeliveredByLogistics() == null ? "Undelivered" : collectionWorkRequest.getDeliveredByLogistics();
        lblLogisticsVal.setText(logistics);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblLogistics;
    private javax.swing.JLabel lblLogisticsVal;
    private javax.swing.JLabel lblNGO;
    private javax.swing.JLabel lblNGOVal;
    private javax.swing.JLabel lblQuantity;
    private javax.swing.JLabel lblQuantityVal;
    private javax.swing.JLabel lblRequestDate;
    private javax.swing.JLabel lblRequestDateVal;
    private javax.swing.JLabel lblRequestStatus;
    private javax.swing.JLabel lblRequestStatusVal;
    private javax.swing.JTable tblFoodItems;
    // End of variables declaration//GEN-END:variables
}
