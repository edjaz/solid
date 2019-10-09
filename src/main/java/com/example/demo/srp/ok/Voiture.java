package com.example.demo.srp.ok;


public class Voiture {
    private CarState state;
    private TableauDeBord tableauDeBord;


    public Voiture() {
        state = CarState.STOPPED;
        tableauDeBord = new TableauDeBord();
        tableauDeBord.add(new FuelCapteur(100));
        tableauDeBord.add(new PressureCapteur(2.6));
    }

    public CarState getState() {
        return state;
    }

    public void start() {
        this.state = CarState.STARTED;
        this.tableauDeBord.start();
    }


    public void stop() {
        this.state = CarState.STOPPED;
        this.tableauDeBord.stop();
    }


    public void display(CapteurType capteurType) {
        this.tableauDeBord.display(capteurType);
    }


    public static void main(String[] args) {
        Voiture dacia = new Voiture();
        dacia.start();
        dacia.display(CapteurType.FUEL);
        dacia.display(CapteurType.PRESSURE);
    }


    enum CarState {
        STOPPED,
        STARTED
    }
}
