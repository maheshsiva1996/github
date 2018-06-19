import java.util.Scanner;

/*
Write a program to give the following output for the given input
Eg 1: Input: a1b10
       Output: abbbbbbbbbb
Eg: 2: Input: b3c6d15
          Output: bbbccccccddddddddddddddd
The number varies from 1 to 99.*/

public class ZohoPG1 {
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("\nInput: ");
		String word=input.nextLine();
		char a[]=word.toCharArray();
		
		for( int i=0;i<a.length;i++){
			char ch = 0;int val=0;
			if(a[i]>='a' && a[i]<='z'){
				ch=a[i];				
			}
			if(i<a.length)
			if(a[i+1]>='0' && a[i+1]<='9'){
				val=a[i+1]-'0';i++;
			}			
			if(i+1<a.length)
				if(a[i+1]>='0'&& a[i+1]<='9'){
					val=(val*10)+(a[i+1]-'0');i++;
				}			
			for(int j=0;j<val;j++)
				System.out.print(ch);
		}
	}
}
