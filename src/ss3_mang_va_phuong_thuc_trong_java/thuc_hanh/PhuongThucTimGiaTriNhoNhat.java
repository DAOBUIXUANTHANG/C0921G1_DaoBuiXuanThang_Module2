package ss3_mang_va_phuong_thuc_trong_java.thuc_hanh;

public class PhuongThucTimGiaTriNhoNhat {
    public static void main(String[] args) {
        int[] arr = {14, 11, 7, 82, 1, 16, 9};
        int index = minValue(arr);
        System.out.println("The smallest element in the array is: " + arr[index]);
    }

    public static int minValue(int[] array) {
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[index]) {
                index = i;
            }
        }
        return index;
    }
}
