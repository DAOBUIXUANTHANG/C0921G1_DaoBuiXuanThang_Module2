package ss10_dsa_danh_sach.bai_tap.trien_khai_cac_phuong_thuc_arraylist;

import java.util.Arrays;

import static com.sun.xml.internal.fastinfoset.util.ValueArray.DEFAULT_CAPACITY;

public class MyList<E> {
    int size = 0;
    static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList(){ elements = new Object[DEFAULT_CAPACITY];}

    public MyList(int capacity){
        if (capacity > 0){
            elements = new Object[capacity];
        } else {
            elements = new Object[DEFAULT_CAPACITY];
            System.out.println("loi tham so truyen vao, khoi tao gia tri size mac dinh = 10");
        }
    }

    private void ensureCapa() {
        if (size > elements.length){
            int newSize = size * 2;
            elements = Arrays.copyOf(elements, newSize);
        }
    }

    public void add( E element){
        size++;
        ensureCapa();
        elements[size-1] = element;
    }

    public void remove(int index){
        if (index < size && index >= 0){
            for (int i = index; i < size; i++) {
                elements[i] = elements[i+1];
            }
        } else {
            System.out.println("loi index ");
        }
    }

    public int getSize(){
        return size;
    }

    public int getELength(){
        return elements.length;
    }

    void eClone(){
        Object e1 =  elements.clone();
    }
}
