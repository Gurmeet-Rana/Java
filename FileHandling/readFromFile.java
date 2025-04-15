import java.util.Scanner;
import java.io.*;
public class readFromFile {
    public static void main(String []args) throws FileNotFoundException,IOException
    {
        FileInputStream fis=new FileInputStream("myFile.txt");
        int ch;
        while((ch=fis.read())!=-1)
        {
            System.out.print((char)ch);
        }
        System.out.println();
        System.out.println("FILE HAS BEEN READ");
    }
}

many problems for which a greedy approach provides optimal solutions 