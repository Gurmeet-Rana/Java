import java.awt.*;
import javax.swing.*;

public class drawing extends Canvas
{ 
    public void paint(Graphics g) // GRAPHICS IS THE PART OF AWT , 
    {
        setBackground(Color.red);
        setForeground(Color.green);
        g.drawString("Hello java",150,200);
        g.drawLine(50,80,200,300);
       // g.drawOval(150,160,200,100);
        g.fillOval(150,160,200,100);
        g.drawArc(150,160,300,100,0,90);
        g.fillArc(150,160,300,100,0,90);

        g.fillRect(100,150,100,200);

        // DRAWING A POLYGON 
        int x[]={20,35,50,65,80,95};
        int y[]={60,105,105,110,95,95};

        g.fillPolygon(x, y, 6);

        

    }
    public static void main(String []args)
    {
        drawing obj = new drawing();
        JFrame f=new JFrame(); // CLASS INSIDE SWING
        f.add(obj);
        f.setSize(300,400); 
        f.setVisible(true);
    }

}
