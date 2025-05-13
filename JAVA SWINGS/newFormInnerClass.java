import java.awt.*;
import javax.swing.*;

import java.awt.event.*;

import java.awt.event.*;

public class newFormInnerClass extends JFrame{

    JTextField name,age;
    JTextArea res;

    JRadioButton r1,r2;
    JButton btn;

    boolean gender;

    public class ItemEvnt implements ItemListener
    {
        public void itemStateChanged(ItemEvent e)
        {
            boolean male=r1.isSelected();
            if(male) 
            {
                res.setBackground(new Color(100,200,40));
                gender=true;
            }
            else 
            {
                gender=false;
                res.setBackground(new Color(150,200,80));
            }
        }
    }


    public class ActionEvnt implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            int ag=Integer.parseInt(age.getText());
            String salutation;
            if(gender)
            {
                salutation="Mr.";
            }
            else
            {
                if(ag<18)
                {
                    salutation="Miss";
                }
                else
                {
                    salutation="Mrs.";
                }
            }

            if(ag<18)
            {
                res.setText("Sorry ! "+salutation+name.getText()+" You are not eligible to vote !");
            }
            else
            {
                res.setText(salutation+name.getText() +" you can Vote!");
            }

        }
    }

    
    public newFormInnerClass()
    {
        FlowLayout layout=new FlowLayout();
        layout.setHgap(500);
        layout.setVgap(10);
        setLayout(layout);

        JLabel l1=new JLabel("Name ");
        add(l1);

        name=new JTextField(10);
        add(name);

        JLabel l2=new JLabel("Age ");
        add(l2);

        age=new JTextField(10);
        add(age);

        JLabel l3=new JLabel("Category ");
        add(l3);

        ButtonGroup bg=new ButtonGroup();
        r1=new JRadioButton("Male");
        r1.addItemListener(new ItemEvnt());
        bg.add(r1);
        r2=new JRadioButton("Female");
        r2.addItemListener(new ItemEvnt());
        bg.add(r2);
        add(r1);
        add(r2);

        btn=new JButton("Vote");   
        btn.addActionListener(new ActionEvnt()); 
        add(btn);           

        JLabel l4=new JLabel("Remark ");
        add(l4);
        res=new JTextArea(20,40);
        add(res);
    }


    public static void main(String []args)
    {
        newFormInnerClass obj=new newFormInnerClass();
        obj.setSize(300,400);
        obj.setVisible(true);
    }
}
