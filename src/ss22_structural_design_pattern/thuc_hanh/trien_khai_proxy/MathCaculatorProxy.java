package ss22_structural_design_pattern.thuc_hanh.trien_khai_proxy;

public class MathCaculatorProxy implements Calculator{
    private MathCaculator mathCaculator;

    public MathCaculatorProxy() {
        this.mathCaculator = new MathCaculator();
    }

    @Override
    public double sum(double first, double second) {
        if(first / 2 + second / 2 >= Double.MAX_VALUE / 2){
            throw new RuntimeException("Out of range");
        }
        if(first / 2 + second / 2 <= Double.MIN_VALUE / 2){
            throw new RuntimeException("Out of range");
        }
        return mathCaculator.sum(first, second);
    }

    @Override
    public double sub(double first, double second) {
        if(first / 2 - second / 2 >= Double.MAX_VALUE / 2){
            throw new RuntimeException("Out of range");
        }
        if(first / 2 - second / 2 <= Double.MIN_VALUE / 2){
            throw new RuntimeException("Out of range");
        }
        return mathCaculator.sub(first, second);
    }

    @Override
    public double multi(double first, double second) {
        double result = mathCaculator.multi(first, second);
        if(first != 0 && result / first != second){
            throw new RuntimeException("Out of range");
        }
        return result;
    }

    @Override
    public double div(double first, double second) {
        if(second == 0){
            throw new RuntimeException("Can't divide by zero");
        }
        return mathCaculator.div(first, second);
    }

}
