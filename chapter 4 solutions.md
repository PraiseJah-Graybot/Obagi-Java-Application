
# Chapter 4 Solutions

## Exercise 1: Code Errors and Corrections

1. **Error**: `while (i <= 10);` contains a semicolon that ends the loop before the body.  
   **Fix**: Remove the semicolon.  
   **Corrected**:
   ```java
   int i = 1;
   while (i <= 10) {
       ++i;
   }
   ```

2. **Error**: Comparing floating-point values using `!=` is unreliable.  
   **Fix**: Use integer counters or a tolerance for comparison.  
   **Corrected**:
   ```java
   for (double k = 0.1; k < 1.0; k += 0.1)
       System.out.println(k);
   ```

3. **Error**: Missing `break` in `case 1` causes fall-through.  
   **Fix**: Add a `break` statement.  
   **Corrected**:
   ```java
   switch (n) {
       case 1:
           System.out.println("The number is 1");
           break;
       case 2:
           System.out.println("The number is 2");
           break;
       default:
           System.out.println("The number is not 1 or 2");
           break;
   }
   ```

4. **Error**: The loop condition `while (n < 10)` should be `<=` to include 10.  
   **Fix**: Change the condition.  
   **Corrected**:
   ```java
   int n = 1;
   while (n <= 10)
       System.out.println(n++);
   ```

## Exercise 2

**4.5** Four basic elements of counter-controlled repetition:
- A control variable (loop counter)
- The initial value of the control variable
- The increment/decrement of the control variable
- The loop-continuation condition

**4.6** `while` vs `for`:
- `while` is used when the number of iterations is not known beforehand.
- `for` is preferred when the number of iterations is known.

**4.7** `do...while` is used when the loop body should execute at least once.  
**Example**: Input validation loop.

**4.8** `break` vs `continue`:
- `break` terminates the loop entirely.
- `continue` skips the current iteration and continues with the next.

### 4.9 Code Fixes:

a) **Incorrect syntax**: use semicolons and correct condition.
```java
for (int i = 100; i >= 1; i--)
    System.out.println(i);
```

b) **Missing break statements**.
```java
switch (value % 2) {
    case 0:
        System.out.println("Even integer");
        break;
    case 1:
        System.out.println("Odd integer");
        break;
}
```

c) **Loop increment wrong for descending odd numbers**.
```java
for (int i = 19; i >= 1; i -= 2)
    System.out.println(i);
```

d) **Incorrect condition check in do-while loop**.
```java
int counter = 2;
do {
    System.out.println(counter);
    counter += 2;
} while (counter <= 100);
```

### 4.10 What does the following program do?

It prints 10 rows of 5 `@` characters each.
```java
public class Printing {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 5; j++)
                System.out.print('@');
            System.out.println();
        }
    }
}
```
