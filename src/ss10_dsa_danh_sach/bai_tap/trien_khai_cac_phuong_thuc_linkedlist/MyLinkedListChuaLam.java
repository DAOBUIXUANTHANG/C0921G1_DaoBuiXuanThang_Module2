package ss10_dsa_danh_sach.bai_tap.trien_khai_cac_phuong_thuc_linkedlist;

//public class MyLinkedList<E> {
//    private Node head;
//    private int numberNode;
//
//    private class Node{
//        private Node next;
//        private Object data;
//
//        public Node( Object data) {
//            this.data = data;
//        }
//
//        public Object getData(){
//            return this.data;
//        }
//    }
//
//    public MyLinkedList(Object head) {
//        this.head = new Node(head);
//    }
//
//    public void add(int index, Object data) {
//        Node temp = head;
//        Node holder;
//
//        for(int i=0; i < index-1 && temp.next != null; i++) {
//            temp = temp.next;
//        }
//        holder = temp.next;
//        temp.next = new Node(data);
//        temp.next.next = holder;
//        numberNode++;
//    }
//}
