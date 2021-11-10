package ss6_ke_thua.bai_tap.thiet_ke_va_trien_khai_lop_triangle;

public class TestLopTriangle {
    public static void main(String[] args) {
        Shape h1 = new Triangle();
        Shape h2 = new Triangle("red", 4, 3,5);
        Triangle h3 = new Triangle(3,4,5);

        System.out.println(h1.toString());
        System.out.println(h2.toString());
        System.out.println(h3.toString());
    }


}
