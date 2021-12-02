package case_study.furama.service.imp;

import case_study.furama.models.goi_dich_vu.Facility;
import case_study.furama.models.goi_dich_vu.House;
import case_study.furama.models.goi_dich_vu.Room;
import case_study.furama.models.goi_dich_vu.Vila;
import case_study.furama.service.FacilityService;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceImpl implements FacilityService {
    public static Map<Facility, Integer> facilityList = new LinkedHashMap<>();

    static {
        facilityList.put(new House( "SSHO-1111","House Ma", 100, 18000, 10, "month", "vip ", 2),1);
        facilityList.put(new Room("SSRO-1111","Room Ma", 20, 20000,4,"year","bua sang"), 1);
        facilityList.put(new Vila( "SSVL-1111","Vila Ma" , 200 , 20, 19, "month", "vip", 50, 3),1);

    }

    @Override
    public void displayList() {

    }

    @Override
    public void facilityMainList() {

    }

    @Override
    public void addHouse() {
        Scanner scanner = new Scanner(System.in);
        House house = new House();

        System.out.println("xin ma dich vu cua house");
        String idServer = scanner.nextLine();

        System.out.println("xin nhap ten cua house");
        String tenVila = scanner.nextLine();

        System.out.println("xin dien tich su dung cua house");
        double area = Double.parseDouble(scanner.nextLine());

        System.out.println("xin nhap gia thue cua house");
        double price = Double.parseDouble(scanner.nextLine());

        System.out.println("xin nhap so nguoi toi da co the o trong house");
        int maxPer = Integer.parseInt(scanner.nextLine());

        System.out.println("xin nhap hinh thuc thue cua house(nam/ thang/ ngay/ gio )");
        String date = scanner.nextLine();

        System.out.println("xin nhap tieu chuan cua house");
        String tieuChuan = scanner.nextLine();

        System.out.println("xin nhap dien so tầng cua house");
        int soTang = Integer.parseInt(scanner.nextLine());



        // chua cai dat compra & hashcode cho class house
    }

    @Override
    public void addRoom() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("xin ma dich vu cua room");
        String idService = scanner.nextLine();

        System.out.println("xin nhap ten cua Room");
        String tenVila = scanner.nextLine();

        System.out.println("xin dien tich su dung cua Room");
        double area = Double.parseDouble(scanner.nextLine());

        System.out.println("xin nhap gia thue cua Room");
        double price = Double.parseDouble(scanner.nextLine());

        System.out.println("xin nhap so nguoi toi da co the o trong Room");
        int maxPer = Integer.parseInt(scanner.nextLine());

        System.out.println("xin nhap hinh thuc thue cua Room(nam/ thang/ ngay/ gio )");
        String date = scanner.nextLine();

        System.out.println("xin nhap dien dich vu mien phi ");
        String dichVuMP = scanner.nextLine();

        Room room = new Room(idService,tenVila,area,price,maxPer,date,dichVuMP);
        // chua cai dat compra & hashcode cho class house
    }

    @Override
    public void addVila() {
        Scanner scanner = new Scanner(System.in);
        Vila vila = new Vila();

        System.out.println("xin ma dich vu cua room");
        String idServer = scanner.nextLine();

        System.out.println("xin nhap ten cua vila");
        String tenVila = scanner.nextLine();

        System.out.println("xin dien tich su dung cua vila");
        double area = Double.parseDouble(scanner.nextLine());

        System.out.println("xin nhap gia thue cua vila");
        double price = Double.parseDouble(scanner.nextLine());

        System.out.println("xin nhap so nguoi toi da co the o trong vila");
        int maxPer = Integer.parseInt(scanner.nextLine());

        System.out.println("xin nhap hinh thuc thue cua vila (nam/ thang/ ngay/ gio )");
        String date = scanner.nextLine();

        System.out.println("xin nhap tieu chuan cua vila");
        String tieuChuan = scanner.nextLine();

        System.out.println("xin nhap dien tích hồ bơi cua vila");
        double hoBoi = Double.parseDouble(scanner.nextLine());

        System.out.println("xin nhap dien so tầng cua vila");
        int soTang = Integer.parseInt(scanner.nextLine());

        // chua cai dat compra & hashcode cho class Vila
    }
}
