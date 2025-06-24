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

import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;

public class Components {
    Components()
    {
        ButtonGroup bg=new ButtonGroup();  // ONLY ONE RBUTTON IS SELECTED
        JRadioButton r1=new JRadioButton("Male");
        JRadioButton r2=new JRadioButton("Female");  // ItemListener , itemStateChanged 
        bg.add(r1);
        bg.add(r2);
        add(r1);
        add(r2);
    }
    public static void main(String []args)
    {

    }
}
