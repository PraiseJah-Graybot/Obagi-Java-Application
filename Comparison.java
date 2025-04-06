// Fig. 2.15: Comparison.java
// Compare integers using if statements, relational operators
// and equlity operators.
import java.util.Scanner; //program uses class Scanner

public class Comparison
{
	// main method begins execution of Java applicaton
	public static void main(String[] args)
	{
		// create Scanner to obtain input fron command line
		Scanner input = new Scanner(System.in);
		
		int number1; // first number to compare
        int number2; // second number to compare
		
		System.out.printf("Enter first integer: "); // prompt
		number1 = input.nextInt(); // read first number from user
		
		System.out.printf("Enter second integer: ");
		number2 = input.nextInt(); // read second number from user
		
		if (number1 == number2)
			System.out.printf("%d == %d%n", number1, number2);
		
		if (number1 != number2)
			System.out.printf("%d != %d%n", number1, number2);
		
		if (number1 < number2)
			System.out.printf("%d < %d%n", number1, number2);
		
		if (number1 > number2)
			System.out.printf("%d > %d%n", number1, number2);
		
		if (number1 <= number2)
			System.out.printf("%d <= %d%n", number1, number2);
		
		if (number1 >= number2)
			System.out.printf("%d => %d%n", number1, number2);
	} // end method main
} // end class Comparison