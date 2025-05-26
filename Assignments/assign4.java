/* Create a Frame showing all relevant controls required when you are registering any student for the university. Once you will click on submit button, it will fetch the data and display in text area . 
*/

import javax.swing.*; 
import java.awt.*;
import java.awt.event.*;

public class assign4 extends JFrame implements ActionListener
{
    JTextField name,rollNumber,section,course;
    JButton btn;
    JTextArea result;

    public void actionPerformed(ActionEvent e)
    {
        result.setText("Name "+name.getText()+'\n'+"Course "+course.getText()+'\n'+"Section "+section.getText()+'\n'+"Roll Number "+rollNumber.getText());
    }


    public assign4()
    {
        setTitle("Student Registration Form :");
        setLayout(new FlowLayout());
        JLabel l1=new JLabel("Name ");
        add(l1);

        name=new JTextField(10);
        add(name);

        JLabel l2=new JLabel("Course ");
        add(l2);

        course=new JTextField(10);
        add(course);

        JLabel l3=new JLabel("Section ");
        add(l3);

        section =new JTextField(10);
        add(section);
        

        JLabel l4=new JLabel("Roll Number ");
        add(l4);
        rollNumber=new JTextField(10);
        add(rollNumber);

        btn=new JButton("Submit");
        
        btn.addActionListener(this);
        add(btn);

        result=new JTextArea(20,40);
        add(result);
    }
    public static void main(String []args)
    {
        assign4 obj=new assign4();
        obj.setVisible(true);
        obj.setSize(300,400);
    }
}
