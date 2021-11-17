package ss12_java_collection_framework.bai_tap.luyen_tap_su_dung_arraylist_va_linkedlist.arraylist;

import java.util.Comparator;

public class ComparatorId implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return o1.getId() - o2.getId();
    }
}
