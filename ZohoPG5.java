import java.util.Scanner;


/*5. Given two sorted arrays, merge them such that the elements are not repeated
Eg 1: Input:
        Array 1: 2,4,5,6,7,9,10,13
        Array 2: 2,3,4,5,6,7,8,9,11,15
       Output:
       Merged array: 2,3,4,5,6,7,8,9,10,11,13,15 
*/
public class ZohoPG5 {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.print("\nn1:");
		int n1=input.nextInt();
		System.out.print("\nn2:");
		int n2=input.nextInt();
		int s1[]=new int[n1+n2];
		int s2[]=new int[n2];
		System.out.print("\nArray[1]: ");
		for(int i=0;i<n1;i++)
			s1[i]=input.nextInt();
		System.out.print("\nArray[2]: ");
		for(int i=0;i<n2;i++)
			s2[i]=input.nextInt();
		
		for(int i=0;i<n1;i++){
			for(int j=0;j<n2;j++){
				if(s1[i]==s2[j]){
					s2[j]=0;
				}
					
			}
		}
		for(int i=0;i<n1;i++)
			System.out.print(s1[i]);
		System.out.println();
		for(int i=0;i<n2;i++)
			System.out.print(s2[i]);
		int count=0;
		for(int i=0;i<n2;i++){
			if(s2[i]!=0){
				s1[n1+count++]=s2[i];				
			}				
		}
		
		
		for(int i=0;i<n1+count-1;i++){
			for(int j=i+1;j<n1+count;j++){
				if(s1[i]>s1[j]){
					int temp=s1[j];
					s1[j]=s1[i];
					s1[i]=temp;
				}
			}
		}
		
		for(int i=0;i<n1+count;i++)
			System.out.print("\n"+s1[i]);
		
	}

}
