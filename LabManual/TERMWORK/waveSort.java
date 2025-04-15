/* Given an unsorted array of integers, sort the array into a wave array. An array arr[0..n-1] 
is sorted in wave form if: 
arr[0] >= arr[1] <= arr[2] >= arr[3] <= arr[4] >= ..... 
 */
import java.util.Scanner;
import java.util.Arrays;
public class waveSort {
    public static void main(String []args)
    {
        int n;
        System.out.println("Enter the size of the array : ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the values in this array : ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        //Arrays.sort(arr);

        for(int i=0;i<n-1;i+=2)
        {
            if(i%2==0)
            {
                if(arr[i]<arr[i+1])
                {
                    int temp=arr[i+1];
                    arr[i+1]=arr[i];
                    arr[i]=temp;
                }                
            }
            else
            {
                if(arr[i]>arr[i+1])
                {
                    int temp=arr[i];

                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }

        System.out.println("Array after sorting in wave form : ");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }

        System.out.println("EXITING THE PROGRAM.....");

    } 
}
