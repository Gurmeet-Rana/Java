/* Write a method removeEvenLength that takes 
an  ArrayList of Strings as a parameter and that 
removes all of the strings of even length from the list. 
(Use ArrayList) */
import java.util.ArrayList;
import java.util.Scanner;
public class arrayList {
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of strings you want to enter : ");
        ArrayList arr=new ArrayList<String>();
        n=sc.nextInt();
        sc.nextLine();
        while(n>0)
        {
            System.out.println("Enter the string : ");
            String str=sc.nextLine();
            arr.add(str);
            n--;
        }

        System.out.println("The array content is : ");
        for(int i=0;i<arr.size();i++)
        {
            System.out.println(arr);
        }
        
    }
}
