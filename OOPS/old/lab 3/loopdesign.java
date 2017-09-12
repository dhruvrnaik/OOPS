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
public class loopdesign {
    public static void main(String[] args) {
        System.out.println("Using for loop"); //Using for
        for(int i=1;i<6;i++){
            for(int j=0;j<i;j++){
                System.out.print( i + " ");//output
            }
            System.out.println("");
        }
        System.out.println("Using foreach"); //Using foreach
        int a[] = {1,2,3,4,5};
        for(int i:a){
            for(int j:a){
                if(j<=i)
                System.out.print(i + " "); //output
            }
            System.out.println("");
        }
        
        
    }
}

