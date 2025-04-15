/* Create a class MyCalculator which consists of a single 
method power(int, int). 
This method takes two integers, n and p, as 
parameters and finds np . 
 If either n or p  is negative, then the method must 
throw an exception which says "n and p should be non-
negative".  
 
Input Format  
Each line of the input contains two integers, n and p .  
 
Output Format  
 
Each line of the output contains the result ,if neither of 
n and  p is negative.  
 
Otherwise the output contains "n and p should be non-
negative" */

import java.util.Scanner;

class MyException extends Exception
{
    MyException(String message)
    {
        super(message);
    }
}

public class MyCalculator {

    public int power(int a,int b)
    {
        int res=1;
        while(b>0)
        {
            res*=a;
            b--;
        }
        return res;
    }

    public static void main( String []args)
    {
        int a=0,b=0;
        Scanner sc=new Scanner(System.in);
        int choice;
        System.out.println("Press :\n1 Input \n2 Calculate Power\n3 EXIT");
        MyCalculator obj=null;
        do
        {
            choice=sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Enter the number : ");
                    a=sc.nextInt();
                    System.out.println("Enter the power : ");
                    b=sc.nextInt();

                    try
                    {
                        if(a<0 || b<0)
                        {
                            throw new MyException("a and b should be non-negative!");
                        }
                        else if(a==0 && b==0)
                        {
                            throw new MyException("a and b should be non-zero!");
                        }

                    }
                    catch(MyException e)
                    {
                        System.out.println("ERROR : "+e.getMessage());
                    }

                    break;

                case 2:
                    obj=new MyCalculator();
                    System.out.println(a+"^"+b+" = "+obj.power(a, b));
                    break;    
            
                default:
                    break;
            }
        }while(choice!=3);
        System.out.println("EXITING THE PROGRAM....");
    }
    
}