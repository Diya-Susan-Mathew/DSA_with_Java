package Strings;
import java.util.Scanner;
public class Palin{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        st = st.toLowerCase();
        boolean isPalin = true;
        for(int i=0;i<st.length();i++){
            int start = st.charAt(i);
            int end = st.charAt(st.length()-1-i);
            if(start != end){
                isPalin = false;
            }
        }
        if(isPalin){
            System.out.println("Entered string is palindrome");
        }else{
            System.out.println("Entered String is not palindrome");
        }

    }
}