import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get user input
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        
        // Calculate the sum
        int sum = num1 + num2;
        
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
        
        scanner.close();
    }
}

