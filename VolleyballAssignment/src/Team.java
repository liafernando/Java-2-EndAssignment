/**
 * Represents a volleyball team in the tournament.
 */
public class Team {
    private String name; // Name of the team.
    private int tournamentPoints; // Points earned by the team in the tournament.

    /**
     * Constructor to initialize a team with its name.
     *
     * @param name The name of the team.
     */
    public Team(String name) {
        this.name = name;
        this.tournamentPoints = 0; // Initialize points to zero.
    }

    /**
     * Get the name of the team.
     *
     * @return The name of the team.
     */
    public String getName() {
        return name;
    }

    /**
     * Get the total tournament points earned by the team.
     *
     * @return The total tournament points earned by the team.
     */
    public int getTournamentPoints() {
        return tournamentPoints;
    }

    /**
     * Add tournament points to the team's total points.
     *
     * @param points The points to be added to the team's total points.
     */
    public void addTournamentPoints(int points) {
        tournamentPoints += points;
    }

    /**
     * Override toString to provide a readable representation of the team (its name).
     *
     * @return The name of the team as a string.
     */
    @Override
    public String toString() {
        return name;
    }
}
