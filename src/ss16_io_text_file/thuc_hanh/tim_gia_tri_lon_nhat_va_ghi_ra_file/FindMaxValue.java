package ss16_io_text_file.thuc_hanh.tim_gia_tri_lon_nhat_va_ghi_ra_file;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FindMaxValue {
    public static int findMax(List<Integer> numbers) {
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (max < numbers.get(i)) {
                max = numbers.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        String url = "D:\\Codegyms\\Modul2\\C0921G1_DaoBuiXuanThang_Module2\\src\\ss16_io_text_file\\thuc_hanh\\tim_gia_tri_lon_nhat_va_ghi_ra_file\\numb.txt";
        String urlResult = "D:\\Codegyms\\Modul2\\C0921G1_DaoBuiXuanThang_Module2\\src\\ss16_io_text_file\\thuc_hanh\\tim_gia_tri_lon_nhat_va_ghi_ra_file\\reslut.txt";

        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();

        List<Integer> numbers = readAndWriteFile.readFile(url);
        for (int e :
                numbers) {
            System.out.print(e + "-");
        }

        int maxValue = findMax(numbers);
        System.out.println(maxValue);
        readAndWriteFile.writeFile(urlResult, maxValue);
    }
}
