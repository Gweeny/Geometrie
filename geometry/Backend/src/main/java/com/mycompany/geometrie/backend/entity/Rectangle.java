package com.mycompany.geometrie.backend.entity;

import com.mycompany.geometrie.backend.entity.FigureGeometriqueInterface;

public class Rectangle extends Quadrilatere implements FigureGeometriqueInterface{



    public  Rectangle(double longueur, double largeur){
        super(longueur, largeur);

    }

    @Override
    public double calculerSurface() {
        return this.getLargeur()*this.getLongueur();
    }

    @Override
    public double calculerPerimetre() {
        return 2*(this.getLongueur()+this.getLargeur());
    }
}
