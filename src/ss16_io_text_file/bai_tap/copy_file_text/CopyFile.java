package ss16_io_text_file.bai_tap.copy_file_text;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyFile {

    public static List<String> readFile(String path){
        List<String> list = new ArrayList<>();
        File file = new File(path);
        BufferedReader br = null;

        try {
            FileReader fileReader = new FileReader(file);
            br = new BufferedReader(fileReader);
            String line = "";

            while ( (line = br.readLine()) != null){
                list.add(line);
            }
        } catch (IOException e){
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return list;
    }

    public static void writeFile(String path, List<String> stringList){
        File file = new File(path);
        BufferedWriter br = null;

        try {
            FileWriter fileWriter = new FileWriter(file);
            br = new BufferedWriter(fileWriter);
            br.write(String.valueOf(stringList));
        } catch (IOException e){
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        final String source = "D:\\Codegyms\\Modul2\\C0921G1_DaoBuiXuanThang_Module2\\src\\ss16_io_text_file\\bai_tap\\copy_file_text\\DocText.txt";
        final String cop = "D:\\Codegyms\\Modul2\\C0921G1_DaoBuiXuanThang_Module2\\src\\ss16_io_text_file\\bai_tap\\copy_file_text\\copy.txt";

        List<String> list =  CopyFile.readFile(source);
        CopyFile.writeFile(cop,list);
    }
}
