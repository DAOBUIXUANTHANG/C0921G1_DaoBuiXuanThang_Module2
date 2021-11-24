package ss17_io_binary_file_serialization.bai_tap.quan_ly_san_pham;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductList implements Serializable {
     static List<Product> productList = new ArrayList<>();
    static {
        productList.add( new Product(122,"milk","vinamilk",18000));
        productList.add( new Product(33,"cacao","vinamilk",18000));
        productList.add( new Product(133,"cocacola","cocacola",18000));
        productList.add( new Product(144,"milk","vinamilk",18000));
    }

    public void display(){
        for (Product product :
                productList) {
            System.out.println(product);
        }
    }

    public void addnew(){
        System.out.println("xin moi nhap thong tin san pham");
        Scanner scanner = new Scanner(System.in);
        Product product = new Product();

        System.out.println("xin moi nhap ma san pham");
        product.setProdCode(Integer.parseInt(scanner.nextLine()));

        System.out.println("xin moi nhap ten san pham");
        product.setName(scanner.nextLine());

        System.out.println("xin moi nhap cong ty san xuat san pham");
        product.setCompany(scanner.nextLine());

        System.out.println("xin moi nhap gia cua san pham");
        product.setPrice(scanner.nextDouble());
        productList.add(product);
        ReadWitre.writeFile(productList);
    }

    public void search(){
        System.out.println("xin nhap ten san pham muon tim kiem");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        boolean check = false;

        for (Product product :
                productList) {
            if (name.equals(product.getName())){
                System.out.println(product);
                check = true;
            }
        }

        if (!check){
            System.out.println("khong tim thay !");
        }
    }

}
