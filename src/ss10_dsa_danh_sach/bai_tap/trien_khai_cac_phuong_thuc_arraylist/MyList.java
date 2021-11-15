package ss10_dsa_danh_sach.bai_tap.trien_khai_cac_phuong_thuc_arraylist;

import java.util.Arrays;

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

    public void eClone(){
        MyList<E> clone = new MyList<>(this.elements.length);
        for (Object cloneI :
                this.elements) {
            clone.add((E) cloneI);
        }
    }

    public int indexOf(E elements){
        for (int i = 0; i < size; i++) {
            if (elements == this.elements[i]){
                return i;
            }
        }
        return 0;
    }

    public boolean contains(E ob){
        for (int i = 0; i < size; i++) {
            if (this.elements[i] == ob){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "MyList{" +
                "elements=" + Arrays.toString(elements) +
                '}';
    }
}
