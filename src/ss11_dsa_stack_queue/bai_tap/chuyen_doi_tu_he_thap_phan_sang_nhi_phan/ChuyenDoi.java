package ss11_dsa_stack_queue.bai_tap.chuyen_doi_tu_he_thap_phan_sang_nhi_phan;

import java.util.Scanner;

public class ChuyenDoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("nhập số muốn chuyển đổi");

        long num = sc.nextLong();
        Number input = new Number(num);

        System.out.println("ma nhi phan la " + input.changeToBinary());

    }
}
