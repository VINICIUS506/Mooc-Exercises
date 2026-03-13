
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String longestName = "";
        int length = 0;
        int sum = 0;
        int count = 0;
        double average = 0.0;

        while (true) {
            String text = scanner.nextLine();

            if (text.equals("")) {
                break;
            }

            String[] pieces = text.split(",");
            String name = pieces[0];
            sum += Integer.valueOf(pieces[1]);
            count++;

            // Checking longest name
            if (name.length() > length) {
                length = name.length();
                longestName = name;
            }

            // Calculating average
            average = ((double) sum / count);
        }

        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + average);
    }
}
