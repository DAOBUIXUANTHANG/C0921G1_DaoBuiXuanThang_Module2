package ss7_abstrac_class_interface.thuc_hanh.lop_animal_va_interface_edible;

import ss7_abstrac_class_interface.thuc_hanh.lop_animal_va_interface_edible.Animal;
import ss7_abstrac_class_interface.thuc_hanh.lop_animal_va_interface_edible.Chicken;
import ss7_abstrac_class_interface.thuc_hanh.lop_animal_va_interface_edible.Tiger;

public class KtAbstractAndInterface {
    public static void main(String[] args) {
//        Animal[] animals = new Animal[2];
//        animals[0] = new Tiger();
//        animals[1] = new Chicken();
//        for (Animal animal : animals) {
//            System.out.println(animal.makeSound());
//        }

        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());

            if (animal instanceof Chicken) {
                Edible edibler = (Chicken) animal;
                System.out.println(edibler.howToEat());
            }
        }

    }
}
