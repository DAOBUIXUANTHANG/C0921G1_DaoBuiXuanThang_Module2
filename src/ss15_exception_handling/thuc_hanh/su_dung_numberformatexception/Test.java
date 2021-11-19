package ss15_exception_handling.thuc_hanh.su_dung_numberformatexception;

import ss15_exception_handling.bai_tap.su_dung_lop_illgaltriangeexception.IllegalTriangleException;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a;
        double b;
        double c;



        try {
            System.out.println("nhap canh thu nhat cua tam giac ");
            a = sc.nextDouble();
            System.out.println("nhap canh thu hai cua tam giac ");
            b = sc.nextDouble();
            System.out.println("nhap canh thu ba cua tam giac ");
            c = sc.nextDouble();

            if (a <= 0 || b <= 0 || c <= 0 || (a + b) < c|| (a + c) < b || (b + c) < a){
                throw new IllegalTriangleException();
            }
        } catch (IllegalTriangleException triangleException){

            System.out.println(triangleException.toString());
        }

    }
}
