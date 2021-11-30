package case_study.furama.service.imp;

import case_study.furama.models.person.Customer;
import case_study.furama.models.person.Employee;
import case_study.furama.service.Check;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements case_study.furama.service.CustomerService , Check {
    public static List<Customer> customerList = new ArrayList<>();

    static {
        customerList.add( new Customer("Nguyen Thi Hu " , "22/1/1995" , "nu" , "151231167", "0383605928" , "A@gmail.com", "K21" , "Diamond" , "USA"));
        customerList.add( new Customer("Nguyen Thi Ba " , "22/1/1995" , "nam" , "151231167", "0383605928" , "A@gmail.com", "K21" , "Diamond" , "VN"));
        customerList.add( new Customer("Nguyen Thi Toan " , "22/1/1995" , "nam" , "151231167", "0383605928" , "A@gmail.com", "K21" , "Diamond" , "USA"));
        customerList.add( new Customer("Nguyen Thi Hong " , "22/1/1995" , "nu" , "151231167", "0383605928" , "A@gmail.com", "K21" , "Diamond" , "USA"));
    }

    @Override
    public void addNew() {
        Customer customer = new Customer();
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhap ho ten khach hang");
        customer.setHoTen(scanner.nextLine());

        System.out.println("nhap ngay sinh khach hang");
        customer.setNgaySinh(scanner.nextLine());

        System.out.println("nhap gioi tinh khach hang");
        customer.setGioiTinh(scanner.nextLine());

        System.out.println("nhap cmnd khach hang");
        customer.setCmnd(scanner.nextLine());

        System.out.println("nhap sdt khach hang");
        customer.setSdt(scanner.nextLine());

        System.out.println("nhap email khach hang");
        customer.setEmail(scanner.nextLine());

        System.out.println("nhap ma so khach hang");
        customer.setMaKhachHang(scanner.nextLine());

        System.out.println("nhập dang cap khach hang");
        customer.setLoaiKhach(scanner.nextLine());

        System.out.println("nhap dia chi cua khach hang");
        customer.setDiaChi(scanner.nextLine());

        customerList.add(customer);
    }

    @Override
    public void displayList() {
        for (Customer customer : customerList){
            System.out.println(customer.toString());
        }
    }

    @Override
    public void edit() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int index = checkE(input);
        if (index != -1 ){
            System.out.println("nhap ho ten khach hang");
            customerList.get(index).setHoTen(scanner.nextLine());

            System.out.println("nhap ngay sinh khach hang");
            customerList.get(index).setNgaySinh(scanner.nextLine());

            System.out.println("nhap gioi tinh khach hang");
            customerList.get(index).setGioiTinh(scanner.nextLine());

            System.out.println("nhap cmnd khach hang");
            customerList.get(index).setCmnd(scanner.nextLine());

            System.out.println("nhap sdt khach hang");
            customerList.get(index).setSdt(scanner.nextLine());

            System.out.println("nhap email khach hang");
            customerList.get(index).setEmail(scanner.nextLine());

            System.out.println("nhap ma so khach hang");
            customerList.get(index).setMaKhachHang(scanner.nextLine());

            System.out.println("nhập dang cap khach hang");
            customerList.get(index).setLoaiKhach(scanner.nextLine());

            System.out.println("nhap dia chi cua khach hang");
            customerList.get(index).setDiaChi(scanner.nextLine());
        } else {
            System.out.println("khong tim thay ma khach hang");
        }
    }

    @Override
    public int checkE(String maso) {
        for (int i = 0; i < customerList.size(); i++) {
            if (maso.equals(customerList.get(i).getMaKhachHang())){
                return i;
            }
        }
        return -1;
    }
}
