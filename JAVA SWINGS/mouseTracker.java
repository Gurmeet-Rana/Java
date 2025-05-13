import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// I WANT THE COORDINATES OF MOUSE TO BE DISPLAYED ON LAYOUT DEMONSTRATING ADAPTER CLASSES 
public class mouseTracker extends JFrame
{
    JTextArea res;

    class MyMouseMotionAdapter extends MouseMotionAdapter
    {
        public void mouseMoved(MouseEvent e)
        {
            res.setText("X : "+e.getX()+" Y :"+e.getY());
        }
    }
    public mouseTracker()
    {
        setLayout(new FlowLayout());
        JLabel l1=new JLabel("Mouse Coordinates : ");
        add(l1);        
        res=new JTextArea(2,20);
        add(res);

        addMouseMotionListener(new MyMouseMotionAdapter());
    }
    public static void main(String []args)
    {
        mouseTracker obj=new mouseTracker();
        obj.setVisible(true);
        obj.setSize(300,400);
    }
}
