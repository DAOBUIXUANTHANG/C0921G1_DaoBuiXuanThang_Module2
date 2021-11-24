package ss19_string_regex.bai_tap.validate_sdt;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePhone {
    private static final String phoneRegex ="^\\(([0-9]){2}\\)\\-\\((0)([0-9]){9}\\)$";

    public ValidatePhone() {
    }

    public boolean vaidateP(String regex){
        Pattern pattern = Pattern.compile(phoneRegex);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
