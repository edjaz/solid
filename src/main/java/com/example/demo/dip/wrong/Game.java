package com.example.demo.dip.wrong;

public class Game {

    public Game() {
        System.out.println("start game");
        this.startInterface();
    }

    private void startInterface() {
        System.out.println("IHM Text");
    }


    public static void main(String[] args) {
        Game game = new Game();
    }

}
