package ss15_exception_handling.bai_tap.su_dung_lop_illgaltriangeexception;

public class IllegalTriangleException extends Exception {
    public IllegalTriangleException() {
        super();
    }

    public IllegalTriangleException(String message) {
        super("message");
    }

    @Override
    public String toString() {
        return "nhap sai 3 canh cua tam giac";
    }
}
