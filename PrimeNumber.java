import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number=input.nextInt();
		boolean  gotPrime=false;
		int temp = number+1;		
		
		while(!gotPrime)
		{
			if ( temp == 1 || temp == 0)
			{
				temp ++;
				continue;
			}
			
			boolean isPrime =true;			
			for(int i =2;i<=temp/2;i++)
			{
				if(temp%i == 0)
				{					
					temp ++;
					isPrime=false;
					break;
				}
			}
			if(isPrime)
			{
				System.out.println("Next Prime Number after "+number+" is "+temp );
				gotPrime=true;
			}			
			
		}
		

	}

}
