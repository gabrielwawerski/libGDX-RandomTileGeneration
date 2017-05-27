package com.masmix.gra;

/*
 * Created by MasmiX on 09.12.2016.
 */
public class MapSize {
    private int[] x;
    private int[] y;

    public MapSize(int x, int y) {
        this.x = new int[x];
        this.y = new int[y];

        for (int i = 0; i < x; i++) {
            this.x[i] = i;
            for (int j = 0; j < y; j++) {
                this.y[j] = j;
            }
        }
    }

    public int getX(int posX) {
        // TODO if ogarniczajacy
        return x[posX];
    }

    public int getY(int posY) {
        return y[posY];
    }
    
    public int getSizeX() {
    	return x.length;
    }
    
    public int getSizeY() {
    	return y.length;
    }
}








