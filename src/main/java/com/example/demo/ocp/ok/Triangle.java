package com.example.demo.ocp.ok;

public class Triangle extends Forme {

    public Triangle(Point p1, Point p2, Point p3) {
        super(p1,p2,p3);
    }

    @Override
    public String getType() {
        return "triangle";
    }
}
