package case_study.furama.models.goi_dich_vu;

import java.util.Objects;

public class Vila extends Facility {
    private String tieuChuanPhong;
    private double areaPool;
    private int numFloor;

    public Vila() {
    }

    public Vila(String idSevice, String name, double area, double price, int maxPerson, String stye, String tieuChuanPhong, double areaPool, int numFloor) {
        super(idSevice, name, area, price, maxPerson, stye);
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vila vila = (Vila) o;
        return Objects.equals(getIdSevice(), vila.getIdSevice());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdSevice());
    }
}
