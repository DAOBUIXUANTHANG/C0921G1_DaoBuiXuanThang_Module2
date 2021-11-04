package ss5_access_modifier_static_method_static_propety.thuc_hanh.static_method;

public class Test {
    public static void main(String[] args) {
        Student.change(); //calling change method

        //creating objects
        Student s1 = new Student(111, "Hoang");
        Student s2 = new Student(222, "Khanh");
        Student s3 = new Student(333, "Nam");
        Student s4 = new Student(444, "Ti");

        //calling display method
        s1.display();
        s2.display();
        s3.display();
        s4.display();
    }
}
