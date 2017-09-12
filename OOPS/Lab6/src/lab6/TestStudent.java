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
class student {
    int regno;
    String name;
    int age;
    void disp(){
        System.out.println("Display of student");
    }
}

class UG extends student{
    double fees;
    int sem;
   
    @Override
    void disp(){
        System.out.println("UG fees:" + fees + " for sem "+sem);
    }
}

class PG extends student{
    double fees;
    int sem;
    void disp(){
        System.out.println("PG");
    }
}

public class TestStudent{
    public static void main(String[] args) {
        
        student s ;
        UG u = new UG();
        s=u;
        System.out.println(((UG)s).fees);
        
    }
}
