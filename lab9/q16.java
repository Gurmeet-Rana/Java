/* Write a java program to accept and print the employee 
details during runtime. The details will include employee 
id, name, dept_ Id. The program should raise an 
exception  if  user  inputs  incomplete  or  incorrect  data. 
The entered value should meet the following conditions: 
 
(i) First Letter of employee name should be in capital 
letter. 
(ii) Employee id should be between 2001 and 5001 
(iii) Department id should be an integer between 1 and 
5. 
 
If the above conditions are not met then the application 
should raise specific exception else should complete 
normal execution */

import java.util.Scanner;

class EmployeeException extends Exception{
    EmployeeException(){};
    EmployeeException(String s)
    {
        super(s);
    }
}
public class q16 {
    public int empId,deptId;
    public String name;
   
    public q16(int id,int dptId,String name)
    {
        this.empId=id;
        this.deptId=dptId;
        this.name=name;        
    } 

    public void showDetails()
    {
        System.out.println("Name of the employee is : "+this.name);
        System.out.println("Employee id of "+this.name+" is "+this.empId);
        System.out.println("Department id of "+this.name+" is "+this.deptId);
    } 

    public static void main(String []args)
    {
       
        int choice;
        Scanner sc=new Scanner(System.in);
        System.out.println("Press 1 . Enter details 2. View Details ");
        q16 obj=null;
        do
        {
            choice=sc.nextInt();
            sc.nextLine();           
            switch (choice) {
                case 1:
                    int eId,dId;
                     
                    System.out.println("Enter your name : ");  
                           
                    String name=sc.nextLine();


                    System.out.println("Enter your employee id : ");
                    eId=sc.nextInt();
                    sc.nextLine();
                    
                    System.out.println("Enter your department id : ");
                    dId=sc.nextInt();
                    sc.nextLine();
                    

                    try
                    {
                        if(name.isEmpty() || !Character.isUpperCase(name.charAt(0)))
                        {
                            EmployeeException e = new EmployeeException("Name's first character is not Capital !");
                            throw e;
                        }
                        if(eId<2001 && eId>5001)
                        {
                            EmployeeException e=new EmployeeException("Employee is not in range [2001,5001]!! ");
                            throw e;
                        }
                        if(dId<1 || dId>5)
                        {
                            EmployeeException e=new EmployeeException("Department id is not in range [1,5]!!");
                            throw e;
                        }


                        obj=new q16(eId, dId, name);

                        System.out.println("Employee details successfully saved !!");                       

                    }
                    catch(EmployeeException e)
                    {
                        System.out.println(e.getMessage());
                    }                    

                    break;
                case 2:
                    try
                    {
                        if(obj==null)
                        {
                            EmployeeException e = new EmployeeException("Employee doesn't exists!");
                            throw e;
                        }
                        
                    }
                    catch(EmployeeException e)
                    {
                        System.out.println(e);
                    }
                    
                    obj.showDetails();                    

                    break;
                
                default:
                    break;
            }
        } while(choice<3);
    }

}
