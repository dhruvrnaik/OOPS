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
import java.util.Scanner;
public class ternary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter 3 nos");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();   
        int largest = (a>c)?(a>b?a:c):(b>c?b:c);
        int small = (a<c)?(a<b?a:c):(b<c?b:c);
        System.out.println("The largest number is " + largest);
        System.out.println("The smallest number is " + small);
    }
    
}
