package org.example;

public class ClaseRectangulo {

    private int id;
    private double ladoA;
    private double ladoB;
    private String color;


    public ClaseRectangulo(int id, double ladoA, double ladoB, String color) {
        this.id = id;
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "ClaseRectangulo{" +
                "id=" + id +
                ", ladoA=" + ladoA +
                ", ladoB=" + ladoB +
                ", color='" + color + '\'' +
                '}';
    }

}
