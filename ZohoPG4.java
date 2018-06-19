import java.util.Scanner;

/*4. Find if a String2 is substring of String1. If it is, return the index of the first occurrence. else return -1.
Eg 1:Input:
        String 1: test123string
         String 2: 123
        Output: 4
Eg 2: Input:
        String 1: testing12
        String 2: 1234 */
  

public class ZohoPG4 {
public static void main(String[] ar){
	Scanner input=new Scanner(System.in);
	System.out.println("String1: ");
	char s1[]=input.nextLine().toCharArray();
	System.out.println("String2: ");
	char s2[]=input.nextLine().toCharArray();
	int num =-1;
	for(int i=0;i<s1.length;i++){
		if(s1[i]==s2[0]){
			 num = i;
			for(int j=1;j<s2.length;j++){
				if(i+j<s1.length){
					if(s1[i+j]!=s2[j]){
						num=-1;
						break;
					}
				}else{
					num=-1;
				}
				
			}			
		}
		if(num!=-1){
			break;
		}
		
	}
	System.out.println("Output: "+num);
	
	
	
}
}
