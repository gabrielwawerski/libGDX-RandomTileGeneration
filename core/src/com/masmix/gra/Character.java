package com.masmix.gra;

import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;

/*
 * Created by MasmiX on 26.11.2016.
 */
public class Character {
    private String name;
    private int health;

    private Vector2 position;
    private Vector2 defaultPosition;

    private TextureRegion textureRegion;


    public Character(String name, int health, TextureRegion textureRegion) {
        this.name = name;
        this.health = health;
        this.textureRegion = textureRegion;
    }

    public Character(String name, TextureRegion textureRegion) {
        this.name = name;
        this.health = 100;
        this.textureRegion = textureRegion;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public float getPositionX() {
        return position.x;
    }

    public void setPositionX(float positionX) {
        this.position.x = positionX;
    }

    public float getPositionY() {
        return position.y;
    }

    public void setPositionY(float positionY) {
        position.y = positionY;
    }

    public Vector2 getPosition() {
        return position;
    }

    public void setPosition(Vector2 position) {
        this.position = position;
    }

    public Vector2 getDefaultPosition() {
        return defaultPosition;
    }

    public void setDefaultPosition(Vector2 defaultPosition) {
        this.defaultPosition = defaultPosition;
    }

    public TextureRegion getTextureRegion() {
        return textureRegion;
    }

    public void setTextureRegion(TextureRegion textureRegion) {
        this.textureRegion = textureRegion;
    }

}
