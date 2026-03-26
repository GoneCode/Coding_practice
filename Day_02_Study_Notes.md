# Day 2 Study Notes - Loops and Iterations
**Date:** March 27, 2026
**Phase:** 1 - Programming Fundamentals
**Topic:** Loops (for, while, do-while) and Pattern Printing

---

## 🎯 Today's Learning Objectives

By the end of today, you should be able to:
- [ ] Understand and use all three types of loops (for, while, do-while)
- [ ] Know when to use each type of loop
- [ ] Write nested loops for pattern printing
- [ ] Solve iteration-based problems
- [ ] Solve 3-4 beginner-level loop problems

**Estimated Time:** 2-3 hours

---

## 📚 Theory: Loops

**What is a Loop?**
A loop is a programming construct that repeats a block of code multiple times until a condition is met.

**Why do we need loops?**
- Avoid writing repetitive code
- Process collections of data
- Repeat actions until a condition changes

---

### 1. For Loop

**Best for:** When you know exactly how many times to repeat.

#### Syntax:
```java
for (initialization; condition; update) {
    // code to repeat
}
```

#### Flow:
1. **Initialization** - Runs once at the start
2. **Condition** - Checked before each iteration
3. **Code Block** - Executes if condition is true
4. **Update** - Runs after each iteration
5. Repeat from step 2

#### Example 1: Print 1 to 5
```java
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}
// Output: 1 2 3 4 5
```

**Breakdown:**
- `int i = 1` - Start at 1
- `i <= 5` - Continue while i is 5 or less
- `i++` - Increment i by 1 after each iteration

#### Example 2: Print Even Numbers from 2 to 10
```java
for (int i = 2; i <= 10; i += 2) {
    System.out.print(i + " ");
}
// Output: 2 4 6 8 10
```

#### Example 3: Countdown from 10 to 1
```java
for (int i = 10; i >= 1; i--) {
    System.out.print(i + " ");
}
// Output: 10 9 8 7 6 5 4 3 2 1
```

#### Example 4: Sum of First N Numbers
```java
int n = 5;
int sum = 0;

for (int i = 1; i <= n; i++) {
    sum += i;  // sum = sum + i
}

System.out.println("Sum = " + sum);
// Output: Sum = 15 (1+2+3+4+5)
```

---

### 2. While Loop

**Best for:** When you don't know how many iterations needed beforehand.

#### Syntax:
```java
while (condition) {
    // code to repeat
}
```

#### Flow:
1. Check condition
2. If true, execute code block
3. Repeat from step 1
4. If false, exit loop

#### Example 1: Print 1 to 5
```java
int i = 1;
while (i <= 5) {
    System.out.println(i);
    i++;
}
// Output: 1 2 3 4 5
```

#### Example 2: Count Digits in a Number
```java
int num = 12345;
int count = 0;

while (num > 0) {
    num = num / 10;  // Remove last digit
    count++;
}

System.out.println("Digits: " + count);
// Output: Digits: 5
```

**Step-by-step for num = 123:**
- Iteration 1: num = 12, count = 1
- Iteration 2: num = 1, count = 2
- Iteration 3: num = 0, count = 3
- Exit (num is not > 0)

#### Example 3: Reverse a Number
```java
int num = 12345;
int reverse = 0;

while (num > 0) {
    int digit = num % 10;           // Get last digit
    reverse = reverse * 10 + digit; // Append to reverse
    num = num / 10;                 // Remove last digit
}

System.out.println("Reverse: " + reverse);
// Output: Reverse: 54321
```

**Step-by-step for num = 123:**
- Iteration 1: digit = 3, reverse = 3, num = 12
- Iteration 2: digit = 2, reverse = 32, num = 1
- Iteration 3: digit = 1, reverse = 321, num = 0

---

### 3. Do-While Loop

**Best for:** When you want to execute the code at least once, regardless of condition.

#### Syntax:
```java
do {
    // code to repeat
} while (condition);
```

