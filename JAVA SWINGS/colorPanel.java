import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class colorPanel extends JFrame
{
    JPanel jp;
    JScrollBar r,g,b;

    public class InnerClass implements AdjustmentListener
    {
        public void adjustmentValueChanged(AdjustmentEvent e)
        {
            jp.setBackground(new Color(r.getValue(),g.getValue(),b.getValue()));
        }
    }

    public colorPanel()
    {

        FlowLayout layout=new FlowLayout();
        
        setLayout(layout);

        jp=new JPanel();
        jp.setPreferredSize(new Dimension(50,50));

        add(jp);

        r=new JScrollBar(JScrollBar.HORIZONTAL,0,0,0,255);
        add(new JLabel("Red "));
        add(r);
        r.addAdjustmentListener(new Inner());

        g=new JScrollBar(JScrollBar.HORIZONTAL,0,0,0,255);
        add(new JLabel("Green "));
        add(g);
        g.addAdjustmentListener(new Inner());

        b=new JScrollBar(JScrollBar.HORIZONTAL,0,0,0,255);
        add(new JLabel("Blue "));
        add(b);
        b.addAdjustmentListener(new Inner());
        
    } 
    public static void main(String []args)
    {
        colorPanel obj=new colorPanel();
        obj.setVisible(true);
        obj.setSize(300,400);
    }
}
