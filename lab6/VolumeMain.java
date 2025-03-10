/* Write a java program to create an interface that consists of a method to display volume () as an abstract method 
and redefine this method in the derived classes to suit their requirements. Create classes called Cone, Hemisphere and Cylinder 
that implements the interface. Using these three classes,  design  a program  that  will  accept  dimensions 
of  a  cone,  cylinder  and  hemisphere  interactively  and display the volumes. 
Volume of cone = (1/3)πr2h Volume of hemisphere = (2/3)πr3 Volume of cylinder = πr2h */

import java.util.Scanner;


interface Volume {
    abstract void displayVolume();    
}

class Cone implements Volume
{
    public double volume;
    public void volumeCone(double r,double h)
    {
        this.volume=(1.0/3.0)*3.14*r*h;
    }
    public void displayVolume()
    {
        System.out.println("Volume of Cone = "+this.volume);
    }
}
class Cylinder implements Volume
{
    public double volume;
    public void volumeCylinder(double r,double h)
    {
        this.volume=r*3.14*r*h;
    }
    public void displayVolume()
    {
        System.out.println("Volume of Cylinder = "+this.volume);
    }
}
class Hemisphere implements Volume
{
    public double volume;
    public void volumeHemisphere(double r)
    {
        this.volume=(2.0/3.0)*3.14*r*r*r;
    }
    public void displayVolume()
    {
        System.out.println("Volume of Hemisphere = "+this.volume);
    }
}


public class VolumeMain {
    public static void main(String [] args)
    {
        int choice =0;
        System.out.println("Press\n1. Calculate Volume of Cone\n2. Calculate Volume of Hemisphere\n3. Calculate Volume of Cylinder\n4. EXIT");
        Scanner sc=new Scanner(System.in);

        double r,h;

        do
        {
            choice=sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the radius of the Cone : ");
                    r=sc.nextDouble();

                    System.out.println("Enter the height of the Cone : ");
                    h=sc.nextDouble();

                    Cone c=new Cone();

                    c.volumeCone(r, h);

                    System.out.println("Volume of Cone = "+c.volume);
                    
                    break;
                case 2:
                    System.out.println("Enter the radius of the Hemisphere : ");
                    r=sc.nextDouble();
                    
                    Hemisphere hemi=new Hemisphere();

                    hemi.volumeHemisphere(r);

                    System.out.println("Volume of Hemisphere = "+hemi.volume);
                    
                    break;
                case 3:
                    System.out.println("Enter the radius of the Cylinder : ");
                    r=sc.nextDouble();

                    System.out.println("Enter the height of the Cylinder : ");
                    h=sc.nextDouble();

                    Cylinder cy=new Cylinder();

                    cy.volumeCylinder(r, h);

                    System.out.println("Volume of Cylinder = "+cy.volume);
                    
                    break;
            
                default:
                    break;
            }
        }while(choice!=4);

        sc.close();

    }
}
