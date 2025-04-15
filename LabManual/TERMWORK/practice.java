import java.util.Scanner;
import java.lang.String;
import java.lang.StringBuilder;
public class practice {
    public static void main(String []args)
    {
        String str;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string : ");
        str=sc.nextInt();
        StringBuilder s=new StringBuilder(str);
        String ans[]=new String[1<<str.length()];
        getPermutation(ans,s,0);

        for()

    }
}
