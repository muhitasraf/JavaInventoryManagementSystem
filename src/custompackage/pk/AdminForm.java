package custompackage.pk;

import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class AdminForm extends javax.swing.JFrame {

    public AdminForm() {
        initComponents();
        updateJListData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        formPanel = new javax.swing.JPanel();
        browseImageLbl = new javax.swing.JLabel();
        browseImageBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        hospitalNameTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        hospitalAddressTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        availableIcuTxt = new javax.swing.JTextField();
        btnPanel = new javax.swing.JPanel();
        saveRecordBtn = new javax.swing.JButton();
        updateRecordBtn = new javax.swing.JButton();
        deleteRecordBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        availableSeatTxt = new javax.swing.JTextField();
        searchWithId = new javax.swing.JTextField();
        searchHospitalId = new javax.swing.JButton();
        logoutBtn = new javax.swing.JButton();
        pendingHospitalBtn = new javax.swing.JButton();
        pendingStatus = new javax.swing.JLabel();
        listingPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        hospitalRecordList = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainPanel.setLayout(new java.awt.GridLayout(1, 0, 15, 0));

        formPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        formPanel.setPreferredSize(new java.awt.Dimension(400, 539));

        browseImageLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        browseImageLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myapp/images/student-profile-default.png"))); // NOI18N
        browseImageLbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        browseImageBtn.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        browseImageBtn.setText("BROWSE IMAGE");
        browseImageBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseImageBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setText("Hospital Name             :");

        hospitalNameTxt.setPreferredSize(new java.awt.Dimension(6, 45));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setText("Hospital Address          :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setText("Availavle ICU               :");

        availableIcuTxt.setPreferredSize(new java.awt.Dimension(6, 45));

        btnPanel.setLayout(new java.awt.GridLayout(1, 0, 10, 0));

        saveRecordBtn.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        saveRecordBtn.setText("Save ");
        saveRecordBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveRecordBtnActionPerformed(evt);
            }
        });
        btnPanel.add(saveRecordBtn);

        updateRecordBtn.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        updateRecordBtn.setText("Update");
        updateRecordBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateRecordBtnActionPerformed(evt);
            }
        });
        btnPanel.add(updateRecordBtn);

        deleteRecordBtn.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        deleteRecordBtn.setText("Delete");
        deleteRecordBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteRecordBtnActionPerformed(evt);
            }
        });
        btnPanel.add(deleteRecordBtn);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setText("Availavle Seat              :");

        availableSeatTxt.setPreferredSize(new java.awt.Dimension(6, 45));

        searchWithId.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        searchWithId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchWithIdKeyReleased(evt);
            }
        });

        searchHospitalId.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        searchHospitalId.setText("Search With Hospital ID");
        searchHospitalId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchHospitalIdActionPerformed(evt);
            }
        });

        logoutBtn.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        logoutBtn.setText("LOGOUT");
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        pendingHospitalBtn.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        pendingHospitalBtn.setText("View Pending Hospital");
        pendingHospitalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pendingHospitalBtnActionPerformed(evt);
            }
        });

        pendingStatus.setText(">");

        javax.swing.GroupLayout formPanelLayout = new javax.swing.GroupLayout(formPanel);
        formPanel.setLayout(formPanelLayout);
        formPanelLayout.setHorizontalGroup(
            formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(formPanelLayout.createSequentialGroup()
                        .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(browseImageLbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(browseImageBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(formPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(hospitalNameTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(hospitalAddressTxt)
                                    .addComponent(availableIcuTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(availableSeatTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(logoutBtn)
                                .addGap(83, 83, 83))
                            .addGroup(formPanelLayout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(searchHospitalId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(pendingHospitalBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(formPanelLayout.createSequentialGroup()
                                        .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(pendingStatus)
                                            .addComponent(searchWithId, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE)))))))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        formPanelLayout.setVerticalGroup(
            formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(browseImageLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(formPanelLayout.createSequentialGroup()
                        .addComponent(searchWithId, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pendingStatus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(searchHospitalId, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pendingHospitalBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(browseImageBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(hospitalNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(hospitalAddressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(availableIcuTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(availableSeatTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addComponent(btnPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        mainPanel.add(formPanel);

        listingPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        hospitalRecordList.setBackground(new java.awt.Color(153, 217, 234));
        hospitalRecordList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        hospitalRecordList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hospitalRecordListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(hospitalRecordList);

        javax.swing.GroupLayout listingPanelLayout = new javax.swing.GroupLayout(listingPanel);
        listingPanel.setLayout(listingPanelLayout);
        listingPanelLayout.setHorizontalGroup(
            listingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listingPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 535, Short.MAX_VALUE)
                .addContainerGap())
        );
        listingPanelLayout.setVerticalGroup(
            listingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listingPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 669, Short.MAX_VALUE)
                .addContainerGap())
        );

        mainPanel.add(listingPanel);

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("MAIN ADMIN PANEL");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1150, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updateRecordBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateRecordBtnActionPerformed
        hospitalName = hospitalNameTxt.getText();
        hospitalAddress = hospitalAddressTxt.getText();
        availableIcu = availableIcuTxt.getText();
        availableSeat = availableSeatTxt.getText();
        idStr = searchWithId.getText();
        if(!hospitalLogoPathStr.isEmpty()){
            Operations operations = new Operations();
            operations.updateHospitalData(hospitalName, hospitalAddress, availableIcu, availableSeat, hospitalLogoPathStr,idStr, this);
        }else{
            JOptionPane.showMessageDialog(this, "Please Select Image First!");
        }
        updateJListData();
    }//GEN-LAST:event_updateRecordBtnActionPerformed

    private void saveRecordBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveRecordBtnActionPerformed

        hospitalName = hospitalNameTxt.getText();
        hospitalAddress = hospitalAddressTxt.getText();
        availableIcu = availableIcuTxt.getText();
        availableSeat = availableSeatTxt.getText();

        if(!hospitalLogoPathStr.isEmpty()){
            Operations operations = new Operations();
            operations.insertHospitalData(hospitalName, hospitalAddress, availableIcu, availableSeat, hospitalLogoPathStr, this);
        }else{
            JOptionPane.showMessageDialog(this, "Please Select Image First!");
        }
        updateJListData();
    }//GEN-LAST:event_saveRecordBtnActionPerformed

    private void browseImageBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseImageBtnActionPerformed
        
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.IMAGE", "jpg", "png", "gif");
        fileChooser.addChoosableFileFilter(filter);
        int result = fileChooser.showSaveDialog(this);
        if(result == JFileChooser.APPROVE_OPTION){
            File selectedImage = fileChooser.getSelectedFile();
            String imagePath = selectedImage.getAbsolutePath();
            try{
                browseImageLbl.setIcon(ResizeImage(imagePath));
                hospitalLogoPathStr = imagePath;
            }catch (Exception exception){
                JOptionPane.showMessageDialog(this, "Image Error: " + exception.getMessage());
            }
        }
    }//GEN-LAST:event_browseImageBtnActionPerformed

    
    
    private void hospitalRecordListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hospitalRecordListMouseClicked
        
    }//GEN-LAST:event_hospitalRecordListMouseClicked

    private void searchHospitalIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchHospitalIdActionPerformed
        JFrame frame = new JFrame();
        try{
            Connection sqlConn = SQLConnection.getConnection();
            String searchTextStr = searchWithId.getText();
            PreparedStatement preparedStatement = sqlConn.prepareStatement("select * from hospital_details where id = '"+searchTextStr+"' ");
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                byte[] hospitalImageByte = resultSet.getBytes("hospital_logo");
                hospitalImageByte = scaleBytes(hospitalImageByte,210,210,frame);
                String hospitalNameStr = resultSet.getString("hospital_name");
                String hospitalAddressStr = resultSet.getString("address");
                String availableIcuStr = resultSet.getString("available_icu");
                String availableSeatStr = resultSet.getString("available_seat");
                hospitalNameTxt.setText(hospitalNameStr);
                hospitalAddressTxt.setText(hospitalAddressStr);
                availableIcuTxt.setText(availableIcuStr);
                availableSeatTxt.setText(availableSeatStr);
                browseImageLbl.setIcon(ViewResizeImage(null, resultSet.getBytes("hospital_logo")));
                //new ImageIcon(hospitalImageByte);
            }
        }catch(Exception exception){
            JOptionPane.showMessageDialog(frame, "Error:"+exception.getMessage());
        }
    }//GEN-LAST:event_searchHospitalIdActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        MainFrame mainFrame = new MainFrame();
        mainFrame.setVisible(true);
        AdminForm frame = new AdminForm();
        frame.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void deleteRecordBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteRecordBtnActionPerformed
                                                        
        Statement statement;
        String searchTextStr = searchWithId.getText();
        try{
            Connection mySqlConn = SQLConnection.getConnection();
            statement = mySqlConn.createStatement();
            statement.executeUpdate("delete from hospital_details where id = '"+searchTextStr+"' ");
            JOptionPane.showMessageDialog(this,"DATA DELETED SUCESSFULLY...");
        }
        catch(Exception oe){
            JOptionPane.showMessageDialog(this,oe.getMessage());
        }
        updateJListData();
    }//GEN-LAST:event_deleteRecordBtnActionPerformed

    private void pendingHospitalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pendingHospitalBtnActionPerformed
        PendingHospitalList pendingHospital = new PendingHospitalList();
        pendingHospital.setVisible(true);
    }//GEN-LAST:event_pendingHospitalBtnActionPerformed

    private void searchWithIdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchWithIdKeyReleased
        String searchTextStr = searchWithId.getText();
        if(!searchTextStr.isEmpty()){
            Operations operations = new Operations();
            operations.searchHospitalData(searchTextStr,pendingStatus,hospitalRecordList,this);
        }
    }//GEN-LAST:event_searchWithIdKeyReleased

    private void updateJListData(){
        Operations operations = new Operations();       
        operations.hospitalJList(hospitalRecordList, this);
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
            java.util.logging.Logger.getLogger(AdminForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AdminForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField availableIcuTxt;
    private javax.swing.JTextField availableSeatTxt;
    private javax.swing.JButton browseImageBtn;
    private javax.swing.JLabel browseImageLbl;
    private javax.swing.JPanel btnPanel;
    private javax.swing.JButton deleteRecordBtn;
    private javax.swing.JPanel formPanel;
    private javax.swing.JTextField hospitalAddressTxt;
    private javax.swing.JTextField hospitalNameTxt;
    private javax.swing.JList<String> hospitalRecordList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel listingPanel;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton pendingHospitalBtn;
    private javax.swing.JLabel pendingStatus;
    private javax.swing.JButton saveRecordBtn;
    private javax.swing.JButton searchHospitalId;
    private javax.swing.JTextField searchWithId;
    private javax.swing.JButton updateRecordBtn;
    // End of variables declaration//GEN-END:variables
    private String hospitalName,hospitalAddress, availableIcu, availableSeat, hospitalLogoPathStr,idStr;
    
    // Resize Image Function
    private ImageIcon ResizeImage(String imgPath){
        int imageX = 177;
        int imageY = 202;
        browseImageLbl.setSize(imageX, imageY);       
        ImageIcon myImage = new ImageIcon(imgPath);
        Image img = myImage.getImage();
        Image newImage = img.getScaledInstance(browseImageLbl.getWidth(), browseImageLbl.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImage);
        return image;
    }
    
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
    
    private ImageIcon ViewResizeImage(String imgPath, byte[] imgBytes){
        int imageX = 177;
        int imageY = 202;
        browseImageLbl.setSize(imageX, imageY);        
        ImageIcon myImage;        
        if(imgPath != null){
            myImage = new ImageIcon(imgPath);
        }else{
            myImage = new ImageIcon(imgBytes);
        }        
        Image img = myImage.getImage();
        Image newImage = img.getScaledInstance(browseImageLbl.getWidth(), browseImageLbl.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImage);
        return image;
    }    
}
