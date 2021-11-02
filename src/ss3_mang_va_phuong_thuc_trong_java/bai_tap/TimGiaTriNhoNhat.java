package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class TimGiaTriNhoNhat {
    public static void main(String[] args) {
        int size = 10;
        int arr[] = new int[size];
        Scanner sc = new Scanner(System.in);


        for (int i = 0; i < size; i++) {
            System.out.println("nhap phan tu thu " + (i+1) + " cua mang");
            arr[i] = sc.nextInt();
        }

        System.out.println("cac phan tu cua mang la");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "\t");
        }

        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]){
                min = arr[i];
            }
        }

        System.out.println("\n phan tu nho nhat trong mang la " + min);
    }
}
