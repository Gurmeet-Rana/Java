/* Write a method swapPairs that switches the order of 
values in an ArrayList of Strings in a pairwise fashion. 
Your method should switch the order of the first two 
values, then switch the order of the next two, switch the 
order of the next two, and so on */

import java.util.*;
public class swappingClass {
    public void swapPairs(ArrayList list)
    {
        if(list.size()<2) return ;
        int i=1;
        while(i<list.size())
        {
            
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

        System.out.println("REST OF THE CODE...");
    } 
}
