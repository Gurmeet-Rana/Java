import java.util.Scanner;

public class ArrayDemo
{

    void arrayFunc(int arr[],int target)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]+arr[j]==target)
                {
                    System.out.println(arr[i]+" + "+arr[j]+" = "+target);
                }
            }
        }
    }

    void arrayFunc(int arr[],int n1,int arr2[],int n2)
    {
            
    }

    public static void main(System [] args)
    {
        int n1,n2;
        int arr1[]=new int[n1];
        int arr2[]=new int[n2];

        
    }
}