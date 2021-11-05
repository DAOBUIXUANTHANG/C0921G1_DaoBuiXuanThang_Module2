package ss6_ke_thua.bai_tap.lop_circle_va_lop_cylinder;

public class Circle {
    private double radius;
    private String color;

    public static double a;

    public Circle(){
        this.radius = 1;
        this.color = "green";
    }

    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double area(){
        return Math.pow(this.radius, 2) * Math.PI;
    }

    public double chuVi(){
        return this.radius * 2 * Math.PI;
    }

    public String toString(){
        return "ban kinh "
                + this.radius
                + " mau sac "
                + this.color
                + "dien tich " + area();

    }
}
