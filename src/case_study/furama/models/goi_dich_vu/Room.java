package case_study.furama.models.goi_dich_vu;

public class Room extends Facility {
    private String dichVuMienPhi;

    public Room(String name, double area, double price, int maxPerson, String stye, String dichVuMienPhi) {
        super(name, area, price, maxPerson, stye);
        this.dichVuMienPhi = dichVuMienPhi;
    }

    public Room(String dichVuMienPhi) {
        this.dichVuMienPhi = dichVuMienPhi;
    }

    public String getDichVuMienPhi() {
        return dichVuMienPhi;
    }

    public void setDichVuMienPhi(String dichVuMienPhi) {
        this.dichVuMienPhi = dichVuMienPhi;
    }
}
