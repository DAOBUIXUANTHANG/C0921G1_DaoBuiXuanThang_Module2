package ss12_java_collection_framework.bai_tap.luyen_tap_su_dung_arraylist_va_linkedlist.arraylist;

public class Product {
    private String name;
    private int id;

    public Product(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
