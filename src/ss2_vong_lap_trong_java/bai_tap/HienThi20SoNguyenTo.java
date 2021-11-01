package ss2_vong_lap_trong_java.bai_tap;

import java.util.Scanner;

public class HienThi20SoNguyenTo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size;

        do {
            System.out.println("nhap so luong so nguyen to can in ra (size =<20)");
            size = sc.nextInt();
            if (size > 20) {
                System.out.println(" nhap sai");
            } else if (size < 0) {
                System.out.println(" nhap sai ");
            } else {
                break;
            }
        } while (size > 20);

        int dem = 0, n = 2;

        System.out.println(size + " So nguyen to la ");

        while (dem != size){

            if (n == 2){
                System.out.print(n+ "\t");
                dem++;
                n++;
            } else {
                boolean check = true;
                for (int i = 2; i < n; i++) {
                    if (n % i == 0){
                        check = false;
                        break;
                    }
                }
                if (check){
                    System.out.print(n+ "\t");
                    n++;
                    dem++;
                } else {
                    n++;
                }
            }
        }
    }
}
