package com.kata.tennis;

public class Game {
	
	/* two players for each game */
    private Player firstPlayer;
    private Player secondPlayer;

    /* Setting players */
    public Game(Player firstPlayer, Player secondPlayer) {
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
    }
  
    /*  First testing a win situation and returning the winner player name
     * Second testing advantage situation and returning the score of the player who has highest score
     * third testing deuce situation.
     * if all these three tests fails, the method return the score of each player. */ 
    public String getGameScore() {
    	
		if (win()) {
			return getPlayerWhoHasHighScore() + " wins";
		}
		
		if (advantage()) { 
			return "advantage " + getPlayerWhoHasHighScore(); 
		}
		
		if (deuce())
			return "deuce";
		
        return firstPlayer.gameScore() + "-" + secondPlayer.gameScore();
    }
    
    /*testing if deuce situation when the two players have an equal score 
     * and the score is bigger than 3 (40) */
    private boolean deuce() {
		return firstPlayer.getScore() >= 3 && firstPlayer.getScore() == secondPlayer.getScore();
	}
    
    /* retrun the player name who has the highest score */
	private String getPlayerWhoHasHighScore() {
		if (firstPlayer.getScore() > secondPlayer.getScore()) {
			return firstPlayer.getName();
		} else {
			return secondPlayer.getName();
		}
	}
	
	/* testing a win situation, when one player score bigger or equal to four 
	 * and his score bigger then the other player score +2 */
	private boolean win() {
		if(secondPlayer.getScore() >= 4 && secondPlayer.getScore() >= firstPlayer.getScore() + 2 )
			return true;
		if(firstPlayer.getScore() >= 4 && firstPlayer.getScore() >= secondPlayer.getScore() + 2)
			return true;
		return false;
	}
	
	/* testing advantage situation, when one player score bigger or equal to four 
	 * and his score equals to the other player score + 1 */
	private boolean advantage() {
		if (secondPlayer.getScore() >= 4 && secondPlayer.getScore() == firstPlayer.getScore() + 1)
			return true;
		if (firstPlayer.getScore() >= 4 && firstPlayer.getScore() == secondPlayer.getScore() + 1)
			return true;
		return false;

	}
	
    /* increasing first player score */
    public void firstPlayerScore(){
        this.firstPlayer.increaseScore();
    }
    
    /* increasing second player score */
    public void secondPlayerScore(){
        this.secondPlayer.increaseScore();
    }
	
    /* Getting first Player score */
    public int getCurrentScoreForFirstPalyer(){
        return firstPlayer.getScore();
    }
    
    /* Getting second Player score */
    public int getCurrentScoreForSecondPlayer(){
        return secondPlayer.getScore();
    }
}
