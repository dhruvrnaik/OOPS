import java.util.Scanner;
class addmult{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int m,n,p,q;
		int a[][] = new int[50][50];
		int b[][] = new int[50][50];
		int c[][] = new int[50][50];
		int add[][] = new int[50][50];
		if(true){		          //Matrix A
			System.out.println("Enter size of matrix A (M*N) ");
			m = sc.nextInt();
			n = sc.nextInt();
			System.out.println("Enter Elements of matrix A (M*N) ");
			for(int i=0;i<m;i++){
				for(int j=0;j<n;j++){
					a[i][j] = sc.nextInt();
				}
			}
		}
		if(true){		         //Matrix B	
			System.out.println("Enter size of matrix B (P*Q) ");
			p = sc.nextInt();
			q = sc.nextInt();
			System.out.println("Enter Elements of matrix B (P*Q) ");
			for(int i=0;i<p;i++){
				for(int j=0;j<q;j++){
					b[i][j] = sc.nextInt();
				}	
			}
		}
		if(m==p && n==q){       //Addition of Matrices (Add)
			System.out.println("Addition Matrix: \n");
			for(int i=0;i<p;i++){		//Addition Loop
				for(int j=0;j<q;j++){
					add[i][j]=a[i][j] + b[i][j];
				}
			}
			for(int i=0;i<p;i++){		//Print Addition Loop
				for(int j=0;j<q;j++){
					System.out.print("   " + add[i][j]);
				}
			System.out.println("");
			}
		}
		if(n==p){		       //Multiplication of Matrices(C)
			System.out.println("Multiplication Matrix: \n");
			for(int i=0;i<m;i++){
				for(int j=0;j<q;j++){
					c[i][j]=0;
					for(int k=0;k<n;k++){
						c[i][j] += a[i][k]*b[k][j];
					}
				}
			}
		}
		for(int i=0;i<m;i++){ //Print Matrix C
			for(int j=0;j<q;j++){
				System.out.print("   " + c[i][j] );
			}
			System.out.println("");
		}
		
	}
}