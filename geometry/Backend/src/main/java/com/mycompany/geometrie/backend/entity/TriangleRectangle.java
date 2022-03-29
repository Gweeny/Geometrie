package com.mycompany.geometrie.backend.entity;


public class TriangleRectangle implements FigureGeometriqueInterface {
    private double base;
    private double hauteur;
    private double hypotenuse;

    public TriangleRectangle(Double base, Double hauteur, Double hypotenuse) {
        super();
    }

    public void calculHypotenuse(){
        this.hypotenuse = Math.sqrt((this.base*this.base)+(this.hauteur*this.hauteur));
    }


    @Override
    public double calculerSurface() {
        return (base*hauteur)/2;
    }

    @Override
    public double calculerPerimetre() {
        return base + hauteur + hypotenuse;
    }
}
