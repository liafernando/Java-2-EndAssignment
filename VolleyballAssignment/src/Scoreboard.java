import java.util.Scanner;


/**
 * This class provides a simple way to run the VolleyballTournament.
 */
public class Scoreboard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VolleyballTournament tournament = new VolleyballTournament();


// Add teams
        tournament.addTeam("Team A");
        tournament.addTeam("Team B");
        tournament.addTeam("Team C");

        // Add matches
        tournament.addMatch("Team A", "Team B");
        tournament.addMatch("Team B", "Team C");
        tournament.addMatch("Team C", "Team A");

        // Record points
        tournament.recordPoint("Team A");
        tournament.recordPoint("Team A");
        tournament.recordPoint("Team A");
        tournament.recordPoint("Team B");
        tournament.recordPoint("Team B");
        tournament.recordPoint("Team C");

        // Display tournament results
        tournament.displayTournamentResults();
    }

}
