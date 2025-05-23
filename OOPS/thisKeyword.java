package OOPS;
class Employee{
    int empid;
    String Empname;

    Employee(){
        this.empid = 20;
        this.Empname = "Sarah";
    }
    Employee(int empid,String empname){
        this.empid = empid;
        this.Empname = empname;
    }


    void changeName(String newname){
        this.Empname = newname;
    }
}
public class thisKeyword{
    public static void main(String[] args) {
        Employee e1 = new Employee();
        System.out.println(e1.empid);
        System.out.println(e1.Empname);
        e1.changeName("Maria");
        System.out.println("New name is " + e1.Empname);
        Employee e2 = new Employee(12,"Serah");
        System.out.println("The id of employee 2 is " +e2.empid);
        System.out.println("The name of employee 2 is " + e2.Empname);
        
        
    }
}