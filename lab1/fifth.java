import java.util.Scanner;
public class fifth {
    public static void swap(int a,int b)
    {
        a=a^b;
        b=b^a;
        a=a^b;
    }
    
    void show(int arr[],int n)
    {
        for(int x:arr)
        {
            System.out.print(x+" ");
        }
    }

    void zigZagSort(int arr[],int n)
    {
        boolean flag=false;
        for(int i=0;i<n-1;i++)
        {
            if(flag)
            {
                if(arr[i+1]<arr[i])
                {
                    int temp=arr[i+1];
                    arr[i+1]=arr[i];
                    arr[i]=temp;
                }
            }
            else
            {
                if(arr[i+1]>arr[i])
                {
                    int temp=arr[i+1];
                    arr[i+1]=arr[i];
                    arr[i]=temp;
                }
            }
        }
    }
    public static void main(String [] args)
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        n=sc.nextInt();

        int arr[]=new int[n];

        System.out.println("Enter the values in the arrays : ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        fifth obj=new fifth();
        obj.zigZagSort(arr,n);

         
        System.out.println("Sorted array is :");
        obj.show(arr, n);
 
    } 
}

//TIMES NEW ROMAN , 12


//NAME , ROLL , SECTION
