package com.masmix.gra;

import com.badlogic.gdx.math.Vector2;

/*
 * Created by MasmiX on 28.11.2016.
 */
public class MovementHandler {
    private Vector2 move;

    public void setPosition(float x, float y) {
        this.move.x = x;
        this.move.y = y;
    }
}
