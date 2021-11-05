package ss6_ke_thua.bai_tap.lop_circle_va_lop_cylinder;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(){
        this.height = 1;
    }

    public Cylinder(double radius, String color, double heigt){
        super(radius, color);
        this.height = heigt;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double capacity(){
        return this.height * this.area();
    }

    @Override
    public String toString() {
        return "Cylinder{"
                + "height = " + height
                + "raidus =" + getRadius()
                + "color: " + getColor()
                + "area = " + area()
                + "capacity = " +capacity() +
                '}';
    }
}
