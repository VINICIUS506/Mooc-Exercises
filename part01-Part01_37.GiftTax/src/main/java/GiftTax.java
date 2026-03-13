
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Value of the gift?");
        double value = Double.valueOf(scan.nextLine());
        double minimumValue = 0.0;
        double taxRate = 0.0;
        double minimumTax = 0.0;

        if (value < 5000) {
            System.out.println("No tax!");
        } else if (value >= 5000 && value < 25000) {
            minimumValue = 5000;
            minimumTax = 100;
            taxRate = 0.08;
        } else if (value >= 25000 && value < 55000) {
            minimumValue = 25000;
            minimumTax = 1700;
            taxRate = 0.10;
        } else if (value >= 55000 && value < 200000) {
            minimumValue = 55000;
            minimumTax = 4700;
            taxRate = 0.12;
        } else if (value >= 200000 && value < 1000000) {
            minimumValue = 200000;
            minimumTax = 22100;
            taxRate = 0.15;
        } else {
            minimumValue = 1000000;
            minimumTax = 142100;
            taxRate = 0.17;
        }

        if (taxRate > 0) {
            double giftTax = (minimumTax + (value - minimumValue) * taxRate);

            System.out.println("Tax: " + giftTax);
        }
    }
}
