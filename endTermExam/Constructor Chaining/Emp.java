import java.util.*;

class Person
{
    public String id,name,dpt;  
    public Person(String id,String name,String dpt)
    {
        this.id=id;
        this.name=name;
        this.dpt=dpt;
    }
}
public class Emp extends Person {
    public Emp(String id,String name,String dpt)
    {
        super(id,name,dpt);
    }    
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        String id,name,dpt;
        System.out.println("Enter the id : ");
        id=sc.nextLine();
        System.out.println("Enter the name of the employee : ");
        name=sc.nextLine();
        System.out.println("Enter the department of the employee : ");
        dpt=sc.nextLine();
        System.out.println("Following is the object : ");
        Emp obj=new Emp(id, name, dpt);
        System.out.println(obj.toString());
        System.out.println("EXITING THE PROGRAM---");
    }
}
