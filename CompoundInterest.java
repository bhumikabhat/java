import java.util.Scanner;
public class CompoundInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double principal, rate, amount;
        int years, timescompounded;
        System.out.print("Enter the principal amount: ");
        principal = scanner.nextDouble();
        System.out.print("Enter the annual interest rate (in %): ");
        rate = scanner.nextDouble() ;
        System.out.print("Enter the number of years: ");
        years = scanner.nextInt();
        System.out.print("Enter the number of times that interest is compounded per year: ");
        timescompounded = scanner.nextInt();
        amount = principal * Math.pow((1 + (rate / 100) / timescompounded), timescompounded * years);
        System.out.printf("The accumulated amount after %d years is: %.2f%n", years, amount);
        scanner.close();
    }
}
