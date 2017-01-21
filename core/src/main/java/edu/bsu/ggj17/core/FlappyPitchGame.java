package edu.bsu.ggj17.core;

import be.tarsos.dsp.pitch.PitchDetectionHandler;
import playn.core.Image;
import playn.core.Platform;
import playn.scene.ImageLayer;
import playn.scene.SceneGame;

public class FlappyPitchGame extends SceneGame {

    public FlappyPitchGame(Platform plat) {
        super(plat, 33); // update our "simulation" 33ms (30 times per second)

        // create and add background image layer
        Image bgImage = plat.assets().getImage("images/bg.png");
        ImageLayer bgLayer = new ImageLayer(bgImage);
        // scale the background to fill the screen
        bgLayer.setSize(plat.graphics().viewSize);
        rootLayer.add(bgLayer);

        PitchDetectionHandler pitch;
    }
}
