package case_study.furama.control;

import case_study.furama.service.imp.CustomerServiceImpl;
import case_study.furama.service.imp.EmployeeServiceImpl;

import java.util.Scanner;

public class FuramaController {
    public Scanner sc = new Scanner(System.in);
    public int choice;
    EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
    CustomerServiceImpl customerService = new CustomerServiceImpl();

    public void displayMenu(){
        while (choice != 6){
            mainMenu();
            choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    employeeManagement();
                    break;
                case 2:
                    customerManagement();
                    break;
                case 3:
                    facilityManagement();
                    break;
                case 4:
                    bookingManagement();
                    break;
                case 5:
                    promotionManagement();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println(" xin nhap dung so thu tu cua lua chon ");
            }
        }
    }

    public void mainMenu(){
        System.out.println("============================");
        System.out.println("1. Employee Management");
        System.out.println("2. Customer Management");
        System.out.println("3. Facility Management");
        System.out.println("4. Booking Management");
        System.out.println("5. Promotion Management");
        System.out.println("6. Exit");
    }

    public void employeeManagement(){
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        System.out.println("1. Display list Employee");
        System.out.println("2. Add new Employee");
        System.out.println("3. Edit Employee");
        System.out.println("4. Return main menu");

        switch (choice){
            case 1:
                employeeService.displayList();
                break;
            case 2:
                employeeService.addNew();
                break;
            case 3:
                employeeService.edit();
                break;
            case 4:
                mainMenu();
                break;
            default:
                System.out.println("nhap sai lua chon");
        }
    }

    public void customerManagement(){
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        System.out.println("1. Display list Customer");
        System.out.println("2. Add new Customer");
        System.out.println("3. Edit Customer");
        System.out.println("4. Return main menu");

        switch (choice){
            case 1:
                customerService.displayList();
                break;
            case 2:
                customerService.addNew();
                break;
            case 3:
                customerService.edit();
                break;
            case 4:
                mainMenu();
                break;
            default:
                System.out.println("nhap sai lua chon");
        }
    }

    public void facilityManagement(){
        System.out.println("1. Display list Facility");
        System.out.println("2. Add new Facility");
        System.out.println("3. Display list facility maintenance");
        System.out.println("4. Return main menu");
    }

    public void bookingManagement(){
        System.out.println("1. Add new booking ");
        System.out.println("2. Display list booking ");
        System.out.println("3. Create new contracts");
        System.out.println("4. Display list contracts");
        System.out.println("4. Edit contracts");
        System.out.println("6. Return main menu");
    }

    public void promotionManagement(){
        System.out.println("1. Display list customers use service");
        System.out.println("2. Display list customers get vocher ");
        System.out.println("3. Return main menu");
    }
}
