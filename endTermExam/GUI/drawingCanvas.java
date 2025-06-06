import java.awt.*;
import javax.swing.*;

public class drawingCanvas extends Canvas
{
    public void paint(Graphics g)
    {       
       g.setColor(Color.RED);
        g.fillRect(140, 100,340 , 300);
        g.fillRect( 120 , 140 , 20, 100);
        g.fillRect( 480, 140, 20, 100);

        g.fillOval(240, 250, 50, 20);

        g.setColor(Color.BLACK);
        g.drawRect(140, 100, 340, 300);
        g.drawRect(120, 140, 20, 100);
        g.drawRect(480, 140, 20, 100);
        g.drawOval(240, 250, 50, 20);
    }
    public static void main(String []args)
    {
        drawingCanvas obj=new drawingCanvas();
        JFrame jf=new JFrame();
        jf.add(obj);
        jf.setVisible(true);
        jf.setSize(300,400);
    }
}
