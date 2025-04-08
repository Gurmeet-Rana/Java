
abstract class AbstractClass
{
    AbstractClass()
    {
        System.out.println("This is the constructor of the abstract class !!");
    }
    abstract void aMethod();
    void normalMethod()
    {
        System.out.println("THIS IS NORMAL METHOD OF ABSTRACT CLASS !!");
    }
}
class subClass extends AbstractClass
{
    void aMethod()
    {
        System.out.println("THIS IS AN ABSTRACT METHOD IN ABSTRACT CLASS !!");
    }
}

public class q4a {
    public static void main(String []args)
    {
        subClass sc=new subClass();
        sc.aMethod();;
        sc.normalMethod();
    }
}
