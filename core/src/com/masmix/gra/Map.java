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
    private int position[][];
    private int mapSize[][];


    public Map(int sizeX, int sizeY, TileTexture tileTextures) {
        mapSize = new int[sizeX][sizeY];
        this.tileTextures = tileTextures;
        sizeX = mapSize.length;
        sizeY = mapSize[0].length;
    }

    public Tile getTileAt(int x, int y) {
        if (!(x < 0) || !(x > tile.length))
            return tile[x][y]; // wymyślić jak zwrócić tile
        else                       // o określonej pozycji na mapie
            throw new IndexOutOfBoundsException();
    }

    public int getPositionAt(int posX, int posY) {
        return position[posX][posY]; // sprawdzic
    }

    public void createMap() {
    	for (int i = 0; i < sizeX; i++) {
    		for (int j = 0; j < sizeY; j++) {
                tile[i][j] = new Tile(tileTextures.getTextureAt(MathUtils.random(0, 4))); // tu rand generator
                position = new int[i][j];
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




