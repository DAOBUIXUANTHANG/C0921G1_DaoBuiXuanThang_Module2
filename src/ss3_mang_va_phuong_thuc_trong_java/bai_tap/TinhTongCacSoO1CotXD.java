package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class TinhTongCacSoO1CotXD {
    public static void main(String[] args) {
        double arr[][] ={
                {1,2,3,4,5,6,7,8,9,0},      // 10pt
                {2,3,4,5,6,7,8,20,21},
                {23,24,25,25,61,8,2,0,9,10} //9pt
        };

        System.out.println("các phần tử trong mảng là \n");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("mang thu :" + i + "\t");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println("");
        }

        Scanner sc = new Scanner(System.in);

        System.out.println("nhap stt cot muon tinh ");
        int sum = 0, cot = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (cot < arr[i].length){
                sum += arr[i][cot];
            } else {
                sum += 0;
            }
        }

        System.out.println(sum);

    }
}
