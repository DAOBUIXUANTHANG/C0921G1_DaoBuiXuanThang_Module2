package ss2_vong_lap_trong_java.bai_tap;

import java.util.Scanner;

public class SoNguyenToNhoHon100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("các số nguyên tố nhỏ hơn 100 là");

        for (int n = 2; n < 100; n++) {
            if (n == 2){
                System.out.print(n+ "\t");
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
                }
            }
        }
    }
}
