package LinkedList;
public class DLLclass{
    private Node head;
    private class Node{
        private int value;
        private Node next;
        private Node prev;
        private Node(int value){
            this.value = value;
        }
        private Node(int value,Node next,Node prev){
            this.value = value;
            this.next = next;
            this.prev = prev;
        }

    }
    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        node.prev = null;
        if(head != null){
            head.prev = node;
        }
        head = node;
    }
    public void insertLast(int value){
        Node node = new Node(value);
        if(head == null){
            node.prev = null;
            node.next = null;
            head = node;
            return;
        }
        Node temp = head;
        while(temp.next !=null){
            temp = temp.next;
        }
        temp.next = node;
        node.prev = temp;
        node.next = null;
    }
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("End");
    }
    public void displayReverse(){
        Node temp = head;
        Node last = null;
        while(temp != null){
            last = temp;
            temp = temp.next;
        }
        while(last != null){
            System.out.print(last.value + "->");
            last = last.prev;
        }
        System.out.print("Start");
    }
    public void displayReverseMy(){  //my code
        Node temp = head;
        while(temp != null){
            if(temp.next == null){
                Node last = temp;
                while(last.prev != null){
                    System.out.print(last.value + "->");
                    last = last.prev;
                }
                System.out.print(last.value + "->");
                System.out.print("Start");
            }
            temp = temp.next;
        }
    }
}