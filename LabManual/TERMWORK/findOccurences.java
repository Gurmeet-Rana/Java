import java.util.Scanner;
import java.util.Arrays;
public class findOccurences {

    static boolean findPat(String str,String pat)
    {
        for(int i=0;i<str.length()-pat.length();i++)
        {
            String sub=str.substring(i, i+pat.length());
            if(pat.equals(sub)) return true;
        } 
        return false;
    }
    public static void main(String []args)
    {
        String str=new String();
        System.out.println("Enter the string : ");
        
        Scanner sc=new Scanner(System.in); 
        
        str=sc.nextLine();

        String pat=new String();
        System.out.println("Enter the patterns to search : ");
        pat=sc.nextLine();

        System.out.println("Relation : "+findOccurences.findPat(str,pat));

        System.out.println("EXITING THEP PROGRAM....");

    }
}
