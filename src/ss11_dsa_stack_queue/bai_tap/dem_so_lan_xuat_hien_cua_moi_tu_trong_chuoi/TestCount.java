package ss11_dsa_stack_queue.bai_tap.dem_so_lan_xuat_hien_cua_moi_tu_trong_chuoi;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestCount {
    public static void main(String[] args) {
        String string = "A V A   AA    forever! forever! count A A B C B B B";

        Map<String, Integer> demTu = new TreeMap<>();
        Map<String, Integer> hashMap = new HashMap<>();

        for (String st :
                string.split(" ", 0)) {
            if (!" ".contains(st)){
                if(!hashMap.containsKey(st)){
                    hashMap.put(st, 1);
                } else {
                    hashMap.put(st, hashMap.get(st) + 1);
                }

            }
        }

        for (String st:
             hashMap.keySet()) {
            System.out.println(hashMap.entrySet());
        }
    }
}
