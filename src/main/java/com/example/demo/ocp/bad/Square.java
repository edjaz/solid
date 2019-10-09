package com.example.demo.ocp.bad;

public class Square {
    private Point[] points;
    private int size = 0;

    public Square(Point p1, Point p2, Point p3, Point p4) {
        this.points = new Point[4];
        this.points[0] = p1;
        this.points[1] = p2;
        this.points[2] = p3;
        this.points[3] = p4;

        this.size = 4;
    }


    public Square(Point p1, Point p2, Point p3) {
        this.points = new Point[3];
        this.points[0] = p1;
        this.points[1] = p2;
        this.points[2] = p3;

        this.size = 3;
    }

    public String getType(){
        if(this.size == 3 ) return "triangle";
        else return "carré";
    }


}
