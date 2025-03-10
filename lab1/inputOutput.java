/* WRITE A MENU - DRIVER PROGRAM TO CALC THE MATRURIT AMT : OF A DEPOSIT : 
    1. TERM DEPOSIT
    2. RECURSSSING DEPOSIT */


/* 
nextBoolena() = Used for reading Boolean value 
nextByte()  =  Used for reading Byte value
nextDouble() = Used for reading Double value
nextFloat() = Used for reading Float value
nextInt() = Used for reading Int value
nextLine() = Used for reading Line value
next() = Used for reading    
 */
import java.util.Scanner;
public class inputOutput {
    public static void main(String [] args)
    {
        //INPUT YOUR NAME 
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name : ");
        //TAKING INPUT USING SCANNER CLASS
        /* String name=sc.next(); DELEMITOR IS SPACE */
        String naam=sc.nextLine();
        System.out.println("YOUR NAME IS "+naam);
        System.out.println("Enter your semester : ");
        int rollNo=sc.nextInt();
        System.out.println("Your Rollnumber is : "+rollNo);
         
    }
}
