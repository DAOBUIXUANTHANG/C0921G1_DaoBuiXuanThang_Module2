package ss13_thuat_toan_tim_kiem.bai_tap.tim_chuoi_tang_dan_co_do_dai_lon_nhat;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TimChuoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("nhap chuoi");
        String input = sc.nextLine();

        List<Character> output = new LinkedList<>();

        for (int i = 0; i < input.length(); i++) {
            LinkedList<Character> list = new LinkedList<>();
            list.add(input.charAt(i));
            for (int j = i+1 ; j < input.length() ; j++) {
                if (input.charAt(j) > list.getLast())  {
                    list.add(input.charAt(j));
                }
            }

            if (list.size() > output.size()){
                output.clear();
                output.addAll(list);
            }

            list.clear();
        }

        String out = "";
        for (char a:
             output) {
            out += a;
        }

        System.out.println("chuoi lon nhat la");
        System.out.println(out);
    }
}
