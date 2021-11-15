package ss2_vong_lap_trong_java.bai_tap;

import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. print the rectange ");
            System.out.println("2. print the square triangle ");
            System.out.println("3. print the rectange ");
            System.out.println("4. exit  ");

            System.out.println(" enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    printRectangle();
                    break;
                case 2:
                    printSqureTriangle1();
                    printSqureTriangle2();
                    printSqureTriangle3();
                    printSqureTriangle4();
                    break;
                case 3:
                    printTriangle();
                    break;
            }
        } while (choice!=4);


    }

    private static void printSqureTriangle4() {
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 5; j++) {
                if (j >= i){
                    System.out.print("* \t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }

    private static void printSqureTriangle3() {
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 5; j++) {
                if (j < (5-i)){
                    System.out.print("\t");
                } else {
                    System.out.print("* \t");
                }
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }

    private static void printSqureTriangle2() {
        for (int i = 5; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* \t");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }

    private static void printSqureTriangle1() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* \t");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }

    private static void printTriangle() {
        for (int i = 0; i < 5; i++) {
            for (int j = 1; j <= 9; j++) {
                if (j > 5 - 1-i && j < 5+i+1){
                    System.out.print("* \t");
                } else {
                    System.out.print(" \t");
                }
            }
            System.out.print("\n");
        }
    }

    private static void printRectangle() {
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 5; j++) {
                System.out.print("* \t");
            }
            System.out.print("\n");
        }
    }
}
