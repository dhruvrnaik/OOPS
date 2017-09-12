/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

/**
 *
 * @author student
 */
class Bank{
    int getRateofInterest(){
        return 2;
    }
}
class SBI extends Bank{
    int getRateofInterest(){
        return 7;
    }
}
class ICICI extends Bank{
    int getRateofInterest(){
        return 8;
    }
}

class Axis extends Bank{
    int getRateofInterest(){
        return 9;
    }
}

public class Banktest {
    public static void main(String[] args) {
    Bank b;
    Bank z = new Bank();
    int x=1;
    
    if(x==1)
        z = new SBI();
    else if(x==2)
        z = new ICICI();
    else if(x==3)
        z = new Axis();
    
    System.out.println(z.getRateofInterest());
    
    }
}
