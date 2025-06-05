import java.util.*;
import java.io.*;

public class ReadWord
{
    public static void main(String []args) throws FileNotFoundException,IOException
    {
        Scanner sc=new Scanner(new File("temp.txt"));
        String str;
        while(sc.hasNext())
        {
            System.out.println(sc.next());
        }
        System.out.println("EXITING---");
    }      
}
