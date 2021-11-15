package ss7_abstrac_class_interface.thuc_hanh.trien_khai_interface_comparable;

public class ComparableCircle extends Circle implements Comparable{
    public ComparableCircle() {
    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    public ComparableCircle(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof ComparableCircle){
            ComparableCircle cir = (ComparableCircle)o;
            if (this.getRadius() > cir.getRadius()) return 1;
            else if (this.getRadius() < cir.getRadius()) return -1;
            else return 1;
        }
        return 0;
    }
}
