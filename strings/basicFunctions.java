import java.util.Scanner;
import java.util.Arrays;

/* SUMMARY : 
-> STRING LITERALS OR NEW 
-> COMPARE : == REFERENCE
     s1.equals(s2) CONTENT
     s1.equalsIgnoreCase(s2) 
     str1.compareTo(str2) SUBTRACTS ASCII          
-> CONCATENATION : produces a new string 
-> substring , toUpperCase() , toLowerCase() , trim() , startsWith() , endsWith() , toCharArray(), valueOf(dataType)   
-> STRING BUFFER : Create modifiable string , Thread Safe , CONSTRUCTOR OVERLOADING : empty buffer of 16 capacity , With specified string , Buffer with specified length   
-> STRING BUFFER METHODS : append, insert(i,s), replace(start,end,str) , delete(start,end) , .reverse() , capacity() , charAt() , substring
-> 
-> 
-> 
*/

public class basicFunctions {
    StringBuffer replace(StringBuffer str) {
        int st;
        int end;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter starting pos : ");
        st = sc.nextInt();
        System.out.println("Enter the ending : ");
        end = sc.nextInt();
        sc.nextLine(); // Consume the newline left by nextInt()

        String s = ""; // Initialize s to an empty string
        System.out.println("Enter a string : ");
        s = sc.nextLine();

        return str.replace(st, end, s);
    }

    StringBuffer delete(StringBuffer str)
    {
        int st;
        int end;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter starting pos : ");
        st = sc.nextInt();
        System.out.println("Enter the ending : ");
        end = sc.nextInt();
        sc.nextLine(); // Consume the newline left by nextInt()

        return str.delete(st, end);
    }
    StringBuffer insert(StringBuffer str)
    {
        int st;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter starting pos : ");
        st = sc.nextInt();
       
        sc.nextLine(); // Consume the newline left by nextInt()

        String s=new String();
        System.out.println("Enter new string to insert : ");
        s=sc.nextLine();
        
        return str.insert(st, s);
        
    }

    StringBuffer sort(StringBuffer str)
    {
        char arr[]=str.toString().toCharArray();
        Arrays.sort(arr);

        str.setLength(0);
        str.append(arr);
        return str;
    }

    StringBuffer reverse(StringBuffer str)
    {
        return str.reverse();
    }
     
    StringBuffer delChar(StringBuffer str)
    {
        return str.deleteCharAt(0);
    }

    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("GURMEET RANA ");
        int choice;
        System.out.println("1. REPLACE\n 2. DELETE \n 3 . INSERT \n 4 SORT \n 5 REVERSE \n 6 DELETE CHARACTER \n 7 GET INDEX \n 8 GET LAST INDEX \n 9 GET LAST OCCURENCE\n:");
        Scanner sc = new Scanner(System.in);

        choice = sc.nextInt();
        basicFunctions bf = new basicFunctions();

        switch (choice) {
            case 1:
                System.out.println("FUNCTION RETURNS : " + bf.replace(str));

                System.out.println("ORIGINAL STRING IS : " + str);

                break;
            case 2 : 
                System.out.println("FUNCTIONS RETURNS : "+bf.delete(str));
                System.out.println("ORIGINAL STRING IS : " + str);    
                break;

            case 3 : 
            System.out.println("FUNCTIONS RETURNS : "+bf.insert(str));
            System.out.println("ORIGINAL STRING IS : " + str);
            break;

            case 4 : 
            System.out.println("FUNCTIONS RETURNS : "+bf.sort(str));
            System.out.println("ORIGINAL STRING IS : " + str);
            case 5 : 
            System.out.println("FUNCTIONS RETURNS : "+bf.reverse(str));
            System.out.println("ORIGINAL STRING IS : " + str);
            break;

            case 6 : 
            System.out.println("FUNCTIONS RETURNS : "+bf.delChar(str));
            System.out.println("ORIGINAL STRING IS : " + str);
            break;
             
            case 7 : 

            System.out.println("INDEX OF character = "+bf.getIndex(str));
            break;
            case 8 : 

            System.out.println("LAST INDEX OF character = "+bf.getLastIndex(str));
            break;

            case 9:
                
            System.out.println("LAST INDEX OF STRING = "+bf.toStr(str));
            break;
            case 10:
                
            System.out.println("SET CHARACTER = "+bf.toStr(str));
            break;


            default:
                break;
        }
        sc.close();
    }

    int getIndex(StringBuffer str)
    {
        Scanner sc=new Scanner(System.in);
        String ch=sc.nextLine();
        return str.indexOf(ch);
    }
    int getLastIndex(StringBuffer str)
    {
        Scanner sc=new Scanner(System.in);
        String ch=sc.nextLine();
        return str.indexOf(ch);
    }

    String toStr(StringBuffer str)
    {
        return str.toString(); 
    }

    String setCh(StringBuffer str)
    {
        str.setCharAt(7,'l');
        return str.toString();
    }

}