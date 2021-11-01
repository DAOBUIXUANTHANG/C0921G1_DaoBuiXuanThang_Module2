package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;


public class DocSo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("xin nhap so");
        int numberInput = scanner.nextInt();

        if (numberInput<0){
            System.out.println("xin nhap so duong");
        } else if (numberInput < 100){
            int number1 = numberInput/10;
            int number2 = numberInput%10;
            if (number1==0&&number2==0){
                System.out.print("khong");
            }
            switch (number1) {
                case 1:
                    System.out.print("muoi ");
                    break;
                case 2:
                    System.out.print("hai muoi ");
                    break;
                case 3:
                    System.out.print("ba muoi ");
                    break;
                case 4:
                    System.out.print("bon muoi ");
                    break;
                case 5:
                    System.out.print("nam muoi ");
                    break;
                case 6:
                    System.out.print("sau muoi ");
                    break;
                case 7:
                    System.out.print("bay muoi ");
                    break;
                case 8:
                    System.out.print("tam muoi ");
                    break;
                case 9:
                    System.out.print("chin muoi ");
                    break;
            }
            switch (number2) {
                case 1:
                    System.out.print("mot");
                    break;
                case 2:
                    System.out.print("hai");
                    break;
                case 3:
                    System.out.print("ba");
                    break;
                case 4:
                    System.out.print("bon");
                    break;
                case 5:
                    if (number1==0){
                        System.out.print("nam");
                    }
                    else{
                        System.out.print("lam");
                    }
                    break;
                case 6:
                    System.out.print("sau");
                    break;
                case 7:
                    System.out.print("bay");
                    break;
                case 8:
                    System.out.print("tam");
                    break;
                case 9:
                    System.out.print("chin");
                    break;
            }
        } else if (numberInput<1000){
            int number1 = numberInput/100;
            int number2 = (numberInput%100)/10;
            int number3 = numberInput%100%10;
            switch (number1){
                case 1:
                    System.out.print("mot tram ");
                    break;
                case 2:
                    System.out.print("hai tram ");
                    break;
                case 3:
                    System.out.print("ba tram ");
                    break;
                case 4:
                    System.out.print("bon tram ");
                    break;
                case 5:
                    System.out.print("nam tram ");
                    break;
                case 6:
                    System.out.print("sau tram ");
                    break;
                case 7:
                    System.out.print("bay tram ");
                    break;
                case 8:
                    System.out.print("tam tram ");
                    break;
                case 9:
                    System.out.print("chin tram ");
                    break;
            }
            switch (number2){
                case 1:
                    System.out.print("muoi ");
                    break;
                case 2:
                    System.out.print("hai muoi ");
                    break;
                case 3:
                    System.out.print("ba muoi ");
                    break;
                case 4:
                    System.out.print("bon muoi ");
                    break;
                case 5:
                    System.out.print("nam muoi ");
                    break;
                case 6:
                    System.out.print("sau muoi ");
                    break;
                case 7:
                    System.out.print("bay muoi ");
                    break;
                case 8:
                    System.out.print("tam muoi ");
                    break;
                case 9:
                    System.out.print("chin muoi ");
                    break;
            }
            if (number3 !=0){
                switch (number3){
                    case 1:
                        System.out.print("mot");
                        break;
                    case 2:
                        System.out.print("hai");
                        break;
                    case 3:
                        System.out.print("ba");
                        break;
                    case 4:
                        System.out.print("bon");
                        break;
                    case 5:
                        if (number2==0){
                            System.out.print("nam");
                        }
                        else{
                            System.out.print("lam");
                        }
                        break;
                    case 6:
                        System.out.print("sau");
                        break;
                    case 7:
                        System.out.print("bay");
                        break;
                    case 8:
                        System.out.print("tam");
                        break;
                    case 9:
                        System.out.print("chin");
                        break;
                }
            }
        }



        }

    }