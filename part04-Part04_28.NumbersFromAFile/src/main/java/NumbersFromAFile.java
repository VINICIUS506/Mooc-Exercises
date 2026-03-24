
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        // Keep track of the numbers in the range of upper and lower bound
        int amountInRange = 0;

        try (Scanner reader = new Scanner(Paths.get(file))) {
            while(reader.hasNextLine()) {
                int row = Integer.valueOf(reader.nextLine());
                if (inRange(row, lowerBound, upperBound)) {
                    amountInRange++;
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Numbers: " + amountInRange);

    }

    public static boolean inRange(int number, int min, int max) {
        return number >= min && number <= max;
    }

}