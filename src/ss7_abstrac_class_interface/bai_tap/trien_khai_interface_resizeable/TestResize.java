package ss7_abstrac_class_interface.bai_tap.trien_khai_interface_resizeable;

public class TestResize {
    public static void main(String[] args) {
        Circle h1 = new Circle();
        Rectangle h2 = new Rectangle();
        Square h3 = new Square();

        System.out.println(h1.toString());
        System.out.println(h2.toString());
        System.out.println(h3.toString());

        h1.resize(30);
        h2.resize(30);
        h3.resize(30);

        System.out.println(h1.toString());
        System.out.println(h2.toString());
        System.out.println(h3.toString());
    }
}
