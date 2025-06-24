import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.Flow;

import javax.swing.*;
public class Student extends JFrame implements ActionListener{
    JTextField tf1,tf2,tf3;
    JButton b1;
    public void actionPerformed(ActionEvent e)
    {
        String str1=tf1.getText();
        String str2=tf2.getText();
        String res=str1+str2;
        tf3.setText(res);
    }
    Student()
    {
        FlowLayout l=new FlowLayout();
        l.setHgap(500);
        l.setVgap(100);
        setLayout(l);
        JLabel l1=new JLabel("First Name  ");
        add(l1);

        tf1=new JTextField(20);
        add(tf1);
        
        JLabel l2=new JLabel("Last Name ");
        add(l2);

        tf2=new JTextField(20);
        add(tf2);

        JLabel l3=new JLabel("Result : ");
        add(l3);

        tf3=new JTextField(20);
        add(tf3);

        b1=new JButton("Concat");
        add(b1);
        b1.addActionListener(this);

    }
    public static void main(String []args)
    {
        Student s=new Student();
        s.setVisible(true);
        s.setSize(300,400);
    }
}
