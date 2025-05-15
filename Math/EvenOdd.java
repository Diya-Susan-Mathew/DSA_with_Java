package Math;
import java.util.Scanner;
public class EvenOdd{
    public static void main(String[] args) {
        int num;
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        System.out.println(isOdd(num));
        
        
        }
        
        private static boolean isOdd(int num) {
            if((num & 1) == 1){
                return true;
            }else{
                return false;
            }
                
        }
}