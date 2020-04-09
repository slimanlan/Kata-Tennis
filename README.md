# Kata-Tennis

Sprint 1: 

Players start with a score of 0 after each game of Tennis.
Players earn points in the following sequences:  0, 15, 30, 40.

If a player earns 40 points, then he wins the game as long as the other player does not gain 40 points.  

If both players have 40 points, then there is "deuce".

Deuce:

Scoring during "deuce" gives the player an advantage. 

If the other player scores too, then we return "deuce" again.

If a player has an advantage and scores again, that player wins the 
game.

Sprint 2 : 

For each tennis match, the players start with a score of 0 sets.
Players win set (for each game owned) in the following sequence: 1, 2, 3, 4, 5, 6, 7.

If a player reach the Set score of 6 and the other player has a Set score of 4 or lower, the player wins the Set.

If a player wins a Game and reach the Set score of 6 and the other player has a Set score of 5, a new Game must be played and the first player who reaches the score of 7 wins the match.

The Tie-Break rule will be activated, when the 2 players win 6 Games.Then the players win set in the following sequences :  1, 2, 3, 4, 5, 6, 7, 8, 9, 10... 

In this case the player won the match when he gets a least 7 points and 2 points more than his opponent. 
