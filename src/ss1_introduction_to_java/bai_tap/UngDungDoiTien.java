package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class UngDungDoiTien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double vnd, usd, rate;
        rate = 23000;

        System.out.println("nhập số tiền (usd): ");
        usd = scanner.nextDouble();

        vnd = usd * rate;

        System.out.println("Số tiền (VND) nhận được là: " + vnd + " vnd");

    }
}