#### Flow:
1. Execute code block (always runs at least once)
2. Check condition
3. If true, repeat from step 1
4. If false, exit

#### Difference from While:
```java
// While loop - may not execute at all
int i = 10;
while (i < 5) {
    System.out.println(i);  // Never prints
}

// Do-While loop - executes at least once
int j = 10;
do {
    System.out.println(j);  // Prints 10 once
} while (j < 5);
```

#### Example: Menu-Driven Program
```java
import java.util.Scanner;

Scanner sc = new Scanner(System.in);
int choice;

do {
    System.out.println("1. Add");
    System.out.println("2. Subtract");
    System.out.println("3. Exit");
    System.out.print("Enter choice: ");
    choice = sc.nextInt();

    if (choice == 1) {
        System.out.println("Adding...");
    } else if (choice == 2) {
        System.out.println("Subtracting...");
    }

} while (choice != 3);

System.out.println("Goodbye!");
```

---

### 4. Loop Comparison

| Feature | For Loop | While Loop | Do-While Loop |
|---------|----------|------------|---------------|
| **Best for** | Known iterations | Unknown iterations | At least 1 execution |
| **Condition check** | Before each iteration | Before each iteration | After each iteration |
| **Guaranteed execution** | No | No | Yes (at least once) |
| **Common use** | Counting, arrays | Reading input | Menu systems |

---

### 5. Nested Loops

**What is a nested loop?**
A loop inside another loop.

#### Example 1: Multiplication Table
```java
for (int i = 1; i <= 5; i++) {           // Outer loop
    for (int j = 1; j <= 10; j++) {      // Inner loop
        System.out.print(i * j + "\t");
    }
    System.out.println();  // New line after each row
}
```

**Output:**
```
1  2  3  4  5  6  7  8  9  10
2  4  6  8  10 12 14 16 18 20
3  6  9  12 15 18 21 24 27 30
4  8  12 16 20 24 28 32 36 40
5  10 15 20 25 30 35 40 45 50
```

#### How Nested Loops Work:
For outer loop i = 1:
- Inner loop runs completely (j = 1 to 10)

For outer loop i = 2:
- Inner loop runs completely again (j = 1 to 10)

And so on...

**Total iterations = Outer iterations × Inner iterations**
In above example: 5 × 10 = 50 iterations

---

### 6. Pattern Printing (Most Important for Practice!)

Patterns help you master nested loops and logical thinking.

#### Pattern 1: Square
```
* * * * *
* * * * *
* * * * *
* * * * *
* * * * *
```

**Code:**
```java
int n = 5;
for (int i = 1; i <= n; i++) {        // Rows
    for (int j = 1; j <= n; j++) {    // Columns
        System.out.print("* ");
    }
    System.out.println();
}
```

---

#### Pattern 2: Right-Angled Triangle
```
*
* *
* * *
* * * *
* * * * *
```

**Logic:** Row i has i stars

**Code:**
```java
int n = 5;
for (int i = 1; i <= n; i++) {
    for (int j = 1; j <= i; j++) {    // j goes up to i
        System.out.print("* ");
    }
    System.out.println();
}
```

---

#### Pattern 3: Inverted Right-Angled Triangle
```
* * * * *
* * * *
* * *
* *
*
```

**Logic:** Row i has (n - i + 1) stars

**Code:**
```java
int n = 5;
for (int i = 1; i <= n; i++) {
    for (int j = 1; j <= n - i + 1; j++) {
        System.out.print("* ");
    }
    System.out.println();
}
```

---

#### Pattern 4: Number Triangle
```
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
```

**Code:**
```java
int n = 5;
for (int i = 1; i <= n; i++) {
    for (int j = 1; j <= i; j++) {
        System.out.print(j + " ");
    }
    System.out.println();
}
```

---

#### Pattern 5: Pyramid (Centered Triangle)
```
    *
   * *
  * * *
 * * * *
* * * * *
```

**Logic:**
- Row i has (n - i) spaces and i stars

