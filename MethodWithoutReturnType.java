// Method withoutout a returntype (void), one that has no parameter, and the class and methods are public
public class MethodWithoutReturnType
{
	public static void main(String[] args)
	{
		MethodWithoutReturnType mwrt = new MethodWithoutReturnType();
		mwrt.addition();
	}
	public void addition()
	{
		int num1 = 15;
		int num2 = 20;
		
		int sum = num1 + num2;
		
		System.out.printf("The sum is %d%n", sum);
	}
}