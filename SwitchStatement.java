import java.util.Scanner;

public class SwitchStatement{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter *131# To Suscribe a new Data plan");
		System.out.println("Enter *310# To check Data balance");
		System.out.println("Enter *606# To Bororow Data");
		System.out.println("");
		
		System.out.print("Enter Code: ");
		String code = input.nextLine();
		
		switch(code){
			case "*131#":
			{
				System.out.println("Enter 1 for 1 Month Suscription");
				System.out.println("Enter 2 for 2 Months Suscription");
				System.out.println("Enter 3 for 3 Months Suscription");
				System.out.println("Enter 4 for 4 Months Suscription");
				System.out.println("");
				
				System.out.print("Enter Code: ");
				int option = input.nextInt();
				
				switch(option){
					case 1:
					{
						System.out.println("Your 1 Month Suscribtion has been activated");
					}
					break;
					
					case 2:
					{
						System.out.println("Your 2 Months Suscribtion has been activated");
					}
					break;
					
					case 3:
					{
						System.out.println("Your 3 Months Suscribtion has been activated");
					}
					break;
					
					case 4:
					{
						System.out.println("Your 4 Months Suscribtion has been activated");
					}
					break;
					
					default:
					System.out.println("Invalid Input");
				}
			} 
			break;
			
			case "*310#":
			{
				System.out.println("Your Balance is: N 245.98");
			}
			break;
			
			case "*606#":
			{
				System.out.println("Enter 1 to Borrow 1000");
				System.out.println("Enter 2 to Borrow 2000");
				System.out.println("Enter 3 to Borrow 3000");
				System.out.println("Enter 4 to Borrow 4000");
				System.out.println("");
				
				System.out.print("Enter Code: ");
				int option = input.nextInt();
				
			
			switch(option){
					case 1:
					{
						System.out.println("You have Borrowed N1000");
					}
					break;
					
					case 2:
					{
						System.out.println("You have Borrowed N2000");
					}
					break;
					
					case 3:
					{
						System.out.println("You have Borrowed N3000");
					}
					break;
					
					case 4:
					{
						System.out.println("You have Borrowed N4000");
					}
					break;
					
					default:
					System.out.println("Invalid Input");
				}
			} 
			
			break;
			default:
					System.out.println("Invalid Input");
		}
	}
}
					
					