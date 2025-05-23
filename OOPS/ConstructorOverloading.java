package OOPS;
class Developer{
    int id;
    String d_name;
    String dept;

    Developer(){
        this.dept = "Data Science";
    }
    Developer(int id,String d_name,String dept){
        this.id = id;
        this.d_name = d_name;
        this.dept = dept;
    }
    Developer(Developer d2){
        this.id = d2.id;
        this.d_name = d2.d_name;
        this.dept = d2.dept;
    }
}
public class ConstructorOverloading{
    public static void main(String[] args) {
        Developer d1 = new Developer(156,"Sera","Secops");
        System.out.println("The id is "+d1.id+" and the name is "+d1.d_name+" and the department is "+d1.dept);
        Developer d3 = new Developer(d1);
        System.out.println("The id is "+d3.id+" and the name is "+d3.d_name+" and the department is "+d3.dept);
    }
}