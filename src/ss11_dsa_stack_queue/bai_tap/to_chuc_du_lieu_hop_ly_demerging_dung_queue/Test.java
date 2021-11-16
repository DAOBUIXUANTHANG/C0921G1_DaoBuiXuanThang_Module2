package ss11_dsa_stack_queue.bai_tap.to_chuc_du_lieu_hop_ly_demerging_dung_queue;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        List<Staff> listChuaSapXep = new ArrayList<>();
        List<Staff> listDaSapXep = new ArrayList<>();
        listChuaSapXep.add(new Staff("Anh","Nam","25/1/1996"));
        listChuaSapXep.add(new Staff("Ba","Nam","23/3/1997"));
        listChuaSapXep.add(new Staff("Tu","Nu","27/9/1996"));
        listChuaSapXep.add(new Staff("Nam","Nam","20/1/2000"));
        listChuaSapXep.add(new Staff("Quynh","Nam","24/6/1990"));
        listChuaSapXep.add(new Staff("Anh","Nu","21/1/1990"));
        listChuaSapXep.add(new Staff("Hang","Nu","25/6/1977"));
        listChuaSapXep.add(new Staff("Tam","Nu","25/6/1977"));
        listChuaSapXep.add(new Staff("Toan","Nam","25/6/1977"));
        listChuaSapXep.add(new Staff("Hang","Nu","25/6/1977"));

        System.out.println("------------------");
        for (int i = 0; i < listChuaSapXep.size(); i++) {
            System.out.println(listChuaSapXep.get(i).toString());
        }

        Collections.sort(listChuaSapXep , new ComparatorDayBirth());


        System.out.println("------------------");
        System.out.println("sau khi sap xep");
        for (int i = 0; i < listChuaSapXep.size(); i++) {
            System.out.println(listChuaSapXep.get(i).toString());
        }

    }
}
