# Day 3 Study Notes - Functions and Number Theory
**Date:** April 2, 2026
**Phase:** 1 - Programming Fundamentals
**Topic:** Functions/Methods, Parameters, Return Types, and Number Theory Problems

---

## 🎯 Today's Learning Objectives

By the end of today, you should be able to:
- [ ] Understand what functions/methods are and why they're important
- [ ] Create functions with parameters and return values
- [ ] Use functions to organize code and avoid repetition
- [ ] Solve number theory problems (GCD, LCM, Prime, Armstrong)
- [ ] Solve 4-5 function-based problems

**Estimated Time:** 2-3 hours

---

## 📚 Theory: Functions/Methods

### What is a Function?

A **function** (also called a **method** in Java) is a reusable block of code that performs a specific task.

**Why use functions?**
- **Code Reusability** - Write once, use many times
- **Organization** - Break large programs into smaller pieces
- **Readability** - Easier to understand and maintain
- **Debugging** - Easier to find and fix bugs
- **Abstraction** - Hide complex logic behind simple names

**Analogy:** Think of a function like a recipe. You write it once, then you can use it whenever you need it without rewriting all the steps.

---

### Function Syntax in Java

```java
accessModifier returnType functionName(parameters) {
    // function body
    return value;  // if returnType is not void
}
```

