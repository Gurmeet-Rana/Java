import java.io.*;
import java.util.*;

public class Read {
    public static void main(String []args) throws FileNotFoundException,IOException
    {
        Scanner sc=new Scanner(System.in);

        FileInputStream fis=new FileInputStream("temp.txt");
       /*  
        READ CHARACTER BY CHARACTER
       
       int ch;
        while((ch=fis.read())!=-1)
        {
            System.out.print((char)ch);
        } */
        BufferedReader br=new BufferedReader(new InputStreamReader(fis));
        String str;
        while((str=br.readLine())!=null)
        {
            System.out.println(str);
        }       
       
        fis.close();
            br.close();
    }
}
