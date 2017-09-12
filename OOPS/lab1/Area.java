//Area of rectangle
import java.util.Scanner;
class Area{
	public static void main(String args[]){
	
	
	//l=10;
	//b=15;
	
	Scanner reader = new Scanner(System.in);
	System.out.println("Enter length and breadth");
	int l = reader.nextInt();
	int b = reader.nextInt();
	
	
	float area,per;
	area=l*b;
	per = 2*(l+b);
	System.out.print("The area of the rectangle is " + area );
	System.out.print("\nThe perimeter of the rectangle is " + per);
	
}
}