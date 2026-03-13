
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double sum = 0;
        double amountPositives = 0;

        while (true) {
            double number = Double.valueOf(scanner.nextLine());

            if (number == 0){
                break;
            }

            if (number > 0){
                amountPositives = amountPositives + 1;
                sum = sum + number;
                continue;
            }
        }

        if (amountPositives == 0){
            System.out.println("Cannot calculate the average");
        } else {
            double average = sum / amountPositives;
            System.out.println(average);
        }
    }
}
