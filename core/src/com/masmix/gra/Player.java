package com.masmix.gra;

import com.badlogic.gdx.math.Vector2;

/*
 * Created by MasmiX on 26.11.2016.
 */
public class Player {
    private Character character;


    public Player(Character character) {
        this.character = character;
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
