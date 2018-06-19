import java.util.Scanner;

/*3. Write a program to print the following output for the given input. 
 * You can assume the string is of odd length
Eg 1: Input: 12345
       Output:
1       5
  2   4
    3
  2  4
1      5*/

public class ZohoPG3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Size: ");
		int n = input.nextInt();
		int a[] = new int[n];
		System.out.print("Input: ");
		for (int i = 0; i < n; i++)
			a[i] = input.nextInt();
		int p=0,q=n-1;
		for(int i=0;i<(n)/2;i++){
			for(int j=i;j>0;j--)
				System.out.print(" ");
			
			System.out.print(a[p]+" ");
			for(int k=0;k<(q-p-2);k++)
				System.out.print(" ");
			
			System.out.println(a[q]);q--;p++;
		}
		for(int j=0;j<n/2;j++)
			System.out.print(" ");
		System.out.println(a[p]);p++;q--;
		
		for(int i=0;i<(n)/2;i++){
			for(int j=i;j<(n/2)-1;j++)
				System.out.print(" ");
			
			System.out.print(a[q]);
			for(int k=0;k<=(p-q-2);k++)
				System.out.print(" ");
			
			System.out.println(a[p]);p++;q--;
		}
		
	}

}
