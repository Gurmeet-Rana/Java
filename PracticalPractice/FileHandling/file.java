import java.io.*;
import java.util.*;
public class file
{
    public static void main(String []args) throws IOException
    {
        FileWriter fw=new FileWriter("text.txt");
        /* fw.write("Hello"); */
        BufferedWriter bw=new BufferedWriter(fw);
        /* fw.write("Gurmeet Rana"); */
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a line");
        String str=sc.nextLine();
        bw.write(str); 

        bw.close();
        fw.close();
    }
}