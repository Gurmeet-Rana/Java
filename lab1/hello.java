import java.util.Scanner;
public class hello
{
    public static void main(String[] args)
    {
        String name,course;
        int rollNo,sem;
        Scanner sc=new Scanner(System.in);

        if(args.length<4)
        {
            System.out.println("Enter all the details");
            System.exit(0);
        }
        
        name = args[0];
        
        course=args[1];
        sc.nextLine();
        rollNo=Integer.parseInt(args[2]);
        sem=Integer.parseInt(args[3]);
       
        System.out.println("Your name is "+name);
        System.out.println("Your Couse is "+course);
        System.out.println("Your Roll number is "+rollNo);
        System.out.println("Your Semester is "+sem);
    }
};