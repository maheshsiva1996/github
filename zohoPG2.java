import java.util.Scanner;

/*2. Write a program to sort the elements in odd positions in descending order and elements in ascending order
Eg 1: Input: 13,2 4,15,12,10,5
        Output: 13,2,12,10,5,15,4
Eg 2: Input: 1,2,3,4,5,6,7,8,9
        Output: 9,2,7,4,5,6,3,8,1 */

public class zohoPG2 {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("Size: ");
		int n=input.nextInt();
		int a[]= new int[n];
		System.out.println("Input: ");
		for(int i=0;i<n;i++)
		 a[i]=input.nextInt();
		
		for(int i=0;i<n-1;i=i+2){
			for(int j=i+2;j<n;j=j+2){
				if(a[i]<a[j]){
					int temp =a[j];
					a[j]=a[i];
					a[i]=temp;
				}				
			}
			for(int k=i+3;k<n;k=k+2){
				if(i+1<n)
				if(a[i+1]>a[k]){
					int temp =a[k];
					a[k]=a[i+1];
					a[i+1]=temp;
				}				
			}
		}
		for(int i=0;i<n;i++)
			System.out.print(" "+a[i]);
		
		
		
	}
}
