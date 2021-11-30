package case_study.furama.models.goi_dich_vu;

public class Vila extends Facility {
    private String tieuChuanPhong;
    private double areaPool;
    private int numFloor;

    public Vila() {
    }

    public Vila(String name, double area, double price, int maxPerson, String stye, String tieuChuanPhong, double areaPool, int numFloor) {
        super(name, area, price, maxPerson, stye);
        this.tieuChuanPhong = tieuChuanPhong;
        this.areaPool = areaPool;
        this.numFloor = numFloor;
    }

    public Vila(String tieuChuanPhong, double areaPool, int numFloor) {
        this.tieuChuanPhong = tieuChuanPhong;
        this.areaPool = areaPool;
        this.numFloor = numFloor;
    }

    public String getTieuChuanPhong() {
        return tieuChuanPhong;
    }

    public void setTieuChuanPhong(String tieuChuanPhong) {
        this.tieuChuanPhong = tieuChuanPhong;
    }

    public double getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(double areaPool) {
        this.areaPool = areaPool;
    }

    public int getNumFloor() {
        return numFloor;
    }

    public void setNumFloor(int numFloor) {
        this.numFloor = numFloor;
    }
}
