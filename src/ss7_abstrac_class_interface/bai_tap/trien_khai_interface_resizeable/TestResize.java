package ss7_abstrac_class_interface.bai_tap.trien_khai_interface_resizeable;

public class TestResize {
    public static void main(String[] args) {

        Shape arr[] = new Shape[4];

        arr[0] = new Circle();
        arr[1] = new Rectangle();
        arr[2] = new Square();


        System.out.println(arr[0].toString());
        System.out.println(arr[1].toString());
        System.out.println(arr[2].toString());

        arr[0].resize(30);
        arr[1].resize(30);
        arr[2].resize(30);

        System.out.println(arr[0].toString());
        System.out.println(arr[1].toString());
        System.out.println(arr[2].toString());
    }
}
