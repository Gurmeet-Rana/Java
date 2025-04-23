/* Write a program MultiThreads that creates two threads-
one thread with the 
name CSthread and the other thread named ITthread. 
Each thread should 
display its respective name and execute after a gap of 

500  milliseconds.  Each  thread  should  also  display  a 
number indicating the number of times it got a chance to 
execute. 
 */

class ABC extends Thread
{
    public void run()
    {
        for(int i=0;true;i++)
        {
            try
            {
                this.sleep(500);
            }
            catch(InterruptedException e)
            {
                System.out.println(e.getMessage());
            }
            System.out.println(this.getName()+" THREAD i = "+i);
        }
    }
}
class XYZ extends Thread
{
    public void run()
    {
        for(int j=0;true;j++)
        {
            try
            {
                this.sleep(500);
            }
            catch(InterruptedException e)
            {
                System.out.println(e.getMessage());
            }
            System.out.println(this.getName()+" THREAD j= "+j);
        }
    }
}


public class MultiThreads {
    public static void main(String []args)
    {
        ABC CSthread = new ABC();
        XYZ ITthread = new XYZ();
        
        CSthread.setName("CSthread");
        ITthread.setName("ITthread");

        CSthread.start();   
       
        
        /* try
        {
            CSthread.join();
           // ITthread.join();            
        }
        catch(InterruptedException e)
        {
            System.out.println(e.getMessage());
        } */

        ITthread.start();
        /* try{
            ITthread.join();
        }
        catch(InterruptedException e)
        {
            System.out.println(e.getMessage());
        } */

        System.out.println("THIS IS THE REST OF THE CODE !! ");

    }
}
