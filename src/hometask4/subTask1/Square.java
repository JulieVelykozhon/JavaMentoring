package hometask4.subTask1;

import hometask4.Shape;

public class Square extends Shape {
    private static final String NAME = "Square";

    private double squareSide;
    private double squareArea;

    public Square( double squareSide) {
        this.squareSide = squareSide;

    }

    @Override
    public double getArea() {
        return squareArea = Math.pow(squareSide, 2);
    }

    @Override
    public String getName() {
        return NAME;
    }

    public double getSquareSide() {
        return squareSide;
    }

    public void setSquareSide(double squareSide) {
        this.squareSide = squareSide;
    }


}






