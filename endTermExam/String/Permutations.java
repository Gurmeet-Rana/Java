import java.util.*;

public class Permutations {
    public static void getPermutations(StringBuffer str,int i)
    {
        if(i>=str.length()) 
        {
            System.out.print(str+" ");
        }
        for(int j=i;j<str.length();j++)
        {
            char temp=str.charAt(i);
            str.setCharAt(i,str.charAt(j));
            str.setCharAt(j, temp);
            getPermutations(str,i+1);
            temp=str.charAt(i);
            str.setCharAt(i,str.charAt(j));
            str.setCharAt(j, temp);
            
        }
    }
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str=sc.nextLine();
        System.out.println("Its permutations are : ");
        StringBuffer sb=new StringBuffer(str);
        Permutations.getPermutations(sb,0);
    }
}
