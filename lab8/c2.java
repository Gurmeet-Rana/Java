package p1;
import static p1.p2.c1.*;
import java.util.Scanner;
public class c2 {
    public static void main(String []args)
    {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number : ");
        a=sc.nextInt();
        b=sc.nextInt();

      //  c1 obj=new c1();

        while (true) {
            int choice;
            System.out.println("Press 1 to add \n 2 to subtract \n 3 to multiply \n 4 to divide \n 5 to exit : ");
            choice=sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println(("Addition : "+sum(a,b)));
                    break;

                case 2:
                    System.out.print("SUBTRACTION : "+sub(a, b));    
                    break;
                case 3:
                    System.out.println("MULTIPLICATION : "+mul(a, b));
                    break;
                case 4: 
                    System.out.println("DIVISION : "+div(a, b));
                    break;
                case 5 : return ;        

                default:
                    break;
            }
        }
        
    }
}
