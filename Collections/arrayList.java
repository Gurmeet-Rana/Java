/* Write a method removeEvenLength that takes 
an  ArrayList of Strings as a parameter and that 
removes all of the strings of even length from the list. 
(Use ArrayList) */

import java.util.*;
public class arrayList
{
    public void removeEvenString(ArrayList list,int n)
    {
        for(int i=0;i<list.size();i++)
        {
            String curr=list.get(i).toString();
            if(curr.length()%2==0)
            {
                list.remove(i);
            }
        }
    }
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<String> list=new ArrayList<>();
        int n;
        System.out.println("Enter the number of strings you want to append in list : ");
        n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++)
        {
            String str;
            System.out.println("Enter the string : ");
            str=sc.nextLine();
            list.add(str);
        }
        System.out.println("You Entered : ");
        for(String s:list)
        {
            System.out.println(s);
        }

        System.out.println("REMOVING EVEN LENGTH STRINGS FROM LIST : ");
        arrayList obj=new arrayList();
        obj.removeEvenString(list,n);
        System.out.println("Updated list is : ");
        for(String s:list)
        {
            System.out.println(s);
        }
        System.out.println("End of Program....");
    }
}