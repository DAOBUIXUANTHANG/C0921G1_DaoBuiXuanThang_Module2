package ss17_io_binary_file_serialization.bai_tap.quan_ly_san_pham;

import java.io.Serializable;

public class Product implements Serializable {
    private int prodCode;
    private String name;
    private String company;
    private double price;

    public Product(int prodCode, String name, String company, double price) {
        this.prodCode = prodCode;
        this.name = name;
        this.company = company;
        this.price = price;
    }

    public Product() {
    }

    public int getProdCode() {
        return prodCode;
    }

    public void setProdCode(int prodCode) {
        this.prodCode = prodCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "prodCode=" + prodCode +
                ", name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", price=" + price +
                '}';
    }
}
