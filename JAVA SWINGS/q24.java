import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class q24 extends JFrame implements ActionListener {

    JTextField tf1,tf2;

    public void actionPerformed(ActionEvent e)
    {
        String s=e.getActionCommand();
        if(s=="COUNT VOWEL")
        {
            int count=0;
            String str=tf1.getText();
            for(int i=0;i<str.length();i++)
            {
                char ch=str.charAt(i);
                if(ch=='a' || ch=='e' ||  ch=='i' || ch=='o'|| ch=='u')
                {
                    count++;
                }
            }
            tf2.setText(Integer.toString(count));
        }
        else if(s=="RESET")
        {
            tf1.setText(" ");
            tf2.setText(" ");
        }
        else
        {
            System.exit(1);
        }
    }

    public q24()
    {
        FlowLayout layout = new FlowLayout();
        layout.setHgap(500);
        layout.setVgap(50);
        setLayout(layout);

        JLabel l1=new JLabel("Enter String ");
        add(l1);
        tf1=new JTextField(10);
        add(tf1);

        JLabel l2=new JLabel("Result ");
        add(l2);
        tf2=new JTextField(10);
        add(tf2);
        JButton countVowel=new JButton("COUNT VOWEL");
        add(countVowel);

        countVowel.addActionListener(this);

        JButton reset=new JButton("RESET");
        add(reset);
        reset.addActionListener(this);

        JButton exit=new JButton("EXIT");
        add(exit);
        exit.addActionListener(this);

    }
    public static void main(String args[])
    {
        q24 obj=new q24();
        obj.setVisible(true);
        obj.setSize(300,400);
    }
}
