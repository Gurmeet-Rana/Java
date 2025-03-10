import java.util.Scanner;
public class sixth {
    public static void sortNegatives(int arr[],int n)
    {
        int i=0,j=n-1;
        while(i<j)
        {
            if(arr[i]>0 && arr[j]<0)
            {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;                
            }
            i++;
            j--;
                     
        }
    }
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in); 
        int n;
        System.out.println("Enter the size of array : ");
        
        n=sc.nextInt();
        int arr[]=new int[n];

        System.out.println("Enter the values in the array : ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        } 
          n=arr.length;
        sortNegatives(arr,n);
        System.out.println("The sorted array is : ");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("Exiting the program....");
    }    
}
