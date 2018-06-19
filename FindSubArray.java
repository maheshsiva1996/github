import java.util.Scanner;

public class FindSubArray {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the length: ");
		int len = input.nextInt();
		System.out.println("Enter the Elements:");
		int a[]=new int[len];
		for(int i=0;i<len;i++)
			a[i]=input.nextInt();
		
		System.out.println("Enter the Sum value: ");
		int value = input.nextInt();
		
		
		for(int i=0;i<len;i++){
			int sum=0;
			for(int j=i;j<len;j++)
			{
				sum+=a[j];
				if(sum == value){
					System.out.println("Subarry from "+i+" to "+j);
					break;
				}
			}
		}

	}

}
