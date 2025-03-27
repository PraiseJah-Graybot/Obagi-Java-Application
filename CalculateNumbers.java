/* Add 10 numbers. find the sum of 6-8 and subtract it from 4-9 and display the result*/
import java.util.Scanner;

public class CalculateNumbers
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int sumOf6_8 = 0;
		int sumOf4_9 = 0;
		
		for (int i = 1; i <= 10; i++)
		{
			System.out.printf("Enter num%d: ",i);
			int num = input.nextInt();
			
			if(i >= 6 && i <= 8)
			{
				sumOf6_8 += num;
			}
			if(i >= 4 && i <= 9)
			{
				sumOf4_9 += num;
			}
		}
		int result = sumOf4_9 - sumOf6_8;
		System.out.printf("The result is %d",result);
	}
}