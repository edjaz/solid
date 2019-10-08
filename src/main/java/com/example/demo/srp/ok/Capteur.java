package com.example.demo.srp.ok;

class Capteur<T> {
    private T value;
    private SensorState state;
    private CapteurType type;


    public Capteur(T value, CapteurType type) {
        this.value = value;
        this.state = SensorState.OFF;
        this.type = type;
    }

    public T getValue() {
        return value;
    }

    public CapteurType getType() {
        return type;
    }

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
            System.err.println(type.getDisplayName() + ": ERREUR");
        } else {
            System.out.println(type.getDisplayName() + " : " + value + " " + type.getUnite());
        }
    }

    enum SensorState {
        OFF,
        ON;
    }




}

enum CapteurType {
    FUEL("Carburant", "L"),
    PRESSURE("Pression", "bar");

    private String displayName;
    private String unite;

    public String getDisplayName() {
        return displayName;
    }

    public String getUnite() {
        return unite;
    }


    CapteurType(String displayName, String unite) {
        this.displayName = displayName;
        this.unite = unite;

    }
}
