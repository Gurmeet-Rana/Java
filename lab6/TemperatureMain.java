
import java.util.Scanner;

abstract class Temperature {
    public double temp;
    public void setTempData(double temp)
    {
        this.temp=temp;
    }

    abstract void changeTemp(double temp);
    abstract void showTemperature();
}

class Fahrenheit extends Temperature
{
    public double ctemp;
    public void changeTemp(double temp)
    {
        this.ctemp=(5.0/9.0)*(temp-32);
    }
    public void showTemperature()
    {
        String formattedValue1 = String.format("%.2f", ctemp);
        System.out.println("Temperture = "+formattedValue1+" Degree Celsius");
    }
}

class Celsius extends Temperature
{
    public double ftemp;
    public void changeTemp(double temp)
    {
        this.ftemp=(9.0/5.0)*temp+32;
    }
    public void showTemperature()
    {
        String formattedValue1 = String.format("%.2f", ftemp);
        System.out.println("Temperture = "+formattedValue1+" Degree Celsius");
    }
}

public class TemperatureMain
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);  
         

        int choice=0;
        System.out.println("Press\n1. Change temperature to degree Celsius \n2. Change temperature to degree Fahrenheit\n3. EXIT");

        double temp;
        Temperature t;

        do
        {
            choice=sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the temperature in Fahrenheit : ");

                    temp=sc.nextDouble();                 
                    
                    t=new Fahrenheit();
                    t.setTempData(temp);

                    t.changeTemp(temp);

                    t.showTemperature();

                    break;

                case 2:
                    
                    System.out.println("Enter temperature in Celsius : ");
                    temp=sc.nextDouble();

                    t=new Celsius();

                    t.setTempData(temp);

                    t.changeTemp(temp);

                    t.showTemperature();
                     
                     break;
                case 3 : 
                    System.out.println("Exiting the program....");
                    break;     
            
                default:
                    break;
            }
        }
        while(choice!=3);

        

        sc.close();

    }
}
