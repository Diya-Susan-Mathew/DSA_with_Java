package OOPS.StaticConcepts;
public class Human{
    int age;
    String name;
    int salary;
    static long Population; // Population is independent of object.It's same for everyone so - static
    public Human(int age,String name,int salary){
        this.age = age;
        this.name = name;
        this.salary = salary;
        Human.Population+=1;   //no need to use this,because it does not depend on object.
    }
}