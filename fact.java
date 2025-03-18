import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get user input
        System.out.print("Enter a number to find its factorial: ");
        int number = scanner.nextInt();
        
        // Initialize factorial result
        long factorial = 1;
        
        // Calculate factorial using a loop
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        
        // Display the result
        System.out.println("The factorial of " + number + " is: " + factorial);
        
        scanner.close();
    }
}

