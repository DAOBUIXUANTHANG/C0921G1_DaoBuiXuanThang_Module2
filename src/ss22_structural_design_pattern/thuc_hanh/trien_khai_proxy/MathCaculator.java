package ss22_structural_design_pattern.thuc_hanh.trien_khai_proxy;

public class MathCaculator implements Calculator{

    @Override
    public double sum(double fist, double second) {
        return fist + second;
    }

    @Override
    public double sub(double fist, double second) {
        return fist - second;
    }

    @Override
    public double multi(double fist, double second) {
        return fist * second;
    }

    @Override
    public double div(double fist, double second) {
        return fist / second;
    }
}
