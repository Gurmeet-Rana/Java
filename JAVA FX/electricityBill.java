import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class electricityBill extends JFrame implements ActionListener
{
    JButton b1,b2;
    JTextField bill,tax;
    JLabel l1,l2;
    JTextField tf1,tf2;
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            bill.setVisible(true);
            l1.setVisible(true);
            tf1.setVisible(true);

        }
        else
        {
            tax.setVisible(true);
            l2.setVisible(true);
            tf2.setVisible(true);
        }
    }
    public electricityBill()
    {
        FlowLayout layout=new FlowLayout();
        layout.setVgap(100);        
        layout.setHgap(150);
        setLayout(layout);
        b1=new JButton("Electricity Bill");
        add(b1);
        b1.addActionListener(this);

        l1=new JLabel("Unit : ");
        add(l1);
        l1.setVisible(false);

        JLabel l3=
        tf1=new JTextField(10);
        add(tf1);
        tf1.setVisible(false);


        bill=new JTextField(10);
        add(bill);
        bill.setVisible(false);

        b2=new JButton("Income Tax");
        add(b2);
        b2.addActionListener(this);
        


        l2=new JLabel("Income : ");
        add(l2);
        l2.setVisible(false);

        tf2=new JTextField(10);
        add(tf2);
        tf2.setVisible(false);

        tax=new JTextField(10);
        add(tax);
        tax.setVisible(false);
    }
    public static void main(String []args)
    {
        electricityBill obj=new electricityBill();
        obj.setSize(300,400);        
        obj.setVisible(true);
    }
}
