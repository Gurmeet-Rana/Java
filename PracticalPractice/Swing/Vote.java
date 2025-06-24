import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;
public class Vote extends JFrame implements ActionListener,ItemListener
{
    JTextField tf1,tf2,tf3;

    JRadioButton r1,r2;
    boolean gender;
    JButton submit;
    public void itemStateChanged(ItemEvent e)
    {
        gender=r1.isSelected();
    }

    public void actionPerformed(ActionEvent e)
    {
        int age=Integer.parseInt(tf2.getText());     
        String salutation ;
        if(gender==true)
        {
            salutation="Mr.";
        }
        else
        {
            
            if(age>18)
            {
                salutation="Mrs";
            }
            else
            {
                salutation="Miss.";
            }
        }
        if(age<18)
        {
            tf3.setBackground(new Color(255,0,0));
            tf3.setText(salutation+tf1.getText()+" Is not allowed to Vote ");
        }
        else
        {
            tf3.setBackground(new Color(0,255,0));
            tf3.setText(salutation+tf1.getText()+" Can vote");
        }
    }
    Vote()
    {
        FlowLayout l =new FlowLayout();
        l.setHgap(50);
        l.setVgap(10);
        setLayout(l);

        JLabel l1=new JLabel("Enter name : ");
        add(l1);
        tf1=new JTextField(20);
        add(tf1);

        JLabel l2=new JLabel("Enter Age : ");
        add(l2);

        tf2=new JTextField(20);
        add(tf2);


        JLabel l3=new JLabel("Remark");
        add(l3);

        tf3=new JTextField(40);
        add(tf3);

        ButtonGroup bg=new ButtonGroup(); 
         r1=new JRadioButton("Male");
         r2=new JRadioButton("Female");
        bg.add(r1);
        bg.add(r2);
        r1.addItemListener(this);
        r2.addItemListener(this);
        add(r1);
        add(r2);
 
        submit=new JButton("Submit");
        submit.addActionListener(this);
        add(submit);
    }
    public static void main(String []args)
    {
        Vote v=new Vote();
        v.setVisible(true);
        v.setSize(300,400);
    }
}
