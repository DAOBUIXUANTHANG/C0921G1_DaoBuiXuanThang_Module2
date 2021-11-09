package ss7_abstrac_class_interface.bai_tap.trien_khai_interface_colorable;

public class TestColorable {
    public static void main(String[] args) {
        Shape arr[] = new Shape[4];
        arr[0] = new Squaree();
        arr[1] = new Circle();
        arr[2] = new Circle();
        arr[3] = new Squaree();

        for ( Shape arr1:
             arr) {
            if ( arr1 instanceof Squaree){
                ((Squaree) arr1).howToColor();
            }
        }
    }
}