**Components:**
- **Access Modifier:** `public`, `private`, `protected` (we'll use `public static` for now)
- **Return Type:** What the function gives back (`int`, `double`, `String`, `void`)
- **Function Name:** Descriptive name (use camelCase)
- **Parameters:** Input values (optional)
- **Return Statement:** Sends value back to caller (required if return type is not `void`)

---

### Example 1: Simple Function (No Parameters, No Return)

```java
public class Example1 {
    // Function definition
    public static void greet() {
        System.out.println("Hello, World!");
    }

    public static void main(String[] args) {
        greet();  // Function call
        greet();  // Can call multiple times
    }
}
```

**Output:**
```
Hello, World!
Hello, World!
```

---

### Example 2: Function with Parameters

```java
public class Example2 {
    // Function with one parameter
    public static void greetUser(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public static void main(String[] args) {
        greetUser("Alice");   // Output: Hello, Alice!
        greetUser("Bob");     // Output: Hello, Bob!
    }
}
```

**Key Point:** Parameters are like variables that receive values when the function is called.

---

### Example 3: Function with Return Value

```java
public class Example3 {
    // Function that returns a value
    public static int add(int a, int b) {
        int sum = a + b;
        return sum;  // Send result back
    }

    public static void main(String[] args) {
        int result = add(5, 3);        // result = 8
        System.out.println(result);

        System.out.println(add(10, 20));  // Direct use: 30
    }
}
```

**Important:**
- If return type is not `void`, you MUST return a value
- The return statement exits the function immediately

---

### Example 4: Multiple Parameters

```java
public class Example4 {
    public static int findMax(int a, int b, int c) {
        int max = a;

        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }

        return max;
    }

    public static void main(String[] args) {
        int largest = findMax(5, 12, 8);
        System.out.println("Largest: " + largest);  // 12
    }
}
```

---

### Example 5: Function Calling Another Function

```java
public class Example5 {
    public static int square(int n) {
        return n * n;
    }

    public static int sumOfSquares(int a, int b) {
        return square(a) + square(b);  // Calling square() function
    }

    public static void main(String[] args) {
        int result = sumOfSquares(3, 4);
        System.out.println(result);  // 9 + 16 = 25
    }
}
```

---

## 📊 Function Types Summary

| Type | Return Type | Parameters | Example |
|------|-------------|------------|---------|
| **Type 1** | void | No | `void greet()` |
| **Type 2** | void | Yes | `void greet(String name)` |
| **Type 3** | non-void | No | `int getRandom()` |
| **Type 4** | non-void | Yes | `int add(int a, int b)` |

---

## 🔢 Number Theory Problems

### 1. Prime Number Check

**What is a Prime Number?**
A number greater than 1 that is divisible only by 1 and itself.

**Examples:**
- Prime: 2, 3, 5, 7, 11, 13, 17, 19, 23...
- Not Prime: 4 (2×2), 6 (2×3), 8 (2×4), 9 (3×3)...

**Approach:**
Check if any number from 2 to n-1 divides n. If yes, it's not prime.

```java
public static boolean isPrime(int n) {
    if (n <= 1) {
        return false;  // 0, 1, and negatives are not prime
    }

    for (int i = 2; i < n; i++) {
        if (n % i == 0) {
            return false;  // Found a divisor, not prime
        }
    }

    return true;  // No divisors found, it's prime
}
```

**Optimized Approach:**
Only check up to √n (square root of n)

```java
public static boolean isPrimeOptimized(int n) {
    if (n <= 1) return false;
    if (n == 2) return true;
    if (n % 2 == 0) return false;  // Even numbers except 2

    for (int i = 3; i * i <= n; i += 2) {  // Only odd numbers
        if (n % i == 0) {
            return false;
        }
    }

    return true;
}
```

**Why √n?**
If n = a × b, and a > √n, then b < √n. So we only need to check up to √n.

**Time Complexity:**
- Basic: O(n)
- Optimized: O(√n)

---

### 2. GCD (Greatest Common Divisor)

**What is GCD?**
The largest number that divides both numbers evenly.

**Example:** GCD(12, 18) = 6
- Divisors of 12: 1, 2, 3, 4, 6, 12
- Divisors of 18: 1, 2, 3, 6, 9, 18
- Common: 1, 2, 3, 6
- Greatest: 6

**Approach 1: Brute Force**
```java
public static int gcdBruteForce(int a, int b) {
    int gcd = 1;
    int min = Math.min(a, b);

    for (int i = 1; i <= min; i++) {
        if (a % i == 0 && b % i == 0) {
            gcd = i;
        }
    }

    return gcd;
}
```

**Approach 2: Euclidean Algorithm (Best!)**
```java
public static int gcd(int a, int b) {
    while (b != 0) {
        int temp = b;
        b = a % b;
        a = temp;
    }
    return a;
}
```

**How Euclidean Algorithm Works:**
GCD(48, 18):
1. 48 % 18 = 12 → GCD(18, 12)
2. 18 % 12 = 6 → GCD(12, 6)
3. 12 % 6 = 0 → GCD(6, 0)
4. Answer: 6

**Recursive Version:**
```java
public static int gcdRecursive(int a, int b) {
    if (b == 0) {
        return a;
    }
    return gcdRecursive(b, a % b);
}
```

**Time Complexity:** O(log(min(a, b)))

---

### 3. LCM (Least Common Multiple)

**What is LCM?**
The smallest number that is a multiple of both numbers.

**Example:** LCM(12, 18) = 36
- Multiples of 12: 12, 24, 36, 48...
- Multiples of 18: 18, 36, 54...
- Common: 36, 72...
- Least: 36

**Formula:**
```
LCM(a, b) = (a × b) / GCD(a, b)
```

**Code:**
```java
public static int lcm(int a, int b) {
    return (a * b) / gcd(a, b);
}
```

**Important:** Calculate GCD first, then use formula to avoid overflow:
```java
public static int lcmSafe(int a, int b) {
    return (a / gcd(a, b)) * b;  // Divide first to prevent overflow
}
```

---

### 4. Armstrong Number

**What is an Armstrong Number?**
A number that equals the sum of its digits each raised to the power of the number of digits.

**Examples:**
- **153** = 1³ + 5³ + 3³ = 1 + 125 + 27 = 153 ✅
- **9474** = 9⁴ + 4⁴ + 7⁴ + 4⁴ = 6561 + 256 + 2401 + 256 = 9474 ✅
- **123** = 1³ + 2³ + 3³ = 1 + 8 + 27 = 36 ❌ (not Armstrong)

**Approach:**
1. Count the number of digits
2. Extract each digit
3. Calculate sum of (digit ^ count)
4. Compare with original number

**Code:**
```java
public static boolean isArmstrong(int num) {
    int original = num;
    int digits = countDigits(num);
    int sum = 0;

    while (num > 0) {
        int digit = num % 10;
        sum += Math.pow(digit, digits);
        num /= 10;
    }

    return sum == original;
}

public static int countDigits(int num) {
    int count = 0;
    while (num > 0) {
        num /= 10;
        count++;
    }
    return count;
}
```

**Common Armstrong Numbers:**
- 1-digit: 1, 2, 3, 4, 5, 6, 7, 8, 9
- 3-digit: 153, 370, 371, 407
- 4-digit: 1634, 8208, 9474

---

### 5. Palindrome Number

**What is a Palindrome?**
A number that reads the same forwards and backwards.

**Examples:**
- Palindrome: 121, 1331, 12321, 0, 7
- Not Palindrome: 123, 1234, 100

**Approach:**
Reverse the number and check if it equals the original.

```java
public static boolean isPalindrome(int num) {
    int original = num;
    int reverse = 0;

    while (num > 0) {
        int digit = num % 10;
        reverse = reverse * 10 + digit;
        num /= 10;
    }

    return reverse == original;
}
```

---

### 6. Perfect Number

**What is a Perfect Number?**
A number that equals the sum of its proper divisors (excluding itself).

**Examples:**
- **6** = 1 + 2 + 3 ✅
- **28** = 1 + 2 + 4 + 7 + 14 ✅
- **12** = 1 + 2 + 3 + 4 + 6 = 16 ❌

**Code:**
```java
public static boolean isPerfect(int num) {
    int sum = 0;

    for (int i = 1; i < num; i++) {
        if (num % i == 0) {
            sum += i;
        }
    }

    return sum == num;
}
```

**Optimized Version:**
```java
public static boolean isPerfectOptimized(int num) {
    if (num <= 1) return false;

    int sum = 1;  // 1 is always a divisor

    for (int i = 2; i * i <= num; i++) {
        if (num % i == 0) {
            sum += i;
            if (i != num / i) {  // Avoid counting same divisor twice
                sum += num / i;
            }
        }
    }

    return sum == num;
}
```

---

## 💻 Today's Practice Problems

### Problem 1: Create a Function to Check Even/Odd ⭐ Easy

**Description:** Write a function that returns true if a number is even, false otherwise.

**Function Signature:**
```java
public static boolean isEven(int num)
```

**Test Cases:**
```java
isEven(4)  → true
isEven(7)  → false
isEven(0)  → true
isEven(-2) → true
```

**Starter Code:**
```java
import java.util.Scanner;

public class Problem1 {
    public static boolean isEven(int num) {
        // Your code here
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (isEven(num)) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        sc.close();
    }
}
```

---

### Problem 2: Factorial Function ⭐ Easy

**Description:** Write a function to calculate factorial of a number.

**Function Signature:**
```java
public static long factorial(int n)
```

**Test Cases:**
```java
factorial(5) → 120
factorial(0) → 1
factorial(1) → 1
factorial(7) → 5040
```

**Starter Code:**
```java
import java.util.Scanner;

public class Problem2 {
    public static long factorial(int n) {
        // Your code here
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(factorial(n));

        sc.close();
    }
}
```

**Hint:** Use a loop to multiply 1 × 2 × 3 × ... × n

---

### Problem 3: Check Prime Number ⭐⭐ Medium

**Description:** Write a function to check if a number is prime.

**Function Signature:**
```java
public static boolean isPrime(int n)
```

**Test Cases:**
```java
isPrime(7)  → true
isPrime(12) → false
isPrime(2)  → true
isPrime(1)  → false
isPrime(29) → true
```

**Starter Code:**
```java
import java.util.Scanner;

public class Problem3 {
    public static boolean isPrime(int n) {
        // Your code here
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (isPrime(n)) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }

        sc.close();
    }
}
```

**Hint:** Check if any number from 2 to n-1 divides n

---

### Problem 4: Calculate GCD ⭐⭐ Medium

**Description:** Write a function to find GCD of two numbers using Euclidean algorithm.

**Function Signature:**
```java
public static int gcd(int a, int b)
```

**Test Cases:**
```java
gcd(48, 18) → 6
gcd(100, 50) → 50
gcd(17, 19) → 1
gcd(0, 5) → 5
```

**Starter Code:**
```java
import java.util.Scanner;

public class Problem4 {
    public static int gcd(int a, int b) {
        // Your code here (use Euclidean algorithm)
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(gcd(a, b));

        sc.close();
    }
}
```

**Hint:** While b ≠ 0, keep replacing (a, b) with (b, a % b)

---

### Problem 5: Check Armstrong Number ⭐⭐ Medium

**Description:** Write a function to check if a number is an Armstrong number.

**Function Signature:**
```java
public static boolean isArmstrong(int num)
```

**Test Cases:**
```java
isArmstrong(153)  → true  (1³ + 5³ + 3³ = 153)
isArmstrong(9474) → true  (9⁴ + 4⁴ + 7⁴ + 4⁴ = 9474)
isArmstrong(123)  → false
isArmstrong(9)    → true  (single digit)
```

**Starter Code:**
```java
import java.util.Scanner;

public class Problem5 {
    public static int countDigits(int num) {
        // Count number of digits
    }

    public static boolean isArmstrong(int num) {
        // Your code here
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (isArmstrong(num)) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }

        sc.close();
    }
}
```

---

## 🔍 Step-by-Step Solutions

### Problem 1 Solution:
```java
import java.util.Scanner;

public class Problem1 {
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (isEven(num)) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        sc.close();
    }
}
```

**Explanation:**
- Use modulo operator to check remainder
- Return true if remainder is 0 (even), false otherwise
- Works for negative numbers too!

---

### Problem 2 Solution:
```java
import java.util.Scanner;

public class Problem2 {
    public static long factorial(int n) {
        long result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(factorial(n));

        sc.close();
    }
}
```

**Explanation:**
1. Start with result = 1
2. Multiply by each number from 1 to n
3. Return the final product
4. Use `long` to handle larger values

**Time Complexity:** O(n)

---

### Problem 3 Solution:
```java
import java.util.Scanner;

public class Problem3 {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (isPrime(n)) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }

        sc.close();
    }
}
```

**Optimized Version:**
```java
public static boolean isPrimeOptimized(int n) {
    if (n <= 1) return false;
    if (n == 2) return true;
    if (n % 2 == 0) return false;

    for (int i = 3; i * i <= n; i += 2) {
        if (n % i == 0) {
            return false;
        }
    }

    return true;
}
```

**Time Complexity:**
- Basic: O(n)
- Optimized: O(√n)

---

### Problem 4 Solution:
```java
import java.util.Scanner;

public class Problem4 {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(gcd(a, b));

        sc.close();
    }
}
```

**Example Trace for gcd(48, 18):**
1. a=48, b=18 → temp=18, b=48%18=12, a=18
2. a=18, b=12 → temp=12, b=18%12=6, a=12
3. a=12, b=6 → temp=6, b=12%6=0, a=6
4. b=0, return a=6

**Time Complexity:** O(log(min(a, b)))

---

### Problem 5 Solution:
```java
import java.util.Scanner;

public class Problem5 {
    public static int countDigits(int num) {
        int count = 0;
        while (num > 0) {
            num /= 10;
            count++;
        }
        return count;
    }

    public static boolean isArmstrong(int num) {
        int original = num;
        int digits = countDigits(num);
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }

        return sum == original;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (isArmstrong(num)) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }

        sc.close();
    }
}
```

**Example for 153:**
- digits = 3
- 1³ + 5³ + 3³ = 1 + 125 + 27 = 153 ✅

**Time Complexity:** O(d) where d is number of digits

---

## 🎓 Key Concepts Summary

### What You Learned Today:
1. ✅ **Functions/Methods** - Reusable code blocks
2. ✅ **Parameters** - Input to functions
3. ✅ **Return Values** - Output from functions
4. ✅ **Prime Numbers** - Divisible only by 1 and itself
5. ✅ **GCD** - Greatest Common Divisor (Euclidean algorithm)
6. ✅ **LCM** - Least Common Multiple
7. ✅ **Armstrong Numbers** - Sum of digits to power of digit count
8. ✅ **Code Organization** - Breaking programs into functions

### Important Algorithms:
- **Prime Check:** Loop from 2 to √n
- **GCD:** Euclidean algorithm (while b ≠ 0)
- **LCM:** (a × b) / GCD(a, b)
- **Armstrong:** Count digits, sum of (digit ^ count)
- **Palindrome:** Reverse number and compare

---

## ⚠️ Common Mistakes to Avoid

### 1. Missing Return Statement
```java
// WRONG - missing return for non-void function
public static int add(int a, int b) {
    int sum = a + b;
    // Missing return!
}

// CORRECT
public static int add(int a, int b) {
    int sum = a + b;
    return sum;
}
```

### 2. Wrong Return Type
```java
// WRONG - function returns value but declared void
public static void getSum(int a, int b) {
    return a + b;  // ERROR!
}

// CORRECT
public static int getSum(int a, int b) {
    return a + b;
}
```

### 3. Parameter Order Matters
```java
public static int divide(int a, int b) {
    return a / b;
}

divide(10, 2);  // Returns 5
divide(2, 10);  // Returns 0 (integer division!)
```

### 4. Modifying Original vs Copy
```java
// Primitive types pass by value (copy)
public static void modify(int x) {
    x = 10;  // Only changes the copy
}

int num = 5;
modify(num);
System.out.println(num);  // Still 5!
```

### 5. Unreachable Code After Return
```java
public static int example() {
    return 5;
    System.out.println("Hi");  // UNREACHABLE! Compiler error
}
```

---

## 🏃‍♂️ Bonus Practice Exercises

### Bonus 1: LCM Function
Write a function to calculate LCM of two numbers.

**Formula:** LCM(a, b) = (a × b) / GCD(a, b)

**Test:**
```java
lcm(12, 18) → 36
lcm(5, 7) → 35
```

### Bonus 2: Print Primes in Range
Write a function to print all prime numbers from 1 to N.

**Input:** 20
**Output:** 2 3 5 7 11 13 17 19

### Bonus 3: Reverse Number Function
Write a function that reverses a number.

**Test:**
```java
reverse(12345) → 54321
reverse(100) → 1
```

### Bonus 4: Sum of Digits Function
Write a function to find sum of digits.

**Test:**
```java
sumOfDigits(12345) → 15
sumOfDigits(999) → 27
```

### Bonus 5: Power Function
Write your own power function (without Math.pow).

**Test:**
```java
power(2, 3) → 8
power(5, 2) → 25
```

### Bonus 6: Fibonacci Function
Write a function to return the Nth Fibonacci number.

**Test:**
```java
fibonacci(6) → 8  (0,1,1,2,3,5,8)
fibonacci(10) → 55
```

---

## 📝 Today's Checklist

Before you finish Day 3:
- [ ] Understand what functions are and why they're useful
- [ ] Know how to write functions with parameters
- [ ] Know how to return values from functions
- [ ] Solve Problem 1 (isEven function)
- [ ] Solve Problem 2 (Factorial function)
- [ ] Solve Problem 3 (Prime check)
- [ ] Solve Problem 4 (GCD)
- [ ] Solve Problem 5 (Armstrong number)
- [ ] Try at least 2 bonus problems
- [ ] Update practice tracker
- [ ] Write at least 3 functions on your own

---

## 🔗 Additional Resources

### Video Tutorials:
- Java Methods/Functions: [Search "Java methods tutorial"]
- Prime Number Algorithm: [Search "prime number check Java"]
- GCD Euclidean Algorithm: [Search "Euclidean algorithm explained"]

### Practice Platforms:
- **HackerRank:** "Java Method" challenges
- **LeetCode:** #9 (Palindrome Number), #204 (Count Primes)
- **GeeksforGeeks:** Number theory problems

### Reading:
- Java methods documentation
- Number theory basics

---

## 💡 Tips for Success

1. **Write Small Functions** - Each function should do ONE thing well
2. **Use Descriptive Names** - `calculateSum()` better than `func1()`
3. **Test Functions** - Call with different inputs to verify correctness
4. **Reuse Functions** - Once written, use them everywhere you can
5. **Think Before Coding** - Plan your function's inputs and outputs first

**Function Naming Conventions:**
- `isXXX()` - Returns boolean (isPrime, isEven)
- `getXXX()` - Returns a value (getMax, getSum)
- `calculateXXX()` - Performs calculation (calculateGCD)
- `printXXX()` - Prints output (printPattern)

---

## 📅 Tomorrow's Preview

**Day 4 Topics:**
- Arrays (Introduction)
- Array operations
- Searching in arrays
- Array problems

**Get Ready To:**
- Store multiple values in one variable
- Iterate through arrays
- Solve array manipulation problems

---

## ✍️ Notes Section

**What I found difficult:**


**What I found easy:**


**Questions to research:**


**Functions I want to practice more:**


**Aha moments:**


---

**Remember:** Functions are the building blocks of organized, reusable code. Master them! 💪

**Next:** Update your `DSA_PRACTICE_TRACKER.md` and start thinking in terms of functions!
