/* Write a java file handling program to count and display 
the number of palindromes present in a text file 
"myfile.txt".  
Example:  If  the  file  "myfile.txt"  contains  the  following 
lines, 
My name is NITIN 
Hello aaa and bbb word 
How are You 
ARORA is my friend 
Output  will be => 4
 */

import java.io.*;
import java.util.Scanner;

public class palindromesInFile {
    static boolean isPalindrome(String str)
    {
        int i=0,j=str.length()-1;
        while(i<j)
        { 
            if(str.charAt(i)!=str.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
    public static void main(String []args) throws FileNotFoundException,IOException
    {
        Scanner sc=new Scanner(new File("myFile.txt"));
        int palindromeCnt=0;
        System.out.println("Palindromes word are : ");
        while(sc.hasNext())
        {
            String word=sc.next();
            if(palindromesInFile.isPalindrome(word))
            {
                palindromeCnt++;
                System.out.println(word);
            }
        }
        System.out.println("myFile.txt has "+palindromeCnt+" Palindromes in it !");
    }    
}
