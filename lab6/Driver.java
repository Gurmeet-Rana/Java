import java.util.Scanner;

abstract class Shape
{     
    abstract public int rectangleArea(int l,int b);
    abstract public double circleArea(int r);
    abstract public int squareArea(int s);       
}

class Area extends Shape
{
    Area(){}
    public int rectangleArea(int l,int b)
    {
        return l*b;
    }

    public double circleArea(int r)
    {
        return 3.14*r*r; 
    }

    public int squareArea(int s)
    {
        return s*s;
    }
    
}

public class Driver {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);

        Shape s=new Area();

        int choice=0;
        System.out.println("Press\n1. Calculate Reactangle Area\n2. Calculate Circle Area\n3. Calculate Square Area\n4. EXIT");

        do
        {
            choice=sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the length and the breadth of the rectangle : ");
                    int l=sc.nextInt(),b=sc.nextInt();
                    System.out.println(("Area of Reactangle with length = "+l+" And Breadth = "+b+" is "+s.rectangleArea(l, b)));
                    
                    break;
                
                case 2 : 
                    System.out.println("Enter the radius of the circle : ");
                    int radi=sc.nextInt();
                    System.out.println("Area of Circle with radius = "+radi+" is "+s.circleArea(radi));    
                    break; 
                
                case 3:
                    System.out.println("Enter the side length of the square : ");

                    int side=sc.nextInt();
                    System.out.println("Area of the square with side length "+side+" is "+s.squareArea(side));
                    break;
                case 4 : 
                    System.out.println("EXITING THE PROGRAM.....");    
                default:
                    break;
            }
        }
        while(choice!=4);

        sc.close();
    }
}
