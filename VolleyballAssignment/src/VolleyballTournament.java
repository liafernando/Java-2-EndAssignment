import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Manages a volleyball tournament by tracking matches and teams.
 */
public class VolleyballTournament {
    private List<Match> matches; // List to store matches
    private Map<String, Team> teams; // Map to store teams

    /**
     * Initializes a new volleyball tournament with empty match and team lists.
     */
    public VolleyballTournament() {
        this.matches = new ArrayList<>();
        this.teams = new HashMap<>();
    }

    /**
     * Adds a new team to the tournament.
     *
     * @param name The name of the team to be added.
     */
    public void addTeam(String name) {
        teams.put(name, new Team(name));
    }


    /**
     * Adds a new match between two teams to the tournament.
     *
     * @param team1Name The name of the first team.
     * @param team2Name The name of the second team.
     */
    public void addMatch(String team1Name, String team2Name) {
        Team team1 = teams.get(team1Name);
        Team team2 = teams.get(team2Name);
        if (team1 != null && team2 != null) {
            matches.add(new Match(team1, team2));
        } else {
            System.out.println("Invalid team names");
        }
    }

    /**
     * Records a point for a team in an ongoing match.
     *
     * @param teamName The name of the team that scored a point.
     */
    public void recordPoint(String teamName) {
        Team team = teams.get(teamName);
        if (team != null) {
            for (Match match : matches) {
                if (!match.isMatchOver()) {
                    match.addPoint(team);
                } else {
                    System.out.println("Match result: " + match.getResult());
                    System.out.println("Winner: " + match.getWinner());
                    System.out.println("Loser: " + match.getLoser());
                    break;
                }
            }
        } else {
            System.out.println("Invalid team name");
        }
    }

    /**
     * Gets the winner of the tournament based on points earned in matches.
     *
     * @return The name of the tournament winner or "No winner yet" if there is no winner.
     */
    public String getTournamentWinner() {
        Team winner = null;
        for (Team team : teams.values()) {
            if (winner == null || team.getTournamentPoints() > winner.getTournamentPoints()) {
                winner = team;
            }
        }
        return winner != null ? winner.getName() : "No winner yet";
    }

    /**
     * Displays the results of all matches and the tournament winner.
     */
    public void displayTournamentResults() {
        for (Match match : matches) {
            System.out.println("Match result: " + match.getResult());
            System.out.println("Winner: " + match.getWinner());
            System.out.println("Loser: " + match.getLoser());
            System.out.println();
        }
        System.out.println("Tournament Winner: " + getTournamentWinner());
    }
}
