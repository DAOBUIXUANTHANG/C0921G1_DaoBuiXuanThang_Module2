package ss7_abstrac_class_interface.thuc_hanh.trien_khai_comparator_de_so_sanh_cach_lop_hinh_hoc;

import java.util.Comparator;

public class CircleComparator implements Comparator<Circle> {
    @Override
    public int compare(Circle circle1, Circle circle2) {
        if (circle1.getRadius() > circle2.getRadius()) return 1;
        else if (circle1.getRadius() < circle2.getRadius()) return -1;
        else return 0;
    }
}
