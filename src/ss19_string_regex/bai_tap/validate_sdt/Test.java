package ss19_string_regex.bai_tap.validate_sdt;

public class Test {
    public static final String[] testp = new String[] { "(84)-(0978483535)", "(84)-(0978daa648)", "(84)-(0973339648)","aaa"};


    public static void main(String[] args) {
        ValidatePhone validatePhone = new ValidatePhone();
        for (String str :
                testp) {
            if (validatePhone.vaidateP(str)){
                System.out.println(str + "true");
            } else {
                System.out.println(str + "false");
            }
        }

    }
}
