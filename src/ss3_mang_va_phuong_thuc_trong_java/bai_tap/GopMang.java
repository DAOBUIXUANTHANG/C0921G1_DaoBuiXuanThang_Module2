package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

public class GopMang {
    public static void main(String[] args) {
        int arr1[] = new int[]{1,2,3,4,5,6}; // 6 pt
        int arr2[] = new int[]{7,8,9,10,11,12}; //6pt

        int arr3[] = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }

        for (int i = 0; i < arr2.length ; i++) {
            arr3[i + arr2.length] = arr2[i];
        }

        System.out.println("phần tử mảng thứ 1 là: ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + "\t");
        }

        System.out.println("\n phần tử mảng thứ 2 là: ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + "\t");
        }

        System.out.println("\n phần tử mảng thứ 3 là: ");
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + "\t");
        }
    }
}
