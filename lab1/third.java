import java.util.Scanner;
public class third {

    private static int findDivisorSum(int num)
    {
        int sum=0;
        for(int i=1;i<=num/2;i++)
        {
            if(num%i==0)
            {
                sum+=i;
            }
        }
        return sum;
    }
    public static void main(String [] args)
    {
        int num1,num2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number :");
        num1=sc.nextInt();

        System.out.println("Enter second number :");
        num2=sc.nextInt();

        int divSum1=findDivisorSum(num1);
        int divSum2=findDivisorSum(num2);

        if(divSum1/num1 == divSum2/num2)
        {
            System.out.println(num1+" AND "+num2+" ARE "+"Friendly Number");
        }
        else
        {
            System.out.println(num1+" AND "+num2+" ARE "+"NOT Friendly Number");
        }
        System.out.println("Exiting the Program....");
}
    }

    
