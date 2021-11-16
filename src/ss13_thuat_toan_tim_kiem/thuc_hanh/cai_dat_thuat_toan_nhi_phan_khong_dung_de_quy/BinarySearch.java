package ss13_thuat_toan_tim_kiem.thuc_hanh.cai_dat_thuat_toan_nhi_phan_khong_dung_de_quy;




public class BinarySearch {
    public static int list[] = new int[]{2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
    public static String st1 = "dasadasdas";


    public static int binarySearch(int[] arr, int key){
        int low = 0;
        int head = arr.length - 1;

        while (head >= low){
            int mid = (low + head) / 2;
            if (arr[mid] == key){
                return mid;
            } else if (key > arr[mid]){
                low = mid + 1;
            } else {
                head = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        System.out.println(binarySearch(list, 2));  /* 0 */
        System.out.println(binarySearch(list, 11)); /* 4 */
        System.out.println(binarySearch(list, 79)); /*12 */
        System.out.println(binarySearch(list, 1));  /*-1 */
        System.out.println(binarySearch(list, 5));  /*-1 */
        System.out.println(binarySearch(list, 80)); /*-1 */

    }

}
