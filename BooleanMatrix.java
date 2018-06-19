import java.util.Scanner;

public class BooleanMatrix {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Size of Matrix: ");
		int n = input.nextInt();
		int mat[][]= new int[n][n];
		System.out.println("Enter the matrix elements");
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
			mat[i][j]=input.nextInt();
		boolean row=false,col=false;
		
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
			{				
				if(i==0 && mat[i][j]==1)
					row=true;
				if(j==0 && mat[i][j]==1)
					col=true;
				
				if(mat[i][j]==1){
					mat[0][j]=1;
					mat[i][0]=1;
				}				
			}
		for(int i=1;i<n;i++)
			for(int j=1;j<n;j++)
			{
				if(mat[0][j]==1 || mat[i][0]==1)
					mat[i][j]=1;
			}
		
			if(row)
				for(int i=0;i<n;i++)
					mat[0][i]=1;
			if(col)
				for(int i=0;i<n;i++)
					mat[i][0]=1;
			
			for(int i=0;i<n;i++){
				System.out.println();
				for(int j=0;j<n;j++)
				{
					System.out.print(mat[i][j]+" ");
				}
			}
	}

}
