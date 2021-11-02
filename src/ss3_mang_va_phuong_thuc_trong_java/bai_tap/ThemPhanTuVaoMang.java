package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mang[] = new int[10];
        mang[0] = 1;
        mang[1] = 2;
        mang[2] = 3;
        mang[3] = 4;
        mang[4] = 5;

        int k, indexK;

        System.out.println("các phần tử trong mảng là :");
        for (int i = 0; i < mang.length; i++) {
            System.out.print(mang[i] + "\t");
        }

        System.out.println("\n nhập số cần chèn");
        k = sc.nextInt();

        do {
            System.out.println("nhập vị trí của số cần chèn: (0-9)");
            indexK = sc.nextInt();
            if (indexK < 0 || indexK > 9){
                System.out.println("không chèn được phàn tử vào mảng");
            } else {
                break;
            }
        } while (!(0 < indexK && indexK < 10));

        if (indexK == 9){
            mang[9] = k;
        } else {

            for (int i = mang.length-1; i > indexK; i--) {
                mang[i] = mang[i-1];
            }
            mang[indexK] = k;
        }

        System.out.println("các phần tử trong mảng sau khi chen là :");
        for (int i = 0; i < mang.length; i++) {
            System.out.print(mang[i] + "\t");
        }

    }
}
