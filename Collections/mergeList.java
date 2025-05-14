import java.util.*;
public class mergeList {
    public static void merge(LinkedList<Integer> l1,LinkedList<Integer> l2,LinkedList<Integer> res)
    {
        int n=l1.size();
        int m=l2.size();
        int i=0,j=0;
        while(i<n && j<m)
        {
            if(l1.get(i)<l2.get(j))
            {
                res.add(l1.get(i));
                i++;
            }
            else
            {
                res.add(l2.get(j));
                j++;
            }
        }
        while(i<n)
        {
            res.add(l1.get(i));
                i++;
        }
        while(j<m)
        {
            res.add(l2.get(j));
                j++;
        }
    }
    public static void main(String []args)
    {
        LinkedList<Integer> l1,l2;
        l1=new LinkedList<Integer>();
        l2=new LinkedList<Integer>();
        int n,m;
        System.out.println("Enter the size of first list : ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter elements in first list : ");
        for(int i=0;i<n;i++)
        {
            l1.add(sc.nextInt());
            sc.nextLine();
        }
        sc.nextLine();
        System.out.println("Enter the size of second list : ");
        m=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the element in second list : ");
        for(int i=0;i<m;i++)
        {
            l2.add(sc.nextInt());
            sc.nextLine();
        }


        LinkedList<Integer> res=new LinkedList<Integer>();
        mergeList.merge(l1,l2,res);
        System.out.println("First list is : ");
        for(Integer i:l1) System.out.print(i+" ");
        System.out.println("Second list is : ");
        for(Integer i:l2) System.out.print(i+" ");
        System.out.println("Resultant list is : ");
        for(Integer j:res) System.out.print(j+" ");
        System.out.println("END OF MAIN ....");

    }
}

