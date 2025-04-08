import java.util.Arrays;
import java.util.Scanner;
import java.lang.StringBuffer;

public class q3b {
    public static void main(String []args)
    {
        System.out.println("Enter the string : ");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        StringBuffer ans=new StringBuffer(str.length());
        char arr[]=str.toCharArray();
        Arrays.sort(arr);
        for(char ch:arr)
        {
            ans.append(ch);
        }
        System.out.println("SORTED STRING : "+ans);

    }
}
