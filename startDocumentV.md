Start Document VolleyBall

Start document of Ameli Fernando, Student number: 5078970

Problem Description

The Dutch volleyball union asked you to develop a Java application for registering scores of a volleyball tournament. National and international teams are competing against each other in the tournament. Every match consists of two teams who play against each other. The match is won by the team who scores 25 points first. There should be a point difference of two with the other team also. So it is possible to have a match result of 38 – 36; but also 25 – 20. The application should return all the necessary information per match: the team who won, the team that lost, the score of each team and the difference in points. When a national team wins, it earns 3 tournament points. International teams earn 2 tournament points when they win.
It should be possible to add one point at a time or start with predefined points. It should also be possible to get the winner of the tournament. This is the team with the most tournament points.
For publishing the results on their website, the volleyball union wants to have an overview of the tournament, with the results.

Input

In this section the input and output of the application will be described.

In the table below all the input (that the user has to input in order to make the application work) are described.

| Case          | Type    | Conditions                   |
| ------------- | ------- | :--------------------------- |
| Team Names    | String  | Names of participating teams |
| Match Results | Integer | Scores for each match        |

Output

| Case                                                         | Type   |
| ------------------------------------------------------------ | ------ |
| Match Result: The result of each match                       | String |
| Tournament Winner: The team with the most tournament points  | String |
| Tournament Results: An overview of all matches and the tournament winner | String |

Calculations

The application will perform the following calculations:

| Case               | Description                                                  |
| ------------------ | ------------------------------------------------------------ |
| Points Calculation | National Team Wins: 3 points, International Team Wins: 2 points |
| Match Winner       | The team that scores 25 points first with a point difference of 2 wins |

Remarks

- Input is validated to ensure that team names are correct.
- Only the `VolleyballTournament` class contains `System.out.println` for displaying results.
- Unit tests will be provided for testing the application's functionality.

Class Diagram

![Screenshot 2023-11-07 at 23.30.39](/Users/liafernando/Desktop/Screenshot 2023-11-07 at 23.30.39.png)

Test Data

In the following table you'll find all the data that is needed for testing.

Team

| Input            | ID   | Code                    |
| ---------------- | ---- | ----------------------- |
| Name             | ID:0 | New name(1)             |
| TournamentPoints | ID:1 | New TournamentPoints(1) |

Match

| Input | ID   | Code         |
| ----- | ---- | ------------ |
| Match | ID:1 | New match(1) |

Tournament 

| Input                 | ID    | Code                  |
| --------------------- | ----- | --------------------- |
| TournamentWinner      | ID: 0 | New TournamentWinner  |
| Tournamentant Results | ID: 1 | New TournamentResults |



Test Cases

In this section the testcases will be described. Every test case should be executed with the test data as starting point.

Test Case 1: Adding Teams

| Step   | Input        | Actions | Expected Output                             |
| ------ | ------------ | ------- | ------------------------------------------- |
| Step 1 | Add "Team A" |         | Number of teams: 1 (Team A)                 |
| Step 2 | Add "Team B" |         | Number of teams: 2 (Team A, Team B)         |
| Step 3 | Add "Team C" |         | Number of teams: 3 (Team A, Team B, Team C) |

**Test Case 2: Adding Matches**

| Step   | Input                         | Actions | Expected Output                                              |
| ------ | ----------------------------- | ------- | ------------------------------------------------------------ |
| Step 1 | Add match "Team A vs. Team B" |         | Number of matches: 1 (Team A vs. Team B)                     |
| Step 2 | Add match "Team B vs. Team C" |         | Number of matches: 2 (Team A vs. Team B, Team B vs. Team C)  |
| Step 3 | Add match "Team C vs. Team A" |         | Number of matches: 3 (Team A vs. Team B, Team B vs. Team C, Team C vs. Team A) |

**Test Case 3: Recording Points**

| Step   | Input                   | Actions                  | Expected Output       |
| ------ | ----------------------- | ------------------------ | --------------------- |
| Step 1 | Team A scores 25 points | Record points for Team A | Match result: 25 - 0  |
| Step 2 | Team B scores 25 points | Record points for Team B | Match result: 25 - 25 |
| Step 3 | Team C scores 25 points | Record points for Team C | Match result: 25 - 25 |

**Test Case 4: Getting Tournament Winner**

| Step   | Input                 | Action | Expected Output                  |
| ------ | --------------------- | ------ | -------------------------------- |
| Step 1 | Get tournament winner |        | Tournament Winner: No winner yet |

**Test Case 5: Displaying Tournament Results**

| Step   | Input                      | Action | Expected Output                            |
| ------ | -------------------------- | ------ | ------------------------------------------ |
| Step 1 | Display tournament results |        | (Result for each match, Tournament Winner) |

