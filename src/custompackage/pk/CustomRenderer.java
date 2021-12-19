
package custompackage.pk;

import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

public class CustomRenderer extends DefaultListCellRenderer implements ListCellRenderer<Object>{    
    
    @Override
    public Component getListCellRendererComponent(JList<?>list,Object value,int index,boolean isSelected,boolean hsaFocus){
        
        HospitalInfo hospitalInfo = (HospitalInfo) value;
        String hospitalId = Integer.toString(hospitalInfo.getHospitalId());
        String hospitalName = hospitalInfo.getHospitalName();
        String icuNumber = hospitalInfo.getAvailableIcu();
        String seatNumber = hospitalInfo.getAvailableSeat();
        String totalICU = hospitalInfo.getTotalIcu();
        String totalNormalBed = hospitalInfo.getTotalNormalSeat();
        String hospitalAddress = hospitalInfo.getHospitalAddress();
        String totalBed = Integer.toString(Integer.parseInt(totalICU) + Integer.parseInt(totalNormalBed));
        String totalAvilablleBed = Integer.toString(Integer.parseInt(icuNumber) + Integer.parseInt(seatNumber));
        String totalUses = Integer.toString(Integer.parseInt(totalBed) - Integer.parseInt(totalAvilablleBed));
        /*String details = "<html><div style=\"background-color: white;  padding: 10px; margin:10px; width:530px\">"+
                         "<div style=\"padding: 9px; background-color: 00a2e8; color: black;font-size:20px;border-radius:12px;width:530px\"><b>" + hospitalName + " ( ID-"+hospitalId+")"+
                         "</div><br/><div style=\"padding: 7px; background-color: 22b14c; color: black;font-size:15px;border-radius:12px;width:100%;float:right;\"><b>Total ICU Bed<span style='display:block; background-color:22b14c;color:22b14c;'>111</span>:</b> " + totalNormalBed +"<span style='display:block; background-color:22b14c;color:22b14c;'>Hidden</span>"+"<b>Available ICU Bed :</b> "+icuNumber+"+
                         "</div><br/><div style=\"padding: 7px; background-color: 22b14c; color: black;font-size:15px;border-radius:12px;width:100%;float:right;\"><b>Total Normal Bed:</b> " + seatNumber +"<span style='display:block; background-color:22b14c;color:22b14c;'>Text121</span>"+"<b>Available Normal Bed :</b> 20"+
                         "</div></div> </html>";
        
        */
        String details = "<html><div style=\"background-color: #F5FFFA;  padding: 18px; margin:10px; width:100%\">"+
                         "<div style=\"padding: 10px;text-align:center; background-color: 00a2e8; color: black;font-size:20px;border-radius:12px;width:530px\"><b>" + hospitalName + " </b>( ID-"+hospitalId+" "+hospitalAddress+")</div>"+
                         "<br/><div style=\"padding-left:10px; padding-right:10px; background-color: 00a2e8; color: black;font-size:20px;border-radius:12px;\">"  + "  Total ICU  Bed : "+totalICU+  "<span style='display:block; background-color:00a2e8;color:00a2e8;'>HiddenTx</span><span style='display:block; background-color:#F5FFFA;color:#F5FFFA;'>Te</span>" + " Available ICU:"+icuNumber+"</div>"+
                         "<br/><div style=\"padding-left:10px; padding-right:10px; background-color: 00a2e8; color: black;font-size:20px;border-radius:12px;\">"  + "  Total Normal Bed: "+totalNormalBed+ "<span style='display:block; background-color:00a2e8;color:00a2e8;'>Hidden</span><span style='display:block; background-color:#F5FFFA;color:#F5FFFA;'>Te</span>" + " Available Seat:"+seatNumber+"</div>"+
                         "<br/><div style=\"padding-left:10px; padding-right:10px; background-color: 00a2e8; color: black;font-size:20px;border-radius:12px;\">"  + "  Total  Bed      : "+totalBed+  "<span style='display:block; background-color:00a2e8;color:00a2e8;'>HiddenText11</span><span style='display:block; background-color:#F5FFFA;color:#F5FFFA;'>Te</span>" + " Available total bed:"+totalAvilablleBed+"</div>"+
                         "<br/><div style=\"padding: 8px;text-align:center; background-color: 00a2e8; color: black;font-size:20px;border-radius:12px;width:530px\">"+"Total Uses Bed:" + totalUses + " </div></html>";
        
        //String details = "<html><div style='padding-left:10px; padding-right:10px; height:50px; background-color: 00a2e8; color: black;font-size:20px;'>" + hospitalName + " ( ID-"+hospitalId+")</span> <span style='display:inline-block; padding-left:6%; background-color:white;color:white;'>Text</span>" +"   "+ hospitalName + " ( ID-"+hospitalId+")</div></html>";
        
        setText(details);
        setIcon(hospitalInfo.getHospitalImage());
        setIconTextGap(10);
        
        if(isSelected){
            setBackground(list.getSelectionBackground());
            setForeground(list.getSelectionForeground());
        }else{
            setBackground(list.getBackground());
            setForeground(list.getForeground());
        }
        
        if(isSelected){
            System.out.println(index);           
        }
        
        setEnabled(true);
        setFont(list.getFont());
        
        return this;        
    }    
}