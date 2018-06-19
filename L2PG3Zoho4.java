import java.util.Scanner;

public class L2PG3Zoho4 {
	
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("size:");
		int size= input.nextInt();
		int array[] = new int[size];
		System.out.print("\nInput Array: ");
		for(int i=0;i<size;i++)
			array[i]=input.nextInt();
		System.out.print("\nWindow Size: ");
		int ws= input.nextInt();
		System.out.println("\nFavorate number: ");
		int favnum=input.nextInt();
		int a[][]=new int[size-ws+1][ws+1];
		
		for(int i=0;i<size-ws+1;i++){
			int fnum[] = new int[5];
			int temp=0;
			for(int j=0;j<ws;j++){
				a[i][j]=array[i+j];
				int num = array[i+j];
				temp=0;
				while(num!=0){
					int val = num%10;
					if(val>fnum[temp]){
						fnum[temp]=val;
					}
					if(val==favnum){
						a[i][ws]=1;
					}
					num=num/10;
					temp++;
				}
			}
			System.out.println();
			for(int k=0;k<ws;k++)
				System.out.print(" "+a[i][k]);
			System.out.print(":");				
			int amt=0,p;
			for(int k=0;k<fnum.length;k++){
				p=1;
				for(int l=0;l<k;l++){
					p=p*10;
				}
				amt=amt+(p*fnum[k]);				
			}
			System.out.print(amt);	
		}
		
		
		
		
	}

}
