package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class DocSo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int so ;

        System.out.println("nhập số cần đọc: ");
        so = scanner.nextInt();

        if (so >= 0 && so < 10){
            switch (so){
                case 0: System.out.println("zero");
                break;
                case 1: System.out.println("one");
                    break;
                case 2: System.out.println("two");
                    break;
                case 3: System.out.println("three");
                    break;
                case 4: System.out.println("four");
                    break;
                case 5: System.out.println("five");
                    break;
                case 6: System.out.println("six");
                    break;
                case 7: System.out.println("seven");
                    break;
                case 8: System.out.println("eight");
                    break;
                case 9: System.out.println("nine");
                    break;
            }

        } else if (so<20){
            switch (so){
                case 10: System.out.println("ten");
                    break;
                case 11: System.out.println("eleven");
                    break;
                case 12: System.out.println("twelve");
                    break;
                case 13: System.out.println("thirteen");
                    break;
                case 14: System.out.println("fourteen");
                    break;
                case 15: System.out.println("fifteen");
                    break;
                case 16: System.out.println("sixteen");
                    break;
                case 17: System.out.println("seventeen");
                    break;
                case 18: System.out.println("eighteen");
                    break;
                case 19: System.out.println("nineteen");
                    break;
        }

    }
}
