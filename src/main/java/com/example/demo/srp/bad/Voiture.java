package com.example.demo.srp.bad;

public class Voiture {
    private int state = -1;
    private double pressure = 2.6;
    private int fuel = 100;
    private int sensor_fuel = -1;
    private int sensor_tire = -1;


    public void start() {
        this.state = 0;
    }


    public void stop() {
        this.state = -1;
    }

    public void startFuelSensor() {
        this.sensor_fuel = 0;
    }

    public void startTireSensor() {
        this.sensor_tire = 0;
    }

    public double getPressure() {
        if (this.sensor_tire == -1) return -1;
        else return pressure;
    }

    public int getFuel() {
        if (this.sensor_fuel == -1) return -1;
        else return fuel;
    }

    public void displayFuel() {
        int fuel = this.getFuel();
        if (fuel == -1) {
            System.err.println("Carburant : ERREUR");
        } else {
            System.out.println("Carburant : " + fuel + " L");
        }
    }

    public void displayPressure() {
        double pressure = this.getPressure();
        if (fuel == -1) {
            System.err.println("Pression : ERREUR");
        } else {
            System.out.println("Pression : " + pressure + " bar");
        }
    }

    public static void main(String[] args) {
        Voiture dacia = new Voiture();
        dacia.start();
        dacia.startFuelSensor();
        dacia.displayFuel();
    }


}
