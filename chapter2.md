**Chapter 2 - Answers**

**Self-Review Exercises 2.1**

a) A(n) **{** begins the body of every method, and a(n) **}** ends the body of every method.

b) You can use the **if** statement to make decisions.

c) **//** begins an end-of-line comment.

d) **Blank lines, space characters, and tab characters** are called white space.

e) **Keywords** are reserved for use by Java.

f) Java applications begin execution at method **main**.

g) Methods **System.out.print**, **System.out.println**, and **System.out.printf** display information in a command window.

**2.2 True or False**

a) **False** - Comments are ignored by the compiler and do not produce output.

b) **True** - All variables in Java must be declared with a type.

c) **False** - Java is case-sensitive, so number and NuMbEr are different variables.

d) **False** - The remainder operator (%) can be used with both integer and floating-point operands.

e) **False** - Multiplication (\*), division (/), and modulus (%) have higher precedence than addition (+) and subtraction (-).

**2.3 Java Statements**

a) int c, thisIsAVariable, q76354, number;

b) System.out.print("Enter an integer: ");

c) int value = input.nextInt();

d) System.out.println("This is a Java program");

e) System.out.printf("This is a %s %s%n", "Java", "program");

f) if (number != 7) System.out.println("The variable number is not equal to 7");

**2.4 Error Corrections**

a) if (c < 7) System.out.println("c is less than 7"); (Removed semicolon after if condition)

b) if (c >= 7) System.out.println("c is equal to or greater than 7"); (Corrected => to >=)

**2.5 Java Statements**

a) // This program calculates the product of three integers.

b) Scanner input = new Scanner(System.in);

c) int x, y, z, result;

d) System.out.print("Enter first integer: ");

e) x = input.nextInt();

f) System.out.print("Enter second integer: ");

g) y = input.nextInt();

h) System.out.print("Enter third integer: ");

i) z = input.nextInt();

j) result = x \* y \* z;

k) System.out.printf("Product is %d%n", result);

**2.6 Full Program**

import java.util.Scanner;

public class ProductCalculator {

public static void main(String\[\] args) {

Scanner input = new Scanner(System.in);

int x, y, z, result;

System.out.print("Enter first integer: ");

x = input.nextInt();

System.out.print("Enter second integer: ");

y = input.nextInt();

System.out.print("Enter third integer: ");

z = input.nextInt();

result = x \* y \* z;

System.out.printf("Product is %d%n", result);

}

}

**2.7 Fill in the Blanks**

a) **Comments** are used to document a program and improve its readability.

b) A decision can be made in a Java program with an **if** statement.

c) Calculations are normally performed by **assignment** statements.

d) The arithmetic operators with the same precedence as multiplication are **division (/) and modulus (%)**.

e) When parentheses in an arithmetic expression are nested, the **innermost** set of parentheses is evaluated first.

f) A location in the computer’s memory that may contain different values at various times throughout execution is called a **variable**.

**2.8 Java Statements**

a) System.out.print("Enter an integer: ");

b) a = b \* c;

c) // This program performs a sample payroll calculation.

**2.9 True or False**

a) **False** - Operator precedence determines order, not just left-to-right evaluation.

b) **True** - All listed variable names are valid.

c) **False** - Operator precedence affects evaluation order.

d) **False** - 3g and 2h are invalid, but 67h2 and h22 are valid variable names.

**2.10 Output Predictions**

a) x = 2

b) Value of 2 + 2 is 4

c) x =

d) 5 = 5

**2.14 Displaying Numbers**

a) System.out.println("1 2 3 4");

b) System.out.print("1 "); System.out.print("2 "); System.out.print("3 "); System.out.println("4");

c) System.out.printf("%d %d %d %d%n", 1, 2, 3, 4);

**2.15 Arithmetic Application** Write a Java program that reads two integers and prints their sum, product, difference, and quotient:

import java.util.Scanner;

public class ArithmeticOperations {

public static void main(String\[\] args) {

Scanner input = new Scanner(System.in);

int num1, num2;

System.out.print("Enter first integer: ");

num1 = input.nextInt();

System.out.print("Enter second integer: ");

num2 = input.nextInt();

System.out.printf("Sum: %d%n", (num1 + num2));

System.out.printf("Product: %d%n", (num1 \* num2));

System.out.printf("Difference: %d%n", (num1 - num2));

System.out.printf("Quotient: %d%n", (num1 / num2));

}

}