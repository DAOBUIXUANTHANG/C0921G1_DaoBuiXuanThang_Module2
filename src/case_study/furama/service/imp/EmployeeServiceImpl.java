package case_study.furama.service.imp;

import case_study.furama.models.person.Employee;
import case_study.furama.service.Check;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements case_study.furama.service.EmployeeService, Check {
    public static List<Employee> employeeList = new ArrayList<>();

    static {
        employeeList.add(new Employee("Tran Van A" , "22/1/1995" , "nam" , "151223167", "0383605928" , "A@gmail.com", "M21", "Dai hoc", "Lễ tân", 180000));
        employeeList.add(new Employee("Tran Van B" , "22/1/1995" , "nam" , "151223167", "0383605928" , "B@gmail.com", "M21", "Dai hoc", "phục vụ", 180000));
        employeeList.add(new Employee("Tran Van C" , "22/1/1995" , "nam" , "151223167", "0383605928" , "C@gmail.com", "M21", "Dai hoc", "quản lý", 180000));
        employeeList.add(new Employee("Tran Van D" , "22/1/1995" , "nam" , "151223167", "0383605928" , "D@gmail.com", "M21", "Dai hoc", "giám đốc", 180000));
    }


    @Override
    public void addNew() {
        Employee employer = new Employee();
        Scanner scanner = new Scanner(System.in);

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
        employer.setTrinhDo(scanner.nextLine());

        System.out.println("nhap vi tri dam nhiem cua nhan vien");
        employer.setViTri(scanner.nextLine());

        System.out.println("nhap luong cua nhan vien");
        employer.setLuong(Integer.parseInt(scanner.nextLine()));

        employeeList.add(employer);
    }

    @Override
    public void displayList() {
        for (Employee employee : employeeList){
            System.out.println(employee.toString());
        }
    }

    @Override
    public void edit() {
        System.out.println("nhap ma so nhan vien muon edit");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int index = checkE(input);

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
            employeeList.get(index).setTrinhDo(scanner.nextLine());

            System.out.println("nhap vi tri dam nhiem cua nhan vien");
            employeeList.get(index).setViTri(scanner.nextLine());

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
}
