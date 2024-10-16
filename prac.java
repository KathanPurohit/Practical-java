import java.util.Scanner;

public class prac {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of items: ");
        int numItems = scanner.nextInt();

        int[] productCodes = new int[numItems];
        double[] prices = new double[numItems];

        for (int i = 0; i < numItems; i++) {
            System.out.print("Enter the product code for item " + (i + 1) + ": ");
            productCodes[i] = scanner.nextInt();
            System.out.print("Enter the price for item " + (i + 1) + ": ");
            prices[i] = scanner.nextDouble();
        }

        double totalBill = calculateTotalBill(productCodes, prices);

        System.out.println("The total bill including tax is: $" + totalBill);

        scanner.close();
    }

    public static double calculateTotalBill(int[] productCodes, double[] prices) {
        double totalBill = 0;

        for (int i = 0; i < productCodes.length; i++) {
            double taxRate = getTaxRate(productCodes[i]);
            double taxAmount = prices[i] * taxRate / 100;
            totalBill += prices[i] + taxAmount;
        }

        return totalBill;
    }

    public static double getTaxRate(int productCode) {
        switch (productCode) {
            case 1: return 8.0;
            case 2: return 12.0;
            case 3: return 5.0;
            case 4: return 7.5;
            default: return 3.0;
        }
    }
}

