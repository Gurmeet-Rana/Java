import java.io.*;
import java.util.*;

public class Write {
    public static void main(String []args) throws FileNotFoundException,IOException
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        //BYTE STREAM 
        FileOutputStream fos=new FileOutputStream("temp.txt");
        byte b[]=str.getBytes();

        /*
        WRITE BYTE BY BYTE 
        for(byte i : b)
        {
            fos.write((char)i);
        } */
        fos.write(b);
        fos.close();

        //CHARACTER STREAM

        System.out.println("ENTER STRING TO ENTER : ");
        str=sc.nextLine();
        FileWriter fw=new FileWriter("temp.txt");

        fw.append(str);

        //fw.close();

        BufferedWriter bw=new BufferedWriter(fw);
        bw.write(str);
        bw.close();

        fw.close();
    }
}
