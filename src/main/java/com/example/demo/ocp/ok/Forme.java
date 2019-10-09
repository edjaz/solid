package com.example.demo.ocp.ok;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public abstract class Forme {
    private List<Point> points;

    public Forme(Point ...points) {
        this.points = Arrays.stream(points).collect(Collectors.toList());
    }

    public abstract String getType();
}
