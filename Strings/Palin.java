package Strings;
import java.util.Scanner;
public class Palin{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String st = sc.nextLine();
        if(isPalindrome(st)){
            System.out.println("String is Palindrome");
        }else{
            System.out.println("String is not Palindrome");
        }
        
    }
    static boolean isPalindrome(String st){
        st = st.toLowerCase();
        if(st == null || st.length() == 0){ // if order is in reverse , then nullpointerexception occurs
            return true;
        }
        boolean isPalin = true;
        for(int i=0;i<st.length();i++){
            int start = st.charAt(i);
            int end = st.charAt(st.length()-1-i);
            if(start != end){
                return false;
            }
        }
        return true;

    }
}