import java.util.Scanner;
public class forth {
    public static void main(String [] args)
    {
        int number;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        number=sc.nextInt();

        int temp=0;
        while(number>0)
        {
            int digit=number%10;
            if(digit==0)
            {
                temp=temp*10+1;
            }
            else{
                temp=temp*10+digit;
            }
            number/=10;            
        }
        
        int ans=0;
        while(temp>0)
        {
            ans=ans*10+temp%10;
            temp/=10;
        }
        

        System.out.println("New Number is : "+ans);

        
    }
}
