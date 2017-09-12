//Largest and Smallest

import java.util.Scanner;
class largesmall{
	public static void main(String args[]){
		Scanner sc =  new Scanner(System.in);
		int arr[] = new int[20];
		System.out.println("Enter array size");
		int n = sc.nextInt();
		System.out.println("Enter array elements");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		int large,small;
		int templ,temps;
		large=arr[0];
		small=arr[0];
		for(int i=1;i<n;i++){
			
			if(arr[i]>large){
				templ=large;
				large=arr[i];
				arr[i]=templ;
			}
			if(arr[i]<small){
				temps=small;
				small=arr[i];
				arr[i]=temps;
			}
		}
		System.out.println("The largest number is "+large);
		System.out.println("The smallest number is "+ small);
	}
}