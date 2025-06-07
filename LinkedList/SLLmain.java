//refer LLclass pgm
package LinkedList;
public class SLLmain{
    public static void main(String[] args) {
        SLLclass list = new SLLclass();   //size will be initialised to zero.
        list.insertFirst(23);
        list.insertFirst(56);
        list.insertFirst(4);
        list.insertFirst(12);
        list.insertLast(40);
        list.insert(32, 5);
        list.insert(100,3);
        System.out.println(list.deleteFirst());
        System.out.println(list.deleteLastmy());
        System.out.println(list.deleteLast());
        System.out.println(list.delete(2));
        System.out.println(list.find(56));
        list.display();

    }
}