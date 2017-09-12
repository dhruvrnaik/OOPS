//Star Kite Design
class starkite{
	public static void main(String args[]){
		for(int i=0;i<=3;i++){
			for(int j=3;j>i;j--)
				System.out.print(" ");
			
			for(int k=2; k< (2*i + 3) ; k++){
				if(k%2==0)
					System.out.print("*");
				else
					System.out.print(" ");
			
			}
			System.out.print("\n");
			
		}
		
		for(int i=0;i<=2;i++){
			for(int j=0;j<=i;j++)
				System.out.print(" ");
			
			for(int k=8; k > (2*i + 3) ; k--){
				if(k%2==0)
					System.out.print("*");
				else
					System.out.print(" ");
			
			}
			System.out.print("\n");
			
		}
			
	}
}