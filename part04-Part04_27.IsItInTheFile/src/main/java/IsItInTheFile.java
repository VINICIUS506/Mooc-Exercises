
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        boolean fileFound = true;
        ArrayList<String> list = new ArrayList<>();

        try (Scanner reader = new Scanner(Paths.get(file))) {
            while (reader.hasNextLine()) {
                list.add(reader.nextLine());
            }
        } catch (Exception e) {
            fileFound = false;
        }

        boolean searchedFound = false;
        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        if (!fileFound) {
            System.out.println("Reading the file " + file + " failed.");
            return; // Stops the program immediately
        } else {
            for(String searching : list) {
                if (searching.equals(searchedFor)) {
                    searchedFound = true;
                }
            }
        }

        if (searchedFound) {
            System.out.println("Found!");
        } else {
            System.out.println("Not found.");
        }

    }
}
