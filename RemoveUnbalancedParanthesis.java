import java.util.Scanner;

public class RemoveUnbalancedParanthesis {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.println("Input:");
		char[] word=input.next().toCharArray();
		int a[]=new int[word.length];int index=0,index2=0,flag1=0;
		int b[]=new int[word.length];
		
		
		for(int i=0;i<word.length;i++){
			if(word[i]=='('){
				a[index++]=i;
				flag1=1;
			}
			if(word[i]==')'){
				if(index==0 && flag1==0){
					b[index2++]=i;
				}else{
					index--;
					if(index==0)
						flag1=0;
				}
			}
		}
		
		System.out.println();
		for(int i=0;i<word.length;i++){
			int flag=0;
			for(int j=0;j<index;j++){
				if(i==a[j])
					flag=1;
			}
			
			for(int j=0;j<index2;j++){
				if(i==b[j])
					flag=1;
			}
			if(flag==0){
				System.out.print(" "+word[i]);
			}
		}
	}
}
