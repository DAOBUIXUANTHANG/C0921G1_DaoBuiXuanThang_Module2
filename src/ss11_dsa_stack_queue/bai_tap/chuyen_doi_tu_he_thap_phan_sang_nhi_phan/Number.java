package ss11_dsa_stack_queue.bai_tap.chuyen_doi_tu_he_thap_phan_sang_nhi_phan;

import java.util.Stack;

public class Number {
    private long number;
    private Stack<Integer> stack = new Stack();
    private String dauRa = "";

    public Number(long number ){
        this.number = number;
    }

    public String chuyenDoiSangThapPhan(){
        do {
            if (number % 2 == 0){
                stack.push(0);
                number = number / 2;
            } else {
                stack.push(1);
                number = number / 2;
            }
        } while (number == 1);

        while (!stack.isEmpty()){
            dauRa = dauRa + stack.pop();
        }

        return dauRa;
    }
}
