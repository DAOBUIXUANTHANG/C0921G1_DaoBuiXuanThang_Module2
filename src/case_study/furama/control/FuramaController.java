package case_study.furama.control;

import case_study.furama.service.imp.CustomerServiceImpl;
import case_study.furama.service.imp.EmployeeServiceImpl;
import case_study.furama.service.imp.FacilityServiceImpl;

import java.util.Scanner;

public class FuramaController {
    public Scanner sc = new Scanner(System.in);
    public int choice;
    EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
    CustomerServiceImpl customerService = new CustomerServiceImpl();
    FacilityServiceImpl facilityService = new FacilityServiceImpl();

    int choiceSub;

    public void displayMenu(){
        while (choice != 6){
            mainMenu();
            choice = Integer.parseInt(sc.nextLine());
            switch (choice){

                case 1:
                    do {
                        System.out.println("1. Display list Employee");
                        System.out.println("2. Add new Employee");
                        System.out.println("3. Edit Employee");
                        System.out.println("4. Return main menu");
                        choiceSub = Integer.parseInt(sc.nextLine());
                        switch (choiceSub){
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
                                break;
                            default:
                                System.out.println("nhap sai lua chon");
                        }
                    } while (choiceSub != 4);
                    break;

                case 2:
                    do {
                        System.out.println("1. Display list Customer");
                        System.out.println("2. Add new Customer");
                        System.out.println("3. Edit Customer");
                        System.out.println("4. Return main menu");

                        choiceSub = Integer.parseInt(sc.nextLine());

                        switch (choiceSub){
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
                                break;
                            default:
                                System.out.println("nhap sai lua chon");
                        }
                    } while (choiceSub != 4);
                    break;
                case 3:

                    do {
                        System.out.println("1. Display list Facility");
                        System.out.println("2. Add new Facility");
                        System.out.println("3. Display list facility maintenance");
                        System.out.println("4. Return main menu");
                        choiceSub = sc.nextInt();
                        switch (choiceSub){
                            case 1:
                                facilityService.displayList();
                                break;
                            case 2:
                                int choicesub2 = 0;
                                do {
                                    System.out.println("Mời nhập 1 đến 4 để chọn:");
                                    System.out.println("1. addVilla");
                                    System.out.println("2. addRoom");
                                    System.out.println("3. addHouse");
                                    System.out.println("4. Return menu");
                                    choicesub2 = Integer.parseInt(sc.nextLine());
                                    switch (choicesub2){
                                        case 1:
                                            facilityService.addVila();
                                            break;
                                        case 2:
                                            facilityService.addRoom();
                                            break;
                                        case 3:
                                            facilityService.addHouse();
                                            break;
                                        case 4:
                                            break;
                                    }
                                    break;
                                } while (choicesub2 != 4);
                                break;
                            case 3:
                                System.out.println("chuc nang chua duoc them vao");
                                System.out.println("================");
                                break;
                            case 4:
                                break;
                            default:
                                System.out.println("xin nhap dung lenh");
                                System.out.println("================");
                        }

                    } while (choiceSub != 4);
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

    }

    public void customerManagement(){
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
