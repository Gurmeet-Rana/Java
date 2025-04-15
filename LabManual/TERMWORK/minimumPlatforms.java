/* We are given two arrays that represent the arrival and departure times of trains, the task 
is to find the minimum number of platforms required so that no train waits */

import java.util.Scanner;
import java.util.Arrays;
public class minimumPlatforms {

    static int count(int arr[][],int n)
    {
        Arrays.sort(arr,(a,b) -> Integer.compare(a[0], b[0]) );
        int minPlatform=1,end=arr[0][1];
        for(int i=1;i<n;i++)
        {
            int start=arr[i][0];
            if(start>=arr[i-1][0] && start<=end)
            {
                minPlatform++;
            }
            if(arr[i][1]>end)
            {
                end=arr[i][1];
            }
        }
        return minPlatform;
    }
    public static void main(String []args)
    {
        Scanner sc= new Scanner(System.in);
        int m;
        System.out.println("Enter the number of rails : ");
        m=sc.nextInt();
        sc.nextLine();
        int arr[][]=new int [m][2];
        for(int i=0;i<m;i++)
        {
            System.out.println("Enter the start time of your rail :  ");
            int start=sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the end time of your rail : ");
            int end=sc.nextInt();
            sc.nextLine();
        } 

        System.out.println("Minimum number of platforms needed = "+minimumPlatforms.count(arr,m));

    }
}
