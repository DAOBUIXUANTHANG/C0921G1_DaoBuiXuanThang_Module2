package ss6_ke_thua.thuc_hanh.he_doi_tuong_hinh_hoc;

public class Shape {
    private String color;
    private boolean filled;

    public Shape(){
        this.color = "blue";
        this.filled = true;
    }

    public Shape(String color, boolean fill){
        this.color = color;
        this.filled = fill;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String toString(){
        if (filled){
            return "a shape with color :" + this.color + " and filled";
        } else {
            return "a shape with color :" + this.color + " and not filled";
        }
    }
}
