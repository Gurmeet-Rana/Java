import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

public class readWrite {
    public static void main(String []args) throws IOException
    {
        FileInputStream fis=new FileInputStream("text.txt");
        BufferedInputStream bis=new BufferedInputStream(fis);

        FileWriter fw=new FileWriter("newFile.txt");
        BufferedWriter bw=new BufferedWriter(fw);

        int ch;
        while((ch=bis.read())!=-1)
        {
            bw.write(ch);
        }

        bw.close();
        fw.close();
        bis.close();
        fis.close();
    }   
}
