package ss17_io_binary_file_serialization.bai_tap.quan_ly_san_pham;

import java.util.Scanner;

public class Main {
    static ProductList productList = new ProductList();
    static void displayMain(){
        System.out.println("1. add");
        System.out.println("2. display");
        System.out.println("3. search");
        System.out.println("0. exit");

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice){
            case 1:
                productList.addnew();
                productList.display();
                displayMain();
                break;
            case 2:
                productList.display();
                displayMain();
                break;
            case 3:
                productList.search();
                displayMain();
                break;
            case 0:
                System.exit(0);
            default:
                System.out.println("nhap sai");
                displayMain();
                break;
        }
    }


    public static void main(String[] args) {

        displayMain();
    }
}
