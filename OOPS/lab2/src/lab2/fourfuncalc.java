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
public class fourfuncalc {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter two nos.");
    int x = sc.nextInt();
    int y = sc.nextInt();
    char ch;
    int z;
    char c;
    do{
        System.out.println("Enter operator(+,-,*,/) or Enter e to exit");
        ch = sc.next().charAt(0);
        switch(ch){
            case '+' : z=(x+y);
                       System.out.println("The answer is " + z);
                       break;
            case '-' :z=(x-y);
                       System.out.println("The answer is " + z);
                       break;
            case '*' :z=(x*y);
                       System.out.println("The answer is " + z);
                       break;
            case '/' :z=(x/y);
                       System.out.println("The answer is " + z);
                       break;
             
        }
        System.out.println(" Do another(y/n)");
        c = sc.next().charAt(0);
        
    }while(c!='n');
    
    }
    
    
}
