public class DataType{
	public static void main(String[] args){
		//Integer type(byte,short,int,long)
		byte age = 50;
		System.out.printf("You are %d years old%n",age);
		
		short quantity = 20000;
		System.out.printf("I bought %d quantity of bags for my business%n",quantity);
		
		int populationInNigeria = 1000000000;
		System.out.printf("The Population in Nigeria is %d%n",populationInNigeria);
		
		long worldPopulation = 8000000000L;
		System.out.printf("The World population is %d%n",worldPopulation);
		
		//float-point numbers(float, double)
		float weight = 5.6F;
		System.out.printf("The bag of rice was %1fkg%n",weight);
		
		double accountBalance = 457575.94747;
		System.out.printf("Your account balance is %c%.2f%n",'$',accountBalance);
		
		//Boolean type(boolean)
		boolean isJavaFun = true;
		System.out.printf("Is Java Fun? %b%n",isJavaFun);
		
		//Character type(char)
		char alpha = '@';
		System.out.printf("My email is praisejah579@gmail.com",alpha);
	}
}	