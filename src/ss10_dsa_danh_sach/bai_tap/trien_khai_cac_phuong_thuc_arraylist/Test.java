package ss10_dsa_danh_sach.bai_tap.trien_khai_cac_phuong_thuc_arraylist;

public class Test {
    public static void main(String[] args) {
        MyList<String> sv1 = new MyList<>();
        sv1.add("anh");
        sv1.add("anh2");
        sv1.add("anh3");
        sv1.add("anh4");
        sv1.add("anh5");
        sv1.add("anh6");
        sv1.add("anh7");

        System.out.println(sv1.size);
        System.out.println(sv1.getELength());
        System.out.println(sv1.toString());

        sv1.remove(3);
        System.out.println(sv1.toString());

    }
}
