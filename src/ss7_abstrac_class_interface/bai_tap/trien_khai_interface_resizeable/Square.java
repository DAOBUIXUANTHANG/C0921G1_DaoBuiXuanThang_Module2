package ss7_abstrac_class_interface.bai_tap.trien_khai_interface_resizeable;

public class Square extends Shape {
    private double size = 1;

    public Square(double canh){
        this.size = canh;
    }

    public Square(){}

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public void resize(double per) {
        this.size = this.size * ((per + 100) / 100);
    }

    @Override
    public double getArena() {
        return this.size * this.size;
    }

    @Override
    public String toString() {
        return "Square{" +
                "size=" + size +
                '}';
    }
}
