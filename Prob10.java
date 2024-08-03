import java.util.Scanner;

public class Prob10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the total selling price of 15 items: ");
        double totalSellingPrice = scanner.nextDouble();

        System.out.print("Enter the profit percentage: ");
        double profitPercentage = scanner.nextDouble();
        double totalCostPrice = totalSellingPrice / (1 + profitPercentage / 100);
        double costPricePerItem = totalCostPrice / 15;

        System.out.println("The cost price of one item is: " + costPricePerItem);
    }
}
