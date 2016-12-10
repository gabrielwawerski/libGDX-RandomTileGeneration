package com.masmix.gra;

import com.badlogic.gdx.math.MathUtils;

/*
 * Created by MasmiX on 04.12.2016.
 */
public class Map {
    private TileTexture tileTextures;
    private Tile[][] tile; // private Tile[][] tile
    private Coordinates coordinates;
    private int rand;


    public Map(Coordinates coordinates, TileTexture tileTextures) {
        this.coordinates = coordinates;
        this.tileTextures = tileTextures;
        tile = new Tile[coordinates.getSizeX()][coordinates.getSizeY()];
    }

    public void createMap() {
        for (int i = 0; i < coordinates.getSizeX(); i++) {
            for (int j = 0; j < coordinates.getSizeY(); j++) {
                rand = MathUtils.random(0, tileTextures.getTextureRegionSize() - 1);
                if (rand == 3) {
                    rand = MathUtils.random(0, tileTextures.getTextureRegionSize() - 1);
                }
                tile[i][j] = new Tile(tileTextures.getTextureRegionAt(rand)); // tu rand generator
            }
        }
    }


    public Tile getTileAt(int x, int y) {
        if (!(x < 0) || !(x > tile.length))
            return tile[x][y];
        else
            throw new IndexOutOfBoundsException();
    }

    public int getCoordinateX(int posX) {
        return coordinates.getX(posX);
    }

    public int getCoordinateY(int posY) {
        return coordinates.getY(posY); // sprawdzic
    }

    public int getSizeX() {
        return coordinates.getSizeX();
    }

    public int getSizeY() {
        return coordinates.getSizeY();
    }
}




