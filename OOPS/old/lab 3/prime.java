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
public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two nos. for range");
        int m = sc.nextInt(); //Input
        int n = sc.nextInt();
        
        System.out.println("Prime nos. are : " ); 
        for(int i=m;i<=n;i++){
            int flag=0;
            for(int j=2;j<=(i/2);j++){
                if(i%j==0){
                    flag=1;
                    //break;
                }
            }
            if(flag==0)
                System.out.println(i); //output
        }
        
        
    }
    
}
