import java.io.*;
import java.util.*;
public class Append {
    public static void main(String []args) throws IOException
    {
        FileWriter fw=new FileWriter("text.txt",true);
        BufferedWriter bw=new BufferedWriter(fw);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a line : ");
        String line=sc.nextLine();
        bw.append(line);

        bw.close();
        fw.close();
    }
}
