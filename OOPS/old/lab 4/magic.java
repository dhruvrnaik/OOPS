 import java.util.Scanner;
class magic{
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
		int row=0,col=0,di=0,nondi=0,flag=0,sum=0;
		for(int i=0;i<m;i++){						
				sum+=arr[0][i];
		}
		
		for(int i=0;i<m;i++){
			
			for(int j=0;j<m;j++){
				row+=arr[i][j];
				col+=arr[j][i];
			}
			if(row !=sum || col != sum )
				flag=1;
		}
		for(int i=0;i<m;i++){
			
			for(int j=0;j<m;j++){
				if(i==j)
					di+=arr[i][j]
			}	
		}
		if(di!=sum)
			flag=1;
		
		for(int i=0;i<m;i++){
			for(int j=0;j<m;j++){
				if((i+j)==(m-1))
					nondi+=arr[i][j];
			}
		}
		if(sum!=di)
			flag=1;
		
		if(flag==1)
			System.out.println("Its not a magic square");
		else
			System.out.println("Its a magic square");
	}	
}