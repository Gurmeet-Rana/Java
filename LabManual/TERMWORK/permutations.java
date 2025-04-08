import java.util.Arrays;
import java.util.Scanner;
public class permutations
{
    static int findFact(int n)
    {
        if(n<=2) return n;
        return findFact(n-1)*n;
    }

    void solve(StringBuilder str,int i,StringBuilder arr[],int n)
    {
        if(i==n)
        {
            arr.append(str);
        }
        for(int j=i;j<n;j++)
        {
            char temp=str.charAt(j);
            str.charAt(i)=temp;

        }
    }
    public static void main(String [] args)
    {
        String str=new String();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string : ");
        str=sc.nextLine();
        int number=permutations.findFact(str.length());
        StringBuilder arr[]=new StringBuilder[number];
        int n=str.length();
        solve(str,0,arr,n);
        for(String x:arr)
        {
            System.out.println(x);
        }
        System.out.println("EXITING THE PROGRAM......");
    }
} 