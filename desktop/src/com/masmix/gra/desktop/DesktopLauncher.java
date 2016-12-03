package com.masmix.gra.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.masmix.gra.GameScreen;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();

		config.title = "masmix1 - Gra v0.1";
		config.width = 800;
		config.height = 480;
		config.resizable = false;
		new LwjglApplication(new GameScreen(), config);
	}
}