**Code:**
```java
int n = 5;
for (int i = 1; i <= n; i++) {
    // Print spaces
    for (int j = 1; j <= n - i; j++) {
        System.out.print(" ");
    }
    // Print stars
    for (int j = 1; j <= i; j++) {
        System.out.print("* ");
    }
    System.out.println();
}
```

---

#### Pattern 6: Diamond
```
    *
   * *
  * * *
 * * * *
* * * * *
 * * * *
  * * *
   * *
    *
```

**Code:**
```java
int n = 5;

// Upper half (pyramid)
for (int i = 1; i <= n; i++) {
    for (int j = 1; j <= n - i; j++) {
        System.out.print(" ");
    }
    for (int j = 1; j <= i; j++) {
        System.out.print("* ");
    }
    System.out.println();
}

// Lower half (inverted pyramid)
for (int i = n - 1; i >= 1; i--) {
    for (int j = 1; j <= n - i; j++) {
        System.out.print(" ");
    }
    for (int j = 1; j <= i; j++) {
        System.out.print("* ");
    }
    System.out.println();
}
```

---

### 7. Loop Control Statements

#### Break - Exit loop immediately
```java
for (int i = 1; i <= 10; i++) {
    if (i == 5) {
        break;  // Exit loop when i is 5
    }
    System.out.print(i + " ");
}
// Output: 1 2 3 4
```

#### Continue - Skip current iteration
```java
for (int i = 1; i <= 5; i++) {
    if (i == 3) {
        continue;  // Skip when i is 3
    }
    System.out.print(i + " ");
}
// Output: 1 2 4 5
```

#### Break vs Continue:
- **Break:** Exits the loop completely
- **Continue:** Skips to next iteration

---

## 💻 Today's Practice Problems

### Problem 1: Print 1 to N ⭐ Easy
**Description:** Write a program to print numbers from 1 to N.

**Input:**
```
10
```

**Output:**
```
1 2 3 4 5 6 7 8 9 10
```

**Starter Code:**
```java
import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Your code here

        sc.close();
    }
}
```

**Hints:**
- Use a for loop from 1 to n
- Print each number with a space

---

### Problem 2: Sum of N Natural Numbers ⭐ Easy
**Description:** Find the sum of first N natural numbers.

**Input:**
```
5
```

**Output:**
```
15
```

**Explanation:** 1 + 2 + 3 + 4 + 5 = 15

**Approach 1: Using Loop**
```java
int sum = 0;
for (int i = 1; i <= n; i++) {
    sum += i;
}
```

**Approach 2: Using Formula (Better!)**
```java
int sum = n * (n + 1) / 2;
```

**Mathematical Formula:** Sum = n × (n + 1) / 2

**Starter Code:**
```java
import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Your code here (try both approaches!)

        sc.close();
    }
}
```

---

### Problem 3: Factorial of N ⭐ Easy
**Description:** Find factorial of a number N. Factorial of N = N × (N-1) × (N-2) × ... × 1

**Input:**
```
5
```

**Output:**
```
120
```

**Explanation:** 5! = 5 × 4 × 3 × 2 × 1 = 120

**Special Cases:**
- 0! = 1
- 1! = 1

**Approach:**
```java
int factorial = 1;
for (int i = 1; i <= n; i++) {
    factorial *= i;  // factorial = factorial * i
}
```

**Starter Code:**
```java
import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Your code here

        sc.close();
    }
}
```

**Warning:** Factorial grows very fast!
- 10! = 3,628,800
- 20! = 2,432,902,008,176,640,000 (exceeds int range!)
- Use `long` for larger factorials

---

### Problem 4: Count Digits in a Number ⭐ Easy
**Description:** Count the number of digits in a given number.

**Input:**
```
12345
```

**Output:**
```
5
```

**Approach:**
Keep dividing by 10 until number becomes 0.

