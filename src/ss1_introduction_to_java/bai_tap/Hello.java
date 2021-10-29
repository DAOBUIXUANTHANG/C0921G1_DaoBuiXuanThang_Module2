package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name ;

        System.out.println("Nhập tên của bạn: ");
        name = scanner.nextLine();

        System.out.println("Hello " + name);
    }
}
