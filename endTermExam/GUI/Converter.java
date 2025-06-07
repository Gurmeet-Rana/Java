import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Converter extends JFrame implements ActionListener
{
    JTextField inputField;
    JRadioButton r1,r2;
   
    JButton Convert,Result;
    ButtonGroup bg;
    Converter()
    {
        setLayout(null);
        setTitle("cm to feet and feet to cm Converter");
        inputField=new JTextField();
        inputField.setBounds(70,10,300,20);
         add(inputField);
        
         
        r1=new JRadioButton("cm to ft");
         r1.setBounds(220,60,100,30);
        
        r2=new JRadioButton("ft to cm");
         r2.setBounds(220,90,100,30);
        bg=new ButtonGroup();
        bg.add(r1);
        bg.add(r2);    
        //add(bg);
        add(r1);
        add(r2);
        
        Convert=new JButton("Convert");
        Convert.setBounds(130,130,100,30);
        add(Convert);
        Convert.addActionListener(this);
        Result=new JButton("Result");
        Result.setBounds(50,180,300,30);
        add(Result);
        Result.addActionListener(this);             
        
    }

    public void actionPerformed(ActionEvent e)
    {
        try{
            int val=Integer.parseInt(inputField.getText());
            if(r1.isSelected())
            {
                String res=String.valueOf(val*30);
                inputField.setText(res);
            }
            else{
                String res=String.valueOf(val*0.3);
                inputField.setText(res);
            }
        }
        catch(NumberFormatException ex)
        {
            System.out.println(ex.getMessage());
        }
    }

    public static void main(String []args)
    {
        Converter obj=new Converter();
        obj.setVisible(true);
        obj.setSize(300,400);
    }
}
