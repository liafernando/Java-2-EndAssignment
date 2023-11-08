/**
 * Represents a volleyball match between two teams.
 */
public class Match {
    private Team team1; // The first team in the match.
    private Team team2; // The second team in the match.
    private int scoreTeam1; // The score of the first team.
    private int scoreTeam2; // The score of the second team.

    /**
     * Constructor to initialize a match with two participating teams.
     *
     * @param team1 The first team in the match.
     * @param team2 The second team in the match.
     */
    public Match(Team team1, Team team2) {
        this.team1 = team1;
        this.team2 = team2;
        this.scoreTeam1 = 0; // Initialize the first team's score to zero.
        this.scoreTeam2 = 0; // Initialize the second team's score to zero.
    }

    /**
     * Add a point to the team that scored in the match.
     *
     * @param team The team that scored a point.
     */
    public void addPoint(Team team) {
        if (team == team1) {
            scoreTeam1++;
        } else if (team == team2) {
            scoreTeam2++;
        }
    }

    /**
     * Check if the match is over based on the scoring rules.
     *
     * @return True if the match is over, false otherwise.
     */
    public boolean isMatchOver() {
        return (scoreTeam1 >= 25 || scoreTeam2 >= 25) && Math.abs(scoreTeam1 - scoreTeam2) >= 2;
    }

    /**
     * Determine the winner of the match and update tournament points accordingly.
     *
     * @return The name of the winning team.
     */
    public String getWinner() {
        if (scoreTeam1 > scoreTeam2) {
            team1.addTournamentPoints(3); // If team 1 wins, add 3 tournament points.
            return team1.getName(); // Return the name of team 1 as the winner.
        } else {
            team2.addTournamentPoints(3); // If team 2 wins, add 3 tournament points.
            return team2.getName(); // Return the name of team 2 as the winner.
        }
    }

    /**
     * Determine the loser of the match.
     *
     * @return The name of the losing team.
     */
    public String getLoser() {
        return scoreTeam1 > scoreTeam2 ? team2.getName() : team1.getName();
    }

    /**
     * Get the result of the match in the format "scoreTeam1 - scoreTeam2".
     *
     * @return The match result as a string.
     */
    public String getResult() {
        return scoreTeam1 + " - " + scoreTeam2;
    }
}
