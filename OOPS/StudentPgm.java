package OOPS;
class Student{
    int rollno=34;
    float marks;
    String name;
}
public class StudentPgm{
    public static void main(String[] args) {
        Student Neha = new Student();
        Neha.rollno=14;
        System.out.println(Neha.rollno);
        System.out.println(Neha.marks);
        System.out.println(Neha.name);
    }
}