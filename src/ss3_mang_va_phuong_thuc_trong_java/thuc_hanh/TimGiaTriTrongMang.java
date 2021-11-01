package ss3_mang_va_phuong_thuc_trong_java.thuc_hanh;

import java.util.Scanner;

public class TimGiaTriTrongMang {
    public static void main(String[] args) {
        String students[] = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a name's student: ");
        String inputName = scanner.nextLine();

        boolean check = false;
        for (int i = 0; i < students.length; i++) {
           if (students[i].equals(inputName)){
               System.out.println("vị trí của học sinh trong list: "+inputName+" la "+ (i+1));
               check = true;
               break;
           }
        }

        if (check == false ){
            System.out.println("không tìm thấy "+inputName+" trong danh sách");
        }
    }
}
