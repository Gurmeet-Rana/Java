import java.util.*;
public class Occurence {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str=sc.nextLine();
        int arr[]=new int[26];
        for(int i=0;i<26;i++) arr[i]=0;
        int maxi=0;
        char ans='@';
        for(char ch : str.toCharArray())
        {
            arr[ch-'a']++;
            if(maxi<arr[ch-'a'])
            {
                maxi=arr[ch-'a'];
                ans=ch;
            }
        }
        System.out.println("MOST OCCURING CHARACTER = "+ans);
    }

}
