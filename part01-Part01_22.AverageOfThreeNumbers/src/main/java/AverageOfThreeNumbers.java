
import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int valueOne = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int valueTwo = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the third number:");
        int valueThree = Integer.valueOf(scanner.nextLine());

        double average = ((double) valueOne + valueTwo + valueThree) / 3;

        System.out.println("The average is " + average);
    }
}
