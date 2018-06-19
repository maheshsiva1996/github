import java.util.Scanner;

public class ZohoWordPuzzule {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Size");
		int n=input.nextInt();
		char a[][]=new char[n][n];
		System.out.println("String1: ");
		char t='a';
		for(int i=0;i<n;i++){
			System.out.println();
			for(int j=0;j<n;j++){
				a[i][j]=t++;
				System.out.print("  "+a[i][j]);
			}
		}	
		System.out.print("\nEnter the text: ");
		String strg=input.next();
		char str[]=strg.toCharArray();
		
		
		int temp=1,x1=-1,x2=-1,y1=-1,y2=-1;
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(a[i][j]==str[0]){
					temp=1;
					for(int k=1;k<str.length&&(i+k)<n;k++){
						if(a[i+k][j]==str[k]){
							temp++;
						}else{
							break;
						}
						if(temp==str.length){
							x1=i;y1=j;
							x2=i+str.length-1;y2=j;
						}						
					}
					temp=1;
					for(int k=1;k<str.length&&(j+k)<n;k++){
						if(a[i][j+k]==str[k]){
							temp++;
						}else{
							break;
						}
						if(temp==str.length){
							x1=i;y1=j;
							x2=i;y2=j+str.length-1;
						}						
					}
					temp=1;
					for(int k=1;k<str.length&&(j-k)>=0;k++){
						if(a[i][j-k]==str[k]){
							temp++;
						}else{
							break;
						}
						if(temp==str.length){
							x1=i;y1=j;
							x2=i;y2=j-(str.length-1);
						}						
					}
					temp=1;
					for(int k=1;k<str.length&&(i-k)>=0;k++){
						if(a[i-k][j]==str[k]){
							temp++;
						}else{
							break;
						}
						if(temp==str.length){
							x1=i;y1=j;
							x2=i-(str.length-1);y2=j;
						}						
					}
				}if(x2!=-1||y2!=-1){break;}
			}if(x2!=-1||y2!=-1){break;}
		}
		if(x2!=-1||y2!=-1){
			System.out.println("\nText found in x1,y1: "+x1+","+y1);
			System.out.println("x2,y2: "+x2+","+y2);
		}else{
			System.out.println("Text not found..");
		}
			
	}
		
	

}
