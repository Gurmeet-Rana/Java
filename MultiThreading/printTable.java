class Table
{
    public synchronized void pTable(int x)
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(x+" * "+i+" = "+i*x);
        }
        //System.out.println(Thread.getName()+" is finished ! ");
    }
}

class A extends Thread
{
    Table t;  //THIS IS CALLED AGGREGATION
    public A(Table t)
    {
        this.t=t;
    }
    public void run()
    {
        t.pTable(2);
    }
}   
class B extends Thread
{
    Table t;
    public B(Table t)
    {
        this.t=t;
    }
    public void run()
    {
        t.pTable(5);
    }
}   

public class printTable {
    public static void main(String []args)
    {
        Table t=new Table();
        A t1=new A(t);
        B t2=new B(t);

        t1.setName("CS Thread");
        t2.setName("IT Thread");

        t1.setPriority(10);
        t1.start();
        t2.start();
        
        System.out.println(t1.getName()+" priotiy = "+t1.getPriority());
        System.out.println(t2.getName()+" priotiy = "+t2.getPriority());
        
        System.out.println("EXITING THE PROGRAM !!");

    }
}
