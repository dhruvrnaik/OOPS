//Non Diagonal Element Finder
import java.util.Scanner;
class nondiagonal{
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
		int sum=0;
		System.out.println("The Non  Diagonal Elements are :");
		for(int i=0;i<m;i++){
			for(int j=0;j<m;j++){
				if((i+j)==(m-1) && i!=j){				//Non Diagonal Elements
					System.out.print(" "+arr[i][j]);
					sum+= arr[i][j];
				}
			}
		}
		System.out.println("Sum of the non diagonal elements is " + sum);
	}
}
