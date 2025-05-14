/* Write a method swapPairs that switches the order of 
values in an ArrayList of Strings in a pairwise fashion. 
Your method should switch the order of the first two 
values, then switch the order of the next two, switch the 
order of the next two, and so on */

import java.util.*;
public class swappingClass {
    public void swapPairs(ArrayList<Integer> list)
    {
        if(list.size()<2) return ;
        int i=0;
        while(i<list.size())
        {
            int a=list.get(i);            
            if(i+1<list.size())
            {
                int b=list.get(i+1);
                list.set(i,b);
                list.set(i+1,a);
            }
            i+=2;
        }
    }
    public static void main(String[]args)
    {
        ArrayList<Integer> list=new ArrayList<>();
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the list : ");
        n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the value : ");
            int ele=sc.nextInt();
            list.add(ele);
        }

        swappingClass obj=new swappingClass();
        obj.swapPairs(list);

        for(int a:list) System.out.print(a+" ");

        System.out.println("REST OF THE CODE...");
    } 
}
