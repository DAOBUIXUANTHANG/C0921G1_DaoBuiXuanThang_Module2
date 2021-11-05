package ss6_ke_thua.bai_tap.lop_point_va_lop_moveablepoint;

public class Point {
    private float x = 0;
    private float y = 0;

    public Point(){
    }

    public Point(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float[] getXY(){
        float xy[] = new float[]{getX(),getY()};
        return xy;
    }

    public String toString() {
        return "Point2D{"
                + "x=" + x
                + ", y=" + y +
                '}';
    }
}
