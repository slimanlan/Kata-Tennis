package com.kata.tennis;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TennisMatchTest {
		
	@Test
	public void match_start_with_game_score_0_0_and_match_set_0_0() {
		
		TennisMatch tennisMatch = new TennisMatch();
		assertEquals(tennisMatch.getGameScore(), "0-0");
		assertEquals(tennisMatch.getMatchSet(), "0-0");
	
	}
	
	@Test
	public void match_start_with_game_score_1_0_and_match_set_0_0() {
		
		TennisMatch tennisMatch = new TennisMatch();
		tennisMatch.firstPlayerScore();
		assertEquals(tennisMatch.getGameScore() , "15-0");
		assertEquals(tennisMatch.getMatchSet() , "0-0");
	
	}
	
	@Test
	public void match_start_with_game_score_3_0_and_match_set_0_0() {
		
		TennisMatch tennisMatch = new TennisMatch();
		tennisMatch.firstPlayerScore();
		tennisMatch.firstPlayerScore();
		tennisMatch.firstPlayerScore();
		assertEquals(tennisMatch.getGameScore() , "40-0");
		assertEquals(tennisMatch.getMatchSet() , "0-0");
	
	}
	
	
	@Test
	public void match_start_with_game_score_3_3_and_match_set_0_0() {
		
		TennisMatch tennisMatch = new TennisMatch();
		tennisMatch.firstPlayerScore();
		tennisMatch.firstPlayerScore();
		tennisMatch.firstPlayerScore();
		
		tennisMatch.secondPlayerScore();
		tennisMatch.secondPlayerScore();
		tennisMatch.secondPlayerScore();
		
		assertEquals(tennisMatch.getGameScore() , "deuce");
		assertEquals(tennisMatch.getMatchSet() , "0-0");
	
	}
	
	
	@Test
	public void match_start_with_game_score_advantage_and_match_set_0_0() {
		
		TennisMatch tennisMatch = new TennisMatch();
		tennisMatch.firstPlayerScore();
		tennisMatch.firstPlayerScore();
		tennisMatch.firstPlayerScore();
		
		tennisMatch.secondPlayerScore();
		tennisMatch.secondPlayerScore();
		tennisMatch.secondPlayerScore();
		
		tennisMatch.firstPlayerScore();
		
		assertEquals(tennisMatch.getGameScore() , "advantage first player");
		assertEquals(tennisMatch.getMatchSet() , "0-0");
	
	}
	
	@Test
	public void match_start_with_game_score_0_0_and_match_set_1_0() {
		
		TennisMatch tennisMatch = new TennisMatch();
		
		tennisMatch.firstPlayerScore();
		tennisMatch.firstPlayerScore();
		tennisMatch.firstPlayerScore();
		tennisMatch.firstPlayerScore();
		
		assertEquals(tennisMatch.getGameScore() , "0-0");
		assertEquals(tennisMatch.getMatchSet() , "1-0");
	
	}
	
	
	@Test
	public void match_start_with_game_score_0_0_and_match_set_1_1() {
		
		TennisMatch tennisMatch = new TennisMatch();
		
		tennisMatch.firstPlayerScore();
		tennisMatch.firstPlayerScore();
		tennisMatch.firstPlayerScore();
		tennisMatch.firstPlayerScore();
		

		tennisMatch.secondPlayerScore();
		tennisMatch.secondPlayerScore();
		tennisMatch.secondPlayerScore();
		tennisMatch.secondPlayerScore();
		
		assertEquals(tennisMatch.getGameScore() , "0-0");
		assertEquals(tennisMatch.getMatchSet() , "1-1");
	
	}
	
	
	@Test
	public void match_start_with_games_score_deuce_and_match_set_1_1() {
		
		TennisMatch tennisMatch = new TennisMatch();
		
		tennisMatch.firstPlayerScore();
		tennisMatch.firstPlayerScore();
		tennisMatch.firstPlayerScore();
		tennisMatch.firstPlayerScore();
		
		tennisMatch.secondPlayerScore();
		tennisMatch.secondPlayerScore();
		tennisMatch.secondPlayerScore();
		tennisMatch.secondPlayerScore();
		
		
		tennisMatch.firstPlayerScore();
		tennisMatch.firstPlayerScore();
		tennisMatch.firstPlayerScore();
		
		tennisMatch.secondPlayerScore();
		tennisMatch.secondPlayerScore();
		tennisMatch.secondPlayerScore();
		
		assertEquals(tennisMatch.getGameScore() , "deuce");
		assertEquals(tennisMatch.getMatchSet() , "1-1");
	
	}
	
	
	@Test
	public void match_start_with_games_score_0_0_and_match_set_6_3() {
		
		TennisMatch tennisMatch = new TennisMatch();
		
		/* Set score : 
		 * first player 6-0 second player
		 */
		for(int i=0; i < 24 ; i++ ) {
			tennisMatch.firstPlayerScore();
		}
		
		/* Set score : 
		 * first player 6-0 second player
		 */
		for (int i=0; i < 12 ; i++ ) {
			tennisMatch.secondPlayerScore();
		}
		
		assertEquals(tennisMatch.getGameScore() , "0-0");
		assertEquals(tennisMatch.getMatchSet() , "first player won the match");
	
	}
	
	@Test
	public void match_start_with_game_score_0_0_and_match_set_6_4() {
		
		TennisMatch tennisMatch = new TennisMatch();
		
		/* Sets score : 
		 * first player 0-4 second player
		 */
		for (int i=0; i < 16 ; i++ ) {
			tennisMatch.secondPlayerScore();
		}
		
		/* Sets score : 
		 * first player 6-4 second player
		 */
		for(int i=0; i < 24 ; i++ ) {
			tennisMatch.firstPlayerScore();
		}
		
		
		
		assertEquals(tennisMatch.getGameScore() , "0-0");
		assertEquals(tennisMatch.getMatchSet() , "first player won the match");
	
	}

	@Test
	public void match_start_with_game_score_0_0_and_match_set_6_5() {
		
		TennisMatch tennisMatch = new TennisMatch();
		
		
		for (int i=0; i < 20 ; i++ ) {
			tennisMatch.secondPlayerScore();
		}
		
		for(int i=0; i < 24 ; i++ ) {
			tennisMatch.firstPlayerScore();
		}
		
		
		
		assertEquals(tennisMatch.getGameScore() , "0-0");
		assertEquals(tennisMatch.getMatchSet() , "6-5");
	
	}
	
	@Test
	public void match_start_with_game_score_0_0_and_match_set_6_6() {
		
		TennisMatch tennisMatch = new TennisMatch();
		
		for (int i=0; i < 20 ; i++ ) {
			tennisMatch.secondPlayerScore();
		}
		
		for(int i=0; i < 24 ; i++ ) {
			tennisMatch.firstPlayerScore();
		}
		

		for (int i=0; i < 4 ; i++ ) {
			tennisMatch.secondPlayerScore();
		}
		
		assertEquals(tennisMatch.getGameScore() , "0-0");
		assertEquals(tennisMatch.getMatchSet() , "6-6");
	}
	
	@Test
	public void match_set_6_7_with_tie_break() {
		
		TennisMatch tennisMatch = new TennisMatch();
		
		/* Set score : 
		 * first player 0-5 second player
		 */
		for (int i=0; i < 20 ; i++ ) {
			tennisMatch.secondPlayerScore();
		}
		
		/* Set score : 
		 * first player 6-5 second player
		 */
		for(int i=0; i < 24 ; i++ ) {
			tennisMatch.firstPlayerScore();
		}
		
		/* Sets score : 
		 * first player 6-7 second player
		 */
		for (int i=0; i < 8 ; i++ ) {
			tennisMatch.secondPlayerScore();
		}
		
		assertEquals(tennisMatch.getGameScore() , "0-0");
		assertEquals(tennisMatch.getMatchSet() , "6-7");
	}
	
	@Test
	public void match_set_7_6_with_tie_break() {
		
		TennisMatch tennisMatch = new TennisMatch();
		
		/* second player wins 5 sets */
		for (int i=0; i < 20 ; i++ ) {
			tennisMatch.secondPlayerScore();
		}
		
		/* first player wins 6 sets */
		for(int i=0; i < 24 ; i++ ) {
			tennisMatch.firstPlayerScore();
		}
		
		/* second player wins another 1 set. 
		 * Total : 6 sets */
		for (int i=0; i < 4 ; i++ ) {
			tennisMatch.secondPlayerScore();
		}
		
		/* first player wins another 1 set.
		 * Total : 7 sets */
		for(int i=0; i < 4 ; i++ ) {
			tennisMatch.firstPlayerScore();
		}
		
		assertEquals(tennisMatch.getGameScore() , "0-0");
		assertEquals(tennisMatch.getMatchSet() , "7-6");
	}
	
	
	@Test
	public void match_set_7_7_with_tie_break() {
		
		TennisMatch tennisMatch = new TennisMatch();
		
		/* second player wins 5 sets */
		for (int i=0; i < 20 ; i++ ) {
			tennisMatch.secondPlayerScore();
		}
		
		/* first player wins 6 sets */
		for(int i=0; i < 24 ; i++ ) {
			tennisMatch.firstPlayerScore();
		}
		
		/* second player wins another 1 set. 
		 * Total : 6 sets */
		for (int i=0; i < 4 ; i++ ) {
			tennisMatch.secondPlayerScore();
		}
		
		/* first player wins another 1 set.
		 * Total : 7 sets */
		for(int i=0; i < 4 ; i++ ) {
			tennisMatch.firstPlayerScore();
		}
		
		/* second player wins another 1 set.
		 * Total : 7 sets */
		for(int i=0; i < 4 ; i++ ) {
			tennisMatch.secondPlayerScore();
		}
		
		assertEquals(tennisMatch.getGameScore() , "0-0");
		assertEquals(tennisMatch.getMatchSet() , "7-7");
	}
	
	@Test
	public void match_set_8_6_with_tie_break() {
		
		TennisMatch tennisMatch = new TennisMatch();
		
		/* second player wins 5 sets */
		for (int i=0; i < 20 ; i++ ) {
			tennisMatch.secondPlayerScore();
		}
		
		/* first player wins 6 sets */
		for(int i=0; i < 24 ; i++ ) {
			tennisMatch.firstPlayerScore();
		}
		
		/* second player wins another 1 set. 
		 * Total : 6 sets */
		for (int i=0; i < 4 ; i++ ) {
			tennisMatch.secondPlayerScore();
		}
		
		/* first player wins another 2 sets.
		 * Total : 8 sets */
		for(int i=0; i < 8 ; i++ ) {
			tennisMatch.firstPlayerScore();
		}
		
		assertEquals(tennisMatch.getGameScore() , "0-0");
		assertEquals(tennisMatch.getMatchSet() , "first player won the match");
	}
	
	@Test
	public void match_with_games_score_0_0_and_match_set_7_4() {
		
		TennisMatch tennisMatch = new TennisMatch();
		
		/* Sets score : 
		 * first player 0-4 second player
		 */
		for (int i=0; i < 16 ; i++ ) {
			tennisMatch.secondPlayerScore();
		}
		
		/* Sets score : 
		 * first player 7-4 second player
		 */
		for(int i=0; i < 28 ; i++ ) {
			tennisMatch.firstPlayerScore();
		}
		
		assertEquals(tennisMatch.getGameScore() , "0-0");
		assertEquals(tennisMatch.getMatchSet() , "first player won the match");
	
	}
}
