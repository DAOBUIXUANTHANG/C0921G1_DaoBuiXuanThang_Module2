package ss6_ke_thua.bai_tap.lop_point2d_va_lop_point3d;

public class Point2D {
    private float x;
    private float y;

    public Point2D(){
        this.x = 0;
        this.y = 0;
    }

    public Point2D(float x, float y){
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
