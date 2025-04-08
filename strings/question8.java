import java.util.Scanner;

public class question8 {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        String str=new String();
        System.out.println("Enter the string : ");
        str=sc.nextLine();  

        int i=0,j=0,countOne=0,ans=0;
        int n=str.length();
        while(j<n)
        {
            if(str.charAt(j)=='1') 
            {
                countOne++;
            }
            if(str.charAt(i)=='0' && str.charAt(j)=='0' && countOne>0)
            {
                
                countOne=0;
                ans++;

                String temp=str.substring(i, j+1);

                System.out.println(temp);
                i=j;
            }
            j++;
        }
        System.out.println(str+" has "+ans);

        System.out.println("EXITING THE PROGRAM.....");

        sc.close();

    }
}
