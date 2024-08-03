import java.util.Scanner;

public class Prob9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount to withdraw (in hundreds): ");
        int amount = scanner.nextInt() * 100;
        int notesOf100 = 0;
        int notesOf50 = 0;
        int notesOf10 = 0;
        
        if (amount >= 100) {
            notesOf100 = amount / 100;
            amount = amount % 100;
        }
        
        if (amount >= 50) {
            notesOf50 = amount / 50;
            amount = amount % 50;
        }
        
        if (amount >= 10) {
            notesOf10 = amount / 10;
        }

        System.out.println("Number of 100 notes: " + notesOf100);
        System.out.println("Number of 50 notes: " + notesOf50);
        System.out.println("Number of 10 notes: " + notesOf10);
    }
}

