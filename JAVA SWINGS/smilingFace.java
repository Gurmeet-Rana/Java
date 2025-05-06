import java.awt.*;
import javax.swing.*;


public class smilingFace extends Canvas 
{
    public void paint(Graphics g)
    {
        
        setForeground(Color.red);

        g.drawOval(195, 180, 30, 30);
        g.drawOval(280, 180, 30, 30);       

        g.drawOval(150, 150, 200, 200);

        g.drawArc(215,250,80,60,225,100);

    }   
    public static void main(String []args)
    {
        smilingFace obj=new smilingFace();
        JFrame f=new JFrame();
        f.add(obj);
        f.setSize(300,400);
        f.setVisible(true);
    } 
}
