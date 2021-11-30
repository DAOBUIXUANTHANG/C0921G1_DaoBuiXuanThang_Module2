package case_study.furama.models.goi_dich_vu;

public class House extends Facility {
    private String tieuChuanPhong;
    private int numFloor;

    public House(String name, double area, double price, int maxPerson, String stye, String tieuChuanPhong, int numFloor) {
        super(name, area, price, maxPerson, stye);
        this.tieuChuanPhong = tieuChuanPhong;
        this.numFloor = numFloor;
    }

    public House(String tieuChuanPhong, int numFloor) {
        this.tieuChuanPhong = tieuChuanPhong;
        this.numFloor = numFloor;
    }

    public String getTieuChuanPhong() {
        return tieuChuanPhong;
    }

    public void setTieuChuanPhong(String tieuChuanPhong) {
        this.tieuChuanPhong = tieuChuanPhong;
    }

    public int getNumFloor() {
        return numFloor;
    }

    public void setNumFloor(int numFloor) {
        this.numFloor = numFloor;
    }
}
