package ss14_sorting_algorithms.bai_tap.cai_dat_thuat_toan_sap_xep_chen;

import java.util.List;

public class InsertionSort {
    public static int[] list = new int[]{1,2,5,3,5,12,55,42,21};


    public static void sort(int[] list){

        for (int i = 1; i < list.length ; i++) {
            int pos = i -1 ;
            int temp = list[i];
            for (; pos >= 0 && list[pos] > temp ; pos-- ){
                list[pos + 1] = list[pos];
            }
            list[pos + 1] = temp;
        }

        for (int i :
                list) {
            System.out.print(i + "\t");
        }
    }
}
