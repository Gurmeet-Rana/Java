import java.util.*;
public class Anagram
{
    public static boolean isAnagram(String str1,String str2)
    {
        StringBuffer s=new StringBuffer(str2);
        if(str1.length()!=str2.length()) return false;
        for(int i=0;i<str1.length();i++)
        {
            int j=0;
            boolean found=false;
            while(j<s.length())
            {
                if(s.charAt(j)==str1.charAt(i))
                {
                    found=true;
                    s.deleteCharAt(j);
                }
                j++;
            }
            if(!found) return false;
        }
        return true;
        
    }
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str1=sc.nextLine();
        System.out.println("Enter the second String : ");
        String str2=sc.nextLine();
        System.out.println(Anagram.isAnagram(str1,str2));
    }
}