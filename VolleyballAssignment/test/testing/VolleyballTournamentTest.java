package testing;
import org.junit.jupiter.api.Test;
import java.util.Collection;
import static org.junit.jupiter.api.Assertions.*;

class VolleyballTournamentTest {

    @Test
    void addTeam(String teamA) {
        VolleyballTournamentTest tournament = new VolleyballTournamentTest();
        tournament.addTeam("Team A");
        tournament.addTeam("Team B");

    }


    @Test
    void addMatch(String teamA,String teamB) {
        VolleyballTournamentTest tournament = new VolleyballTournamentTest();
        tournament.addTeam("Team A");
        tournament.addTeam("Team B");
        tournament.addMatch("Team A", "Team B");

        assertEquals(1, tournament.getMatches().size());
    }

    private Collection<Object> getMatches()
    {
        return getMatches();
    }


    @Test
    void recordPoint() {
        VolleyballTournamentTest tournament = new VolleyballTournamentTest();
        tournament.addTeam("Team A");
        tournament.addTeam("Team B");
        tournament.addMatch("Team A", "Team B");

        tournament.recordPoint();

        assertNotNull(tournament.getMatchResults());
    }

    private Object getMatchResults() {
        return getMatchResults();
    }

    @Test
    String getTournamentWinner() {
        VolleyballTournamentTest tournament = new VolleyballTournamentTest();
        tournament.addTeam("Team A");
        tournament.addTeam("Team B");
        tournament.addMatch("Team A", "Team B");
        tournament.recordPoint();

        String winner = tournament.getTournamentWinner();

        assertEquals("Team A", winner);
        return winner;
    }

    @Test
    void displayTournamentResults() {
        VolleyballTournamentTest tournament = new VolleyballTournamentTest();
        tournament.addTeam("Team A");
        tournament.addTeam("Team B");
        tournament.addMatch("Team A", "Team B");
        tournament.recordPoint();

        assertNotNull(tournament.getMatchResults());
    }
}
