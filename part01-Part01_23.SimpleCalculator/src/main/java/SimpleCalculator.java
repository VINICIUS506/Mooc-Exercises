
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int valueOne = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int valueTwo = Integer.valueOf(scanner.nextLine());

        int sum = valueOne + valueTwo;
        int sub = valueOne - valueTwo;
        int mult = valueOne * valueTwo;
        double div = (double) valueOne / valueTwo;

        System.out.println(valueOne + " + " + valueTwo + " = " + sum);
        System.out.println(valueOne + " - " + valueTwo + " = " + sub);
        System.out.println(valueOne + " * " + valueTwo + " = " + mult);
        System.out.println(valueOne + " / " + valueTwo + " = " + div);
    }
}
