package lab8;

/* Write  a  program  to  insert  a  string  into  another  string  (Without  using  any  predefined 
method) at any given index */
import java.util.Scanner;
public class Insertion {

    void insert(StringBuffer str,String temp,int i)
    {
        String rest=str.substring(i);
        int k=0;
        for(int j=i;j<str.length();j++)
        {
            str.setCharAt(j,temp.charAt(k));
        }
        
    } 
    public static void main(String [] args)
    {
        String s;
        System.out.println("Enter a string : ");
        Scanner sc=new Scanner(System.in);
        s=sc.nextLine();

        StringBuilder str=new StringBuilder(s);

        int index;
        System.out.println("Enter the index to insert at : ");
        index=sc.nextInt();

        String toInsert=sc.nextLine();

        insert(str,toInsert,index);
            

    }
}
