package com.example.demo.srp.ok;

import java.util.ArrayList;
import java.util.List;

class TableauDeBord {
    private List<Capteur> capteurs;

    public TableauDeBord() {
        this.capteurs = new ArrayList<>();
    }

    public void add(Capteur capteur) {
        capteurs.add(capteur);
    }

    public void start() {
        capteurs.forEach(capteur -> capteur.start());
    }

    public void stop() {
        capteurs.forEach(capteur -> capteur.stop());
    }

    public void display(CapteurType type) {
        capteurs
                .stream()
                .filter(capteur -> capteur.getType() == type)
                .forEach(capteur -> capteur.display());
    }
}
