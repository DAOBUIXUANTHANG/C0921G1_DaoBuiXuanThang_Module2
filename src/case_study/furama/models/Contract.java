package case_study.furama.models;

public class Contract {
    private String soHopDong;
    private String maBooking;
    private double tienCoc;
    private double tongTien;
    private String maKhachHang;

    public Contract() {
    }

    public Contract(String soHopDong, String maBooking, double tienCoc, double tongTien, String maKhachHang) {
        this.soHopDong = soHopDong;
        this.maBooking = maBooking;
        this.tienCoc = tienCoc;
        this.tongTien = tongTien;
        this.maKhachHang = maKhachHang;
    }

    public String getSoHopDong() {
        return soHopDong;
    }

    public void setSoHopDong(String soHopDong) {
        this.soHopDong = soHopDong;
    }

    public String getMaBooking() {
        return maBooking;
    }

    public void setMaBooking(String maBooking) {
        this.maBooking = maBooking;
    }

    public double getTienCoc() {
        return tienCoc;
    }

    public void setTienCoc(double tienCoc) {
        this.tienCoc = tienCoc;
    }

    public double getTongTien() {
        return tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "soHopDong='" + soHopDong + '\'' +
                ", maBooking='" + maBooking + '\'' +
                ", tienCoc=" + tienCoc +
                ", tongTien=" + tongTien +
                ", maKhachHang='" + maKhachHang + '\'' +
                '}';
    }
}
