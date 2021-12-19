
package custompackage.pk;

import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.imageio.ImageIO;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;

public class Operations {
    public static void insertHospitalData(String personName,String hospitalAddress, String personMiddleName, String personLastName, String personImagePath, JFrame frame){
        try{
            Connection mySqlConn = SQLConnection.getConnection();
            String mySqlQuery = "INSERT INTO hospital_details (hospital_name, address, available_icu, available_seat, hospital_logo) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = mySqlConn.prepareStatement(mySqlQuery);
            
            preparedStatement.setString(1, personName);
            preparedStatement.setString(2, hospitalAddress);
            preparedStatement.setString(3, personMiddleName);
            preparedStatement.setString(4, personLastName);
            
            try{
                InputStream inputStream = new FileInputStream(new File(personImagePath));
                preparedStatement.setBlob(5, inputStream);
            }catch (Exception exception){
                JOptionPane.showMessageDialog(frame, "Image Error: " + exception.getMessage());
                return;
            }
            
            try{
                preparedStatement.execute();
                JOptionPane.showMessageDialog(frame, "Record Has Been Saved!");
            }catch (Exception exception){
                JOptionPane.showMessageDialog(frame, "Image Error: " + exception.getMessage());
                return;
            }            
        }catch (Exception exception){
            JOptionPane.showMessageDialog(frame, "Data Error: " + exception.getMessage());
            return;
        }
    }
    
    public static void updateHospitalData(String personName,String hospitalAddress, String personMiddleName, String personLastName, String personImagePath, String idStr, JFrame frame){
        try{
            Connection mySqlConn = SQLConnection.getConnection();
            String mySqlQuery = " update hospital_details set hospital_name = ?, address = ?, available_icu = ?, available_seat = ?, hospital_logo = ? where id = ' "+idStr+" ' ";
            PreparedStatement preparedStatement = mySqlConn.prepareStatement(mySqlQuery);
            
            preparedStatement.setString(1, personName);
            preparedStatement.setString(2, hospitalAddress);
            preparedStatement.setString(3, personMiddleName);
            preparedStatement.setString(4, personLastName);
            
            try{
                InputStream inputStream = new FileInputStream(new File(personImagePath));
                preparedStatement.setBlob(5, inputStream);
            }catch (Exception exception){
                JOptionPane.showMessageDialog(frame, "Image Error: " + exception.getMessage());
                return;
            }
            //preparedStatement.setString(6, idStr);
            try{
                preparedStatement.execute();
                JOptionPane.showMessageDialog(frame, "Record Has Been Saved!");
            }catch (Exception exception){
                JOptionPane.showMessageDialog(frame, "Image Error: " + exception.getMessage());
                return;
            }            
        }catch (Exception exception){
            JOptionPane.showMessageDialog(frame, "Data Error: " + exception.getMessage());
            return;
        }
    }
    
    public static void updateHospitalInfo(String personName,String hospitalAddress, String personImagePath, int idStr, JFrame frame){
        try{
            Connection mySqlConn = SQLConnection.getConnection();
            String mySqlQuery = " update hospital_details set hospital_name = ?, address = ?, available_icu = ?, available_seat = ?, hospital_logo = ? where id = ' idStr ' ";
            PreparedStatement preparedStatement = mySqlConn.prepareStatement(mySqlQuery);
            
            preparedStatement.setString(1, personName);
            preparedStatement.setString(2, hospitalAddress);
            
            try{
                InputStream inputStream = new FileInputStream(new File(personImagePath));
                preparedStatement.setBlob(4, inputStream);
            }catch (Exception exception){
                JOptionPane.showMessageDialog(frame, "Image Error: " + exception.getMessage());
                return;
            }
            //preparedStatement.setString(6, idStr);
            try{
                preparedStatement.execute();
                JOptionPane.showMessageDialog(frame, "Record Has Been Saved!");
            }catch (Exception exception){
                JOptionPane.showMessageDialog(frame, "Image Error: " + exception.getMessage());
                return;
            }            
        }catch (Exception exception){
            JOptionPane.showMessageDialog(frame, "Data Error: " + exception.getMessage());
            return;
        }
    }        
            
    public static void updateStatus(String idStr,int status,JFrame frame){
        try{
            Connection mySqlConn = SQLConnection.getConnection();
            String mySqlQuery = " update hospital_details set status = ? where id = ' "+idStr+" ' ";
            PreparedStatement preparedStatement = mySqlConn.prepareStatement(mySqlQuery);
            
            preparedStatement.setInt(1, status);
            
            try{
                preparedStatement.execute();
                JOptionPane.showMessageDialog(frame, "Hospital Approved!");
            }catch (Exception exception){
                JOptionPane.showMessageDialog(frame, "Error: " + exception.getMessage());
            }            
        }catch (Exception exception){
            JOptionPane.showMessageDialog(frame, "Data Error: " + exception.getMessage());
        }
    }
    
