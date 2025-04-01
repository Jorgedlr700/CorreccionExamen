package org.example;

public class Clasecirculo {
    private int id;
    private double radio;
    private String color;


    public Clasecirculo(int id) {
        this.id = id;
    }

    public Clasecirculo(double radio) {
        this.radio = radio;
    }

    public Clasecirculo(String color) {
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


}
