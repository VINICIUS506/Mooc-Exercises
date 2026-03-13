
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.print("\n");
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        int numberOfStars = 1;
        int numberOfSpaces = size - 1;
        while (numberOfStars < (size + 1)) {
            printSpaces(numberOfSpaces);
            printStars(numberOfStars);
            numberOfStars++;
            numberOfSpaces--;
        }

    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        int numberOfStars = 1;
        int numberOfSpaces = height - 1;
        int trunkHeight = 2;

        // Print the top of the tree:
        while (numberOfStars < (height * 2)) {
            printSpaces(numberOfSpaces);
            printStars(numberOfStars);
            numberOfStars = numberOfStars + 2;
            numberOfSpaces--;
        }

        // Print trunk of the tree
        for (int i = 0; i < trunkHeight; i++){
            printSpaces((height - 1) - 1);
            printStars(3);
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(4);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);  
    }
}
