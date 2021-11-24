package ss17_io_binary_file_serialization.demo.manage_student.service;


import ss17_io_binary_file_serialization.demo.manage_student.model.Product;;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteReadFile {
    static final String PATH_FILE = "D:\\Codegyms\\Modul2\\C0921G1_DaoBuiXuanThang_Module2\\src\\ss17_io_binary_file_serialization\\demo\\manage_student\\students.dat";

    public static List<Product> readFile() {
        File file = new File(PATH_FILE);
        List<Product> productList = new ArrayList<>();
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
            if (fileInputStream.available() != 0) {
                objectInputStream = new ObjectInputStream(fileInputStream);
                // khi mình ghi vào object nào thì cast đúng kiểu của object đó
                productList = (List<Product>) objectInputStream.readObject();
            }
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (objectInputStream != null) {
                    objectInputStream.close();
                }
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return productList;
    }

    public static void writeFile(List<Product> productList) {
        File file = new File(PATH_FILE);
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(file);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(productList);
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try{
                if (objectOutputStream != null){
                    objectOutputStream.close();
                }
                if (fileOutputStream != null){
                    fileOutputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
