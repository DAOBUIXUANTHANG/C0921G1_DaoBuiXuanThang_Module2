package case_study.furama.service.imp;

import case_study.furama.models.person.Employee;
import case_study.furama.service.Check;
import case_study.furama.service.io_text.FileReadAndWirte;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements case_study.furama.service.EmployeeService, Check {

    public static final String[] trinhDoHocVan = new String[]{"Trung cấp","Cao đẳng","Đại học","sau đại học"};
    public static final String[] viTriDamNhiem = new String[]{"Lễ tân","phục vụ","chuyên viên","giám sát","quản lý","giám đốc"};
    Scanner scanner = new Scanner(System.in);
    public static final String PATHEMPLOY = "D:\\Codegyms\\Modul2\\C0921G1_DaoBuiXuanThang_Module2\\src\\case_study\\furama\\data\\EmplSource.csv";

    public static List<Employee> employeeList ;


    static {
        employeeList = covertStringToEmpl();
//        employeeList.add(new Employee("Tran Van A" , "22/1/1995" , "nam" , "151223167", "0383605928" , "A@gmail.com", "M21", "Dai hoc", "Lễ tân", 180000));
//        employeeList.add(new Employee("Tran Van B" , "22/1/1995" , "nam" , "151223167", "0383605928" , "B@gmail.com", "M21", "Dai hoc", "phục vụ", 180000));
//        employeeList.add(new Employee("Tran Van C" , "22/1/1995" , "nam" , "151223167", "0383605928" , "C@gmail.com", "M21", "Dai hoc", "quản lý", 180000));
//        employeeList.add(new Employee("Tran Van D" , "22/1/1995" , "nam" , "151223167", "0383605928" , "D@gmail.com", "M21", "Dai hoc", "giám đốc", 180000));
    }


    @Override
    public void addNew() {
        Employee employer = new Employee();
        String trinhDo;
        String viTri;

        System.out.println("nhap ho ten nhan vien");
        employer.setHoTen(scanner.nextLine());

        System.out.println("nhap ngay sinh nhan vien");
        employer.setNgaySinh(scanner.nextLine());

        System.out.println("nhap gioi tinh nhan vien");
        employer.setGioiTinh(scanner.nextLine());

        System.out.println("nhap cmnd nhan vien");
        employer.setCmnd(scanner.nextLine());

        System.out.println("nhap sdt nhan vien");
        employer.setSdt(scanner.nextLine());

        System.out.println("nhap email nhan vien");
        employer.setEmail(scanner.nextLine());

        System.out.println("nhap ma so nhan vien");
        employer.setMaNhanVien(scanner.nextLine());

        System.out.println("nhap trinh do hoc van nhan vien");
        trinhDo = chonTrinhDo();
        employer.setTrinhDo(trinhDo);

        System.out.println("nhap vi tri dam nhiem cua nhan vien");
        viTri = chonViTri();
        employer.setViTri(viTri);

        System.out.println("nhap luong cua nhan vien");
        employer.setLuong(Double.parseDouble(scanner.nextLine()));

        employeeList.add(employer);
        List<String> stringList = covertCusToString();
        FileReadAndWirte.writeFile(PATHEMPLOY,stringList, false);
    }

    @Override
    public void displayList() {
        System.out.printf("|%-3s |%-20s | %-10s |%-10s | %-10s | %-10s | %-20s | %-10s | %-20s | %-10s | %-10s | %n" ,
                "STT", "Họ và tên" , "Ngày sinh" , "Giới tính " , "CMND" , "SDT" , "email", "Mã số nhân viên" ,"trinh độ học vấn ","chức vụ", " Lương");
        for (Employee e : employeeList){
            int index = 1;
            System.out.printf("|%-3s |%-20s | %-10s |%-10s | %-10s | %-10s | %-20s | %-10s | %-20s | %-10s | %-10d | %n",
                   index++, e.getHoTen(), e.getNgaySinh(), e.getGioiTinh(), e.getCmnd(),e.getSdt(), e.getEmail(), e.getMaNhanVien(), e.getMaNhanVien(), e.getTrinhDo(), e.getViTri(), e.getLuong());

        }
    }

    @Override
    public void edit() {
        System.out.println("nhap ma so nhan vien muon edit");
        String input = scanner.nextLine();
        int index = checkE(input);
        String trinhDo;
        String viTri;

        if (index != -1){
            System.out.println("nhap ho ten nhan vien");
            employeeList.get(index).setHoTen(scanner.nextLine());

            System.out.println("nhap ngay sinh nhan vien");
            employeeList.get(index).setNgaySinh(scanner.nextLine());

            System.out.println("nhap gioi tinh nhan vien");
            employeeList.get(index).setGioiTinh(scanner.nextLine());

            System.out.println("nhap cmnd nhan vien");
            employeeList.get(index).setCmnd(scanner.nextLine());

            System.out.println("nhap sdt nhan vien");
            employeeList.get(index).setSdt(scanner.nextLine());

            System.out.println("nhap email nhan vien");
            employeeList.get(index).setEmail(scanner.nextLine());

            System.out.println("nhap ma so nhan vien");
            employeeList.get(index).setMaNhanVien(scanner.nextLine());

            System.out.println("nhap trinh do hoc van nhan vien");
            trinhDo = chonTrinhDo();
            employeeList.get(index).setTrinhDo(trinhDo);

            System.out.println("nhap vi tri dam nhiem cua nhan vien");
            viTri = chonViTri();
            employeeList.get(index).setViTri(viTri);

            System.out.println("nhap luong cua nhan vien");
            employeeList.get(index).setLuong(Integer.parseInt(scanner.nextLine()));
        } else {
            System.out.println(" khong tim thay nhan vien");
        }
    }

    @Override
    public int checkE(String maso) {
        for (int i = 0; i < employeeList.size(); i++) {
            if (maso.equals(employeeList.get(i).getMaNhanVien())){
                return i;
            }
        }
        return -1;
    }

    public String chonTrinhDo(){
        int choice;

        do {
            System.out.println("=======================================");
            System.out.println("xin chon trinh do hoc van cua nhan vien");
            System.out.println("1.Trung cap");
            System.out.println("2.Cao Dang");
            System.out.println("3.Dai Hoc");
            System.out.println("4.Sau Dai hoc");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    return trinhDoHocVan[0];
                case 2:
                    return trinhDoHocVan[1];
                case 3:
                    return trinhDoHocVan[2];
                case 4:
                    return trinhDoHocVan[3];
                default:
                    System.out.println("xin nhap lua chon nhu trong bang");
            }
        }while (true);
    }

    public String chonViTri(){
        int choice;

        do {
            System.out.println("=======================================");
            System.out.println("xin chon vi tri cua nhan vien");
            System.out.println("1.Lễ tân");
            System.out.println("2.phục vụ");
            System.out.println("3.chuyên viên");
            System.out.println("4.giám sát");
            System.out.println("5.quản lý");
            System.out.println("6.giám đốc");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice){
                case 1:
                    return viTriDamNhiem[0];
                case 2:
                    return viTriDamNhiem[1];
                case 3:
                    return viTriDamNhiem[2];
                case 4:
                    return viTriDamNhiem[3];
                case 5:
                    return viTriDamNhiem[4];
                case 6:
                    return viTriDamNhiem[5];
                default:
                    System.out.println("xin nhap lua chon nhu trong bang");
            }
        } while (true);
    }

    public static List<Employee> covertStringToEmpl() {
        List<String> stringList = FileReadAndWirte.readFile(PATHEMPLOY);
        List<Employee> employeeList = new ArrayList<>();

        String[] arrCus;
        for (String line :
                stringList) {
            arrCus = line.split(",");
            employeeList.add(new Employee(arrCus[0], arrCus[1], arrCus[2], arrCus[3], arrCus[4], arrCus[5], arrCus[6], arrCus[7], arrCus[8], Double.parseDouble(arrCus[9])));
        }
        return employeeList;
    }

    public List<String> covertCusToString(){
        List<String> stringList = new ArrayList<>();
        for (Employee employee:
                employeeList) {
            stringList.add(employee.toString());
        }
        return stringList;
    }
}
