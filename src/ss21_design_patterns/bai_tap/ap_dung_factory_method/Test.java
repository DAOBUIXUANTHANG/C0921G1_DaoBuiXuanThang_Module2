package ss21_design_patterns.bai_tap.ap_dung_factory_method;

public class Test {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape circle = shapeFactory.getShape("Circle");
        Shape rec = shapeFactory.getShape("Rectangle");
        Shape square = shapeFactory.getShape("Square");
        Shape circle1 = shapeFactory.getShape("Circle");

        circle.draw();
        rec.draw();
        square.draw();
        circle1.draw();
    }
}
