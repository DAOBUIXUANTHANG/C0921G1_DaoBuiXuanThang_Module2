package ss12_java_collection_framework.bai_tap.luyen_tap_su_dung_arraylist_va_linkedlist.arraylist;

import java.util.*;

public class ProductManganer {
    public  List<Product> productsList = new ArrayList<>();


    public void display() {
        System.out.println("1. them moi san pham ");
        System.out.println("2. xoa san pham ");
        System.out.println("3. hien thi danh sach san pham ");
        System.out.println("4. tim kiem san pham ");
        System.out.println("5. sap xep san pham ");
        System.out.println("0. ket thuc ");
    }

    public void add1(int id , String name){

        productsList.add(new Product(name , id));
    }

    public void add(){
        Scanner sc = new Scanner(System.in);
        String name;
        int id;

        System.out.println("Nhap ten san pham");
        name = sc.nextLine();
        System.out.println("nhap id san pham");
        id = sc.nextInt();

        Product pr = new Product(name,id);
        productsList.add(pr);
    }

    public void delete(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vi tri muon xoa");
        int index = sc.nextInt();
        for (int i = 0; i < productsList.size(); i++) {
            if (i == index){
                productsList.remove(i);
            }
        }
    }

    public void displayProduct(){
        for (int i = 0; i < productsList.size(); i++) {
            System.out.println((i+1)+ " " + productsList.get(i).toString());
        }
    }

    public void searchName(){

        String name;
        System.out.println("nhap id muon tim ");
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();

        boolean check = false;
        for (int i = 0; i < productsList.size(); i++) {
            if (productsList.get(i).getName().equals(name)){
                System.out.println(productsList.get(i).toString());
                check = true;
            }
        }

        if (!check){
            System.out.println("khong tim thay ten san pham ");
        }
    }

    public static void main(String[] args) {
        ProductManganer pr = new ProductManganer();
        pr.add1(1, "A");
        pr.add1(2, "B");
        pr.add1(3, "C");
        pr.add1(4, "D");
        pr.add1(5, "E");


        pr.display();

        Scanner input = new Scanner(System.in);
        int choice = -1;

        while (choice != 0){
            System.out.println("chon : ");
            choice = input.nextInt();
            switch (choice){
                case 1:
                    pr.add();
                    break;
                case 2:
                    pr.delete();
                    break;
                case 3:
                    pr.displayProduct();
                    break;
                case 4:
                    pr.searchName();
                    break;
                case 5:
                    ComparatorId comparatorId = new ComparatorId();
                    Collections.sort( pr.productsList , comparatorId);
                    pr.displayProduct();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("chua chon ");
            }
        }
    }

}
