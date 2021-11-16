package ss7_abstrac_class_interface.bai_tap.trien_khai_interface_resizeable;

public class Circle extends Shape implements Resizeable{
    private double radius = 1;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
    }

    @Override
    public void resize(double per) {
        this.radius = this.radius * ((per + 100)/100);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArena(){return radius * radius * Math.PI;}

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius="
                + getRadius()
                + ", which is a subclass of "
                + super.toString();
    }

}
