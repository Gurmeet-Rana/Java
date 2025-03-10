/* Create  a abstract  Base Class    Temperature 
Data members: 
double temp; 
Method members: 
void setTempData(double) 
abstact void changeTemp() 
 
Sub Class Fahrenheit      (subclass of Temperature) 
Data members: 
double ctemp; 
method member: 
Override abstract method  changeTemp() to convert 
Fahrenheit temperature into degree Celsius by using 
formula C=5/9*(F-32) and display converted 
temperature 
 

Sub Class Celsius                  (subclass of 
Temperature) 
Data member: 
double  ftemp; 
Method member: 
Override abstract method changeTemp() to convert 
degree Celsius into Fahrenheit temperature  by using  
formula F=9/5*c+32 and display converted temperature
  */

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
        System.out.println("Temperture = "+ctemp+" Degree Celsius");
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
        System.out.println("Temperature = "+ftemp+" Degree Fahrenheit");
    }
}

public class TemperatureMain
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);  
         

        int choice=0;
        System.out.println("Press\n1. Change temperature to degree Fahrenheit \n2. Change temperature to degree Celsuis\n3. EXIT");

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

        System.out.println("EXITING THE PROGRAM....");

        sc.close();

    }
}
