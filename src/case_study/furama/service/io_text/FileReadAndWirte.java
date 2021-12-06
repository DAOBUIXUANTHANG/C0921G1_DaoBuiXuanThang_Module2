package case_study.furama.service.io_text;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileReadAndWirte {

    public static void writeFile(String path , List<String> stringList, boolean apend){
        File file = new File(path);
        BufferedWriter bufferedWriter = null;

        try {
            FileWriter fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (String line :
                    stringList) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
        } catch (IOException exception){
            exception.printStackTrace();
        } finally {
            try {
                if (bufferedWriter != null){
                    bufferedWriter.flush();
                    bufferedWriter.close();
                }
            } catch (IOException e){
                e.printStackTrace();
            }
        }

    }

    public static List<String> readFile(String path){
        List<String> stringList = new ArrayList<>();
        File file = new File(path);
        BufferedReader br = null;

        try {
            FileReader fileReader = new FileReader(file);
            br = new BufferedReader(fileReader);
            String line = "";
            while ((line = br.readLine()) != null){
                stringList.add(line);
            }
        } catch (FileNotFoundException fileNotFoundException){
            fileNotFoundException.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        } finally {
            try {
                if (br != null){
                    br.close();
                }
            } catch (IOException e){
                e.printStackTrace();
            }
        }

        return stringList;
    }
}
