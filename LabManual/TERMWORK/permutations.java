import java.util.*;

public class Permutations
{
    public static void printPermutations(StringBuffer str,int i)
    {
        if(i>=str.length()) 
        {
            System.out.print(str+" ");
            return ;
        }

        for(int j=i;j<str.length();j++)
        {
            char temp=str.charAt(i);
            str.setCharAt(i,str.charAt(j));
            str.setCharAt(j, temp);
            
            printPermutations(str, i+1);

            temp=str.charAt(i);
            str.setCharAt(i,str.charAt(j));
            str.setCharAt(j, temp);
            
        }

    }
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        String org=new String();
        System.out.println("Enter the string : ");
        org=sc.nextLine();
        StringBuffer orgBuffer=new StringBuffer(org);

        Permutations.printPermutations(orgBuffer,0);

        System.out.println("End of program---");
    }
}