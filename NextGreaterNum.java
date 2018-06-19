import java.util.Arrays;
import java.util.Scanner;

// Find next greater number with same set of digits

public class NextGreaterNum {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Digits: ");
		char[] arr= input.next().toCharArray();
		int n = arr.length;
		int i ,j;
		for (i =n-1;i>0;i--)
		{
			if(arr[i-1]<arr[i])
				break;
		}
		
		if (i==0)
		{
			System.out.println("Not Possible");
		}
		
		char min1=arr[i-1]; 
		int min2=i;
		for(j=i+1;j<n;j++)
		{
			if(arr[j]<arr[min2] && min1<arr[j])
				min2=j;
		}
		
		char temp=arr[min2];
		arr[min2]=arr[i-1];
		arr[i-1]=temp;
		
		Arrays.sort(arr,i,n);
		
		System.out.println();
		
		for(i=0;i<n;i++)
			System.out.print(arr[i]);
		

	}

}
