package Strings;
public class Concatenation{
    public static void main(String[] args) {
        System.out.println('a' + 'b'); //addition of characters 
        System.out.println("a" + "b"); //addition of strings
        /* first convert int 1 to Integer that will call toString(),so it becomes
            "a" + "1"
         */
        System.out.println("a" + 1); 
    }
}