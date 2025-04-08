import java.util.Scanner;

class Data
{
    public String name;
    public int votes;
    float percentVotes;
    public static int instanceCnt;
    static{
        instanceCnt=0;
    }
    public Data(String name,int votes,float d)
    {
        this.name=name;
        this.votes=votes;
        this.percentVotes=d;
        instanceCnt++;
    } 
    public static void show()
    {
        System.out.println("NUMBER OF INSTANCE CREATED  = "+instanceCnt);
    }
    @Override
    public String toString() {
        return "Candidate: " + name + ", Votes: " + votes + ", Percentage: " + percentVotes + "%";
    }
}

public class q1 {
    
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter number of data : ");
        n=sc.nextInt();
        sc.nextLine();
        Data arr[]=new Data[n];
        for(int i=0;i<n;i++) arr[i]=null;
        int totalVotes=100;
        int j=-1;
        for(int i=0;i<n;i++)
        {
            String name;
            int votes;
            System.out.println("Enter the name : ");
            name=sc.nextLine();
            
            System.out.println("Enter the votes : ");
            votes=sc.nextInt();
            sc.nextLine();
            totalVotes+=votes;
            float temp=(votes/totalVotes)*100;
            if(j==-1 ||  temp>arr[j].percentVotes)
            {
                j=i;
            }
            arr[i]=new Data(name, votes,temp);
        }

        Data.show();

        System.out.println(arr[j].toString()+" IS THE WINNER "+j);
        
    }
}
