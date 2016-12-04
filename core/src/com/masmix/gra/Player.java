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

    private Animation walkLeftAnim;
    private Animation walkRightAnim;
    private Animation walkUpAnim;
    private Animation walkDownAnim;

    private float walkLeftStateTime;
    private float walkRightStateTime;
    private float walkUpStateTime;
    private float walkDownStateTime;

    private Vector2 playerPosition;


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

        walkLeftAnim = new Animation(1.0f, walkLeft1, walkLeft2, walkLeft3, walkLeft4);
        walkLeftAnim.setPlayMode(Animation.PlayMode.NORMAL);

        walkRightAnim = new Animation(0.55f, walkRight1, walkRight2, walkRight3, walkRight4);
        walkRightAnim.setPlayMode(Animation.PlayMode.NORMAL);

        walkUpAnim = new Animation(1.0f, walkUp, standUp);
        walkUpAnim.setPlayMode(Animation.PlayMode.NORMAL);

        walkDownAnim = new Animation(1.0f, walkDown, standDown);
        walkDownAnim.setPlayMode(Animation.PlayMode.NORMAL);

        playerPosition = new Vector2();

        walkLeftStateTime = 0;
        walkRightStateTime = 0;
        walkUpStateTime = 0;
        walkDownStateTime = 0;
    }

    public Character getCharacter() {
        return character;
    }

    public Animation getWalkLeftAnim() {
        return walkLeftAnim;
    }

    public void setWalkLeftAnim(Animation walkLeftAnim) {
        this.walkLeftAnim = walkLeftAnim;
    }

    public Animation getWalkRightAnim() {
        return walkRightAnim;
    }

    public void setWalkRightAnim(Animation walkRightAnim) {
        this.walkRightAnim = walkRightAnim;
    }

    public Animation getWalkUpAnim() {
        return walkUpAnim;
    }

    public void setWalkUpAnim(Animation walkUpAnim) {
        this.walkUpAnim = walkUpAnim;
    }

    public Animation getWalkDownAnim() {
        return walkDownAnim;
    }

    public void setWalkDownAnim(Animation walkDownAnim) {
        this.walkDownAnim = walkDownAnim;
    }

    public float getWalkLeftStateTime() {
        return walkLeftStateTime;
    }

    public void setWalkLeftStateTime(float walkLeftStateTime) {
        this.walkLeftStateTime = walkLeftStateTime;
    }

    public float getWalkRightStateTime() {
        return walkRightStateTime;
    }

    public void setWalkRightStateTime(float walkRightStateTime) {
        this.walkRightStateTime = walkRightStateTime;
    }

    public float getWalkUpStateTime() {
        return walkUpStateTime;
    }

    public void setWalkUpStateTime(float walkUpStateTime) {
        this.walkUpStateTime = walkUpStateTime;
    }

    public float getWalkDownStateTime() {
        return walkDownStateTime;
    }

    public void setWalkDownStateTime(float walkDownStateTime) {
        this.walkDownStateTime = walkDownStateTime;
    }

    public Vector2 getPlayerPosition() {
        return playerPosition;
    }

    public void setPlayerPosition(float playerPositionX, float playerPositionY) {
        playerPosition.set(playerPositionX, playerPositionY);
    }

    public float getPlayerPositionX() {
        return  playerPosition.x;
    }

    public float getPlayerPositionY() {
        return  playerPosition.y;
    }

    public void setPlayerPositionX(float playerPositionX) {
        this.playerPosition.x = playerPositionX;
    }

    public void setPlayerPositionY(float playerPositionY) {
        this.playerPosition.y = playerPositionY;
    }
}


//    public void setHealth(int health) {
//        character.setHealth(health);
//    }
//
//    public int getHealth() {
//        return character.getHealth();
//    }