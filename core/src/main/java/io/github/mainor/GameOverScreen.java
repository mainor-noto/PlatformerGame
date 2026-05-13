package io.github.mainor;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.GlyphLayout;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class GameOverScreen implements Screen {

    private final Main game;
    private final int finalScore;
    private final boolean won;

    private static final int W = 640;
    private static final int H = 480;



    public GameOverScreen(Main game, int finalScore, boolean won) {
        this.game = game;
        this.finalScore = finalScore;
        this.won = won;
    }
    }
}

@Override
public void show() {

}
