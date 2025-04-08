package p1.p2;

public class c1 extends Exception{
    public  static int sum(int a,int b)
    {
        return a+b;
    } 
    public  static int sub(int a,int b)
    {
        return a-b;
    }
    public static  int mul(int a,int b)
    {
        return a*b;
    }
    public static  int div(int a,int b)
    {
        try
        {
            if(b==0)
            {
                throw new ArithmeticException();
            }
            return a/b;
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        return 0;
    }
}
