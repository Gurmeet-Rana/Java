import java.awt.*;
import javax.swing.*;
public class components extends JFrame {
    public components()
    {
        JLabel JB=new JLabel("Name : ");
        FlowLayout fl=new FlowLayout();
        fl.setHgap(200);
        fl.setVgap(100);
         
        setLayout(fl);
        
        add(JB); 

        JTextArea jta=new JTextArea(2,10);  //SCROLLABLE TEXT AREA 
        JScrollPane jpa=new JScrollPane(jta);         
        add(jpa);
        jpa.setLocation(100,50);
        JLabel state=new JLabel("Enter your state : ");
        add(state);

        System.out.println();
       
        String s[]={"UTTAR PRADESH","UTTARAKHAND","KASHMIR","POK","COK"};
        JComboBox jcb=new JComboBox<>(s);
        add(jcb);

        JLabel gender=new JLabel("Select your gender : ");
        add(gender);

        JRadioButton male=new JRadioButton("Male");
        JRadioButton female=new JRadioButton("Female");
        ButtonGroup bg=new ButtonGroup();
        bg.add(male);
        bg.add(female);
        add(male);
        add(female);

        JLabel education=new JLabel("Enter your education : ");
        add(education);

        DefaultListModel<String> dll=new DefaultListModel<>();
        dll.addElement("B.TECH CSE");
        dll.addElement("B.TECH ECE");
        dll.addElement("MASTERS");

        JList<String> list=new JList<>(dll);
        add(list);

        JButton button=new JButton("Submit");
        add(button);
    }

    public static void main(String []args)
    {
        components c=new components();
        c.setVisible(true);
        c.setSize(300,400);
    }
}
