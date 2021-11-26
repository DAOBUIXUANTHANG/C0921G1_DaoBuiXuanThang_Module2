package ss21_design_patterns.thuc_hanh.factory_method;

public class DemoFactory {
    public static void main(String[] args) {
        FactoryAnimal factoryAnimal = new FactoryAnimal();

        Animal a1 = factoryAnimal.getAnimal("feline");
        System.out.println("a1 sound " + a1.makeSound());

        Animal b2 = factoryAnimal.getAnimal("canine");
        System.out.println("b2 sound " + b2.makeSound());
    }
}
