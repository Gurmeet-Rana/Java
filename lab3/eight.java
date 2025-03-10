import java.util.Scanner; 
public class eight {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=new String();
        System.out.println("Enter the string :");
        str=sc.nextLine();
        System.out.println("You entered the string : "+str);
        int i=0,j=0;
        int n=str.length();
        int count=0;
        while(j<n)
        {
            while(j<n && str.charAt(j)=='1') j++;
            if(str.charAt(i)=='0' && j!=i)
            {
                String temp=str.substring(i,j+1);

                System.out.println(temp);

                count++;
                i=j;
            }
            j++;
        }
        System.out.println("There are "+count+" Patterns of kind 0(1+)0.");

        System.out.println("EXITING THE PROGRAM....");
    }
}
