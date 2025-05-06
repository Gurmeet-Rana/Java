import java.io.*;
import java.util.Scanner;

class Temp
{
    public synchronized void writeToFile(FileOutputStream fos) throws InterruptedIOException, FileNotFoundException
    {
        String line=sc.nextLine();
        int i=0;
        char ch;
        while(i<line.length())
        {
            fos.write(line.charAt(i));
            i++;
        }
    }
    public synchronized void readFromFile(FileInputStream fis) throws InterruptedException , FileNotFoundException
    {
        char ch;
        while((ch=fis.read())!=null)
        {
            System.out.print(ch);
        }
    }
}

class A extends Thread
{
    FileInputStream fis;
    Temp obj;
    A(FileInputStream fis,Temp obj)
    {
        this.obj=obj;
        this.fis=fis;
    }
    public void run()
    {
        obj.writeToFile(fis);
    }
}

class B extends Thread
{
    FileOutputStream fos;
    Temp obj;
    A(FileOutputStream fos,Temp obj)
    {
        this.obj=obj;
        this.fos=fos;
    }
    public void run()
    {
        obj.readFromFile(fos);
    }
}


public class File {
    public static void main(String args[])
    {
        FileOutputStream fos=new FileOutputStream("Sample.txt");
        Temp obj=new Temp();
        A t1=new A(fos, obj);
        B t2=new B(fos,obj);
        t1.setName("WRITER");
        t2.setName("READER");
        t1.start();
        t2.start();
        try
        {
            t1.join();
            t2.join();
        }         
        catch(InterruptedException e)
        {
            System.out.println(e.getMessage());
        }

        System.out.println("REST OF THE CODE !! ");
    }
}
