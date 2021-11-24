package ss19_string_regex.bai_tap.validate_ten_lop_hoc;

public class Test {
    private static String[] test = new String[]{"C0318G","M0318G","P0323A","P0323M"};

    public static void main(String[] args) {
        ValidateClasss validateClasss = new ValidateClasss();

        for (String string:
             test) {
            if (validateClasss.checkClass(string)){
                System.out.println("true " + string);
            } else {
                System.out.println("false " + string);
            }
        }
    }
}
