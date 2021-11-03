package ss4_lop_va_doi_tuong_trong_java.bai_tap.phuong_trinh_bac_2;

import java.util.Scanner;

public class MainPhuongTrinhBac2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c;

        System.out.println("phuong trinh bac 2: a ^ 2 * X + b * X + c = 0");
        System.out.println("xin moi nhap a: ");
        a = sc.nextDouble();

        System.out.println("xin moi nhap b: ");
        b = sc.nextDouble();

        System.out.println("xin moi nhap c: ");
        c = sc.nextDouble();

        QuadraticEquation phuongTrinh1 = new QuadraticEquation(a,b,c);
        phuongTrinh1.nghiemPhuongTrinhBac2();
    }
}
