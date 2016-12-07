package com.masmix.gra;

/*
 * Created by MasmiX on 04.12.2016.
 */
public class Map {
    private Tile[] tile; // private Tile[][] tile
    private int sizeX;
    private int sizeY;
    private int position[][];
    private int dimension[][];


    public Map(int sizeX, int sizeY, Tile... tiles) {
        dimension = new int[sizeX][sizeY];
        this.tile = tiles;
        sizeX = dimension.length;
        sizeY = dimension[0].length;
    }

    public void createMap() {

    }

    public Tile[] getTile() {
        return tile;
    }

    public int getSizeX() {
        return sizeX;
    }

    public int getSizeY() {
        return sizeY;
    }

    public Tile getTileAt(int x, int y) {
        if (!(x < tile.length) || !(x > tile.length))
            return position[x][y]; // wymyślić jak zwrócić tile
        else                       // o określonej pozycji na mapie
            throw new IndexOutOfBoundsException();
    }

}