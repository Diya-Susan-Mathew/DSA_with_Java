package LinkedList;
public class DLLmain{
    public static void main(String[] args) {
        DLLclass list = new DLLclass();
        list.insertFirst(87);
        list.insertFirst(67);
        list.insertFirst(15);
        list.insertFirst(32);
        list.display();
        // System.out.println();
        list.displayReverseMy();
        System.out.println();
        list.displayReverse();
        System.out.println();
        list.insertLast(34);
        list.display();
    }
}