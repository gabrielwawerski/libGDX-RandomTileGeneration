package com.masmix.gra;

import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;

/*
 * Created by MasmiX on 26.11.2016.
 */
public class Player {
    private Character character;

    private TextureRegion standDown;
    private TextureRegion standLeft;
    private TextureRegion standRight;
    private TextureRegion standUp;
    private TextureRegion walkDown;
    private TextureRegion walkUp;
    private TextureRegion walkLeft1;
    private TextureRegion walkLeft2;
    private TextureRegion walkLeft3;
    private TextureRegion walkLeft4;
    private TextureRegion walkRight1;
    private TextureRegion walkRight2;
    private TextureRegion walkRight3;
    private TextureRegion walkRight4;

    private Animation animWalkLeft;
    private Animation animWalkRight;
    private Animation animWalkUp;
    private Animation animWalkDown;


    public Player(Character character, TextureRegion standDown,
                  TextureRegion standLeft, TextureRegion standRight,
                  TextureRegion standUp, TextureRegion walkDown,
                  TextureRegion walkUp, TextureRegion walkLeft1,
                  TextureRegion walkLeft2, TextureRegion walkLeft3,
                  TextureRegion walkLeft4, TextureRegion walkRight1,
                  TextureRegion walkRight2, TextureRegion walkRight3,
                  TextureRegion walkRight4) {
        this.character = character;

        this.standDown = standDown;
        this.standLeft = standLeft;
        this.standRight = standRight;
        this.standUp = standUp;
        this.walkDown = walkDown;
        this.walkUp = walkUp;
        this.walkLeft1 = walkLeft1;
        this.walkLeft2 = walkLeft2;
        this.walkLeft3 = walkLeft3;
        this.walkLeft4 = walkLeft4;
        this.walkRight1 = walkRight1;
        this.walkRight2 = walkRight2;
        this.walkRight3 = walkRight3;
        this.walkRight4 = walkRight4;

        animWalkLeft = new Animation(1.0f, walkLeft1, walkLeft2, walkLeft3, walkLeft4);
        animWalkRight = new Animation(1.0f, walkRight1, walkRight2, walkRight3, walkRight4);
        animWalkUp = new Animation(1.0f, walkUp, standUp);
        animWalkDown = new Animation(1.0f, walkDown, standDown);
    }

    public Character getCharacter() {
        return character;
    }

    public void setHealth(int health) {
        character.setHealth(health);
    }

    public int getHealth() {
        return character.getHealth();
    }
}
