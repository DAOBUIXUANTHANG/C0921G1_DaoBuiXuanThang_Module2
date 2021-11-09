package ss7_abstrac_class_interface.bai_tap.trien_khai_interface_colorable;

import ss7_abstrac_class_interface.bai_tap.trien_khai_interface_resizeable.Square;

public class Squaree extends  Shape implements Colorable {
    private double canh = 1;

    public Squaree(){}

    public Squaree(double canh){
        this.canh = canh;
    }

    public double getCanh() {
        return canh;
    }

    public void setCanh(double canh) {
        this.canh = canh;
    }

    public double getArea(){
        return this.canh * this.canh;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides..");
    }
}
