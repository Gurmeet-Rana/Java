import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Writing {
    public static void main(String []args) throws IOException
    {
        FileWriter fw=new FileWriter("text.txt");          
        BufferedWriter bw=new BufferedWriter(fw);
        // CHAR BY CHAR 
        String line="SHEELA";
        for(int i=0;i<line.length();i++)
        {
            char ch=line.charAt(i);
            bw.write(ch);
        }

        //word by word 
        line="SHEELA KI JAWANI";
        String words[]=line.split(" ");
        for(String word:words)
        {
            bw.write(word+" ");
        }
        
        String lines[]={"MY NAME IS GURMEET ","PURSUING B.TECH"};
        for(String l:lines)
        {
            bw.write(l);
            bw.newLine();
        }

        bw.close();
        fw.close();

        //BYTE STREAMS

        FileOutputStream fos=new FileOutputStream("text.txt");
        BufferedOutputStream bos=new BufferedOutputStream(fos);

        line="Hello Word";
        for(int i=0;i<line.length();i++)
        {
            bos.write((byte)line.charAt(i));
        }

        for(String word:words)
        {
            bos.write(word.getBytes());
            bos.write(' ');
        }

        for(String l:lines)
        {
            bos.write(l.getBytes());
            bos.write('\n');
        }

        bos.close();
        fos.close();
    }
}
