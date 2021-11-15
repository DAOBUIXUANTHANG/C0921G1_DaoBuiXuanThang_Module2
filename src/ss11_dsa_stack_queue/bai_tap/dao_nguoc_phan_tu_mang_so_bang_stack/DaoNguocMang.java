package ss11_dsa_stack_queue.bai_tap.dao_nguoc_phan_tu_mang_so_bang_stack;

import java.util.Stack;

public class DaoNguocMang<T> {
    private String nhapVao;
    private int size;
    private Stack<Character> myStack = new Stack<>();
    private String dauRa = "";

    public DaoNguocMang(){}

    public DaoNguocMang(String nhapvao){
        this.nhapVao = nhapvao;
        this.size = nhapvao.length();
    }

    public void nhapStack(){
        for (int i = 0; i < this.size; i++) {
            myStack.push(nhapVao.charAt(i));
        }
    }

    public String daoNguoc(){
        nhapStack();
        while (size>0){
            dauRa = dauRa + myStack.peek() ;
            myStack.pop();
            size--;
        }
        return dauRa ;
    }

}
