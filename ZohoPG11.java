import java.util.Scanner;

/*
11) To output the given string for the given input which is an integer.
Input: 1
Output: A
Input: 26
Output: Z
Input : 27
Output: AA
Input: 28:
Output: AB
Input: 1000
Output: ALL
*/
public class ZohoPG11 {
	
	public int index;
	public void convert(int num){
		index=0;
		 int word[]=new int[40];
		while(num > 0){			
			word[index++]=num%26+'A'-1;
			num=num/26;
		}
		System.out.print("\nOutput: ");
		for(int i=index-1;i>=0;i--){
			System.out.print((char)word[i]);
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ZohoPG11 a =new ZohoPG11();
		System.out.println("Input: ");
		int num=input.nextInt();
		a.convert(num);		
		
	}

}
