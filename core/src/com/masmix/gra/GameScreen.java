package com.masmix.gra;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.graphics.FPSLogger;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;

/*
 * Created by MasmiX on 24.11.2016.
 */
public class GameScreen extends ApplicationAdapter {
    private static final int SCREEN_WIDTH = 800;
    private static final int SCREEN_HEIGHT = 480;
    private SpriteBatch batch;
    private TextureAtlas playerAtlas;
    private TextureAtlas tilesAtlas;
    private FPSLogger fpsLogger;
    private Camera camera;
    private Viewport viewport;

    private Character character;
    private Player player;


    @Override
    public void create() {
        batch = new SpriteBatch();
        fpsLogger = new FPSLogger();
        camera = new OrthographicCamera();
        viewport = new FitViewport(SCREEN_WIDTH, SCREEN_HEIGHT, camera);
        playerAtlas = new TextureAtlas("gra.pack");
        tilesAtlas = new TextureAtlas("tiles.pack");
        character = new Character("MasmiX");

        player = new Player(character,
                new TextureRegion(playerAtlas.findRegion("standDown")), new TextureRegion(playerAtlas.findRegion("standLeft")),
                new TextureRegion(playerAtlas.findRegion("standRight")), new TextureRegion(playerAtlas.findRegion("standUp")),
                new TextureRegion(playerAtlas.findRegion("walkDown")), new TextureRegion(playerAtlas.findRegion("walkUp")),
                new TextureRegion(playerAtlas.findRegion("walkLeft1")), new TextureRegion(playerAtlas.findRegion("walkLeft2")),
                new TextureRegion(playerAtlas.findRegion("walkLeft3")), new TextureRegion(playerAtlas.findRegion("walkLeft4")),
                new TextureRegion(playerAtlas.findRegion("walkRight1")), new TextureRegion(playerAtlas.findRegion("walkRight2")),
                new TextureRegion(playerAtlas.findRegion("walkRight3")), new TextureRegion(playerAtlas.findRegion("walkRight4")));
    }

    private void updateScene() {
        float deltaTime = Gdx.graphics.getDeltaTime();
        if (!player.getWalkRightAnim().isAnimationFinished(player.getWalkRightStateTime())) {
            player.setWalkRightStateTime(player.getWalkRightStateTime() + deltaTime);
            player.setPlayerPositionX(player.getPlayerPositionX() + 50 * deltaTime);

            System.out.println(player.getWalkRightAnim().getKeyFrame(player.getWalkRightStateTime(), false));
        }
    }

    private void drawScene() {
        batch.begin();
        batch.draw(player.getWalkRightAnim().getKeyFrame(player.getWalkRightStateTime()), player.getPlayerPositionX(), player.getPlayerPositionY());

//        System.out.println("playerPos X: " + player.getPlayerPositionX());
        batch.end();
    }

    @Override
    public void render () {
        Gdx.gl.glClearColor(1, 1, 1, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        fpsLogger.log();

        updateScene();
        drawScene();
    }

    @Override
    public void resize (int width, int height) {
        viewport.update(width, height);
    }

    @Override
    public void dispose () {
        batch.dispose();
        playerAtlas.dispose();
        tilesAtlas.dispose();
    }
}
