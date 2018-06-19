import java.util.Scanner;

public class L2PG4Zoho5 {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int a[][]={{1,3,4,6,2},{3,5,8,9,0},{1,7,3,2,4},{2,3,1,4,2},{6,4,3,2,1}};
		for(int i =0;i<a.length;i++){
			System.out.println();
			 for(int j=0;j<a.length;j++){
				 System.out.print(" "+ a[i][j]);
			 }
		}
		System.out.println("\nEnter the fav number: ");
		int favnum = input.nextInt();
		 for(int i =0;i<a.length;i++){
			 for(int j=0;j<a.length;j++){
				
					if(i+1<a.length-1)
					if(a[i][j]+a[i+1][j]==favnum){
					
						System.out.println(a[i][j]+" + "+a[i+1][j]+"="+ favnum);
					}
				
					if(j+1<a.length-1)
					if(a[i][j]+a[i][j+1]==favnum){
						System.out.println(a[i][j]+" + "+a[i][j+1]+"="+ favnum);
					}
					if(i+1<a.length-1 && j+1<a.length)
					if(a[i][j]+a[i+1][j+1]==favnum){
						System.out.println(a[i][j]+" + "+a[i+1][j+1]+"="+ favnum);
					}		
					
					if(i+1<a.length-1 && j-1>=0)
					if( (a[i][j]+a[i+1][j-1])==favnum){
						System.out.println(a[i][j]+" + "+a[i+1][j-1]+"="+ favnum);
					
				}
			 }
		 }
		
	}

}
