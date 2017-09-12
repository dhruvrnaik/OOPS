//factorial
import java.util.Scanner;
class fact{
	public static void main(String args[]){
		Scannner reader = new Scanner(System.in);
		System.out.println("Enter a number");
		int a =  reader.nextInt();
		int fact=1;
		for(int i=1;i<=a; i++)
			fact*=i;
		System.out.print("The factorial is " + fact );
	}
	
}