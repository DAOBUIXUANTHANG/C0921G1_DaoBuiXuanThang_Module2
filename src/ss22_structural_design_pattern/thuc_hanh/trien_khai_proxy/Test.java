package ss22_structural_design_pattern.thuc_hanh.trien_khai_proxy;

public class Test {
    public static void main(String[] args) {
        MathCaculatorProxy proxy = new MathCaculatorProxy();

        double result = proxy.sum(2,3);
        System.out.println("2 + 3 = " + result);

        result = proxy.sum(2 , Double.MAX_VALUE);
        System.out.println("2 + Max_Value = " + result);
    }
}
