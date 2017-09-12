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
public class expression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two nos.");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("(a<<2) + (b>>2)" + ((a<<2) + (b>>2)));
        System.out.println("b>0" + (b>0) );
        System.out.println("a+b*100/10" + (a+b*100/10) );
        System.out.println("a&b" + (a&b) );
    }
}
