package ss15_exception_handling.bai_tap.su_dung_lop_illgaltriangeexception;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IllegalTriangleException {
        Scanner sc = new Scanner(System.in);
        double a;
        double b;
        double c;

        while (true){
            try {
                System.out.println("xin nhap canh thu 1 cua tam giac");
                a = sc.nextDouble();

                System.out.println("xin nhap canh thu 2 cua tam giac");
                b = sc.nextDouble();

                System.out.println("xin nhap canh thu 3 cua tam giac");
                c = sc.nextDouble();

                if (a <= 0 || b <= 0 || c <= 0 || a + b < c || a + c < b || b + c < a){
                    throw new IllegalTriangleException();
                }
                break;
            } catch (IllegalTriangleException exception){
                System.out.println(exception.toString());;
            }
        }


    }
}
