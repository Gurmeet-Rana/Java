/* Write a class Display having void wish(String name) methods that wishes hello to given string name . B/w printing hello and and provided string name apply delay of 500 ms . Suppose multiple threads are there and they are trying to access this wish() method concurrently on same object then irregular output will be there . Write this application in sucha a way that output becomes regular . 
 */

import java.util.Scanner;
class Display {
    String name;
    Display(String name)
    {
        this.name=name;
    }
    public synchronized void wish()
    {
        System.out.print(" Hello - ");
        try
        {
            Thread.sleep(500);
        }
        catch(InterruptedException e)
        {
            System.out.println("ERROR : "+e);
        }
        System.out.println(name);
    }
}

class ABC extends Thread
{
    Display d;
    ABC(Display d)
    {
        this.d=d;
    }
    public void run()
    {
        System.out.print("From "+this.getName());
        d.wish();
    }
}
class XYZ extends Thread
{
    Display d;
    XYZ(Display d)
    {
        this.d=d;
    }
    public void run()

    {
        System.out.print("From "+this.getName());
        d.wish();
    }
}

public class Main
{
    public static void main(String []args)
    {
        Display d=new Display("ABC");
        ABC t1=new ABC(d);
        d=new Display("XYZ");
        XYZ t2=new XYZ(d);

        t1.setName("Thread 1");

        t2.setName("Thread 2");

        t1.start();
        try
        {
            t1.join();
        }
        catch(InterruptedException e )
        {
            System.out.println("ERROR : "+e);
        }

        t2.start();

        try
        {
            t2.join();
        }
        catch(InterruptedException e )
        {
            System.out.println("ERROR : "+e);
        }

        System.out.println("REST OF THE CODE !!");
    } 
}