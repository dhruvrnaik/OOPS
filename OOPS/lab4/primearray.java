//Prime nos in a array
import java.util.Scanner;

class primearray{
	public static void main(String args[]){

		int arr[] = new int [50];
		Scanner sc = new Scanner(System.in);
		int n,flag=0;
		System.out.println("Enter size of array ");
		n = sc.nextInt();
		System.out.println("Enter elements");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++){
			flag=0;
			for(int j=2;j<=arr[i]/2;j++){
				if(arr[i]%j==0)
					flag=1;
			}
			if(flag==0)
				System.out.println("Prime Number found: " + arr[i]);

		}
	}
}