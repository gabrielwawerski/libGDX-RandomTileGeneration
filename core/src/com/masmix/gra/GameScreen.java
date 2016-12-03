package com.masmix.gra;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.masmix.gra.Character;
import com.masmix.gra.Player;

/*
 * Created by MasmiX on 24.11.2016.
 */
public class GameScreen extends ApplicationAdapter {
    private SpriteBatch batch;
    private TextureAtlas textureAtlas;

    private Character character;
    private Player player;


    @Override
    public void create() {
        batch = new SpriteBatch();
        textureAtlas = new TextureAtlas();


        character = new Character("MasmiX", 100);
        player = new Player(character);

    }

    private void updateScene() {

    }

    private void drawScene() {
        batch.begin();
        batch.end();
    }

    @Override
    public void render () {
        updateScene();
        drawScene();
    }

    @Override
    public void resize (int width, int height) {
    }

    @Override
    public void dispose () {
        batch.dispose();
    }
}
