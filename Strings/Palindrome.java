package Strings;
import java.util.Scanner;
public class Palindrome{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        str = str.toLowerCase();
        int len = str.length();
        int start = 0;
        int end =len-1;
        boolean isPalindrome = true;
        while(start < end){ 
            if(str.charAt(start)==str.charAt(end)){
                start++;
                end--;
            }else{
                isPalindrome = false;
                break;
            }
        }
        if(isPalindrome){
            System.out.println("Entered string " + str + " is Palindrome");
        }else{
            System.out.println("Entered string " + str + " is not palindrome");
        }

    }
}