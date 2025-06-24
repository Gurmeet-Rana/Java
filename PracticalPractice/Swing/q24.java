import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.concurrent.Flow;
public class q24 extends JFrame implements ActionListener 
{
    JButton b1,b2,b3;
    JTextField tf1,tf2;
    public void actionPerformed(ActionEvent e)
    {
        //e.getActionCommand
        if(e.getSource()==b1)
        {
            tf1.setText("");
            tf2.setText("");
        }
        else if(e.getSource()==b2)
        {
            int count=0;
            String str=tf1.getText();
            for(int i=0;i<str.length();i++)
            {
                char c=str.charAt(i);
                if(c=='a' || c=='i'||c=='e'||c=='o'||c=='u')
                {
                    count++;
                }
            }
            String ans=Integer.toString(count); // String.valueOf(datatype);
            tf2.setText(ans);
        }
        else
        {
            System.exit(5);
        }
    }
    public q24()
    {
        FlowLayout l=new FlowLayout();
        l.setHgap(500);
        l.setVgap(100);
        setLayout(l);
        JLabel l1=new JLabel("Enter String : ");
        add(l1);
        tf1=new JTextField(20);
        add(tf1);

        JLabel l2=new JLabel("Result : ");
        add(l2);
        tf2=new JTextField(20);
        add(tf2);

        b1=new JButton("Reset");
        add(b1);
        b1.addActionListener(this);
        b2=new JButton("Count Vowel");
        add(b2);
        b2.addActionListener(this);
        b3=new JButton("Exit");
        add(b3);
        b3.addActionListener(this);
    }
    public static void main(String []args)
    {
        q24 obj=new q24();
        obj.setVisible(true);
        obj.setSize(300,400);
    }
}