package Methods;
public class Overloading{
    public static void main(String[] args) {
        //fun();
        fun(9);
    }
    static void fun(){
        System.out.println("Hello, this is executed when no parameters is given");
    }
    static void fun(int a){
        System.out.println("Executed when giving a parameter");
    }
}