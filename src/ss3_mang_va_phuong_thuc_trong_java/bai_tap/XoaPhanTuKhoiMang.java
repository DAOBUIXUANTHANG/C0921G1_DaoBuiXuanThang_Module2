package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        int arr[] = new int[] {1,2,3,4,5,6,7,8,9};

        Scanner sc = new Scanner(System.in);
        int k,indexK;

        System.out.println("Nhap k");
        k = sc.nextInt();


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k && i != (arr.length -1)){
                indexK = i;
                for (int j = indexK; j < arr.length-1 ; j++) {
                    arr[j] = arr[j+1];
                }
                arr[arr.length - 1] = 0;
            } else if (arr[i] == k && i == arr.length - 1){
                arr[i] =0;
            } else {
                System.out.println("không có k trong mảng");
            }
        }

        System.out.println("Mảng còn lại sau khi xóa phần tử " + k + " là: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }

    }
}
