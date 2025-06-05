/* Write a class Display having void wish(String name) methods that wishes hello to given string name . B/w printing hello and and provided string name apply delay of 500 ms . Suppose multiple threads are there and they are trying to access this wish() method concurrently on same object then irregular output will be there . Write this application in sucha a way that output becomes regular .  */

import java.util.*;

class Display 
{
    public synchronized void wish(String name)
    {
        System.out.println("Hello , ");
        try{
            this.sleep(500);
        }
        catch(InterruptedException e)
        {
            System.out.println(e.getMessage());
        }

        System.out.println(name);
    }
}

class T1 extends Thread
{
    Display d;
    T1(Display d)
    {
        this.d=d;
    }
    public void run()
    {
        d.wish("ARJUN");
    }
}
class T2 extends Thread
{
    Display d;
    T2(Display d)
    {
        this.d=d;
    }
    public void run()
    {
        d.wish("ARJUN");
    }
}


public class Wish {
    public static void main(String []args)
    {
        Display d=new Display();

        T1 t1=new T1(d);
        T2 t2=new T2(d);

        t1.start();
        t2.start();

        System.out.println("EXITING THE PROGRAM----");
    }
}
