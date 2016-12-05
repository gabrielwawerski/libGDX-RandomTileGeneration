package com.masmix.gra;

import com.badlogic.gdx.graphics.g2d.TextureRegion;

/*
 * Created by MasmiX on 04.12.2016.
 */
public class Tile {
    private int posX;
    private int posY;
    private static int ID = 0;
    private int tileID;
    private TextureRegion tileTextureRegion;


    public Tile(int posX, int posY, TextureRegion tileTextureRegion) {
        ID++;
        this.tileID = ID;
        this.posX = posX;
        this.posY = posY;
        this.tileTextureRegion = tileTextureRegion;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public int getTileID() {
        return tileID;
    }

    public TextureRegion getTileTextureRegion() {
        return tileTextureRegion;
    }

    public void setTileTextureRegion(TextureRegion tileTextureRegion) {
        this.tileTextureRegion = tileTextureRegion;
    }
}
