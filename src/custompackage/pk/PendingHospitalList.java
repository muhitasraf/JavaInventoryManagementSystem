
package custompackage.pk;

import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class PendingHospitalList extends javax.swing.JFrame {

    public PendingHospitalList() {
        initComponents();
        updateJListData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        hospitalNameLabel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pendingHospitalList = new javax.swing.JList<>();
        approvedBtn = new javax.swing.JButton();
        pendingIdTxt = new javax.swing.JTextField();
        deleteBtn = new javax.swing.JButton();
        pendingSearchBtn = new javax.swing.JButton();
        pendingUserLabel = new javax.swing.JLabel();
        pendingHospitalLabel = new javax.swing.JLabel();
        pendingStatus = new javax.swing.JLabel();
        pendingAddressLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(102, 153, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ALL PENDING HOSPITAL LIST");
        jLabel1.setVerifyInputWhenFocusTarget(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                .addContainerGap())
        );

        pendingHospitalList.setBackground(new java.awt.Color(153, 217, 234));
        pendingHospitalList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(pendingHospitalList);

        approvedBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        approvedBtn.setText("Approve This Hospital");
        approvedBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approvedBtnActionPerformed(evt);
            }
        });

        pendingIdTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pendingIdTxtKeyReleased(evt);
            }
        });

        deleteBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        deleteBtn.setText("Delete This Hospital");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        pendingSearchBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        pendingSearchBtn.setText("Search Details For This Id");
        pendingSearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pendingSearchBtnActionPerformed(evt);
            }
        });

        pendingUserLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        pendingUserLabel.setText(" ");

        pendingHospitalLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        pendingHospitalLabel.setText(" ");

        pendingStatus.setText(">");

        pendingAddressLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        pendingAddressLabel.setText(" ");

        javax.swing.GroupLayout hospitalNameLabelLayout = new javax.swing.GroupLayout(hospitalNameLabel);
        hospitalNameLabel.setLayout(hospitalNameLabelLayout);
        hospitalNameLabelLayout.setHorizontalGroup(
            hospitalNameLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, hospitalNameLabelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(hospitalNameLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(hospitalNameLabelLayout.createSequentialGroup()
                        .addGroup(hospitalNameLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(approvedBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pendingSearchBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pendingIdTxt, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(deleteBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pendingUserLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pendingHospitalLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(hospitalNameLabelLayout.createSequentialGroup()
                                .addComponent(pendingStatus)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(pendingAddressLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 738, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        hospitalNameLabelLayout.setVerticalGroup(
            hospitalNameLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hospitalNameLabelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(hospitalNameLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(hospitalNameLabelLayout.createSequentialGroup()
                        .addComponent(pendingIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pendingStatus)
                        .addGap(18, 18, 18)
                        .addComponent(pendingSearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(approvedBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pendingHospitalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pendingUserLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pendingAddressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 120, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(hospitalNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(hospitalNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pendingSearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pendingSearchBtnActionPerformed
        JFrame frame = new JFrame();
        try{
            Connection sqlConn = SQLConnection.getConnection();
            String searchTextStr = pendingIdTxt.getText();
            PreparedStatement preparedStatement = sqlConn.prepareStatement("select * from hospital_details where id = '"+searchTextStr+"' ");
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                String hospitalNameStr = resultSet.getString("hospital_name");
                String hospitalId = resultSet.getString("id");
                String hospitalUserName = resultSet.getString("hospital_userName");
                String hospitalAddress = resultSet.getString("address");
                pendingHospitalLabel.setText(hospitalNameStr+" (ID-"+hospitalId+")");
                pendingUserLabel.setText("User Name: "+hospitalUserName);
                pendingAddressLabel.setText("Address: "+hospitalAddress);
            }
        }catch(Exception exception){
            JOptionPane.showMessageDialog(frame, "Error:"+exception.getMessage());
        }
    }//GEN-LAST:event_pendingSearchBtnActionPerformed

    private void approvedBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approvedBtnActionPerformed

        String idStr = pendingIdTxt.getText();
        int status = 1;
        Operations operations = new Operations();
        operations.updateStatus(idStr,status,this);
        updateJListData();
    }//GEN-LAST:event_approvedBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        Statement statement;
        String searchTextStr = pendingIdTxt.getText();
        try{
            Connection mySqlConn = SQLConnection.getConnection();
            statement = mySqlConn.createStatement();
            statement.executeUpdate("delete from hospital_details where id = '"+searchTextStr+"' ");
            JOptionPane.showMessageDialog(this,"HOSPITAL DELETED SUCESSFULLY");
        }
        catch(Exception oe){
            JOptionPane.showMessageDialog(this,oe.getMessage());
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void pendingIdTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pendingIdTxtKeyReleased
        String searchTextStr = pendingIdTxt.getText();
        if(!searchTextStr.isEmpty()){
            Operations operations = new Operations();
            operations.searchPendingHospitalData(searchTextStr,pendingStatus,pendingHospitalList,this);
        }
    }//GEN-LAST:event_pendingIdTxtKeyReleased

    private void updateJListData(){
        Operations operations = new Operations();
        operations.pendingHospitalJList(pendingHospitalList, this);
    }
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PendingHospitalList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PendingHospitalList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PendingHospitalList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PendingHospitalList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PendingHospitalList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton approvedBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JPanel hospitalNameLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel pendingAddressLabel;
    private javax.swing.JLabel pendingHospitalLabel;
    private javax.swing.JList<String> pendingHospitalList;
    private javax.swing.JTextField pendingIdTxt;
    private javax.swing.JButton pendingSearchBtn;
    private javax.swing.JLabel pendingStatus;
    private javax.swing.JLabel pendingUserLabel;
    // End of variables declaration//GEN-END:variables

public static byte[] scaleBytes(byte[] fileData,int width,int height,JFrame frame){
        ByteArrayInputStream byteInputStream = new ByteArrayInputStream(fileData);
        try{
            BufferedImage image = ImageIO.read(byteInputStream);
            if(height==0){
                height = (width*image.getHeight())/image.getWidth();
            }
            if(width==0){
                width = (height*image.getWidth()/image.getHeight());
            }
            Image scaledImage = image.getScaledInstance(width, height, Image.SCALE_SMOOTH);
            BufferedImage bufferImage = new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);
            bufferImage.getGraphics().drawImage(scaledImage, 0, 0, new Color(0,0,0),null);
            ByteArrayOutputStream byteOutputStream = new ByteArrayOutputStream();
            ImageIO.write(bufferImage, "jpg", byteOutputStream);
            return byteOutputStream.toByteArray();
        }catch(Exception exception){
            JOptionPane.showMessageDialog(frame, "Error:"+exception.getMessage());
        }
        return null;
}
}
