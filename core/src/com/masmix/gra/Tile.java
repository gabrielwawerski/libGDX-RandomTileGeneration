package com.masmix.gra;

import com.badlogic.gdx.graphics.g2d.TextureRegion;

/*
 * Created by MasmiX on 04.12.2016.
 */
public class Tile {
    private static int ID = 0;
    private int tileID;
    private TextureRegion textureRegion;

    /**
     *
     * @param textureRegion część tekstury
     */
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