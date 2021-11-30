package ss19_string_regex.bai_tap.validate_ten_lop_hoc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateClass {
    private static final String valiClasses = "^[ACP]{1}[0-9]{4}[GHIKLM]{1}$";

    public ValidateClass() {
    }

    public boolean checkClass(String input){
        Pattern pattern = Pattern.compile(valiClasses);
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }
}