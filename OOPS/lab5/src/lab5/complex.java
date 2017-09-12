/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

/**
 *
 * @author student
 */
public class AddOverload {
    public void add(double a1,double a2, double b2)
    {
        double sum=a1+a2;
        System.out.println("real part is"+sum+"imaginary part is"+ b2+"i");
    }
    public void add(double c1, double c2,double d1, double d2)
    {
        double real=c1+d1;
        double imaginary=c2+d2;
        System.out.println("real part is"+real+"imaginary part is"+imaginary+"i");
    }
    public static void main(String[] args) {
        AddOverload obj= new AddOverload();
        obj.add(2.0,3.0,7.0);
        obj.add(5.0,1.0,1.5,1.7);
    }
    
    
    
}
