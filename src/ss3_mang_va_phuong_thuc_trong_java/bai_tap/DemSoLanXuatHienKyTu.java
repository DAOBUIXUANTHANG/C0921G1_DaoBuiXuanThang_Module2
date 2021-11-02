package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class DemSoLanXuatHienKyTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = "abaaacde123r45d5547";
        System.out.println("nhập ký tự cần tìm : ");
        char sym = sc.next().charAt(0);
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (sym == str.charAt(i)){
                count++;
            }
        }

        System.out.println("so lan xuat hien cua ky tu la: " + count);
    }
}
