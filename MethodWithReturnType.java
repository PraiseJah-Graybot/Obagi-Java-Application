// Method with a returntype(one that has no parameter and has a method), and the class and methods are public
public class MethodWithReturnType
{
	public static void main(String[] args)
	{
		MethodWithReturnType mwrt = new MethodWithReturnType();
		int resuit = mwrt.addition(15,30);
		
		System.out.printf("The sum is %d%n", resuit);
	}
	public int addition(int num1, int num2)
	{
		int sum = mum1 + num2;
			
		return sum;
	}
}