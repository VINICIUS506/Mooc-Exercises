
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File: ");
        String file = scan.nextLine();
        System.out.println("Team: ");
        String team = scan.nextLine();

        // Keep track of total games, wins and losses the team has
        int games = 0;
        int wins = 0;
        int losses = 0;

        try (Scanner scanner = new Scanner(Paths.get(file))) {
            while(scanner.hasNextLine()) {
                String line = scanner.nextLine();

                String[] parts = line.split(",");
                String team1 = parts[0];
                String team2 = parts[1];
                int team1Score = Integer.valueOf(parts[2]);
                int team2Score = Integer.valueOf(parts[3]);

                if (team1.equals(team) && team1Score > team2Score || team2.equals(team) && team2Score > team1Score) {
                        wins++;
                        games++;
                } else if (team1.equals(team) && team1Score < team2Score || team2.equals(team) && team2Score < team1Score) {
                        losses++;
                        games++;
                } 
            }
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }

        System.out.println("Games: " + games);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);

    }

}
