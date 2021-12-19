
package custompackage.pk;

import javax.swing.Icon;

public class HospitalInfo {
    public int hospitalId;
    public String hospitalName;
    public String hospitalAddress;
    public Icon hospitalImage;
    public String totalIcu;
    public String availableIcu;
    public String totalNormalSeat;
    public String availableSeat;
    
    public HospitalInfo(int hospitalId,String hospitalName,String hospitalAddress,String totalIcu,String availableIcu,String totalNormalSeat,String availableSeat,Icon hospitalImage){
        this.hospitalId = hospitalId;
        this.hospitalName = hospitalName;
        this.hospitalAddress = hospitalAddress;
        this.totalIcu = totalIcu;
        this.availableIcu = availableIcu;
        this.totalNormalSeat = totalNormalSeat;
        this.availableSeat = availableSeat;
        this.hospitalImage = hospitalImage;
    }

    public int getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(int hospitalId) {
        this.hospitalId = hospitalId;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getHospitalAddress() {
        return hospitalAddress;
    }

    public void setHospitalAddress(String hospitalAddress) {
        this.hospitalAddress = hospitalAddress;
    }

    public Icon getHospitalImage() {
        return hospitalImage;
    }

    public void setHospitalImage(Icon hospitalImage) {
        this.hospitalImage = hospitalImage;
    }
    
    public String getTotalIcu() {
        return totalIcu;
    }

    public void setTotalIcu(String totalIcu) {
        this.totalIcu = totalIcu;
    }
    
    public String getAvailableIcu() {
        return availableIcu;
    }

    public void setAvailableIcu(String availableIcu) {
        this.availableIcu = availableIcu;
    }
    
    public String getTotalNormalSeat() {
        return totalNormalSeat;
    }

    public void setTotalNormalSeat(String totalNormalSeat) {
        this.totalNormalSeat = totalNormalSeat;
    }

    public String getAvailableSeat() {
        return availableSeat;
    }

    public void setAvailableSeat(String availableSeat) {
        this.availableSeat = availableSeat;
    }
    
}
