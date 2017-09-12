//Symmetric Matrix
import java.util.Scanner;
class symmetric{
	public static void main(String args[]){
		
		int arr[][]= new int [50][50];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of matrix(M*M)"); // Size of square matrix-n
		int m = sc.nextInt();
		System.out.println("Enter matrix elements"); //Input Elements
		for(int i=0;i<m;i++){
			for(int j=0;j<m;j++){
				 arr[i][j] = sc.nextInt();
			}
		}
		int flag=0;
		for(int i=0;i<m;i++){
			for(int j=0;j<m;j++){
				if(arr[i][j]!=arr[j][i]){ //Condition for a matrix to be symmetric
					flag=1;
					break;
				}
			}
		}
		if (flag==1)
			System.out.println("The given matrix is not symmetric");
		else
			System.out.println("The given matrix is symmetric");
		
	}
}