import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class swingComponents extends JFrame
{
    swingComponents()
    {
        setLayout(null); //ABSOLUTE POSITIONING
        setTitle("Employee Details Form");

        JLabel fName=new JLabel("First Name : ");
        fName.setBounds(10,10,80,25);
        JTextField fNameText=new JTextField();
        fNameText.setBounds(90,10,100,25);

        JLabel sName=new JLabel("Second Name : ");
        sName.setBounds(200, 10, 100,25);
        JTextField sNameText=new JTextField();
        sNameText.setBounds(300,10,100,25);

        JLabel state=new JLabel("State : ");
        state.setBounds(410,10,40,25);

        String []states={"Uttar Pradesh","Delhi","Haryana","Punjab"};
        JComboBox<String> stateBox=new JComboBox<>(states);
        stateBox.setBounds(450,10,120,25);

        JLabel qualify=new JLabel("Qualification :");
        qualify.setBounds(500,10,80,25);

        JCheckBox q1=new JCheckBox("10th");
        q1.setBounds(580,10,80,25);
        JCheckBox q2=new JCheckBox("12th");
        q2.setBounds(710,10,50,25);
        JCheckBox q3=new JCheckBox("B.tech");
        q3.setBounds(760,10,70,25);

        JLabel dept=new JLabel("Department : ");
        dept.setBounds(10,50,80,25);
        JRadioButton r1=new JRadioButton("ME");
        r1.setBounds(100,50,50,25);
        JRadioButton r2=new JRadioButton("CSE");
        r2.setBounds(150,50,50,25);
        JRadioButton r3=new JRadioButton("ECE");
        r3.setBounds(200,50,50,25);

        ButtonGroup deptGroup=new ButtonGroup();
        deptGroup.add(r1);
        deptGroup.add(r2);
        deptGroup.add(r3);

        JLabel prfc=new JLabel("Proficiency Lavel : ");
        prfc.setBounds(270,50,120,25);
        JTextField p1=new JTextField(1);
        p1.setBounds(390,50,20,25);
        JTextField p2=new JTextField(1);
        p2.setBounds(415,50,20,25);
        JTextField p3=new JTextField(1);
        p3.setBounds(440,50,20,25);

        JLabel details=new JLabel("Employee Detqils ");
        details.setBounds(480,50,150,25);
        String []cols={"ID","NAME","SAL"};
        String [][] data=
        {
            {
                "1","raj","10"
            },
            {
                "2","Sham","20"
            }
        };

        JTable table= new JTable(data,cols);
        JScrollPane tablePane=new JScrollPane(table);
        tablePane.setBounds(400,90,350,100);

        add(fName);
        add(fNameText);
        add(sName);
        add(sNameText);
        add(state);
        add(stateBox);
        add(qualify);
        add(q1);
        add(q2);
        add(q3);
        add(dept);
        add(r1);
        add(r2);
        add(r3);
        add(prfc);
        add(p1);
        add(p2);
        add(p3);

        add(details);
        add(tablePane);

    }
    public static void main(String []args)
    {
        swingComponents obj=new swingComponents();
        obj.setVisible(true);
        obj.setSize(300,400);
    }
}
