/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author student
 */
//
import java.util.Scanner;
public class leapyear {
    public static void main(String[] args) {
        boolean leapyear=false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  leap year");
        int year = sc.nextInt();
        if(year%400 == 0)
            leapyear= true;
        else if(year%100 ==0)
            leapyear = false;
        else if (year%4==0)
            leapyear = true;
        if(leapyear)
            System.out.println(year + " is a leapyear");
        else 
            System.out.println(year + " is not a leapyear");
        
    }
    
}
