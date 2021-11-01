package ss3_mang_va_phuong_thuc_trong_java.thuc_hanh;

import java.util.Scanner;

public class TimGiaTriLonNhatTrongMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int array1[];

        do {
            System.out.println("nhập kich thuoc mang");
            size = scanner.nextInt();
            if (size > 20){
                System.out.println("kich thuoc mang nho hon 20");
            } else if (size < 0){
                System.out.println("kich thuoc mang lon hon 0");
            } else {
                break;
            }
        } while (!(size < 20 && size > 0));

        array1 = new int[size];
        int i = 0;
        while (i < array1.length) {
            System.out.println("nhap phan tu thu "+ ( i + 1 ) + " : ");
            array1[i] = scanner.nextInt();
            i++;
        }

        System.out.println("list: ");
        for (int j = 0; j < array1.length; j++) {
            System.out.print(array1[j] + "\t");
        }

        int max = array1[0];
        int index = 1;
        for (int j = 0; j < array1.length; j++) {
            if (array1[j] > max){
                max = array1[j];
                index = j + 1;
            }
        }

        System.out.println(" max la " + max + " tai vi tri " + index);
    }
}
