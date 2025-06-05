import java.util.*;

class myException extends Exception
{
    public myException(String msg)
    {
        super(msg);
    }

}

public class divByZero extends Exception {
    public static void main(String []args)
    {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numerator : ");
        a=sc.nextInt();
        System.out.println("Enter the denominator : ");
        b=sc.nextInt();
        try{
            if(b==0)
            {
                throw new myException("NOT ALLOWED!!");
            }
            System.out.println(a+"/"+b+"="+a/b);
        }
        catch(myException e)
        {
            System.out.println(e.toString());
        }
    }
}
