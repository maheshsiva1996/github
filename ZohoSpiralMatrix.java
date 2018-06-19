import java.util.Scanner;

public class ZohoSpiralMatrix {
	public static void main(String args[]){
		Scanner input =new Scanner(System.in);
		System.out.println("Size: ");
		int n=input.nextInt();
		int a[][]=new int[n][n];
		int temp = 0;
		for(int i=0;i<n;i++){
			System.out.println("\n");
			for(int j=0;j<n;j++){
				a[i][j]=++temp;
				System.out.print("     "+ a[i][j]);
			}
		}
		System.out.println("\n");
		int step=1,x=n/2,y=n/2;
		for(int i=0;i<n-1;i++){
			if(i%2==0){
				for(int j=0;j<step;j++){
					System.out.print(" "+a[x++][y]);
				}
				for(int j=0;j<step;j++){
					System.out.print(" "+a[x][y++]);
				}
				step++;
			}else{
				for(int j=0;j<step;j++){
					System.out.print(" "+a[x--][y]);
				}
				for(int j=0;j<step;j++){
					System.out.print(" "+a[x][y--]);
				}
				step++;
			}
		}
		
		for(int i=0;i<n;i++){
			System.out.print(" "+a[i][0]);
		}
	}
}
