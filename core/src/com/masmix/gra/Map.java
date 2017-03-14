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
    private int mapSizeX;
    private int mapSizeY;


    public Map(Coordinates coordinates, TileTexture tileTextures) {
        this.coordinates = coordinates;
        this.tileTextures = tileTextures;
        this.tile = new Tile[coordinates.getSizeX()][coordinates.getSizeY()];
        this.mapSizeX = coordinates.getSizeX() * 16;
        this.mapSizeY = coordinates.getSizeY() * 16;
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
        if (!(x < 0) && !(x > tile.length))
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