**Logic:**
```
12345 / 10 = 1234 (count = 1)
1234 / 10 = 123  (count = 2)
123 / 10 = 12    (count = 3)
12 / 10 = 1      (count = 4)
1 / 10 = 0       (count = 5)
```

**Starter Code:**
```java
import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        // Your code here

        sc.close();
    }
}
```

**Alternative Approach:**
```java
int digits = String.valueOf(num).length();
```

---

### Problem 5: Print Right-Angled Triangle Pattern ⭐⭐ Medium
**Description:** Print a right-angled triangle pattern of stars.

**Input:**
```
5
```

**Output:**
```
*
* *
* * *
* * * *
* * * * *
```

**Starter Code:**
```java
import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Your code here (use nested loops!)

        sc.close();
    }
}
```

**Hints:**
- Outer loop for rows (1 to n)
- Inner loop for columns (1 to current row number)

---

## 🔍 Step-by-Step Solutions

### Problem 1 Solution:
```java
import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }

        sc.close();
    }
}
```

**Time Complexity:** O(n)
**Space Complexity:** O(1)

---

### Problem 2 Solution:

**Approach 1: Loop**
```java
import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println(sum);
        sc.close();
    }
}
```

**Approach 2: Formula (Optimal)**
```java
import java.util.Scanner;

public class Problem2Optimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = n * (n + 1) / 2;

        System.out.println(sum);
        sc.close();
    }
}
```

**Time Complexity:**
- Approach 1: O(n)
- Approach 2: O(1) ✅ Better!

---

### Problem 3 Solution:
```java
import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long factorial = 1;  // Use long for larger numbers

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        System.out.println(factorial);
        sc.close();
    }
}
```

**Time Complexity:** O(n)
**Space Complexity:** O(1)

---

### Problem 4 Solution:
```java
import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int count = 0;

        while (num > 0) {
            num = num / 10;
            count++;
        }

        System.out.println(count);
        sc.close();
    }
}
```

**Edge Case:** What if num = 0?
```java
// Handle zero case
if (num == 0) {
    count = 1;
}
```

**Time Complexity:** O(log₁₀(n)) - depends on number of digits
**Space Complexity:** O(1)

---

### Problem 5 Solution:
```java
import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {        // Rows
            for (int j = 1; j <= i; j++) {    // Columns
                System.out.print("* ");
            }
            System.out.println();  // New line after each row
        }

        sc.close();
    }
}
```

**Analysis:**
- Row 1: 1 star
- Row 2: 2 stars
- Row 3: 3 stars
- Row n: n stars

**Time Complexity:** O(n²) - nested loops
**Space Complexity:** O(1)

---

## 🎓 Key Concepts Summary

### What You Learned Today:
1. ✅ **For Loop** - Best for known iterations
2. ✅ **While Loop** - Best for unknown iterations
3. ✅ **Do-While Loop** - Guarantees at least one execution
4. ✅ **Nested Loops** - Loop inside a loop
5. ✅ **Pattern Printing** - Using nested loops creatively
6. ✅ **Break & Continue** - Control loop flow

### Important Techniques:
- **Count digits:** Keep dividing by 10
- **Reverse number:** Extract last digit, build reverse
- **Factorial:** Multiply 1 × 2 × 3 × ... × n
- **Sum formula:** n × (n + 1) / 2
- **Patterns:** Outer loop = rows, Inner loop = columns

---

## ⚠️ Common Mistakes to Avoid

### 1. Infinite Loops
```java
// WRONG - i never changes!
int i = 1;
while (i <= 10) {
    System.out.println(i);
    // Missing i++
}

// CORRECT
int i = 1;
while (i <= 10) {
    System.out.println(i);
    i++;  // Don't forget!
}
```

### 2. Off-by-One Errors
```java
// Prints 1 to 9 (WRONG if you want 1 to 10)
for (int i = 1; i < 10; i++) {
    System.out.println(i);
}

// Prints 1 to 10 (CORRECT)
for (int i = 1; i <= 10; i++) {
    System.out.println(i);
}
```

