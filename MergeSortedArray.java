import java.util.Scanner;

public class MergeSortedArray {
	
	public static void main(String[] args) {
		int n1, n2;	
		
		Scanner input= new Scanner(System.in);
		
	System.out.println("Enter the no of Elements in arr1 :");
	n1 = input.nextInt();
	
	System.out.println("Enter the no of Elements in arr2 :");
	n2 = input.nextInt();
	
	int ar1[]=new int[n1];
	int ar2[]=new int[n2];
	int ar3[]=new int[n1+n2];
	
	System.out.println("Enter the Elements in arr1 :");	
	for(int i =0 ; i<n1;i++)
	ar1[i]=input.nextInt();
	
	System.out.println("Enter the Elements in arr2 :");	
	for(int i =0;i<n1;i++)
	ar2[i]=input.nextInt();
	
	int i =0 , j =0, k=0;
	
	while(i<n1 && i<n2)
	{
		if(ar1[i]<ar2[j])
		{
			ar3[k++]=ar1[i++];
		}
		else
		{
			ar3[k++]=ar2[j++];
		}
	}
	
	while(i<n1)
	{
		ar3[k++]=ar1[i++];
	}
	
	while(i<n2)
	{
		ar3[k++]=ar2[i++];
	}
	
	}

}
