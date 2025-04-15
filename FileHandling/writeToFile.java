import java.util.Scanner;
import java.io.*;
public class writeToFile {
    public static void main(String [] args) throws FileNotFoundException,IOException
    {
        FileOutputStream fos=new FileOutputStream("myFile.txt");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string to enter in file !");
        String line=sc.nextLine();
        int i=0;
        int n=line.length();
        while(i<n)
        {
            fos.write(line.charAt(i));
            i++;
        } 
        fos.close();
    }
}
