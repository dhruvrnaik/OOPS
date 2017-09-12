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
import java.util.*;
public class areacircum {
    public static void main(String[] args) {
        
    
        Scanner reader = new Scanner(System.in);
	System.out.println("Enter length and breadth"); //Input
	int l = reader.nextInt();
	int b = reader.nextInt();
	float area,per;
	area=l*b;
	per = 2*(l+b);
	System.out.print("The area of the rectangle is " + area ); //Output
	System.out.print("\nThe perimeter of the rectangle is " + per);
    }
}