**Test Case 6: Invalid Team Name**

| Step   | Input                                                  | Action                 | Expected Output              |
| ------ | ------------------------------------------------------ | ---------------------- | ---------------------------- |
| Step 1 | Attempt to add invalid match "Invalid Team vs. Team A" | Invalid team VS Team A | "Invalid team names" message |

**Test Case 7: Ongoing Match Results**

| Step   | Input                  | Action                   | Expected Output     |
| ------ | ---------------------- | ------------------------ | ------------------- |
| Step 1 | Team A scores 5 points | Record points for Team A | Match result: 5 - 0 |

**Test Case 8: Match Ending**

| Step   | Input                   | Action                   | Expected Output      |
| ------ | ----------------------- | ------------------------ | -------------------- |
| Step 1 | Team A scores 25 points | Record points for Team A | Match result: 25 - 0 |

**Test Case 9: Adding Duplicate Teams**

| Step   | Input        | Action | Expected Output                     |
| ------ | ------------ | ------ | ----------------------------------- |
| Step 1 | Add "Team A" | Team A | "Invalid team name" message         |
| Step 2 | Add "Team B" | Team B | Number of teams: 2 (Team A, Team B) |
| Step 3 | Add "Team B" | Team C | "Invalid team name" message         |

Test Case 10: Adding Duplicate Matches

| Step   | Input                         | Action            | Expected Output                          |
| ------ | ----------------------------- | ----------------- | ---------------------------------------- |
| Step 1 | Add match "Team A vs. Team B" | Team A vs. Team B | Number of matches: 1 (Team A vs. Team B) |
| Step 2 | Add match "Team A vs. Team B" | Team A vs. Team B | "Match already exists" message           |
| Step 3 | Add match "Team B vs. Team A" | Team B vs. Team A | "Match already exists" message           |

**Test Case 11: Adding Teams to Ongoing Matches**

| Step   | Input                         | Action                   | Expected Output                          |
| ------ | ----------------------------- | ------------------------ | ---------------------------------------- |
| Step 1 | Add match "Team A vs. Team B" | Team A vs. Team B        | Number of matches: 1 (Team A vs. Team B) |
| Step 2 | Team A scores 25 points       | Record points for Team A | "Invalid team name" message              |
| Step 3 | Add "Team C"                  |                          | "Invalid team name" message              |

**Test Case 12: Ongoing Match Result Before Completion**

| Step   | Input                         | Action                   | Expected Output                          |
| ------ | ----------------------------- | ------------------------ | ---------------------------------------- |
| Step 1 | Add match "Team A vs. Team B" |                          | Number of matches: 1 (Team A vs. Team B) |
| Step 2 | Team A scores 10 points       | Record points for Team A | Match result: 10 - 0                     |
| Step 3 | Team B scores 15 points       | Record points for Team B | Match result: 15 - 10                    |

**Test Case 13: Getting Tournament Winner After Matches**

| Step   | Input                   | Action                   | Expected Output                  |
| ------ | ----------------------- | ------------------------ | -------------------------------- |
| Step 1 | Get tournament winner   |                          | Tournament Winner: No winner yet |
| Step 2 | Team A scores 25 points | Record points for Team A | Tournament Winner: Team A        |
| Step 3 | Team B scores 25 points | Record points for Team B | Tournament Winner: Team B        |

**Test Case 14: Displaying Tournament Results After Matches**

| Step   | Input                      | Action | Expected Output                            |
| ------ | -------------------------- | ------ | ------------------------------------------ |
| Step 1 | Display tournament results |        | (Result for each match, Tournament Winner) |

**Test Case 15: Adding Matches After Tournament Ends**

| Step   | Input                         | Action                   | Expected Output                      |
| ------ | ----------------------------- | ------------------------ | ------------------------------------ |
| Step 1 | Team A scores 25 points       | Record points for Team A | Match result: 25 - 0                 |
| Step 2 | Add match "Team A vs. Team B" |                          | "Tournament is already over" message |

Test Case 16: Adding Teams After Tournament Ends**

| Step   | Input                   | Action                   | Expected Output                      |
| ------ | ----------------------- | ------------------------ | ------------------------------------ |
| Step 1 | Team A scores 25 points | Record points for Team A | Match result: 25 - 0                 |
| Step 2 | Add "Team D"            | Add Team D               | "Tournament is already over" message |

**Test Case 17: Adding a Team with an Existing Name**

| Step | Input                    | Action           | Expected Output     |
| ---- | ------------------------ | ---------------- | ------------------- |
| 1    | Action: Add Team A       | Add Team A       | No specific output  |
| 2    | Action: Add Team A again | Add Team A again | "Invalid team name" |