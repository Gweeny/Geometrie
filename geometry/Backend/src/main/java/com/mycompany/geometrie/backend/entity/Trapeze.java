package com.mycompany.geometrie.backend.entity;

public class Trapeze extends Quadrilatere implements FigureGeometriqueInterface{
    private double coteA;
    private double coteB;
    private double coteC;
    private double coteD;

    public Trapeze(double cote) {
        super(cote);
    }


    @Override
    public double calculerSurface() {
        return 0;
    }

    @Override
    public double calculerPerimetre() {
        return 0;
    }
}
