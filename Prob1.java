public class Prob1 {

    public static void main(String[] args) {
        double basicSalary = 105000;

        double dearnessAllowance = basicSalary * 0.40;  
        double houseRentAllowance = basicSalary * 0.20;

        double grossSalary = basicSalary + dearnessAllowance + houseRentAllowance;

        System.out.println("Ramesh's Basic Salary: " + basicSalary);
        System.out.println("Dearness Allowance: " + dearnessAllowance);
        System.out.println("House Rent Allowance: " + houseRentAllowance);
        System.out.println("Gross Salary: " + grossSalary);
    }
}