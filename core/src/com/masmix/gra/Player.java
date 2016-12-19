package com.masmix.gra;

import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;

/*
 * Created by MasmiX on 26.11.2016.
 */
public class Player {
    private Character character;
    private Vector2 origin;

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

    private float walkLeftAnimTime;
    private float walkRightAnimTime;
    private float walkUpAnimTime;
    private float walkDownAnimTime;


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

        this.character.setPosition(new Vector2());

        walkLeftAnim = new Animation(1.0f, walkLeft1, walkLeft2, walkLeft3, walkLeft4);
        walkLeftAnim.setPlayMode(Animation.PlayMode.NORMAL);

        walkRightAnim = new Animation(0.40f, walkRight1, walkRight2, walkRight3, walkRight4);
        walkRightAnim.setPlayMode(Animation.PlayMode.LOOP);

        walkUpAnim = new Animation(1.0f, walkUp, standUp);
        walkUpAnim.setPlayMode(Animation.PlayMode.LOOP);

        walkDownAnim = new Animation(1.0f, walkDown, standDown);
        walkDownAnim.setPlayMode(Animation.PlayMode.NORMAL);

        walkLeftAnimTime = 0;
        walkRightAnimTime = 0;
        walkUpAnimTime = 0;
        walkDownAnimTime = 0;
        origin = new Vector2();
        origin.set(0, 0);
    }

    public Character getCharacter() {
        return character;
    }

    public Animation getWalkLeftAnim() {
        return walkLeftAnim;
    }

    public Animation getWalkRightAnim() {
        return walkRightAnim;
    }

    public Animation getWalkUpAnim() {
        return walkUpAnim;
    }

    public Animation getWalkDownAnim() {
        return walkDownAnim;
    }

    public float getWalkLeftAnimTime() {
        return walkLeftAnimTime;
    }

    public void setWalkLeftAnimTime(float walkLeftAnimTime) {
        this.walkLeftAnimTime = walkLeftAnimTime;
    }

    public float getWalkRightAnimTime() {
        return walkRightAnimTime;
    }

    public void setWalkRightAnimTime(float walkRightAnimTime) {
        this.walkRightAnimTime = walkRightAnimTime;
    }

    public float getWalkUpAnimTime() {
        return walkUpAnimTime;
    }

    public void setWalkUpAnimTime(float walkUpAnimTime) {
        this.walkUpAnimTime = walkUpAnimTime;
    }

    public float getWalkDownAnimTime() {
        return walkDownAnimTime;
    }

    public void setWalkDownAnimTime(float walkDownAnimTime) {
        this.walkDownAnimTime = walkDownAnimTime;
    }

    public Vector2 getPosition() {
        return character.getPosition();
    }

    public void setPosition(float positionX, float positionY) {
        character.setPositionX(positionX);
        character.setPositionY(positionY);
    }

    public float getPositionX() {
        return  character.getPosition().x;
    }

    public float getPositionY() {
        return  character.getPosition().y;
    }

    public void setPositionX(float positionX) {
        character.setPositionX(positionX);
    }

    public void setPositionY(float positionY) {
        character.setPositionY(positionY);
    }

    public void positionAdd(float x, float y) {
        character.getPosition().add(x, y);
    }

    public Vector2 getOrigin() {
        return origin;
    }

    public void setOrigin(float x, float y) {
        this.origin.x = x;
        this.origin.y = y;
    }
}