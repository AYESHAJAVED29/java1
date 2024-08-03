import java.util.Scanner;

public class Prob6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Taking two positive numbers as input from the user
        System.out.print("Enter the base number: ");
        int base = scanner.nextInt();
        System.out.print("Enter the exponent number: ");
        int exponent = scanner.nextInt();
        double result = Math.pow(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);

        scanner.close();
    }
}
