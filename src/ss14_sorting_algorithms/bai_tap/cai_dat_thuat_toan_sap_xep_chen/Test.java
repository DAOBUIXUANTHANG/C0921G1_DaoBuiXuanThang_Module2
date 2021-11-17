package ss14_sorting_algorithms.bai_tap.cai_dat_thuat_toan_sap_xep_chen;

public class Test {
    public static void main(String[] args) {
        
        int[] list = new int[]{1,2,5,3,5,12,55,42,21};
        InsertionSort.sort(list);

        for (int i :
                list) {
            System.out.print(i + "\t");
        }
    }
}
