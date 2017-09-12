//Diagonal Matrix
import java.util.Scanner;
class diagonal{
	public static void main(String args[]){
		
		int arr[][]= new int [50][50];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of matrix(M*M)");
		int m = sc.nextInt();
		System.out.println("Enter matrix elements");
		for(int i=0;i<m;i++){
			for(int j=0;j<m;j++){
				 arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("The Principal Diagonal Elements are :");
		for(int i=0;i<m;i++){
			for(int j=0;j<m;j++){
				if(i==j) // Property of diagonal elements
					System.out.print(" "+ arr[i][j]);
			}
		}
	}
}