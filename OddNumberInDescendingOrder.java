public class OddNumberInDescendingOrder
{
	public static void main(String[] args)
	{
		int i = 50;
		
		while(i >= 1)
		{
			if(i%2 == 1)
			{
				System.out.printf("%d%n",i);
			}
			i--;
		}
	}
}