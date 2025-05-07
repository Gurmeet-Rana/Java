import java.awt.*;
import java.awt.event.*; // FOR ACTION LISTENER OR FOR ANY LISTENER . 

import javax.swing.*;

public class student extends JFrame implements ActionListener{ //ACTION LISTENER IS INTERFACE

    
    JTextField fName,fLastName,tSubmit;
    public void actionPerformed(ActionEvent e)
    {
        tSubmit.setText(fName.getText()+fLastName.getText());
    }

    public student()
    {
        JLabel firstName=new JLabel("First name : ");
        FlowLayout layout=new FlowLayout();
        layout.setVgap(60);
        layout.setHgap(500);
        setLayout(layout);
        add(firstName);

        fName=new JTextField(10);
        add(fName);

        JLabel lastName=new JLabel("Last Name : ");
        add(lastName);
        
        fLastName=new JTextField(10);
        add(fLastName);

        JLabel res=new JLabel("RESULT : ");
        add(res);

        tSubmit=new JTextField(10);
        add(tSubmit);

        JButton submit=new JButton("Concat");
        add(submit);

        //JTable 
        //JScrollBar sb3=new JScrollBar(JScrollBar.HORIZONTAL,50,15);
        /* String data[][]={{"101","Amit","76000"},
                        {"102","Raju","84834"},
                    {
                        "103","kalu","12345"
                    }    };
        String column[]={"ID","NAME","SALARY"};
        JTable t=new JTable(data,column);
        JScrollPane sp=new JScrollPane(t);
        add(sp);  */

        submit.addActionListener(this); //WHY THIS : ALSO IF YOU NOT OVERRIDE PUBLIC VOID ACTIONPERFORMED(ACTION EVENT E); 

        
        
    }
    public static void main(String []args)
    {
        student s=new student();
        s.setVisible(true);
        s.setSize(300,400);
    }
}
