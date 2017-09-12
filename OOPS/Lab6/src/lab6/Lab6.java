/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

/**
 *
 * @author VIBHOR BANSAL
 */
import java.util.*;
class Account
{
       String name;
       int accnum;
       String acctype;
       double balance;
       Scanner sc=new Scanner(System.in);
       
       Account(){}
       void getData()
       {
           
           System.out.println("Enter name");
           name=sc.nextLine();
           System.out.println("Enter account number");
           accnum=sc.nextInt();
           System.out.println("Enter account type");
           acctype=sc.next();
           System.out.println("Enter original balance");
           balance=sc.nextDouble();
           
       }
       
      
}

class currentaccount extends Account
{
        void displaybalance()
        {
               if(balance<1000)
               {
                   double penalty=balance/100.0;
                   balance-=penalty;
                   System.out.println("Penalty="+penalty);
                   
               }
               System.out.println("Balance="+balance);
                   
        }
        
}
        
class savingsaccount extends currentaccount
{
    void interest()
    {   
        double interest=0;
        if(balance>10000)
            interest=balance/10.0;
        balance+=interest;
        System.out.println("Interest="+interest);
        
        
    }
    void withdraw()
    {
        System.out.println("Enter amount ");
        double amount=sc.nextDouble();
        balance-=amount;
    }
}
 class menu
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        savingsaccount obj=new savingsaccount();
        obj.getData();
        char ch;
        do{
            System.out.println("Enter 1 to check balance and 2 to withdraw money and 3 to check interest ");
            int choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                    obj.displaybalance();
                    break;
                    
                case 2:
                    obj.withdraw();
                    obj.displaybalance();
                    break;
                case 3:
                    obj.interest();
                    obj.displaybalance();
                    break;
                default:
                    System.out.println("Wrong choice");
                    
            }
            System.out.println("Continue operations? (y/n)");
            ch=sc.next().charAt(0);
            
        }while(ch=='y');
        
    }
}