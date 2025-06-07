package OOPS.StaticConcepts;
public class HumanEx{
    public static void main(String[] args) {
        Human Sus = new Human(18,"Susan",1000);
        Human Ria = new Human(18,"Ria Saira",2000);
        System.out.println(Sus.name);
        System.out.println(Sus.Population);
        System.out.println(Ria.Population);
    }
}