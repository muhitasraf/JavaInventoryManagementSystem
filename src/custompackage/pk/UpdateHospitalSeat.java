
package custompackage.pk;

import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public final class UpdateHospitalSeat extends javax.swing.JFrame{

    public UpdateHospitalSeat() {      
        initComponents();
        bedcount();
    }
    Connection con1;
    PreparedStatement prepareStatement;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        normalbed = new javax.swing.JPanel();
        normalbedlabel = new javax.swing.JLabel();
        normalbedtext = new javax.swing.JTextField();
        icubedlabel = new javax.swing.JLabel();
        icubedtext = new javax.swing.JTextField();
        addbutton = new javax.swing.JButton();
        totalbedlabel = new javax.swing.JLabel();
        totalAvailablebedtext = new javax.swing.JTextField();
        browseImageLbl = new javax.swing.JLabel();
        browseImageBtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        hospitalJLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        hospitalNameTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        hospitalAddressTxt = new javax.swing.JTextField();
        updateInfoBtn = new javax.swing.JButton();
        normalbedlabel1 = new javax.swing.JLabel();
        totalICUtext = new javax.swing.JTextField();
        icubedlabel1 = new javax.swing.JLabel();
        totalNormalbedtext = new javax.swing.JTextField();
        totalbedlabel1 = new javax.swing.JLabel();
        totalbedtext = new javax.swing.JTextField();
        updateTotalBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        normalbed.setBorder(javax.swing.BorderFactory.createTitledBorder("Hospital"));

        normalbedlabel.setText("Available Normal Bed");

        icubedlabel.setText("Available ICU Bed");

        addbutton.setText("Update Available");
        addbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbuttonActionPerformed(evt);
            }
        });

        totalbedlabel.setText("Available Total Bed");

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

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        hospitalJLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(hospitalJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 727, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(hospitalJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Hospital Name");

        hospitalNameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hospitalNameTxtActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Hospital Addres");

        updateInfoBtn.setText("Update Hospital Info ");
        updateInfoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateInfoBtnActionPerformed(evt);
            }
        });

        normalbedlabel1.setText("Total ICU Bed");

        totalICUtext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalICUtextActionPerformed(evt);
            }
        });

        icubedlabel1.setText("Total Normal Bed");

        totalbedlabel1.setText("Total Bed");

        updateTotalBtn.setText("Update Total");
        updateTotalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateTotalBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout normalbedLayout = new javax.swing.GroupLayout(normalbed);
        normalbed.setLayout(normalbedLayout);
        normalbedLayout.setHorizontalGroup(
            normalbedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(normalbedLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(normalbedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, normalbedLayout.createSequentialGroup()
                        .addGroup(normalbedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(browseImageLbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(browseImageBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(312, 312, 312)
                        .addGroup(normalbedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(normalbedLayout.createSequentialGroup()
                                .addGroup(normalbedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(icubedlabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(totalbedlabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(43, 43, 43)
                                .addGroup(normalbedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(totalICUtext)
                                    .addComponent(totalNormalbedtext)
                                    .addComponent(totalbedtext, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(normalbedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(normalbedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, normalbedLayout.createSequentialGroup()
                                        .addComponent(updateTotalBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(55, 55, 55))
                                    .addComponent(addbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(normalbedLayout.createSequentialGroup()
                                    .addGroup(normalbedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(icubedlabel)
                                        .addComponent(normalbedlabel)
                                        .addComponent(totalbedlabel)
                                        .addComponent(normalbedlabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(normalbedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(normalbedtext)
                                        .addComponent(icubedtext)
                                        .addComponent(totalAvailablebedtext, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(72, 72, 72))
                    .addGroup(normalbedLayout.createSequentialGroup()
                        .addGroup(normalbedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(normalbedLayout.createSequentialGroup()
                                .addGroup(normalbedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(normalbedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(hospitalNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(hospitalAddressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(updateInfoBtn))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        normalbedLayout.setVerticalGroup(
            normalbedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(normalbedLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(normalbedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(normalbedLayout.createSequentialGroup()
                        .addComponent(browseImageLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(browseImageBtn)
                        .addGap(31, 31, 31)
                        .addGroup(normalbedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hospitalNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(normalbedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hospitalAddressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addComponent(updateInfoBtn))
                    .addGroup(normalbedLayout.createSequentialGroup()
                        .addGroup(normalbedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(normalbedlabel)
                            .addComponent(normalbedtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(normalbedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(icubedlabel)
                            .addComponent(icubedtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(normalbedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(totalbedlabel)
                            .addComponent(totalAvailablebedtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(addbutton)
                        .addGap(67, 67, 67)
                        .addGroup(normalbedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(normalbedlabel1)
                            .addComponent(totalICUtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(normalbedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(icubedlabel1)
                            .addComponent(totalNormalbedtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(normalbedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(totalbedlabel1)
                            .addComponent(totalbedtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addComponent(updateTotalBtn)))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(normalbed, javax.swing.GroupLayout.PREFERRED_SIZE, 837, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(normalbed, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
       
    private void addbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbuttonActionPerformed
        try {            
            AdminHospitalLogin login = new AdminHospitalLogin();
            Connection sqlConn = SQLConnection.getConnection();          
            int id = login.getidfromdatabase;
            prepareStatement = sqlConn.prepareStatement("update hospital_details set available_seat = ?, available_icu = ?, total_bed = ? where id = ?");
            prepareStatement.setInt(1,Integer.parseInt(normalbedtext.getText()));
            prepareStatement.setInt(2,Integer.parseInt(icubedtext.getText()));
            prepareStatement.setInt(3,Integer.parseInt(normalbedtext.getText())+Integer.parseInt(icubedtext.getText()));
            prepareStatement.setInt(4,id);
            prepareStatement.executeUpdate();
            totalAvailablebedtext.setText(Integer.toString(Integer.parseInt(normalbedtext.getText())+Integer.parseInt(icubedtext.getText())));                
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UpdateHospitalSeat.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(UpdateHospitalSeat.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(UpdateHospitalSeat.class.getName()).log(Level.SEVERE, null, ex);
        }       
    }//GEN-LAST:event_addbuttonActionPerformed

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

    private void hospitalNameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hospitalNameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hospitalNameTxtActionPerformed

    private void updateTotalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateTotalBtnActionPerformed
        try {            
            AdminHospitalLogin login = new AdminHospitalLogin();
            Connection sqlConn = SQLConnection.getConnection();          
            int id = login.getidfromdatabase;
            prepareStatement = sqlConn.prepareStatement("update hospital_details set total_icu = ?, total_normal_seat = ? where id = ?");
            prepareStatement.setInt(1,Integer.parseInt(totalICUtext.getText()));
            prepareStatement.setInt(2,Integer.parseInt(totalNormalbedtext.getText()));
            prepareStatement.setInt(3,id);
            prepareStatement.executeUpdate();
            totalAvailablebedtext.setText(Integer.toString(Integer.parseInt(normalbedtext.getText())+Integer.parseInt(icubedtext.getText())));                
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UpdateHospitalSeat.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(UpdateHospitalSeat.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(UpdateHospitalSeat.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_updateTotalBtnActionPerformed

    private void updateInfoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateInfoBtnActionPerformed
        hospitalName = hospitalNameTxt.getText();
        hospitalAddress = hospitalAddressTxt.getText();
        AdminHospitalLogin login =new AdminHospitalLogin();
        int idStr = login.getidfromdatabase;
         
        if(!hospitalLogoPathStr.isEmpty()){
            Operations operations = new Operations();
            operations.updateHospitalInfo(hospitalName, hospitalAddress, hospitalLogoPathStr,idStr, this);
        }else{
            JOptionPane.showMessageDialog(this, "Please Select Image First!");
        }
    }//GEN-LAST:event_updateInfoBtnActionPerformed

    private void totalICUtextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalICUtextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalICUtextActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateHospitalSeat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateHospitalSeat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateHospitalSeat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateHospitalSeat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        new UpdateHospitalSeat().setVisible(true);
    }

    void bedcount(){  
        AdminHospitalLogin login =new AdminHospitalLogin();
        int icubed = login.availableicubed;  
        int normalSeat = login.availablenormalbed; 
        int totalbed = login.availableTotalBed;
        
        int totalICU = login.totalICU;
        int totalNormalBed = login.totalNormalBed;
        int totalBed = login.totalBed;
        
        String hospitalName = login.hospitalName;
        String hospitalAddress = login.hospitalAddress;
        
        hospitalJLabel.setText(hospitalName);
        
        icubedtext.setText(Integer.toString(icubed));
        normalbedtext.setText(Integer.toString(normalSeat));
        totalAvailablebedtext.setText(Integer.toString(totalbed));
        
        totalICUtext.setText(Integer.toString(totalICU));
        totalNormalbedtext.setText(Integer.toString(totalNormalBed));
        totalbedtext.setText(Integer.toString(totalBed));
        
        hospitalNameTxt.setText(hospitalName);
        hospitalAddressTxt.setText(hospitalAddress);
        //browseImageLbl.setIcon(ViewResizeImage(null, resultSet.getBytes("hospital_logo")));
        //new ImageIcon(hospitalImageByte);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbutton;
    private javax.swing.JButton browseImageBtn;
    private javax.swing.JLabel browseImageLbl;
    private javax.swing.JTextField hospitalAddressTxt;
    private javax.swing.JLabel hospitalJLabel;
    private javax.swing.JTextField hospitalNameTxt;
    private javax.swing.JLabel icubedlabel;
    private javax.swing.JLabel icubedlabel1;
    private javax.swing.JTextField icubedtext;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel normalbed;
    private javax.swing.JLabel normalbedlabel;
    private javax.swing.JLabel normalbedlabel1;
    private javax.swing.JTextField normalbedtext;
    private javax.swing.JTextField totalAvailablebedtext;
    private javax.swing.JTextField totalICUtext;
    private javax.swing.JTextField totalNormalbedtext;
    private javax.swing.JLabel totalbedlabel;
    private javax.swing.JLabel totalbedlabel1;
    private javax.swing.JTextField totalbedtext;
    private javax.swing.JButton updateInfoBtn;
    private javax.swing.JButton updateTotalBtn;
    // End of variables declaration//GEN-END:variables

    private String hospitalName,hospitalAddress, hospitalLogoPathStr;
    
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
