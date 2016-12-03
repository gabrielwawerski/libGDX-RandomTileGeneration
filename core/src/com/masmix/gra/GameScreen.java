package com.masmix.gra;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

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
        textureAtlas = new TextureAtlas("gra.pack");

        character = new Character("MasmiX");
        player = new Player(character,
                new TextureRegion(textureAtlas.findRegion("standDown")),
                new TextureRegion(textureAtlas.findRegion("standLeft")),
                new TextureRegion(textureAtlas.findRegion("standRight")),
                new TextureRegion(textureAtlas.findRegion("standUp")),
                new TextureRegion(textureAtlas.findRegion("walkDown")),
                new TextureRegion(textureAtlas.findRegion("walkUp")),
                new TextureRegion(textureAtlas.findRegion("walkLeft1")),
                new TextureRegion(textureAtlas.findRegion("walkLeft2")),
                new TextureRegion(textureAtlas.findRegion("walkLeft3")),
                new TextureRegion(textureAtlas.findRegion("walkLeft4")),
                new TextureRegion(textureAtlas.findRegion("walkRight1")),
                new TextureRegion(textureAtlas.findRegion("walkRight2")),
                new TextureRegion(textureAtlas.findRegion("walkRight3")),
                new TextureRegion(textureAtlas.findRegion("walkRight4")));

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
