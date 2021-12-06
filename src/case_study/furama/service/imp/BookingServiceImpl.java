package case_study.furama.service.imp;

import case_study.furama.models.Booking;
import case_study.furama.service.CustomerService;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class BookingServiceImpl implements case_study.furama.service.BookingService {
    CustomerServiceImpl customerService = new CustomerServiceImpl();
    static Set<Booking> bookingSet = new TreeSet<>();
    public static final String PATHBOOKING = "";
    Scanner scanner = new Scanner(System.in);

    static {
        bookingSet.add(new Booking("AK1101", "3/05/2015", "30/10/2019", "D001", "SVVL-0000", "massage"));
        bookingSet.add(new Booking("AK209", "3/05/2003", "28/10/2019", "D002", "HOVL-0000", "dac biet"));
        bookingSet.add(new Booking("AK002", "11/05/2019", "30/10/2019", "D003", "ROVL-0000", "câu cá"));

    }


    @Override
    public void addNew() {
        Booking booking = new Booking();
        System.out.println("Nhập mã booking");
        booking.setMaBooking(scanner.nextLine());

        System.out.println("Ngày Bắt Đầu");
        booking.setNgayBatDau(scanner.nextLine());

        System.out.println("Ngày Kết Thúc");
        booking.setNgayKetThuc(scanner.nextLine());

        System.out.println("Chọn mã khách hàng");
        customerService.displayList();
        booking.setMaKhachHang(scanner.nextLine());

        System.out.println("Nhập tên Dịch Vụ");
        booking.setTenDichVu(scanner.nextLine());

        System.out.println("Chọn Loại Dịch VỤ");
        booking.setLoaiDichVu(scanner.nextLine());
        bookingSet.add(booking);


    }

    @Override
    public void displayList() {
        for (Booking booking :
                bookingSet) {
            System.out.println(booking);
        }
    }

    @Override
    public void edit() {

    }

    
}
