import java.util.*;

public class AnagramSecond {
    public static boolean isAnagram(String str1,String str2)
    {
        char arr1[]=str1.toCharArray();
        char arr2[]=str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i=0;i<arr1.length;i++)
        {
            if(arr1[i]!=arr2[i]) return false;
        }
        return  true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str=sc.nextLine();
        System.out.println("Enter the second string : ");
        String str2=sc.nextLine();
        System.out.println(AnagramSecond.isAnagram(str,str2));
    }
}
