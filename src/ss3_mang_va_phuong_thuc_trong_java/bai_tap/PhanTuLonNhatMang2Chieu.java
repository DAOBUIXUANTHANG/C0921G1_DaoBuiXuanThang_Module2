package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class PhanTuLonNhatMang2Chieu {
    public static void main(String[] args) {
//        double arr[][] ={
//                {1,2,3,4,5,6,7,8,9,0},
//                {2,3,4,5,6,7,8,20,21},
//                {23,24,25,25,61,8,2,0}
//        };

        Scanner sc = new Scanner(System.in);
        double arr[][];
        int doCao, doRong;

        do {
            System.out.println("nhâp độ cao của ma trận");
            doCao = sc.nextInt();
            if (doCao > 5){
                System.out.println("chieu cao < 5");
            }
        } while (!(doCao < 5 && doCao > 0));

        do {
            System.out.println("nhâp độ dai của ma trận");
            doRong = sc.nextInt();
            if (doRong > 5){
                System.out.println("chieu cao < 5");
            }
        } while (!(doRong < 5 && doRong > 0));



        arr = new double[doCao][doRong];

        for (int i = 0; i < doCao; i++) {
            for (int j = 0; j < doRong; j++) {
                System.out.println("phần tử thứ " + "[" + i + "]" + "[" + j + "]");
                arr[i][j] = sc.nextDouble();
            }
        }

        double max = arr[0][0];
        int indexI = 0, indexJ = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max){
                    max = arr[i][j];
                    indexI = i;
                    indexJ = j;
                }
            }
        }

        System.out.println("so lon nhat la " + max);
        System.out.println("tai vi tri: i = " +indexI + " j = " +indexJ );
    }
}
