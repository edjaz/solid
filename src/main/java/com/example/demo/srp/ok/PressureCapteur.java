package com.example.demo.srp.ok;

public class PressureCapteur extends Capteur<Double> {

    protected PressureCapteur(Double value) {
        super(value);
        displayName =  "pression";
        unite = "bar";
    }

    @Override
    public CapteurType getType() {
        return CapteurType.PRESSURE;
    }
}
