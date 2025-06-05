import java.util.*;

public class ISBN {
    public static boolean isValid(String n)
    {
        if(n.length()!=10)
        {
            System.out.println("NOT A VALID ISBN ");
            return false;
        }
        int number=Integer.parseInt(n);
        int sum=0;
        while(number>0)
        {
            sum+=number%10;
            number=number/10;
        }
        if(sum%11==0)
        {
            System.out.println("VALID H RE !");
            return true;
        }
        return false;
    }
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the ISBN number : ");
        String str=sc.nextLine(); 
        System.out.println(ISBN.isValid(str));
    }
}
