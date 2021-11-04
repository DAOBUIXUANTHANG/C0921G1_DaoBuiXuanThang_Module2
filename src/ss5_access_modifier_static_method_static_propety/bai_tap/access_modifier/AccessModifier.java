package ss5_access_modifier_static_method_static_propety.bai_tap.access_modifier;

public class AccessModifier {
    private double raidus = 1.0;
    private String color = "red";

    public AccessModifier(){}

    public  AccessModifier( double raidus){
        this.raidus = raidus;
    }

    public double getRaidus() {
        return raidus;
    }

    public String getColor() {
        return color;
    }

    private double getRaidus1() { // k truy cap ngoai dc
        return raidus;
    }

    protected String getColor1() {
        return color;
    }
}
