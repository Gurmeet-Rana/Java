/* Write a multithread based application, where one thread reads and shows all the palindromes 
and another shows length of every word written inside file.  
Note: The output must be consistent
 */
 
 import java.io.*;
 import java.util.*;
 class PalindromeThread extends Thread
 {
    private final String fileName;
    PalindromeThread(String fileName)
    {
        this.fileName=fileName;
    }
    public void run()
    {
        try
        {
            Scanner sc=new Scanner(new FileReader(fileName));
            while(sc.hasNext())
            {
                String word=sc.next();
                if(isPalindrome(word))
                {
                    System.out.println("Palindrome : "+word);
                }
            }
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
    private boolean isPalindrome(String word)
    {
        StringBuilder sb=new StringBuilder(word);
        return word.equalsIgnoreCase(sb.reverse().toString());
    }
 }
 class LengthThread extends Thread
 {
    private final String fileName;
    LengthThread(String fileName)
    {
        this.fileName=fileName;
    }
    public void run()
    {
        try(Scanner sc=new Scanner(new FileReader(fileName)))
        {
            while(sc.hasNext())
            {
                String word=sc.next();
                System.out.println("Length of "+word+" : "+word.length());
            }
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
 }
 
 public class assign3c {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        FileWriter fw = new FileWriter("temp.txt");

        System.out.println("Enter words (end with '@'): ");
        String word;
        while (!(word = sc.next()).equals("@")) {
            fw.write(word + " ");
        }
        fw.close();

        // Start both threads with same file
        String filename = "temp.txt";
        Thread t1 = new PalindromeThread(filename);
        Thread t2 = new LengthThread(filename);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("End of Program.");
    }
}