import java.util.Scanner;

interface volume {
    abstract void displayVolume();    
}

class Rectangle implements volume
{
    public void displayVolume()
    {
        System.out.println("Reactangle");
    }
}
class Square implements volume
{
    public void displayVolume()
    {
        System.out.println("Square");
    }
}
class Circle implements volume
{
    public void displayVolume()
    {
        System.out.println("Circle");
    }
}

public class question14 {
    public static void main(String [] args)
    {
        Rectangle s;
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
