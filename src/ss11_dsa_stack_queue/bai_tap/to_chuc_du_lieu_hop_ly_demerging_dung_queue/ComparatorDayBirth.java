package ss11_dsa_stack_queue.bai_tap.to_chuc_du_lieu_hop_ly_demerging_dung_queue;

import java.util.Comparator;

public class ComparatorDayBirth implements Comparator<Staff> {


    @Override
    public int compare(Staff o1, Staff o2) {
        if (o1.getGender() == o2.getGender()){
            return o1.getDateBirth().compareTo(o2.getDateBirth());
        }
        return - (o1.getGender().compareTo(o2.getGender()));
    }
}
