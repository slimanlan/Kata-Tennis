package com.kata.tennis;


import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

public class TennisGameTest {
	
	private Player firstPlayer;
    private Player secondPlayer;
    private Game game;

    @Before
    public void setup() {
        firstPlayer = new Player("firstPlayer");
        secondPlayer = new Player("secondPlayer");
        game = new Game(firstPlayer,secondPlayer);
    }

    @Test
    public void game_must_start_with_score_0_0(){
        assertEquals( game.getCurrentScoreForFirstPalyer() , 0);
        assertEquals( game.getCurrentScoreForSecondPlayer() , 0);
    }

    @Test
    public void game_with_score_1_0_forFirstPlayer(){
        game.firstPlayerScore();
        assertEquals( game.getCurrentScoreForFirstPalyer() , 1);
        assertEquals( game.getCurrentScoreForSecondPlayer() , 0);
    }

    @Test
    public void game_with_score_1_1(){
        game.firstPlayerScore();
        game.secondPlayerScore();
        assertEquals( game.getCurrentScoreForFirstPalyer() , 1);
        assertEquals( game.getCurrentScoreForSecondPlayer() , 1);
    }

    @Test
    public void game_with_score_15_15(){
        game.firstPlayerScore();
        game.secondPlayerScore();
        assertEquals( game.getGameScore() , "15-15");
    }

    @Test
    public void game_with_score_15_30(){
        game.firstPlayerScore();
        game.secondPlayerScore();
        game.secondPlayerScore();
        assertEquals( game.getGameScore() , "15-30");
    }

    @Test
    public void game_with_score_15_40(){
        game.firstPlayerScore();
        game.secondPlayerScore();
        game.secondPlayerScore();
        game.secondPlayerScore();
        assertEquals( game.getGameScore() , "15-40");
    }

    @Test
    public void game_with_score_30_40(){
        game.firstPlayerScore();
        game.firstPlayerScore();
        game.secondPlayerScore();
        game.secondPlayerScore();
        game.secondPlayerScore();
        assertEquals( game.getGameScore() , "30-40");
    }

    @Test
    public void game_with_score_deuce_40_40(){
        game.firstPlayerScore();
        game.firstPlayerScore();
        game.firstPlayerScore();
        game.secondPlayerScore();
        game.secondPlayerScore();
        game.secondPlayerScore();
        assertEquals( game.getGameScore() , "deuce");
    }

    @Test
    public void game_firstPlayer_Win(){
        game.firstPlayerScore();
        game.firstPlayerScore();
        game.firstPlayerScore();
        game.firstPlayerScore();
        assertEquals( game.getGameScore() , "firstPlayer wins");
    }

    @Test
    public void game_secondPlayer_Win(){
        game.secondPlayerScore();
        game.secondPlayerScore();
        game.secondPlayerScore();
        game.secondPlayerScore();
        assertEquals( game.getGameScore() , "secondPlayer wins" );
    }

    @Test
    public void game_score_deuce(){
        game.firstPlayerScore();
        game.firstPlayerScore();
        game.firstPlayerScore();
        game.firstPlayerScore();
        game.secondPlayerScore();
        game.secondPlayerScore();
        game.secondPlayerScore();
        game.secondPlayerScore();
        assertEquals( game.getGameScore() , "deuce" );
    }

    @Test
    public void game_with_score_advantage_firstPlayer(){
        game.firstPlayerScore();
        game.firstPlayerScore();
        game.firstPlayerScore();
        game.firstPlayerScore();
        game.firstPlayerScore();
        game.secondPlayerScore();
        game.secondPlayerScore();
        game.secondPlayerScore();
        game.secondPlayerScore();
        assertEquals( game.getGameScore() , "advantage firstPlayer" );
    }

    @Test
    public void game_with_score_advantage_secondPlayer(){
        game.firstPlayerScore();
        game.firstPlayerScore();
        game.firstPlayerScore();
        game.firstPlayerScore();
        game.secondPlayerScore();
        game.secondPlayerScore();
        game.secondPlayerScore();
        game.secondPlayerScore();
        game.secondPlayerScore();
        assertEquals(game.getGameScore() , "advantage secondPlayer" );
    }
    
}
