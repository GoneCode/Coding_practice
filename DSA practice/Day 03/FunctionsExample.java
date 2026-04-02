import java.util.Scanner;

public class FunctionsExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int result = factorial(number);
        System.out.println("Factorial of " + number + " is: " + result);

    }
    public static int factorial(int n){
        return (n==0 || n==1) ? 1 : n * factorial(n-1);
    }
}