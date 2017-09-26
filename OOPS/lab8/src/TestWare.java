/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author student
 */
interface ware{
    void sales(int x);
}
class Hardware implements ware{
    String category;
    public void sales (int x){
        System.out.println("Sales for Hardware in 3 months:" + (x*3));
    }
}

class Software implements ware{
    String OS;
    String type;
    public void sales(int x){
        System.out.println("Sales for Software in 3 months: " + (3*x));
    }
}

public class TestWare {
    public static void main(String[] args) {
        
    
    Software s = new Software();
    s.OS = "Ubuntu";
    s.sales(12500);
    }
}
