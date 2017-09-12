/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author student
 */
import java.util.Scanner;
public class armstrong {
    static void Arm(int x){
        int sum=0;
        int rem = 0;
        int cpy =x;
        
        while(cpy>0){
            rem = cpy%10;
            sum = sum + (rem*rem*rem);
            cpy= cpy/10;
        }
        
        if(sum==x)
            System.out.println("The number is Armstrong Number"); //output
        else
            System.out.println("The number is not an Armstrong Number");
        
    }
   
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number"); //Input
        int n = sc.nextInt();
        Arm(n);
        
    }
    
}
