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
public class search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = {1,4,2,4,6,0,6,7,2,3,2,0,3,5,3,4,3,0,6,4,8,4,9,3,8};
        System.out.println("Enter value to be searched");
        int val = sc.nextInt();
        System.out.println("Value found at locations: - ");
        int c=0;
        for(int i:a){
            if(i==val)
                System.out.print("a[" + c + "]" + "  "); //output
            c++;
        }
        
    }
    
}
