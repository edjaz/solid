package com.example.demo.ocp.ok;

public class Carre extends Forme {

    public Carre(Point p1, Point p2, Point p3, Point p4) {
        super(p1,p2,p3,p4);
    }

    @Override
    public String getType() {
        return "carré";
    }
}
