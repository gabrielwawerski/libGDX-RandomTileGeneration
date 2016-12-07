package com.masmix.gra;

import com.badlogic.gdx.graphics.g2d.TextureRegion;

/*
 * Created by MasmiX on 04.12.2016.
 */
public class Tile {
    private static int ID = 0;
    private int tileID;
    private TextureRegion textureRegion;


    public Tile(TextureRegion textureRegion) {
        ID++;
        this.tileID = ID;
        this.textureRegion = textureRegion;
    }

    public int getTileID() {
        return tileID;
    }

    public TextureRegion getTextureRegion() {
        return textureRegion;
    }

    public void setTextureRegion(TextureRegion textureRegion) {
        this.textureRegion = textureRegion;
    }
}


//    public int getPosX() {
//        return posX;
//    }
//
//    public void setPosX(int posX) {
//        this.posX = posX;
//    }
//
//    public int getPosY() {
//        return posY;
//    }
//
//    public void setPosY(int posY) {
//        this.posY = posY;
//    }
