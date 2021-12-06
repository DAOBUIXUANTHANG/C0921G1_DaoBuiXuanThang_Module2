package case_study.furama.service.imp;

import case_study.furama.models.person.Customer;
import case_study.furama.service.Check;
import case_study.furama.service.PhanLoaiCus;
import case_study.furama.service.io_text.FileReadAndWirte;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements case_study.furama.service.CustomerService , Check, PhanLoaiCus {
    public static List<Customer> customerList ;
    private static final String[] LOAICUSTOMS = new String[]{"Diamond", "Platinium", "Gold" , "Silver", "Member"};
    static final String PATH = "D:\\Codegyms\\Modul2\\C0921G1_DaoBuiXuanThang_Module2\\src\\case_study\\furama\\data\\CustomerSource.csv";

    static {
        customerList = covertStringToCustom();
//        customerList.add( new Customer("Nguyen Thi Hu " , "22/1/1995" , "nu" , "151231167", "0383605928" , "A@gmail.com", "K21" , "Diamond" , "USA"));
//        customerList.add( new Customer("Nguyen Thi Ba " , "22/1/1995" , "nam" , "151231167", "0383605928" , "A@gmail.com", "K21" , "Diamond" , "VN"));
//        customerList.add( new Customer("Nguyen Thi Toan " , "22/1/1995" , "nam" , "151231167", "0383605928" , "A@gmail.com", "K21" , "Diamond" , "USA"));
//        customerList.add( new Customer("Nguyen Thi Hong " , "22/1/1995" , "nu" , "151231167", "0383605928" , "A@gmail.com", "K21" , "Diamond" , "USA"));
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
        customer.setLoaiKhach(phanLoai());

        System.out.println("nhap dia chi cua khach hang");
        customer.setDiaChi(scanner.nextLine());

        customerList.add(customer);
        List<String> stringList = covertCusToString();
        FileReadAndWirte.writeFile(PATH, stringList, false);

    }

    @Override
    public void displayList() {
        int index = 1;
        System.out.printf("|%-3s |%-20s | %-10s |%-10s | %-10s | %-10s | %-20s | %-10s | %-20s | %-10s | %n" ,
                "STT", "Họ và tên" , "Ngày sinh" , "Giới tính " , "CMND" , "SDT" , "email", "Mã số KH" ,"Đẳng cấp", "Địa chỉ");
        for (Customer customer : customerList){
            System.out.printf("|%-3s |%-20s | %-10s |%-10s | %-10s | %-10s | %-20s | %-10s | %-20s | %-10s | %n"  ,
                    index++ , customer.getHoTen(), customer.getNgaySinh(), customer.getGioiTinh(), customer.getCmnd(), customer.getSdt(), customer.getEmail(), customer.getMaKhachHang(), customer.getLoaiKhach(), customer.getDiaChi());
        }
    }

    @Override
    public void edit() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap ma so muon tim kiem");

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
            customerList.get(index).setLoaiKhach(phanLoai());

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

    @Override
    public String phanLoai() {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("xin chon loai khach");
            System.out.println("1. Diamond");
            System.out.println("2. Platinium");
            System.out.println("3. Gold");
            System.out.println("4. Silver");
            System.out.println("5. member");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice){
                case 1:
                    return LOAICUSTOMS[0];
                case 2:
                    return LOAICUSTOMS[1];
                case 3:
                    return LOAICUSTOMS[2];
                case 4:
                    return LOAICUSTOMS[3];
                case 5:
                    return LOAICUSTOMS[4];
                default:
                    System.out.println("xin nhap dung lua chong");
            }

        } while (true);

    }

    public static List<Customer> covertStringToCustom() {
        List<String> stringList = FileReadAndWirte.readFile(PATH);
        List<Customer> customerList = new ArrayList<>();

        String[] arrCus;
        for (String line :
                stringList) {
            arrCus = line.split(",");
            customerList.add(new Customer(arrCus[0], arrCus[1], arrCus[2], arrCus[3], arrCus[4], arrCus[5], arrCus[6], arrCus[7], arrCus[8]));
        }
        return customerList;
    }

    public List<String> covertCusToString(){
        List<String> stringList = new ArrayList<>();
        for (Customer customer:
             customerList) {
            stringList.add(customer.toString());
        }
        return stringList;
    }
}
