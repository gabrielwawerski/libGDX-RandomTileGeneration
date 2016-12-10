package com.masmix.gra;

import com.badlogic.gdx.graphics.g2d.TextureRegion;

/*
 * Created by MasmiX on 08.12.2016.
 */
class TileTexture {
    private TextureRegion[] textureRegion;

    /**
     *
     * @param textureRegion tablica texture regionów wszystkich kafelków, które znajdą się na mapie, numerowane od 0.
     */
    public TileTexture(TextureRegion... textureRegion) {
        this.textureRegion = textureRegion;
//        for (int i = 0; i < textureRegion.length; i++) {
//            this.textureRegion[i] = new TextureRegion(textureRegion[i]);
//        }
    }

    public TextureRegion getTextureRegionAt(int i) {
        if (!(i > textureRegion.length) || !(i < 0)) {
            return textureRegion[i];
        }
        else
            throw new IndexOutOfBoundsException();
    }
}
