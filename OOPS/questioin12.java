import java.util.Scanner;

abstract class Shape
{
    abstract void displayShape();
}

class Rectangle extends Shape
{
    void displayShape()
    {
        System.out.println("RECTANGLE");
    }
}
class Square extends Shape
{
    void displayShape()
    {
        System.out.println("SQUARE");
    }
}
class Circle extends Shape
{
    void displayShape()
    {
        System.out.println("CIRCLE");
    }
}

public class questioin12 {
    public static void main(String [] args)
    {
        Shape s;
        int choice=0;
        Scanner sc=new Scanner(System.in);
         while (true) {
            System.out.println("1- rectange 2- sq 3- circle");
       
            choice=sc.nextInt();

            switch (choice) {
                case 1:
                    s=new Rectangle();
                    s.displayShape();
                    
                    break;
                case 2:
                    s=new Square();
                    s.displayShape();
                    
                    break;
                case 3:
                    s=new Circle();
                    s.displayShape();
                    
                    break;
                    case 4 : return;
            
                default:
                    break;
            }
        }

    }
}
