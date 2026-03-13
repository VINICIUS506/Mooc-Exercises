
public class StarSign {

    public static void main(String[] args) {

        
        //The tests are not checking the main, so you can modify it freely.
        //NB: If the tests don't seem to pass, you should try the methods here
        //in the main to make sure they print the correct shapes!

        // Stars test:
        printStars(5);
        printStars(3);
        printStars(9);
        System.out.println("\n");

        // Square test:
        printSquare(4);
        System.out.println("\n");

        // Rectangle test:
        printRectangle(17, 3);
        System.out.println("\n");

        // Triangle test:
        printTriangle(4);
    }

    public static void printStars(int number) {
        // first part of the exercise
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.print("\n");
    }

    public static void printSquare(int size) {
        // second part of the exercise
        int number = 0;
        while (number < size) {
            printStars(size);
            number++;
        }
    }

    public static void printRectangle(int width, int height) {
        // third part of the exercise
        int number = 0;
        while (number < height) {
            printStars(width);
            number++;
        }
    }

    public static void printTriangle(int size) {
        // fourth part of the exercise
        int number = 1;
        while (number < (size + 1)) {
            printStars(number);
            number++;
        }
    }
}
