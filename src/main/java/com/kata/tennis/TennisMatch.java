package com.kata.tennis;

public class TennisMatch {
	
	private int firstPlayerSetScore;
	
	private int secondPlayerSetScore;
	
	private Game currentGame;
	
	Player firstPlayer;
	
	Player secondPlayer;
	
	private boolean tieBreak;
	/* Setting up a tennis match */
	TennisMatch() {
		firstPlayerSetScore = 0;
		secondPlayerSetScore = 0;
		firstPlayer = new Player("first player");
		secondPlayer = new Player("second player");
		currentGame = new Game(firstPlayer, secondPlayer);
		tieBreak = false;
	}
	
	/* Check if player won the match
	 * If not return the match sets */
	public String getMatchSet() {
		
		if (!tieBreak) checkIfTieBreakSituation(); 
		
		if (checkIfFirstPlayerWon()) {
			return "first player won the match";
		}
		
		if (checkIfSecondPlayerWon()) {
			return "second player won the match";
		}
				
		return firstPlayerSetScore + "-" + secondPlayerSetScore;
	}
	
	/* check if second player won the match*/
	private boolean checkIfSecondPlayerWon() {
		
		if (tieBreak &&  secondPlayerSetScore == firstPlayerSetScore + 2 ) {
			return true; 
		}
		
		if ((secondPlayerSetScore == 6 && firstPlayerSetScore <= 4) || (secondPlayerSetScore == 7 && !tieBreak)) {
			return true;
		}
		
		return false;
	}

	/* check if first player won the match */
	private boolean checkIfFirstPlayerWon() {
		
		if (tieBreak && firstPlayerSetScore == secondPlayerSetScore + 2 ) {
			return true; 
		}
		
		if ((firstPlayerSetScore == 6 && secondPlayerSetScore <= 4) || (firstPlayerSetScore == 7 && !tieBreak)) {
			return true;
		}
		
		return false;
	}
	
	/* checking if tie break situation */
	private void checkIfTieBreakSituation() {
		if (firstPlayerSetScore >= 6 && secondPlayerSetScore >= 6 ) tieBreak = true; 
	}

	/* Get current game score */
	public String getGameScore() {
		return currentGame.getGameScore();
	}
		
	/* Upadte current game score after first player scores
	 * Check if current games is finished to create a new game
	 * */
	public void firstPlayerScore() {
		currentGame.firstPlayerScore();
		isCurrentGameFinish(); 
	}
	
	/* Upadte current game score after second player scores
	 * Check if current games is finished to create a new game
	 * */
	public void secondPlayerScore() {
		currentGame.secondPlayerScore();
		isCurrentGameFinish();
	}
	
	/* Check if current games is finished when a player won the game
	 * Increase player set score after the game is finished
	 * Create a new game after the current game is finished */
	public void isCurrentGameFinish() {
		String currentgameScore = currentGame.getGameScore();
		if ("first player wins".equals(currentgameScore)) {
			firstPlayerSetScore ++;
			createNewGame(); 
		} else if ("second player wins".equals(currentgameScore)) {
			secondPlayerSetScore++;
			createNewGame();
		}
	}
	
	/* Create a new game */
	private void createNewGame() {
		firstPlayer.resetScore();
		secondPlayer.resetScore();
		currentGame = new Game(firstPlayer, secondPlayer);
	}
	
	
}
