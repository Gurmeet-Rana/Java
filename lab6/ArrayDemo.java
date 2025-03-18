import java.util.Scanner;


public class ArrayDemo
{  

    void arrayFunc(int arr[],int arr2[],int target,int n1,int n2)
    {
        for(int i=0;i<n1;i++)
        {
            int temp=target-arr[i];
            for(int j=0;j<n2;j++)
            {
                if(arr2[j]==temp)
                {
                    System.out.println(arr[i]+"+"+arr2[j]+" = "+target);
                }
            }
        }        
    }
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int n1,n2;
        System.out.println("Enter the size of first array : ");
        n1=sc.nextInt();
        System.out.println("Enter the size of second array : ");
        n2=sc.nextInt();
        int arr1[]=new int[n1];
        int arr2[]=new int[n2];
        
        System.out.println(("Enter values in first array : "));
        for(int i=0;i<n1;i++) arr1[i]=sc.nextInt();

        System.out.println("Enter values in second array : ");
        for(int i=0;i<n2;i++) arr2[i]=sc.nextInt();

        int targetSum;
        System.out.println("Enter the target Sum : ");
        targetSum=sc.nextInt();

        ArrayDemo obj=new ArrayDemo();

        obj.arrayFunc(arr1,arr2,targetSum,n1,n2);

        System.out.print("EXITING THE PROGRAM......");        
    }
}