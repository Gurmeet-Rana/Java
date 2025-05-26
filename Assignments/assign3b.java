/* Create a class MyBank with following details- 
private double balance  
public MyBank(double balance) // constructor 
public void deposit(double amount)// to deposit amount 
public void withdraw (double amount) // to withdraw 
public double getBalance() // to fetch the balance of account 
Create another class MyTransaction, which is a thread class with following details- 
private MyBank account // Data member 
private double amount // Data member 
private boolean flag // Data member, it will be true for deposit and false for withdraw 
public MyTransaction (MyBank account, double amount, boolean flag)// constructor 
Also override the run() method to call deposit() and withdraw() methods. 
Create main thread where- 
Create  an  object  of  Mybank  with  initial  balance  1000  Rs.  Also  create  two  threads  of 
MyTransaction  class  named  as  depositeThread  and  withdrawThread,  both  must  share  the 
same object of Mybank class.  
For deposit thread the flag value must be true and for withdraw thread it must be false. Ex- 
MyTransaction  depositThread=new  MyTransaction(account,500,true);//  500  amount  to  be 
deposited 
MyTransaction withdrawThread=new MyTransaction(account,200,true);// 200 amount to be 
withdrawn 
Write  your  program  in  such  a  way  that,  threads  can  call  deposit  and  withdraw  methods  in 
any order but the final balance of account will be consistent. You must input the deposit and 
withdrawing amount from user.   
Note: Provide the output for at least five different inputs */

public class assign3b {
    
}
