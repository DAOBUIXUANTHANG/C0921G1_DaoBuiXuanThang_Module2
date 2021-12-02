package case_study.furama.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FacilityRegex {
    private static Pattern pattern;
    private static Matcher matcher;

    private static final String VILA_REGEX = "^(SVVL)-[\\d]{4}$";
    private static final String HOUSE_REGEX = "^(SVHO)-[\\d]{4}$";
    private static final String ROOM_REGEX = "^(SVRO)-[\\d]{4}$";
    private static final String NAMEFAC_REGEX = "^[A-Z][a-z]*([\\s][A-Z]([a-z])*)*$";

    // kiem tra mã của vila,house room
    public static boolean vilaRegex(String regex){
        pattern = Pattern.compile(VILA_REGEX);
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public static boolean houseRegex(String regex){
        pattern = Pattern.compile(HOUSE_REGEX);
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public static boolean roomRegex(String regex){
        pattern = Pattern.compile(ROOM_REGEX);
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    // kiểm tra tên của dịch vụ
    public static boolean nameFacilityRegex(String regex){
        pattern = Pattern.compile(NAMEFAC_REGEX);
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    // kiểm tra diện tích hô bơi, phòng

    public static boolean areaRegex(double regex){
        if (regex > 30){
            return true;
        }
        return false;
    }

    // kiểm tra số lượng người thuê

    public static boolean numPerRegex(int regex){
        if (regex < 0 || regex > 20){
            return false;
        }
        return true;
    }

    public static boolean numFloor(int regex){
        if (regex < 0){
            return false;
        }
        return true;
    }




}
