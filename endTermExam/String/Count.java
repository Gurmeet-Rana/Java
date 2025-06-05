import java.util.*;
public class Count
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str=sc.nextLine();
        int wordCnt=0,alphaCnt=0,numberCnt=0;
        String arr[]=str.split("\\s+");
        for(String s:arr)
        {
            wordCnt++;
            for(char ch:s.toCharArray())
            {
                if(Character.isDigit(ch))
                {
                    numberCnt++;
                }
                else
                {
                    alphaCnt++;
                }
            }
        }
        System.out.println("Words count = "+wordCnt);
        System.out.println("Alphabet count = "+alphaCnt);
        System.out.println("Number count = "+numberCnt);
    }
}