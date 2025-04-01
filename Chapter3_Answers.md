# Chapter 3 Answers

## Exercise 1

### 3.10
The `if` statement and `while` statement are similar in that both control the flow of execution based on a condition. However, the `if` statement is a single-selection control structure that executes a block of code only once if the condition is true. In contrast, the `while` statement is a repetition structure that continues executing a block of code as long as the condition remains true.

### 3.11
When a Java program divides one integer by another, it performs integer division, discarding the fractional part of the result. To retain decimal precision, at least one operand should be cast to `double` or `float` before division.

### 3.12
Control statements can be combined in two ways: (1) Nesting, where one control statement is placed inside another, and (2) Sequential execution, where multiple control statements are executed one after another.

### 3.13
For summing the first 100 positive integers, a `for` loop is appropriate. For summing an arbitrary number of positive integers, a `while` loop with sentinel-controlled repetition is better.

### 3.14
Preincrementing (`++x`) increases the value before using it in an expression, while postincrementing (`x++`) increases the value after using it.

### 3.15
#### a) Error: Semicolon after `if` statement; incorrect closing quote in `System.out.println`.
```java
if (age >= 65)
    System.out.println("Age is greater than or equal to 65");
else
    System.out.println("Age is less than 65");
```

#### b) Error: `total` is uninitialized.
```java
int x = 1, total = 0;
while (x <= 10) {
    total += x;
    ++x;
}
```

#### c) Error: Missing braces for multiple statements.
```java
while (x <= 100) {
    total += x;
    ++x;
}
```

#### d) Error: Infinite loop due to incorrect increment direction.
```java
while (y > 0) {
    System.out.println(y);
    --y;
}
```

## Exercise 2

### 3.17 (Gas Mileage)
Develop a Java program that takes miles driven and gallons used as input, calculates miles per gallon, and displays both individual and cumulative mileage.

### 3.18 (Credit Limit Calculator)
A Java program should accept account details, compute the new balance, and determine if the credit limit is exceeded.

### 3.19 (Sales Commission Calculator)
The program calculates weekly earnings based on a $200 base salary plus 9% commission on sales.

### 3.20 (Salary Calculator)
A Java program should calculate gross pay, considering overtime pay for hours beyond 40.

### 3.21 (Find the Largest Number)
Using a loop, the program reads 10 numbers, tracking the largest value entered.

### 3.22 (Tabular Output)
A Java loop prints a formatted table of values.

### 3.23 (Find the Two Largest Numbers)
Modify Exercise 3.21 to find the two largest values among 10 inputs.

### 3.24 (Validating User Input)
Modify the program in Figure 3.10 to repeatedly prompt the user until a valid input (1 or 2) is entered.

### 3.25 (Checkerboard Pattern of Asterisks)
A Java program using nested loops to display a checkerboard pattern.

## Making a Difference

### 3.38 (Enforcing Privacy with Cryptography)
Encrypt a four-digit integer by modifying each digit and swapping positions; implement decryption by reversing these steps.

### 3.39 (World Population Growth)
A Java program calculates and displays world population growth for the next 75 years, assuming a constant growth rate, and predicts when the population doubles.
