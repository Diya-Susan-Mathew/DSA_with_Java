package Strings;
public class diffObjects{
    public static void main(String[] args) {
        String name1 = new String("Hello");
        String name2 = new String("Hello");
        System.out.println(name1 == name2);   //checks the objects
        System.out.println(name1.equals(name2)); //checks the value
    }
}