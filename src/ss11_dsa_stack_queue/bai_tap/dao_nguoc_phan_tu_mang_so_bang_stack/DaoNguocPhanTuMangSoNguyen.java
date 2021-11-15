package ss11_dsa_stack_queue.bai_tap.dao_nguoc_phan_tu_mang_so_bang_stack;

import java.util.Scanner;
import java.util.Stack;

public class DaoNguocPhanTuMangSoNguyen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String mWord = sc.nextLine();
        DaoNguocMang h1 = new DaoNguocMang(mWord);

        System.out.println(" mang ban dau la " + mWord);
        System.out.println(" mang dao nguoc la " + h1.daoNguoc());


    }
}
