import java.io.*;

class CS
{
    String fileName;
    CS(String fileName)
    {
        this.fileName=fileName;
    }
    public synchronized void writeToFile() throws FileNotFoundException,IOException
    {
        FileWriter fw=new FileWriter(fileName);
        String str="My name is Gurmeet Rana.";
        BufferedWriter bw=new BufferedWriter(fw);
        bw.append(str);
    }
    public synchronized void readFromFile() throws FileNotFoundException,IOException
    {
        FileReader fr=new FileReader(fileName);
        BufferedReader br=new BufferedReader(fr);
        String content="h";
        while((content=br.readLine())!=null)
        {
            System.out.println(content);
        }
    }
}

class Thread1 extends Thread
{
    CS obj;
    Thread1(CS obj)
    {
        this.obj=obj;
    }
    public void run()  
    {
        System.out.println("IN --- "+this.getName());
        try{
            obj.writeToFile();
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }

    }
}

class Thread2 extends Thread
{
    CS obj;
    Thread2(CS obj2)
    {
        this.obj=obj2;
    }
    public void run() 
    {
        System.out.println("IN--- "+this.getName());
        try{
            obj.readFromFile();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}

public class FileOp {
    public static void main(String []args)
    {
        String fileName="text.txt";
        CS obj=new CS(fileName);

        Thread1 t1=new Thread1(obj);
        Thread2 t2=new Thread2(obj);
        
        t1.start();

        t2.start();

        System.out.println("EXITING--");
    }
}
