package com.battleship.client;

import com.battleship.gameplay.Game;

class BattleshipClient {
    public static void main(String[] args) {
        Game.loadBanner();
        Game.initialize();
        Game.clearScreen();
    }
}