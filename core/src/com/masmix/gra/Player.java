package com.masmix.gra;

import com.badlogic.gdx.math.Vector2;

/*
 * Created by MasmiX on 26.11.2016.
 */
public class Player {
    private Character character;
    
    private TextureRegion standLeft;
    //...
    
    private Animation walkLeft;
    //...

    public Player(Character character, TextureRegion standLeft) {
        this.character = character;
        this.standLeft = standLeft;
        //...
        
        walkLeft = new Animation();
        
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
