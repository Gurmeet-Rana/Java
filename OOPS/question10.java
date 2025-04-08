import java.util.Scanner;

public class question10 {

    boolean isValid(String s) {


        if (s.isEmpty()) return false;


        s=s.trim();
        // Check if it ends with '.', '!', or '?'
        char lastChar = s.charAt(s.length() - 1);
        if (lastChar != '.' && lastChar != '!' && lastChar != '?') return false;

        // Check for only uppercase letters and spaces
        for (int i = 0; i < s.length() - 1; i++) { // Exclude last char (punctuation)
            char ch = s.charAt(i);
            if (ch != ' ' && (ch < 'A' || ch > 'Z')) {
                return false;
            }
        }

        return true;
    }
    private String strData;
    public question10(String str)
    {
        if(!isValid(str))
        {
            System.out.println("NOT VALID !!");
            strData=new String();
        }
        else{
            strData=str;
        }
    }

    int countWord()
    {
        String x[]=this.strData.split("\\s+");
        int count=0;
        
        for(String s:x)
        {
            System.out.println(s);
            count++;
        }
        
        
        return count;

    }

    boolean startswith(String s)
    {
        if(s.isEmpty()) return false;
        return s.charAt(0)=='a'||s.charAt(0)=='i'||s.charAt(0)=='e'||s.charAt(0)=='o'||s.charAt(0)=='u';
    }
    boolean endswith(String s)
    {
        if(s.isEmpty()) return false;
        return s.charAt(s.length()-1)=='a'||s.charAt(s.length()-1)=='i'||s.charAt(s.length()-1)=='e'||s.charAt(s.length()-1)=='o'||s.charAt(s.length()-1)=='u';
    }



    String placeWord()
    {
        StringBuffer start=new StringBuffer();
        StringBuffer end=new StringBuffer();
        String str[]=strData.split("\\s+");
        StringBuffer middle=new StringBuffer();

        for(String s:str)
        {
            if(startswith(s))
            {
                start.append(s).append(" ");
            }
            else if(endswith(s))
            {
                end.append(s).append(" ");
            }else
            {
                middle.append(s).append(" ");
            }
        } 
        start=start.append(middle).append(end);
        return start.toString();
    }
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=new String();
        System.out.println("Enter the stirng : ");
        str=sc.nextLine();
        question10 q=new question10(str);

        System.out.println(str+" has words = "+q.countWord());

        System.out.println(q.placeWord());
        

    }
}
