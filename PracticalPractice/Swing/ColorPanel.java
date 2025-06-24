import java.awt.*;
import java.awt.event.*;
import java.util.concurrent.Flow;

import javax.swing.*;
public class ColorPanel extends JFrame 
{
    JScrollBar r,g,b;
    JPanel p;
    class MyAdjustmentListener implements AdjustmentListener
    {
        public void adjustmentValueChanged(AdjustmentEvent e)
        {
             p.setBackground(new Color(r.getValue(),g.getValue(),b.getValue()));
        }
    }
    ColorPanel()
    {
        setLayout(new FlowLayout());

        r=new JScrollBar(JScrollBar.HORIZONTAL,0,1,0,100);
        r.setPreferredSize(new Dimension(250,100));
        r.addAdjustmentListener(new MyAdjustmentListener());
        add(r);
        g=new JScrollBar(JScrollBar.HORIZONTAL,0,1,0,100);
        g.setPreferredSize(new Dimension(250,100));
        g.addAdjustmentListener(new MyAdjustmentListener());
        add(g);
        b=new JScrollBar(JScrollBar.HORIZONTAL,0,1,0,100);
        b.setPreferredSize(new Dimension(250,100));
        b.addAdjustmentListener(new MyAdjustmentListener());
        add(b);

        p=new JPanel();
        p.setPreferredSize(new Dimension(50,50));
        add(p);
    }
    public static void main(String []args)
    {
        ColorPanel cp=new ColorPanel();
        cp.setVisible(true);
        cp.setSize(300,400); 
    }
}
