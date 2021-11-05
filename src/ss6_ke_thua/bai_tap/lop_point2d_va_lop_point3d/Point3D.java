package ss6_ke_thua.bai_tap.lop_point2d_va_lop_point3d;

public class Point3D  extends Point2D{
    private float z;

    public Point3D(){
        this.setX(0);
        this.setY(0);
        this.z = 0;
    }

    public Point3D(float x, float y, float z){
        super(x,y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] getXYZ(){
        float xyz[] = new float[]{getX(),getY(),getZ()};
        return xyz;
    }

    public String toString() {
        return "Point2D{"
                + "x= " + getX()
                + ", y= " + getY()
                + ", z= " + getZ() +
                '}';
    }
}
