package Strings;
import java.util.Arrays;
public class Char{
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(Arrays.toString(str.toCharArray()));
        System.out.println(Arrays.toString(str.split(" ")));
    }
}