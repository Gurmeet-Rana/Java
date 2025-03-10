import java.util.Scanner;
public class WordExample
{
    public String strData;

    boolean isValid(String str)
    {
        char ch=str.charAt(str.length()-1);
        if(ch=='.' || ch=='?' || ch=='!')
        {
            for(int i=0;i<str.length()-1;i++)
            {
                if(!(str.charAt(i)==' ' || str.charAt(i)>='A' && str.charAt(i)<='Z'))
                {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public WordExample(String s)
    {
        if(isValid(s))
        {
            this.strData=s;
        }
        else
        {
            System.out.println("String is not valid .");
            this.strData=null;
        }         
    }

    int countWords()
    {
        if(strData==null)
        {
            return 0;
        }
        int n=strData.length();
        int count=1;
        
        int j=1;
        while(j<n)
        {
            if(strData.charAt(j)==' ' && strData.charAt(j-1)!=' ') count++;
            j++;
        }

        return count;
    }

    boolean isVowel(char ch)
    {
        return ch=='A'||ch=='I'|| ch=='E'|| ch=='O'|| ch=='U';
    }

    void placeWords()
    {
        if(strData==null) return ;
        String str1="",str2="";

        int i=0,j=1;
        int n = strData.length();
        while(j<n)
        {
            if(strData.charAt(j)==' ' && strData.charAt(j-1)!=' ')
            {
                if(isVowel(strData.charAt(i)))
                {
                    str1+=strData.substring(i,j)+" ";
                }
                else
                {
                    str2+=strData.substring(i,j)+" ";
                }
                i=j+1;
            }
            j++;
        }
        if(i!=n-1)
        {
            if(isVowel(strData.charAt(i)))
            {
                str1+=strData.substring(i,n-1);
            }
            else
            {
                str2+=strData.substring(i,n-1);
            }
            
        }
        strData=str1.trim()+" "+str2.trim()+ strData.charAt(n-1);
    }

    public String show()
    {
        return strData;
    } 

    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String str;
        System.out.println("Enter the string : ");
        str=sc.nextLine();
        WordExample wd=new WordExample(str);
        
        int choice=0;
        do
        {   
            System.out.println(("Press\n1. Count Words\n2. Place Words\n3. Show String\n4. EXIT"));
            choice=sc.nextInt();
            switch (choice) {
                case 1:
                    {
                        System.out.println(("Number of words are : "+wd.countWords())); 
                    }                    
                    break;
                case 2: 
                    {
                        wd.placeWords();
                    }
                    break;
                case 3:
                    {
                        System.out.println("String is "+wd.show()) ;
                    }    
                default:
                    break;
            }
        }while(choice!=4);

        sc.close();

        System.out.println("EXITING THE PROGRAM...");

    }

} 