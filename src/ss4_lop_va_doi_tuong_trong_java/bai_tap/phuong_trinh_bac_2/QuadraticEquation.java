package ss4_lop_va_doi_tuong_trong_java.bai_tap.phuong_trinh_bac_2;

public class QuadraticEquation {
    private double a, b, c, delta;

    public QuadraticEquation(){
    }

    public QuadraticEquation(double a, double b, double c ){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getterA(){
        return this.a;
    }

    public double getterB(){
        return this.b;
    }

    public double getterC(){
        return this.b;
    }

    public double getDiscrimiant(){
        return Math.pow(this.b, 2) - 4 * this.a * this.c;
    }

    public double getRoot1(){
        return -(b + Math.pow(getDiscrimiant(), 0.5)) / (2 * a);
    }

    public double getRoot2(){
        return -(b - Math.pow(getDiscrimiant(), 0.5)) / (2 * a);
    }

    public void nghiemPhuongTrinhBac2(){
        if (getDiscrimiant() > 0){
            System.out.println("phuong trinh co 2 nghiem la: " + getRoot1() + " va " + getRoot2());
        } else if (getDiscrimiant() == 0){
            System.out.println("phuong trinh co 2 nghiem kep la " + getRoot1());
        } else {
            System.out.println("phuong trinh vo nghiem ");
        }
    }
}
