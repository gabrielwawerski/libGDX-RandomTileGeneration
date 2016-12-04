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
    private TextureRegion tileTexture;


    public Tile(int posX, int posY, TextureRegion tileTexture) {
        ID += 1;
        this.tileID = ID;
        this.posX = posX;
        this.posY = posY;
        this.tileTexture = tileTexture;
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

    public void setTileID(int tileID) {
        this.tileID = tileID;
    }

    public TextureRegion getTileTexture() {
        return tileTexture;
    }

    public void setTileTexture(TextureRegion tileTexture) {
        this.tileTexture = tileTexture;
    }
}
