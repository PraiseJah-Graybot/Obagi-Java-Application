import java.util.Scanner;
import java.security.SecureRandom;

public class RandomNumberGenerator
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		SecureRandom secureRandom = new SecureRandom();
		
		System.out.print("Enter number: ");
		long num = scan.nextLong();
		
		if (num <= 0)
		{
			System.out.println("Number must be greater than 0");
		}
		else
		{
			long number = secureRandom.nextLong(num) + 1;
			System.out.println("The lower Limt is 0");
			System.out.println("The Upper Limt is " + (num + 1));
			
			System.out.printf("The generated number is %d%n", number);
		}
	}
}