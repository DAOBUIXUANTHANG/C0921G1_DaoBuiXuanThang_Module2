package ss14_sorting_algorithms.bai_tap.minh_hoa_thuat_toan_sap_xep_chen;

public class InsertSort {
    public static void main(String[] args) {
        int[] list = new int[]{1,22,13,14,24,26,17,44,60,44,55,2};

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
