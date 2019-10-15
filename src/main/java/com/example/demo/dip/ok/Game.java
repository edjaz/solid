package com.example.demo.dip.ok;


public class Game {

    private GUI ihm;

    public Game(GUI ihm) {
        this.ihm = ihm;
        System.out.println("start game");
        this.startInterface();
    }

    private void startInterface() {
        this.ihm.start();
    }

    public static void main(String[] args) {
        GUI text = () -> System.out.println("IHM Text");
        new Game(text);

        new Game(new TextGraphic());
        new Game(new IHMGraphic());

    }

}


@FunctionalInterface
interface GUI {
    void start();
}

class IHMGraphic implements GUI {

    @Override
    public void start() {
        System.out.println("IHM Graphic");
    }
}


class TextGraphic implements GUI {

    @Override
    public void start() {
        System.out.println("IHM Graphic");
    }
}
