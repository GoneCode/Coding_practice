# Day 1 Study Notes - Programming Fundamentals
**Date:** March 26, 2026
**Phase:** 1 - Programming Fundamentals
**Topic:** Variables, Data Types, Basic I/O, and Operators

---

## 🎯 Today's Learning Objectives

By the end of today, you should be able to:
- [ ] Understand different data types and when to use them
- [ ] Perform basic input/output operations
- [ ] Use arithmetic and comparison operators
- [ ] Write simple conditional statements (if/else)
- [ ] Solve 3 beginner-level problems

**Estimated Time:** 2-3 hours

---

## 📚 Theory: Core Concepts

### 1. Variables and Data Types

A **variable** is a container that stores data. Think of it as a labeled box.

#### Common Data Types:

| Data Type | Description | Example | Memory Size |
|-----------|-------------|---------|-------------|
| `int` | Whole numbers | 42, -10, 0 | 4 bytes |
| `long` | Large whole numbers | 1234567890L | 8 bytes |
| `float` | Decimal numbers | 3.14f, -0.5f | 4 bytes |
| `double` | Precise decimals | 3.14159, 2.71828 | 8 bytes |
| `char` | Single character | 'A', 'z', '5' | 2 bytes |
| `boolean` | True/False | true, false | 1 bit |
| `String` | Text/words | "Hello", "DSA" | varies |

#### Variable Declaration (Java):
```java
// Syntax: dataType variableName = value;
int age = 25;
double price = 99.99;
char grade = 'A';
String name = "John";
boolean isPassed = true;
```

**Important Rules:**
- Variable names are case-sensitive (`age` ≠ `Age`)
- Must start with letter or underscore (`_age`, `age1` ✅ | `1age` ❌)
- Cannot use keywords (`int`, `class`, `public`)
- Use meaningful names (`studentCount` better than `x`)

---

### 2. Operators

#### Arithmetic Operators
```java
int a = 10, b = 3;

int sum = a + b;        // 13 (Addition)
int diff = a - b;       // 7  (Subtraction)
int product = a * b;    // 30 (Multiplication)
int quotient = a / b;   // 3  (Division - integer division!)
int remainder = a % b;  // 1  (Modulo - remainder)

// Watch out!
int x = 10 / 3;         // x = 3 (not 3.333)
double y = 10.0 / 3;    // y = 3.333... (correct)
```

**Common Mistake:**
```java
int result = 5 / 2;           // result = 2 (WRONG if you want 2.5)
double result = 5.0 / 2.0;    // result = 2.5 (CORRECT)
```

#### Comparison Operators
```java
int a = 5, b = 10;

boolean isEqual = (a == b);      // false (equal to)
boolean isNotEqual = (a != b);   // true  (not equal)
boolean isGreater = (a > b);     // false (greater than)
boolean isLess = (a < b);        // true  (less than)
boolean isGreaterEq = (a >= b);  // false (greater or equal)
boolean isLessEq = (a <= b);     // true  (less or equal)
```

#### Logical Operators
```java
boolean x = true, y = false;

boolean and = x && y;    // false (both must be true)
boolean or = x || y;     // true  (at least one true)
boolean not = !x;        // false (opposite)
```

#### Increment/Decrement
```java
int count = 5;

count++;     // count = 6 (post-increment)
++count;     // count = 7 (pre-increment)
count--;     // count = 6 (post-decrement)
--count;     // count = 5 (pre-decrement)

// Difference:
int a = 5;
int b = a++;  // b = 5, then a = 6 (use then increment)
int c = ++a;  // a = 7, then c = 7 (increment then use)
```

---

### 3. Basic Input/Output

#### Output (Printing)
```java
System.out.print("Hello");      // No newline
System.out.println("World");    // With newline
System.out.println("Age: " + 25);  // Concatenation

// Formatted output
System.out.printf("Pi = %.2f\n", 3.14159);  // Pi = 3.14
```

