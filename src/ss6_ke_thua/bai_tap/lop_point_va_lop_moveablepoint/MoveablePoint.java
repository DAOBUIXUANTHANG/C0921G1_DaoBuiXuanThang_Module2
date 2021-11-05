package ss6_ke_thua.bai_tap.lop_point_va_lop_moveablepoint;

public class MoveablePoint extends Point {
    private float xSpeed = 0;
    private float ySpeed = 0;

    public MoveablePoint(){

    }

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed){
        super( x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed(){
        float toaDo[] = new float[]{getXSpeed(), getYSpeed()};
        return toaDo;
    }

    @Override
    public String toString() {
        return "( x =" + getX()+ ",y = " + getY() + " )"
                + ", speed = "+ "( x =" + getXSpeed()+ ",y = " + getYSpeed() + " )";
    }

    public Point move(){
        this.setX(this.getXSpeed() + xSpeed);
        this.setY(this.getYSpeed() + ySpeed);
        return  this;
    }
}
