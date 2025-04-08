import java.util.HashMap;
import java.util.Scanner;

public class validation extends Exception{

    static boolean check(String s)
    {
       String arr[]=s.split("\\.");

        if(arr.length!=4) return false;

       for(String x:arr)
       {
            try
            {
                int number=Integer.parseInt(x);
                if(number<0 || number>255) return false;
            }
            catch(NumberFormatException e)
            {
                System.out.println(e);
            }

          System.out.println(x);
       }
       return true;
    }
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        String str=new String();
        System.out.println("ENTER AND iPv4 number to validate : ");
        str=sc.nextLine();
        System.out.println(str+" is "+validation.check(str));
    }
}