#### Input (Reading)
```java
import java.util.Scanner;

Scanner sc = new Scanner(System.in);

// Reading different types
int num = sc.nextInt();           // Read integer
double decimal = sc.nextDouble(); // Read decimal
String word = sc.next();          // Read single word
String line = sc.nextLine();      // Read entire line
char ch = sc.next().charAt(0);    // Read character

sc.close();  // Always close scanner
```

**Example Program:**
```java
import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("Hello " + name + ", you are " + age + " years old!");

        sc.close();
    }
}
```

---

### 4. Conditional Statements

#### If-Else
```java
int marks = 75;

if (marks >= 90) {
    System.out.println("Grade: A");
} else if (marks >= 80) {
    System.out.println("Grade: B");
} else if (marks >= 70) {
    System.out.println("Grade: C");
} else {
    System.out.println("Grade: F");
}
```

#### Ternary Operator (Shorthand)
```java
int age = 18;
String status = (age >= 18) ? "Adult" : "Minor";
System.out.println(status);  // Adult
```

#### Switch Statement
```java
int day = 3;

switch(day) {
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    case 3:
        System.out.println("Wednesday");
        break;
    default:
        System.out.println("Invalid day");
}
```

---

## 💻 Today's Practice Problems

### Problem 1: Sum of Two Numbers ⭐ Easy
**Description:** Write a program to take two numbers as input and print their sum.

**Input:**
```
5 10
```

**Output:**
```
15
```

**Starter Code:**
```java
import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Your code here

        sc.close();
    }
}
```

**Hints:**
- Use `sc.nextInt()` to read two integers
- Add them and print the result
- Time complexity: O(1)

---

### Problem 2: Check Even or Odd ⭐ Easy
**Description:** Write a program to check if a number is even or odd.

**Input:**
```
7
```

**Output:**
```
Odd
```

**Input:**
```
12
```

**Output:**
```
Even
```

**Approach:**
- A number is even if `num % 2 == 0`
- Otherwise it's odd

**Starter Code:**
```java
import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        // Your code here

        sc.close();
    }
}
```

---

### Problem 3: Find Largest of 3 Numbers ⭐ Easy
**Description:** Given three numbers, find and print the largest one.

**Input:**
```
5 12 8
```

**Output:**
```
12
```

**Approach 1 (Using if-else):**
```java
if (a >= b && a >= c) {
    largest = a;
} else if (b >= a && b >= c) {
    largest = b;
} else {
    largest = c;
}
```

**Approach 2 (Using Math.max):**
```java
int largest = Math.max(a, Math.max(b, c));
```

**Starter Code:**
```java
import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // Your code here

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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int sum = num1 + num2;
        System.out.println(sum);

        sc.close();
    }
}
```

**Explanation:**
1. Create Scanner object to read input
2. Read two integers using `nextInt()`
3. Add them and store in `sum`
4. Print the result
5. Close the scanner

---

### Problem 2 Solution:
```java
import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        sc.close();
    }
}
```

**Explanation:**
1. Read the number
2. Use modulo operator (%) to check remainder when divided by 2
3. If remainder is 0, it's even; otherwise odd

---

### Problem 3 Solution:
```java
import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int largest;

        if (a >= b && a >= c) {
            largest = a;
        } else if (b >= a && b >= c) {
            largest = b;
        } else {
            largest = c;
        }

        System.out.println(largest);

        sc.close();
    }
}
```

**Explanation:**
1. Read three numbers
2. Compare: if `a` is greater than both `b` and `c`, `a` is largest
3. Else if `b` is greater than both `a` and `c`, `b` is largest
4. Otherwise, `c` is largest
5. Print the result

---

## 🎓 Key Concepts Summary

### What You Learned Today:
1. ✅ **Variables** store data with specific types
2. ✅ **Operators** perform operations (arithmetic, comparison, logical)
3. ✅ **Input/Output** using Scanner and System.out
4. ✅ **Conditionals** make decisions (if/else)
5. ✅ **Modulo (%)** finds remainder - useful for even/odd checks

