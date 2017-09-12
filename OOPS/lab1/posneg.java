//10 nos pos-neg
import java..util.Scanner;
class posneg{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);	
	int arr[] = new int[20];
	System.out.println("Enter array size");
	int n= sc.nextInt();
	for(int i=0;i<n;i++){
		arr[i] = sc.nextInt();
	}
	System.out.print("Positive nos are = ");
	for(int i=0;i<10;i++){
		if(arr[i]>0)
			System.out.print(" " + arr[i] + " ");
	}
		System.out.print("\nNegative nos are = ");
	for(int i=0;i<10;i++){
		if(arr[i]<0)
			System.out.print(" " + arr[i] + " ");
	}
	}
}
