import java.util.Scanner;
 
public class second {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);       

        int choice;
        System.out.println("Enter :\n 1 to Term Deposit \n 2 to Recurring Deposit \n 3 to Exit");
        choice=sc.nextInt();

        do{
            switch (choice) {
                case 1:
    
                   {
                    float principal,rateOfInterest;
                    int timePeriod;
                    double maturityAmt;
    
                    System.out.println("Enter Principal Amount : ");       
                    principal=sc.nextFloat();
            
                    System.out.println("Enter the Rate Of Interest : ");
                    rateOfInterest=sc.nextFloat();
            
                    System.out.println("Enter the Time Period : ");
                    timePeriod=sc.nextInt();
    
                    maturityAmt=principal*Math.pow(1+0.01*rateOfInterest,timePeriod);
                    System.out.println("Maturity Amount is : "+maturityAmt);
                    break;
                   }
                case 2: 
                    {
                        
                        float monthlyInstallment,rateOfInterest;
                        int timePeriod;
    
                        System.out.println("Enter Monthly Installments : ");
                        monthlyInstallment=sc.nextFloat();
    
                        System.out.println("Enter Rate Of Interest : ");
                        rateOfInterest=sc.nextFloat();
    
                        System.out.println("Enter the Time Period : ");
                        timePeriod=sc.nextInt();
    
                        double maturityAmt;
                        maturityAmt=monthlyInstallment*timePeriod + monthlyInstallment*timePeriod*(timePeriod+1)/2*timePeriod/100*1/12;
    
                        System.out.println("Maturity Amt is :"+maturityAmt);
    
                    }
                default:
                    break;
            }
            System.out.println("Enter Choice : ");
            choice=sc.nextInt();
        }while(choice!=3);    

        System.out.println("Exiting the Program....");
    }
}
