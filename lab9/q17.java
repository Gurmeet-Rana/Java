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

class myException extends Exception
{
    myException(String s)
    {
        super(s);
    }
}

public class MyCalculator{
    public int a, b,res;
    int power(int a,int b)
    {

        res=1;

        while(b--)
        {
            res*=a;
        }
    }


    public void showDetails()
    {
        System.out.println("Power of "+this.a+" Raised to "+this.b+" is "+this.res);
    }
    public static void main(String []args)
    {
        int choice;
        System.out.println("Enter 1 . to take input . 2 to calculate power 3. to show power 4. Exit !");
        Scanner sc=new Scanner(System.in);
        MyCalculator obj=null;
        do
        {
            choice=sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the number : ");
                    a=sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter the power : ");
                    b=sc.nextInt();
                    sc.nextLine();

                    try
                    {
                        String message;
                        if(a<0 || b<0 )
                        {
                            message="Number and power must be non - negative!!";
                            myException e=new myException("");
                            throw e;
                        }
                        else if(a==0 && b==0)
                        {
                            message="Number and Power must be Not Equal !";
                            myException e=new myException("");
                            throw e;
                        }

                    }
                    catch(myException e)
                    {
                        System.out.println(e.getMessage());
                    }

                    System.out.println("Data is successfully input !");

                    break;
                case 2:    
                    obj=new MyCalculator(a,b);
                    System.out.println("Power is successfully calculated !");
                    break;
                case 3: 
                    obj.showDetails();
                    break;    
                default:
                    break;
            }
        }while(4);

        System.out.println("EXITING PROGRAM....");

    }
}
