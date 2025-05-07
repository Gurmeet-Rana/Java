import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class addEvent extends JFrame implements ActionListener {
    JTextField num1,num2,sum,subtract;

    public void actionPerformed(ActionEvent e)
    {
        int n1=Integer.parseInt(num1.getText());
        int n2=Integer.parseInt(num2.getText());
        int Sum=n1+n2;
        String n3=Integer.toString(Sum);
        sum.setText(n3);        
    } 

    public addEvent()
    {

        setLayout(new FlowLayout());

        JLabel l1=new JLabel("Enter first number : ");      
        add(l1);  
        num1=new JTextField(10);       
        add(num1);


        JLabel l2=new JLabel("Enter second number : ");
        add(l2);
        num2=new JTextField(10);
        add(num2);

        JButton l3=new JButton("ADD");
        add(l3);
        sum=new JTextField(10);
        add(sum);

        l3.addActionListener(this);

        JButton l4=new JButton("SUBTRACT");
        add(l4);
        subtract=new JTextField(10);
        add(subtract);

        l4.addActionListener(this);
    }
    public static void main(String[]args)
    {
        addEvent obj = new addEvent(); 
        obj.setVisible(true);
        obj.setSize(300,400);
    }
}
