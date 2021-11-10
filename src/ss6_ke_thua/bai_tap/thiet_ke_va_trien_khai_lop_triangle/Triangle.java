package ss6_ke_thua.bai_tap.thiet_ke_va_trien_khai_lop_triangle;

public class Triangle extends Shape{
    double side1 = 1;
    double side2 = 1;
    double side3 = 1;

    public Triangle(){}

    public Triangle(String color, double side1, double side2, double side3){
        super(color);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(double side1, double side2, double side3){
        super();
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public boolean isTriangle(){
        boolean check1 = this.side1 + this.side2 > this.side3;
        boolean check2 = this.side1 + this.side3 > this.side2;
        boolean check3 = this.side2 + this.side3 > this.side1;
        if (check1 && check2 && check3){
            return true;
        } else {
            return false;
        }
    }

    private double getPerimeter(){
        return this.side1 + this.side2 + this.side3;
    }


    private double getArea(){
        double S = (getPerimeter() - this.side1) * (getPerimeter() - this.side2) * (getPerimeter() - this.side3);
        return Math.pow(getPerimeter() * S , 2);
    }

    @Override
    public String toString() {
        if (isTriangle()){
            return "Triangle{" +
                    "color is " + super.getColor() +
                    " side1=" + side1 +
                    ", side2=" + side2 +
                    ", side3=" + side3 +
                    " perimeter = " + getPerimeter() +
                    " area = " + getArea() +
                    '}';
        } else {
            return "khong phai la tam giac";
        }
    }
}
