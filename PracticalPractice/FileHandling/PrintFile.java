import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class PrintFile {
    public static void main(String []args) throws IOException,FileNotFoundException
    {
        /* FileReader fr=new FileReader("text.txt");
        
        BufferedReader br=new BufferedReader(fr);
        //CHARACTER BY CHARACETER 
        int ch;
        while((ch=br.read())!=-1)
        {
            System.out.print((char)ch);
        }

        // word by word 

        Scanner sc=new Scanner(fr);
        while(sc.hasNext())
        {
            System.out.println(sc.next());

        }
        sc.close();

        //line by line
        String word;
        while ((word=br.readLine())!=null) {
            System.out.println(word);
            System.out.print('\n');
        }

        br.close();

        fr.close(); */

        //BYTE STREAM 

        FileInputStream fis=new FileInputStream("text.txt");
        
        int ch;
        while ((ch=fis.read())!=-1) {
            System.out.print((char)ch);
        }

        fis.close();

        
    }
}
