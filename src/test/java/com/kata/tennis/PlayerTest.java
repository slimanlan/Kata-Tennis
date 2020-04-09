package com.kata.tennis;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class PlayerTest {
	
	 private Player player;

	@Before
	public void init() {
	    player = new Player("FirstPlayer");
	}
	
	@Test
	public void player_must_have_score_equals_0(){
		assertEquals( player.getScore(), 0);
	}
	
	@Test
	public void player_must_have_score_equals_3(){
		player.increaseScore();
		player.increaseScore();
		player.increaseScore();
		assertEquals( player.getScore(), 3);
	}
	
	@Test
	public void player_name_Test(){
		assertEquals( player.getName(), "FirstPlayer");
	}
}