### 3. Forgetting to Update Loop Variable
```java
// WRONG - infinite loop
int i = 0;
while (i < 5) {
    System.out.println(i);
    // i never increments!
}
```

### 4. Wrong Condition in While
```java
// WRONG - will cause error if num is 0
while (num != 0) {
    num = num / 10;
}

// CORRECT
while (num > 0) {
    num = num / 10;
}
```

### 5. Semicolon After Loop
```java
// WRONG - loop body is empty!
for (int i = 0; i < 5; i++); {
    System.out.println(i);  // Runs only once
}

// CORRECT
for (int i = 0; i < 5; i++) {
    System.out.println(i);
}
```

---

## 🏃‍♂️ Bonus Practice Exercises

### Bonus 1: Print Multiplication Table
Print multiplication table of N up to 10.

**Input:** 5
**Output:**
```
5 x 1 = 5
5 x 2 = 10
...
5 x 10 = 50
```

### Bonus 2: Check Prime Number
Check if a number is prime (divisible only by 1 and itself).

**Hint:** Check if any number from 2 to n-1 divides n.

**Input:** 7
**Output:** Prime

**Input:** 12
**Output:** Not Prime

### Bonus 3: Fibonacci Series
Print first N Fibonacci numbers: 0, 1, 1, 2, 3, 5, 8, 13...

**Logic:** Each number is sum of previous two.

**Input:** 7
**Output:** 0 1 1 2 3 5 8

### Bonus 4: Print Pyramid Pattern
```
    *
   ***
  *****
 *******
*********
```

**Hint:** Row i has (2×i - 1) stars

### Bonus 5: Sum of Digits
Find sum of all digits in a number.

**Input:** 12345
**Output:** 15 (1+2+3+4+5)

---

## 📝 Today's Checklist

Before you finish Day 2:
- [ ] Understand all three types of loops
- [ ] Know when to use each loop type
- [ ] Solve Problem 1 (Print 1 to N)
- [ ] Solve Problem 2 (Sum of N numbers)
- [ ] Solve Problem 3 (Factorial)
- [ ] Solve Problem 4 (Count digits)
- [ ] Solve Problem 5 (Triangle pattern)
- [ ] Try at least 2 bonus problems
- [ ] Update practice tracker
- [ ] Practice 2-3 more patterns on your own

---

## 🔗 Additional Resources

### Video Tutorials:
- For loops in Java: [Search "Java for loop tutorial"]
- While loops explained: [Search "Java while loop"]
- Pattern printing tricks: [Search "Java pattern programs"]

### Practice Platforms:
- **HackerRank:** "For Loop" and "While Loop" challenges
- **GeeksforGeeks:** Pattern printing programs
- **LeetCode:** #1342 (Number of Steps), #1281 (Subtract Product and Sum)

### Reading:
- Java loops documentation
- Pattern programming guide

---

## 💡 Pattern Printing Tips

1. **Identify the pattern:**
   - How many rows?
   - What's in each row?
   - Any spaces before stars/numbers?

2. **Break it down:**
   - Outer loop = rows
   - Inner loop(s) = columns/spaces/stars

3. **Find the relationship:**
   - Row 1: How many items?
   - Row 2: How many items?
   - Row i: How many items? (generalize)

4. **Test with small values:**
   - Try n = 3 or n = 4 first
   - Then test with n = 5

---

## 📅 Tomorrow's Preview

**Day 3 Topics:**
- More loop problems (advanced)
- Functions/Methods
- GCD and LCM
- Armstrong numbers

**Get Ready To:**
- Break code into reusable functions
- Understand return types and parameters
- Solve number theory problems

---

## ✍️ Notes Section

**What I found difficult:**


**What I found easy:**


**Questions to research:**


**Patterns I struggled with:**


**Aha moments:**


---

**Remember:** Pattern printing is VERY important for understanding nested loops. Don't skip it! 💪

**Next:** Update your `DSA_PRACTICE_TRACKER.md` after completing today's exercises!
