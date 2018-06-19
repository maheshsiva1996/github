import java.util.Scanner;

/*
7. find the factors of the numbers given in an array and to sort the numbers in descending order according to the factors present in it.
Input:
Given array : 8, 2, 3, 12, 16
Output: 12, 16, 8, 2, 3
*/
public class ZohoPG7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Size: ");
		int n= input.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		for(int i=0;i<n;i++){
			a[i]=input.nextInt();
		}
		
		for(int i=0;i<n;i++){
			int count=0;
			for(int j=2;j<(a[i]/2)+1;j++){
				if(a[i]%j==0){
					count++;
				}
			}
			b[i]=count;
		}	
			
		for(int i=0;i<n-1;i++){
			for(int j=i+1;j<n;j++){
				if(b[i]<b[j]){
					int temp=b[j];
					b[j]=b[i];
					b[i]=temp;
					temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
		}
		System.out.println();
		for(int i=0;i<n;i++){
			System.out.print(a[i]+" ");
		}
	}

}
