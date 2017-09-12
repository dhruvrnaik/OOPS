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
//bitwise multiply divide
import java.util.Scanner;
public class bitwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        System.out.println(n + "/2 = " + (n>>1));
        System.out.println(n + "*2 = " + (n<<1));
        
    }
            
}
