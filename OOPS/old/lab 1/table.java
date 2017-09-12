//Table of a number
import java.util.Scanner;
class table{
	public static void main(String args[]){
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a number");
		int a =  reader.nextInt(); 
		for(int i=1;i<=10; i++){
			System.out.print(" " + a*i	);
	}
	
	
}
}
