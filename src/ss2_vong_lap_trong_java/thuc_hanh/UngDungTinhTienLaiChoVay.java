package ss2_vong_lap_trong_java.thuc_hanh;

import java.util.Scanner;

public class UngDungTinhTienLaiChoVay {
    public static void main(String[] args) {
        double money = 1.0,interestRate = 1.0;
        int month = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("nhập số tiền gửi: ");
        money = scanner.nextDouble();

        System.out.println("nhập số tháng gửi: ");
        month = scanner.nextInt();

        System.out.println("Nhập lãi suất: ");
        interestRate = scanner.nextDouble();

        double total = 0;
        for (int i = 0; i < month; i++){
            total += money * (interestRate/100)/12 * month;
        }

        System.out.println("tổng số tiền thu được là : "+ total);
    }
}
