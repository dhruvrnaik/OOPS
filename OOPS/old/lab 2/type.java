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
//Type Conversion
import java.util.Scanner;
public class type {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        char c;
        double d;
        /*int to byte
        char to int
        double to byte
        double to int */
        System.out.println("Enter an integer ");
        i =sc.nextInt();
        System.out.println("Enter a character");
        c = sc.next().charAt(0);
        System.out.println("Enter a double");
        d = sc.nextDouble();
        byte b,bd;
        int ci,di;
        b = (byte)i;
        ci = c;
        bd = (byte)d;
        di = (int)d;
        System.out.println("int to byte " + b);
        System.out.println("char to int " + ci);
        System.out.println("double to byte " + bd);
        System.out.println("double to int " + di);
    }
}
