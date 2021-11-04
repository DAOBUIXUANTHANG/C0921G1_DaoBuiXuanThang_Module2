package ss5_access_modifier_static_method_static_propety.bai_tap.xay_dung_lop_chi_ghi_trong_java;

public class TestLop {
    public static void main(String[] args) {
        Student st1 = new Student();
        st1.setName("hoang");
        st1.setClasses("lop2");
        System.out.println(st1.getName());
        System.out.println(st1.getClasses());

        st1.setName1("Tu");
    }
}
