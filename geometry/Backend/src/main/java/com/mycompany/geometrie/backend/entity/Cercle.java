package com.mycompany.geometrie.backend.entity;

public class Cercle implements FigureGeometriqueInterface{
    private final double pi = Math.PI;
    private double rayon;

    public Cercle(Double rayon, Double pi) {
        super();
    }

    @Override
    public double calculerSurface() {
        return pi*(rayon*rayon);
    }

    @Override
    public double calculerPerimetre() {
        return 2*pi*rayon;
    }
}
