package ss7_abstrac_class_interface.thuc_hanh.lop_animal_va_interface_edible.lop_fruit_apple_orange;

import ss7_abstrac_class_interface.thuc_hanh.lop_animal_va_interface_edible.lop_fruit_apple_orange.Fruit;
import ss7_abstrac_class_interface.thuc_hanh.lop_animal_va_interface_edible.lop_fruit_apple_orange.Orange;
import ss7_abstrac_class_interface.thuc_hanh.lop_animal_va_interface_edible.lop_fruit_apple_orange.Apple;


public class testfr {
    public static void main(String[] args) {
        Fruit fruits[] = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }
    }
}
