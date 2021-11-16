package ss7_abstrac_class_interface.bai_tap.trien_khai_interface_resizeable;

public class TestResize {
    public static void main(String[] args) {

        Shape arr[] = new Shape[4];

        arr[0] = new Circle();
        arr[1] = new Rectangle();
        arr[2] = new Square();

        System.out.println("truoc khi resize");
        System.out.println(arr[0].toString());
        System.out.println(arr[1].toString());
        System.out.println(arr[2].toString());

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] instanceof Circle){
                ((Circle)arr[i]).resize(100);
            } else if (arr[i] instanceof Rectangle){
                Rectangle h1 = (Rectangle)arr[i];
                h1.resize(100);
            }
        }
        System.out.println("sau khi resize");
        System.out.println(arr[0].toString());
        System.out.println(arr[1].toString());
        System.out.println(arr[2].toString());
    }
}