    public static void hospitalJList(JList list,JFrame frame){        
        DefaultListModel listModel = new DefaultListModel();
        try{
            Connection sqlConn = SQLConnection.getConnection();
            PreparedStatement preparedStatement = sqlConn.prepareStatement("Select * from hospital_details where status = 1");
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                byte[] hospitalImageByte = resultSet.getBytes("hospital_logo");
                hospitalImageByte = scaleBytes(hospitalImageByte,215,365,frame);
                listModel.addElement(new HospitalInfo(resultSet.getInt("id"),resultSet.getString("hospital_name"),resultSet.getString("address"),resultSet.getString("total_icu"),
                resultSet.getString("available_icu"),resultSet.getString("total_normal_seat"),resultSet.getString("available_seat"),new ImageIcon(hospitalImageByte)));
            }
        }catch(Exception exception){
            JOptionPane.showMessageDialog(frame, "Error:"+exception.getMessage());
        }
        list.setCellRenderer(new CustomRenderer());
        list.setModel(listModel); 
    }
    
    public static void pendingHospitalJList(JList list,JFrame frame){        
        DefaultListModel listModel = new DefaultListModel();
        try{
            Connection sqlConn = SQLConnection.getConnection();
            PreparedStatement preparedStatement = sqlConn.prepareStatement("Select * from hospital_details where status = 0 ");
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                byte[] hospitalImageByte = resultSet.getBytes("hospital_logo");
                hospitalImageByte = scaleBytes(hospitalImageByte,215,215,frame);
                listModel.addElement(new HospitalInfo(resultSet.getInt("id"),resultSet.getString("hospital_name"),resultSet.getString("address"),resultSet.getString("total_icu"),
                resultSet.getString("available_icu"),resultSet.getString("total_normal_seat"),resultSet.getString("available_seat"),new ImageIcon(hospitalImageByte)));
            }
        }catch(Exception exception){
            JOptionPane.showMessageDialog(frame, "Error:"+exception.getMessage());
        }
        list.setCellRenderer(new CustomRenderer());
        list.setModel(listModel); 
    }

    public static void searchHospitalData(String searchQuery,JLabel statusLabel,JList list,JFrame frame){
        DefaultListModel listModel = new DefaultListModel();
        try{
            Connection sqlConn = SQLConnection.getConnection();
            String query = searchQuery;
            PreparedStatement preparedStatement = sqlConn.prepareStatement("select * from hospital_details where hospital_name like '%"+query+"%' or address like '%"+query+"%'");
            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.isBeforeFirst()){
                while(resultSet.next()){
                    byte[] hospitalImageByte = resultSet.getBytes("hospital_logo");
                    hospitalImageByte = scaleBytes(hospitalImageByte,215,215,frame);
                    listModel.addElement(new HospitalInfo(resultSet.getInt("id"),resultSet.getString("hospital_name"),resultSet.getString("address"),resultSet.getString("total_icu"),
                    resultSet.getString("available_icu"),resultSet.getString("total_normal_seat"),resultSet.getString("available_seat"),new ImageIcon(hospitalImageByte)));
                }                
                if(searchQuery.isEmpty()){         
                    statusLabel.setText("<html><p style=\"font-size:15px;\"><b>Search By Hospital Name Or By Location Near !</b>");    
                }else{
                    statusLabel.setText("<html><p style=\"font-size:15px;\"><b>Hospital Found for: </b>"+searchQuery);
                }
            }else{
                statusLabel.setText("<html><p style=\"font-size:15px;\"><b>No Hospital Found as: </b>"+searchQuery);
            }            
        }catch(Exception exception){
            JOptionPane.showMessageDialog(frame, "Error:"+exception.getMessage());
        }
        list.setCellRenderer(new CustomRenderer());
        list.setModel(listModel);       
    }
    
    public static void searchPendingHospitalData(String searchQuery,JLabel pendingStatus,JList list,JFrame frame){
        DefaultListModel listModel = new DefaultListModel();
        try{
            Connection sqlConn = SQLConnection.getConnection();
            String query = searchQuery;
            PreparedStatement preparedStatement = sqlConn.prepareStatement("select * from hospital_details where id like '%"+query+"%' && status = 0 ");
            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.isBeforeFirst()){
                while(resultSet.next()){
                    byte[] hospitalImageByte = resultSet.getBytes("hospital_logo");
                    hospitalImageByte = scaleBytes(hospitalImageByte,215,215,frame);
                    listModel.addElement(new HospitalInfo(resultSet.getInt("id"),resultSet.getString("hospital_name"),resultSet.getString("address"),resultSet.getString("total_icu"),
                    resultSet.getString("available_icu"),resultSet.getString("total_normal_seat"),resultSet.getString("available_seat"),new ImageIcon(hospitalImageByte)));
                }
                pendingStatus.setText("<html><p style=\"font-size:15px;\"><b>Pending Hospital Found></b>");
            }else{
                pendingStatus.setText("<html><p style=\"font-size:15px;\"><b>"+searchQuery+" Already Approved.</b>");
            }            
        }catch(Exception exception){
            JOptionPane.showMessageDialog(frame, "Error:"+exception.getMessage());
        }
        list.setCellRenderer(new CustomRenderer());
        list.setModel(listModel);       
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
}
