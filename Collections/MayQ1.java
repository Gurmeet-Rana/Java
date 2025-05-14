import java.util.*;
import java.util.Scanner;
public class MayQ1 {
    void removeElement(ArrayList<String> list)
    {
        for(int i=0;i<list.size();i++)
        {
            if(list.get(i).length()%2==0)
            {
                list.remove(i);
            }
        }
    }
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<String> list=new ArrayList<String>();
        int n;
        System.out.println("Enter the number of elements you want to enter : ");
        n=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter : ");
        for(int i=1;i<=n;i++)
        {
            list.add(sc.nextLine());
        }
        MayQ1 obj=new MayQ1();
        System.out.println("Original list : ");
        for(String word:list) System.out.print(word+" ");
        obj.removeElement(list);
        System.out.println("List after removing even length elements : ");
        for(String word:list) System.out.print(word+" ");
    }

}
