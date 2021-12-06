package case_study.furama.service.imp;

import case_study.furama.models.goi_dich_vu.Facility;
import case_study.furama.models.goi_dich_vu.House;
import case_study.furama.models.goi_dich_vu.Room;
import case_study.furama.models.goi_dich_vu.Vila;
import case_study.furama.regex.FacilityRegex;
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

        String idService ;
        do {
            System.out.println("xin ma dich vu cua house");
            idService = scanner.nextLine();
            if (FacilityRegex.houseRegex(idService)){
                house.setIdSevice(idService);
                break;
            } else {
                System.out.println("xin nhap dung ma dich vu : ( SSRO-XXXX, XXXX là mã số dich vụ )");
            };
        } while (true);

        String tenHou;
        do {
            System.out.println("xin nhap ten cua house");
            tenHou = scanner.nextLine();
            if (FacilityRegex.nameFacilityRegex(tenHou)){
                house.setIdSevice(tenHou);
                break;
            } else {
                System.out.println("xin nhap dung ten");
            };
        } while (true);

        // kiểm tra và nhập diện tích nhà
        double area;
        do {
            System.out.println("xin dien tich su dung cua house (đơn vi m2)");
            area = Double.parseDouble(scanner.nextLine());
            if (area > 30){
                house.setArea(area);
                break;
            } else {
                System.out.println("xin nhap dung dien tich su dung (dien tich room > 30 m2)");
            }

        } while (true);

        // kiểm tra và nhập giá thuê
        double price;
        do {
            System.out.println("xin nhap gia thue cua House");
            price = Double.parseDouble(scanner.nextLine());
            if (price > 0){
                house.setPrice(price);
                break;
            } else {
                System.out.println("nhap sai");
            }
        } while (true);

        // kiểm tra và nhập số người
        int maxPer;
        do {
            System.out.println("xin nhap so nguoi toi da co the o trong Room");
            maxPer = Integer.parseInt(scanner.nextLine());
            if (maxPer > 0 && maxPer < 20){
                house.setMaxPerson(maxPer);
                break;
            } else {
                System.out.println("xin nhap dung so luong nguoi ( 0 < so nguoi < 20 )");
            }
        } while (true);

        System.out.println("xin nhap hinh thuc thue cua house(nam/ thang/ ngay/ gio )");
        String date = scanner.nextLine();
        house.setStye(date);

        System.out.println("xin nhap tieu chuan cua house");
        String tieuChuan = scanner.nextLine();
        house.setTieuChuanPhong(tieuChuan);

        System.out.println("xin nhap dien so tầng cua house");
        int soTang = Integer.parseInt(scanner.nextLine());
        house.setNumFloor(soTang);
        // chua cai dat compra & hashcode cho class house
    }

    @Override
    public void addRoom() {
        Scanner scanner = new Scanner(System.in);
        Room room = new Room();

        // kiểm tra và nhập mã dịch vụ
        String idService;
        do {
            System.out.println("xin ma dich vu cua room");
            idService = scanner.nextLine();
            if (FacilityRegex.roomRegex(idService)){
                room.setIdSevice(idService);
                break;
            } else {
                System.out.println("xin nhap dung ma dich vu : ( SSRO-XXXX, XXXX là mã số dich vụ )");
            };
        } while (true);

        // kiểm tra và nhập tên phòng
        String tenRoom;
        do {
            System.out.println("xin nhap ten cua Room");
            tenRoom = scanner.nextLine();
            if (FacilityRegex.nameFacilityRegex(tenRoom)){
                room.setIdSevice(tenRoom);
                break;
            } else {
                System.out.println("xin nhap dung ten");
            };
        } while (true);

        // kiểm tra và nhập diện tích phòng
        double area;
        do {
            System.out.println("xin dien tich su dung cua Room (đơn vi m2)");
            area = Double.parseDouble(scanner.nextLine());
            if (area > 30){
                room.setArea(area);
                break;
            } else {
                System.out.println("xin nhap dung dien tich su dung (dien tich room > 30 m2)");
            }

        } while (true);

        // kiểm tra và nhập giá thuê
        double price;
        do {
            System.out.println("xin nhap gia thue cua Room");
            price = Double.parseDouble(scanner.nextLine());
            if (price > 0){
                room.setPrice(price);
                break;
            }
        } while (true);

        // kiểm tra và nhập số người
        int maxPer;
        do {
            System.out.println("xin nhap so nguoi toi da co the o trong Room");
            maxPer = Integer.parseInt(scanner.nextLine());
            if (maxPer > 0 && maxPer < 20){
                room.setMaxPerson(maxPer);
                break;
            } else {
                System.out.println("xin nhap dung so luong nguoi ( 0 < so nguoi < 20 )");
            }
        } while (true);

        System.out.println("xin nhap hinh thuc thue cua Room(nam/ thang/ ngay/ gio )");
        String date = scanner.nextLine();
        room.setStye(date);

        System.out.println("xin nhap dien dich vu mien phi ");
        String dichVuMP = scanner.nextLine();
        room.setDichVuMienPhi(dichVuMP);
        // chua cai dat compra & hashcode cho class house
    }

    @Override
    public void addVila() {
        Scanner scanner = new Scanner(System.in);
        Vila vila = new Vila();

        // kiểm tra và nhập mã dịch vụ
        String idService;
        do {
            System.out.println("xin ma dich vu cua vila");
            idService = scanner.nextLine();
            if (FacilityRegex.roomRegex(idService)){
                vila.setIdSevice(idService);
                break;
            } else {
                System.out.println("xin nhap dung ma dich vu : ( SSVL-XXXX, XXXX là mã số dich vụ )");
            };
        } while (true);

        // kiểm tra và nhập tên vila
        String tenRoom;
        do {
            System.out.println("xin nhap ten cua Vila");
            tenRoom = scanner.nextLine();
            if (FacilityRegex.nameFacilityRegex(tenRoom)){
                vila.setIdSevice(tenRoom);
                break;
            } else {
                System.out.println("xin nhap dung ten");
            };
        } while (true);

        // kiểm tra và nhập diện tích phòng
        double area;
        do {
            System.out.println("xin dien tich su dung cua Vila (đơn vi m2)");
            area = Double.parseDouble(scanner.nextLine());
            if (area > 30){
                vila.setArea(area);
                break;
            } else {
                System.out.println("xin nhap dung dien tich su dung (dien tich Vila > 30 m2)");
            }

        } while (true);

        // kiểm tra và nhập giá thuê
        double price;
        do {
            System.out.println("xin nhap gia thue cua Vila");
            price = Double.parseDouble(scanner.nextLine());
            if (price > 0){
                vila.setPrice(price);
                break;
            }
        } while (true);

        // kiểm tra và nhập số người
        int maxPer;
        do {
            System.out.println("xin nhap so nguoi toi da co the o trong Vila");
            maxPer = Integer.parseInt(scanner.nextLine());
            if (maxPer > 0 && maxPer < 20){
                vila.setMaxPerson(maxPer);
                break;
            } else {
                System.out.println("xin nhap dung so luong nguoi ( 0 < so nguoi < 20 )");
            }
        } while (true);

        System.out.println("xin nhap hinh thuc thue cua vila (nam/ thang/ ngay/ gio )");
        String date = scanner.nextLine();
        vila.setStye(date);

        System.out.println("xin nhap tieu chuan cua vila");
        String tieuChuan = scanner.nextLine();
        vila.setTieuChuanPhong(tieuChuan);


        // kiểm tra diện tích hồ bơi
        double areaPool;
        do {
            System.out.println("xin nhap dien tích hồ bơi cua vila");
            areaPool = Double.parseDouble(scanner.nextLine());
            if (areaPool > 30){
                vila.setAreaPool(areaPool);
                break;
            } else {
                System.out.println("xin nhap dung dien tich su dung (dien tich Vila > 30 m2)");
            }
        } while (true);

        int soTang;
        do {
            System.out.println("xin nhap dien so tầng cua vila");
            soTang = Integer.parseInt(scanner.nextLine());
            if (soTang > 0) {
                vila.setNumFloor(soTang);
                break;
            } else {
                System.out.println(" xin nhap dung so tang");
            }
        } while (true);

        // chua cai dat compra & hashcode cho class Vila
    }
}
