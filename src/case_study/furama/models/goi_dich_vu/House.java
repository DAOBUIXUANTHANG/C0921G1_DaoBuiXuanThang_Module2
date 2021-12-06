package case_study.furama.models.goi_dich_vu;

import java.util.Objects;

public class House extends Facility {
    private String tieuChuanPhong;
    private int numFloor;

    public House(String idSevice, String name, double area, double price, int maxPerson, String stye, String tieuChuanPhong, int numFloor) {
        super(idSevice, name, area, price, maxPerson, stye);
        this.tieuChuanPhong = tieuChuanPhong;
        this.numFloor = numFloor;
    }

    public House() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        House house = (House) o;
        return getIdSevice().equals(house.getIdSevice()) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdSevice());
    }
}
