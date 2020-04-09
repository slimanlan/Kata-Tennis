package com.kata.tennis;

public class Player {
	
	    /* Player Name */
		private String name;
	    /* Payer score count*/
	    private int count;

	    public Player(String name) {
	        this.name = name;
	        this.count = 0;
	    }
	    
	    public int getScore() {
	        return count;
	    }

	    public void increaseScore(){
	        this.count++;
	    }
	    
	    public void resetScore() {
	    	this.count = 0;
	    }
	    
	    /* calculing player score {0, 15, 30, 40} */
	    public int gameScore(){
	    	if (count == 3 ) return 40;
	    	else return 15 * count; 
	    }

	    public String getName() {
	        return name;
	    }
}
