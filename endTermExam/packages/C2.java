package P1.P2;
import java.util.*;
import P1.*;

public class C2 implements P1.I1{
    public int sub(int a,int b)
    {
        return a-b;
    } 
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.println("Enter the first number : ");
        a=sc.nextInt();
        System.out.println("Enter the second number : ");
        b=sc.nextInt();

        P1.C1 obj=new P1.C1();

        C2 o=new C2(); 

        System.out.println(a+"+"+b+"="+obj.sum(a,b));
        System.out.println(a+"-"+b+"="+o.sub(a,b));

        System.out.println("EXITING THE PROGRAM....");
    }
}
