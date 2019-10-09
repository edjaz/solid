package com.example.demo.srp.ok;

public class FuelCapteur extends Capteur<Integer> {

    protected FuelCapteur(Integer value) {
        super(value);
        displayName = "Carburant";
        unite = "L";
    }

    @Override
    public CapteurType getType() {
        return CapteurType.FUEL;
    }
}
