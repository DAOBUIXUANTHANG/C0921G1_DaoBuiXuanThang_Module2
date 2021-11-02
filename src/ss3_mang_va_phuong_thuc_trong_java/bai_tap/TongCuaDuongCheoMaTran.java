package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class TongCuaDuongCheoMaTran {
    public static void main(String[] args) {
        int size;
        double matran[][];

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("nhâp kich thuoc của ma trận vuong");
            size = sc.nextInt();
            if (size > 5){
                System.out.println(" size  =< 5");
            }
        } while (!(size < 5 && size > 0));
        matran = new double[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.println("phần tử thứ " + "[" + i + "]" + "[" + j + "]");
                matran[i][j] = sc.nextDouble();
            }
        }

        System.out.println("các phần tử trong mảng là \n");
        for (int i = 0; i < matran.length; i++) {
            System.out.print("mang thu :" + i + "\t");
            for (int j = 0; j < matran[i].length; j++) {
                System.out.print(matran[i][j] + "\t");
            }
            System.out.println("");
        }

        int sum = 0;

        for (int i = 0; i < matran.length; i++) {
            sum += matran[i][i];
        }

        System.out.println(sum);
    }
}
