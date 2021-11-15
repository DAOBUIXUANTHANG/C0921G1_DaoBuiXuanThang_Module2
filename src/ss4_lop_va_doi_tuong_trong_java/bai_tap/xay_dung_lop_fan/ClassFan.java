package ss4_lop_va_doi_tuong_trong_java.bai_tap.xay_dung_lop_fan;

public class ClassFan {
    final int SLOW = 1, MEDIUM = 2, FAST = 3;
    int speed;
    private boolean on;
    private double radius;
    private String color;

    public ClassFan(){
        this.speed = SLOW;
        this.on = false;
        this.color = "blue";
        this.radius = 5;
    }

    public ClassFan(int speed, boolean on, double radius, String color){
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public String toString(){
        if (this.on){
            return "fan is on, speed: " + this.speed + " color: " + this.color + " radius: " + this.radius;
        } else {
            return "fan's off";
        }
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed < 3){
            this.speed = speed;
        } else {
            this.speed = FAST;
        }
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
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
}
