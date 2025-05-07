import java.awt.*;
import javax.swing.*;

public class student extends JFrame {
    public student()
    {
        JLabel firstName=new JLabel("First name : ");
        FlowLayout layout=new FlowLayout();
        layout.setVgap(60);
        layout.setHgap(500);
        setLayout(layout);
        add(firstName);

        JTextField fName=new JTextField(10);
        add(fName);

        JLabel lastName=new JLabel("Last Name : ");
        add(lastName);
        
        JTextField fLastName=new JTextField(10);
        add(fLastName);

        JLabel res=new JLabel("RESULT : ");
        add(res);
        JTextField tfield=new JTextField(10);
        add(tfield);

        Button submit=new Button("Concat");
        add(submit);

        
    }
    public static void main(String []args)
    {
        student s=new student();
        s.setVisible(true);
        s.setSize(300,400);
    }
}
