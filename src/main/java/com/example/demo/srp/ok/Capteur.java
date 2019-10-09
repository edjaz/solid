package com.example.demo.srp.ok;

abstract class  Capteur<T> {
    private T value;
    private SensorState state;

    protected String displayName;
    protected String unite;



    protected Capteur(T value) {
        this.value = value;
        this.state = SensorState.OFF;
    }

    public T getValue() {
        return value;
    }

    public abstract CapteurType getType();

    public void setValue(T value) {
        this.value = value;
    }

    public void start() {
        state = SensorState.ON;
    }

    public void stop() {
        state = SensorState.OFF;
    }

    public void display() {
        if (state == SensorState.OFF) {
            System.err.println(displayName + ": ERREUR");
        } else {
            System.out.println(displayName + " : " + value + " " + unite);
        }
    }

    enum SensorState {
        OFF,
        ON;
    }


}

enum CapteurType {
    FUEL,
    PRESSURE
}
