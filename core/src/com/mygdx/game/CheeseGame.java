package com.mygdx.game;

import com.badlogic.gdx.Game;

public class CheeseGame extends Game {

    @Override
    public void create() {
        CheeseMenu cheeseMenu = new CheeseMenu(this);
        setScreen(cheeseMenu);
    }
}
