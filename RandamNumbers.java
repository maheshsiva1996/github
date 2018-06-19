import java.util.Random;
import java.util.Scanner;

public class RandamNumbers {

	public static void main(String[] args) {
		
		Random rand = new Random();
		Scanner input= new Scanner(System.in);
		
		System.out.println("Enter the min : ");
		int min = input.nextInt();
		System.out.println("Enter the max : ");
		int max = input.nextInt();
		System.out.println("Random Numbers: ");
		for(int i=0;i<10;i++)
		{
			System.out.println(rand.nextInt(max - min)+ min);
		}

	}

}
