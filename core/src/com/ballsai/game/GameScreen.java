package com.ballsai.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class GameScreen extends ScreenAdapter{
	private MyGdxGame pacmanGame;
	private Texture pacmanImg;
	private int x;
	private int y;
	
	 
    public GameScreen(MyGdxGame pacmanGame) {
        this.pacmanGame = pacmanGame;
        pacmanImg = new Texture("pacman.png");
        x = 100;
        y = 100;
    }
    
    public void render (float delta) {
    	Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
    	 x += 5;
    	 SpriteBatch batch = pacmanGame.batch;
         batch.begin();
        
         batch.draw(pacmanImg, x, y);
         batch.end();
        
         
    	
    }
}