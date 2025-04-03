// Method with a returntype(one that has no parameter and has a method), and the class and methods are public. static method
public class StaticMethodWithReturnType
{
	public static void main(String[] args)
	{
		double result = StaticMethodWithReturnType.average(70,90,50);
		System.out.printf("The average is %f%n", result);
	}
	public static double average(int num1, int num2, int num3)
	{
		double avg = (double) (num1 + num2 + num3)/3;
		
		return avg;
	}
}