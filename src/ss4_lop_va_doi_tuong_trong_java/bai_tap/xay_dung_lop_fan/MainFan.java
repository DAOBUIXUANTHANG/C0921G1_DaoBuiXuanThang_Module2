package ss4_lop_va_doi_tuong_trong_java.bai_tap.xay_dung_lop_fan;

public class MainFan {
    public static void main(String[] args) {
        ClassFan fan1 = new ClassFan(3,true,10,"yellow");
        ClassFan fan2 = new ClassFan(2, false, 5,"blue");

        System.out.println(fan1.toString());
        System.out.println(fan2.toString());

    }
}
