/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import java.util.Scanner;
public class Employee {
    Scanner sc = new Scanner(System.in);
    String name;
    String city;
    double basic;
    double da;
    double hra;
    double total;
    void getdata(){
        System.out.println("Enter Name & City");
        name = sc.next();
        city = sc.next();
        System.out.println("Enter basic,da and hra");
        basic = sc.nextDouble();
        da = sc.nextDouble();
        hra = sc.nextDouble();
    }
    void calc(){
        
        total = basic*(1+(.01)*(hra+da));
        
    }
    void disp(){
        System.out.println("The total salary is: " + total);
    }
    public static void main(String[] args) {
        Employee a = new Employee();
        a.getdata();
        a.calc();
        a.disp();
     
    }
}
