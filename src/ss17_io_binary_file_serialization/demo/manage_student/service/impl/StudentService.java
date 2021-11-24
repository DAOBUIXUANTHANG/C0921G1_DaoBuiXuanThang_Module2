package ss17_io_binary_file_serialization.demo.manage_student.service.impl;


import ss17_io_binary_file_serialization.demo.manage_student.model.Product;
import ss17_io_binary_file_serialization.demo.manage_student.service.IStudentService;
import ss17_io_binary_file_serialization.demo.manage_student.service.WriteReadFile;

import java.util.List;
import java.util.Scanner;

public class StudentService implements IStudentService {

    List<Product> products;
    {
        products = WriteReadFile.readFile();
    }

    @Override
    public void addStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter name");
        String name = scanner.nextLine();
        System.out.println("Please enter gender");
        String gender = scanner.nextLine();
        System.out.println("Please enter age");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Please enter point");
        double point = Double.parseDouble(scanner.nextLine());
        products.add(new Product(name, age, gender, point));
        WriteReadFile.writeFile(products);
    }

    @Override
    public void displayStudent() {
        products = WriteReadFile.readFile();
        for (Product product : products) {
            System.out.println(product);
        }
    }

    @Override
    public void deleteStudent() {

    }
}
