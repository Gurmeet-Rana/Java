import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;
import java.util.concurrent.Flow;

import javax.swing.*;
public class MouseTracker extends JFrame implements MouseMotionListener
{
    JTextField tf1;

    class MyMouseMotionAdapter extends MouseMotionAdapter
    {
        public void mouseMoved(MouseEvent e )
        {
              int x=e.getX();
        int y=e.getY();
        tf1.setText("X= "+x+" Y = "+y);
        }
    } 

    public void mouseMoved(MouseEvent e)
    {
         int x=e.getX();
        int y=e.getY();
        tf1.setText("X= "+x+" Y = "+y);
    }
    public void mouseDragged(MouseEvent e)
    {
       
    }
    MouseTracker()
    {
        setLayout(new FlowLayout());
        tf1=new JTextField(30);
        add(tf1);
        addMouseMotionListener(new MyMouseMotionAdapter());
    }
    public static void main(String args[])
    {
        MouseTracker obj=new MouseTracker();
        obj.setVisible(true);
        obj.setSize(300,400);
    }
}
