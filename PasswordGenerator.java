import java.util.Random;

public class PasswordGenerator
{
	private static final String UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private static final String LOWER = "abcdefghijklmnopqrstuvwxyz";
	private static final String DIGITS = "0123456789";
	private static final String SPECIAL = "!@#$%^&*()-_+=<>?";
	
	private static final String ALL_CHARS = UPPER + LOWER + DIGITS + SPECIAL;
	private static final Random random = new Random();
	
	public static String generatePassword(int length)
	{
		StringBuilder password = new StringBuilder(length);
		for (int i = 0; i < length; i++)
		{
			int index = random.nextInt(ALL_CHARS.length());
			password.append(ALL_CHARS.charAt(index));
		}
		return password.toString();
	}
	public static void main(String[] args)
	{
		int length = 12; // change as needed
		String password = generatePassword(length);
		System.out.println("Generated Password: " + password);
	}
}