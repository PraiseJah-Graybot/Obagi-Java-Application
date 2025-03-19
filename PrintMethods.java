public class PrintMethods{
	public static void main(String[] args){
		//Using the print() (print method)
		System.out.print("\"Learning Java Is Fun\"\n");
		System.out.print(" Hey, come and learn with me");
		
		//Using the printLn()
		System.out.println();
        System.out.println(" I want to tell you that java is diferent from javascript");
		System.out.println("\t this is the indented text");
		
		//Using the printf()
		System.out.printf("My name is %s and I love %s%n","John","Java");
		System.out.printf("I am living in No.%d Kaduna Street %n",1);
		System.out.printf("I bought Java JDK with %f Naira%n",159.345);
		System.out.printf("I bought Java JDK with %.1f Naira%n",159.345);
		System.out.printf("I bought Java JDK with %c%.1f %n",'$',159.345);
	}
}
	