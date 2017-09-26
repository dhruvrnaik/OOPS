/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author student
 */
import java.util.Scanner;
public class AlphabeticalOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = new String [5];
        System.out.println("Enter 5 strings");
        for(int i=0;i<5;i++){
            s[i] = sc.next();
        }
        for(int i=0;i<4;i++){
            for(int j=i;j<5;j++){
                if(s[i].compareTo(s[j])>0){
                    String temp;
                    temp = s[i];
                    s[i] = s[j];
                    s[j]= temp;
                }
                    
            }
        }
        for(int i=0;i<5;i++)
            System.out.println("String : "+i + s[i]);
    }
}
