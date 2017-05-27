package com.masmix.gra;

import com.badlogic.gdx.math.MathUtils;

/*
 * Created by MasmiX on 04.12.2016.
 */
public class Map {
    private TileTexture tileTextures;
    private Tile[][] tile; // private Tile[][] tile
    private MapSize mapSize;
    private int rand;
    private int mapSizeX;
    private int mapSizeY;


    public Map(MapSize mapSize, TileTexture tileTextures) {
        this.mapSize = mapSize;
        this.tileTextures = tileTextures;
        this.tile = new Tile[mapSize.getSizeX()][mapSize.getSizeY()];
        this.mapSizeX = mapSize.getSizeX() * 16;
        this.mapSizeY = mapSize.getSizeY() * 16;
    }

    public void createMap() {
        for (int i = 0; i < mapSize.getSizeX(); i++) {
            for (int j = 0; j < mapSize.getSizeY(); j++) {
                rand = MathUtils.random(0, tileTextures.getTextureRegionSize() - 1);
                if (rand == 3) {
                    rand = MathUtils.random(0, tileTextures.getTextureRegionSize() - 1);
                }
                tile[i][j] = new Tile(tileTextures.getTextureRegionAt(rand)); // tu rand generator
            }
        }
    }


    public Tile getTileAt(int x, int y) {
        if (!(x < 0) && !(x > tile.length))
            return tile[x][y];
        else
            throw new IndexOutOfBoundsException();
    }

    public int getCoordinateX(int posX) {
        return mapSize.getX(posX);
    }

    public int getCoordinateY(int posY) {
        return mapSize.getY(posY); // sprawdzic
    }

    public int getSizeX() {
        return mapSize.getSizeX();
    }

    public int getSizeY() {
        return mapSize.getSizeY();
    }

    public int getMapSizeX() {
        return mapSizeX;
    }

    public void setMapSizeX(int mapSizeX) {
        this.mapSizeX = mapSizeX;
    }

    public int getMapSizeY() {
        return mapSizeY;
    }

    public void setMapSizeY(int mapSizeY) {
        this.mapSizeY = mapSizeY;
    }
}




