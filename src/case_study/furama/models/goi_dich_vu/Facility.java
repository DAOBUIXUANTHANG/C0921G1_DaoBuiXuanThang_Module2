package case_study.furama.models.goi_dich_vu;

public abstract class Facility {
    private String idSevice;
    private String name;
    private double area;
    private double price;
    private int maxPerson;
    private String stye;

    public Facility(String idSevice, String name, double area, double price, int maxPerson, String stye) {
        this.idSevice = idSevice;
        this.name = name;
        this.area = area;
        this.price = price;
        this.maxPerson = maxPerson;
        this.stye = stye;
    }

    public Facility() {
    }

    public String getIdSevice() {
        return idSevice;
    }

    public void setIdSevice(String idSevice) {
        this.idSevice = idSevice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getMaxPerson() {
        return maxPerson;
    }

    public void setMaxPerson(int maxPerson) {
        this.maxPerson = maxPerson;
    }

    public String getStye() {
        return stye;
    }

    public void setStye(String stye) {
        this.stye = stye;
    }
}
