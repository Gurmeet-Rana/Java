import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
// NAME , AGE, RADIO BUTTON : GENDER MALE FEMALE , VOTE , REMARK
public class newForm extends JFrame implements ActionListener,ItemListener {

    
    JTextField name,age;
    JTextArea res;
    JButton btn;
    JRadioButton r1,r2;

    boolean gender;
    public void itemStateChanged(ItemEvent e)
    {
        if(r1.isSelected())
        {
            gender=true;
            res.setBackground(new Color(200,100,50));
        }
        else
        {
            gender=false;
            res.setBackground(new Color(100,200,50));
        }
    }

    public void actionPerformed(ActionEvent e)
    {
        int ag=Integer.parseInt(age.getText()); 
        String salutation;
        if(gender==true)
        {
            salutation="Mr.";
        }
        else
        {
            if(ag<18)
            {
                salutation="Miss ";
            }
            else
            {
                salutation="Mrs ";
            }
        }

        if(ag<18)
        {
            res.setText("Sorry "+salutation+name.getText()+ " You are not allowed to vote.");
        }
        else
        {
            res.setText(salutation+name.getText()+ " can vote!!");
        }
    }

    public newForm()
    {
         
        FlowLayout layout=new FlowLayout();
        layout.setVgap(10);
        layout.setHgap(400);
        setLayout(layout);
        
        JLabel l1=new JLabel("Name ");  //NAME
        add(l1);
        name=new JTextField(20);
        add(name);
        JLabel l2=new JLabel("Age ");  //AGE 
        add(l2);
        age=new JTextField(20);
        add(age);
        JLabel l3=new JLabel("Category ");
        add(l3);

        ButtonGroup bg=new ButtonGroup();  // GENDER 
       
        r1=new JRadioButton("Male ");         
        r1.addItemListener(this);
        
        r2=new JRadioButton("Female ");
        r2.addItemListener(this);

        bg.add(r1);
        bg.add(r2);

        add(r1);
        add(r2);
 
        btn=new JButton("Vote");  // VOTE BUTTON 
        btn.addActionListener(this);
        add(btn);

        JLabel l4=new JLabel("Remark"); 
        add(l4);
        res=new JTextArea(20,30);  // REMARK
        add(res);
    }
    public static void main(String args[])
    {
        newForm obj=new newForm();
        obj.setSize(300,400);
        obj.setVisible(true);
    }
}
