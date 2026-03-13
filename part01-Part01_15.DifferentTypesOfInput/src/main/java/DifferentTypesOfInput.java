
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string: ");
        String text = scanner.nextLine();
        System.out.println("Give an integer: ");
        int value = Integer.valueOf(scanner.nextLine());
        System.out.println("Give a double: ");
        double floatingValue = Double.valueOf(scanner.nextLine());
        System.out.println("Give a boolean: ");
        boolean bool = Boolean.valueOf(scanner.nextLine());

        System.out.println("You gave the string " + text);
        System.out.println("You gave the integer " + value);
        System.out.println("You gave the double " + floatingValue);
        System.out.println("You gave the boolean " + bool);
    }
}
