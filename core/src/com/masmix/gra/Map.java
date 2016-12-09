package com.masmix.gra;

import com.badlogic.gdx.math.MathUtils;

/*
 * Created by MasmiX on 04.12.2016.
 */
public class Map {
    private TileTexture tileTextures;
    private Tile[][] tile; // private Tile[][] tile
    private int sizeX;
    private int sizeY;
    private int[][] mapSize;
    private Coordinates coordinates;


    public Map(Coordinates coordinates, TileTexture tileTextures) {
        mapSize = new int[sizeX][sizeY];
        this.coordinates = coordinates;
        this.tileTextures = tileTextures;
        this.sizeX = sizeX;
        this.sizeY = sizeY;
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

    public void createMap() {
    	for (int i = 0; i < sizeX; i++) {
    		for (int j = 0; j < sizeY; j++) {
                tile[i][j] = new Tile(tileTextures.getTextureAt(MathUtils.random(0, 4))); // tu rand generator
            }
    	}

    }

    public int getSizeX() {
        return sizeX;
    }

    public int getSizeY() {
        return sizeY;
    }
}




