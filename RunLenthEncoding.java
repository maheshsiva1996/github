import java.util.Scanner;

public class RunLenthEncoding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the String: ");
		char str[]=input.next().toCharArray();
		String outstr= new String();
		int i=0;
		for( i=0;i<str.length;i++)
		{
			outstr=outstr+str[i];
			int slen=1;
			while(i+1<str.length && str[i]==str[i+1])
			{
				i++;
				slen++;
			}
			outstr+=slen;
		}
		System.out.println(outstr);
	}

}