### Important Formulas:
- **Check Even:** `num % 2 == 0`
- **Check Odd:** `num % 2 != 0`
- **Check Divisible by n:** `num % n == 0`
- **Last digit:** `num % 10`
- **Remove last digit:** `num / 10`

---

## ⚠️ Common Mistakes to Avoid

1. **Integer Division:**
   ```java
   int x = 5 / 2;      // x = 2 (WRONG for decimal)
   double y = 5.0 / 2; // y = 2.5 (CORRECT)
   ```

2. **Comparison vs Assignment:**
   ```java
   if (x = 5) { }   // WRONG! (assignment)
   if (x == 5) { }  // CORRECT (comparison)
   ```

3. **Scanner Not Closed:**
   ```java
   Scanner sc = new Scanner(System.in);
   // ... use scanner ...
   sc.close();  // DON'T FORGET!
   ```

4. **Reading After nextInt():**
   ```java
   int num = sc.nextInt();
   String line = sc.nextLine();  // Gets empty string!
   // Fix: add sc.nextLine() after nextInt() to consume newline
   ```

5. **Missing Break in Switch:**
   ```java
   switch(x) {
       case 1:
           System.out.println("One");
           break;  // Don't forget!
       case 2:
           System.out.println("Two");
           break;
   }
   ```

---

## 🏃‍♂️ Practice Exercises (Bonus)

If you finish early, try these:

### Bonus 1: Simple Calculator
Write a program that takes two numbers and an operator (+, -, *, /) and performs the operation.

**Input:**
```
10 5 +
```
**Output:**
```
15
```

### Bonus 2: Swap Two Numbers
Swap two numbers without using a third variable.

**Hint:** Use arithmetic operations
```java
a = a + b;
b = a - b;
a = a - b;
```

### Bonus 3: Temperature Converter
Convert Celsius to Fahrenheit using formula: F = (C × 9/5) + 32

**Input:**
```
25
```
**Output:**
```
77.0
```

---

## 📝 Today's Checklist

Before you finish Day 1:
- [ ] Read and understand all theory sections
- [ ] Type and run all example code (don't just read!)
- [ ] Solve Problem 1 (Sum of Two Numbers)
- [ ] Solve Problem 2 (Check Even or Odd)
- [ ] Solve Problem 3 (Find Largest of 3)
- [ ] Try at least 1 bonus problem
- [ ] Update your practice tracker
- [ ] Write down any questions/doubts

---

## 🔗 Additional Resources

### Video Tutorials:
- Variables and Data Types: [Search "Java variables tutorial"]
- Input/Output in Java: [Search "Scanner class Java"]
- If-Else Statements: [Search "Java conditional statements"]

### Practice Platforms:
- **HackerRank:** Java Introduction track
- **LeetCode:** #1480 (Running Sum), #1672 (Richest Customer)
- **GeeksforGeeks:** Basic Java problems

### Reading:
- Java Documentation: Scanner class
- Java Operators reference guide

---

## 💡 Tips for Success

1. **Type, don't copy-paste** - Muscle memory matters!
2. **Run every example** - See the output yourself
3. **Experiment** - Change values, break things, learn!
4. **Take breaks** - 25 min work, 5 min break (Pomodoro)
5. **Don't rush** - Understanding > Speed at this stage

---

## 📅 Tomorrow's Preview

**Day 2 Topics:**
- Loops (for, while, do-while)
- Nested loops
- Pattern printing
- Practice problems on loops

**Get Ready To:**
- Print patterns (triangles, pyramids)
- Calculate sums using loops
- Iterate through ranges

---

## ✍️ Notes Section

**What I found difficult:**


**What I found easy:**


**Questions to research:**


**Aha moments:**


---

**Remember:** Every expert was once a beginner. You've got this! 💪

**Next:** Update your `DSA_PRACTICE_TRACKER.md` with today's progress!
