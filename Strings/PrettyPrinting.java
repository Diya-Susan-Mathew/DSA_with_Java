package Strings;
public class PrettyPrinting{
    public static void main(String[] args) {
        float a = 3.4562f;
        System.out.printf("Formatted number is %.2f \n",a);  // 2 decimal digits
        // f in printf stands for formatted output
        System.out.println(Math.PI);
        System.out.printf("Value of pi is %.4f",Math.PI);   // upto 4 decimal digits
    }
}