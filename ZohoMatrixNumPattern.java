import java.util.Scanner;

/*Enter the number: 3
   3   3   3   3   3
   3   2   2   2   3
   3   2   1   2   3
   3   2   2   2   3
   3   3   3   3   3
   */
public class ZohoMatrixNumPattern {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=input.nextInt();
		int p=0,q=2*n-1;
		int a[][]=new int[q][q];
		for(int x=n;x>0;x--){
		for(int i=p;i<q;i++){			
			for(int j=p;j<q;j++){
				a[i][j]=x;
			}
		}
		p++;q--;
	}
		for(int i=0;i<2*n-1;i++){
			System.out.println("\n");
			for(int j=0;j<2*n-1;j++){				
				System.out.print("   "+ a[i][j]);
			}
		}
		
 }
}
