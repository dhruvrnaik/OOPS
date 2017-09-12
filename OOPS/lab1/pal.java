//Palindrome
import java.util.Scanner;
class pal{
	public static void main(String args[]){
		
		int b=0;
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = reader.nextInt();
		int c=a;
		for(int i=0; a>0; i++){
			
			b*=10;
			b = b + a%10;
			a= a/10;
			
			
		}
			if(b==c)
				System.out.print("Its a palindrome");
			else
				System.out.print("It's not a palindrome");
	}
}