package com.company;

public class Compteur {
    protected double totalisateur,partiel;
    final double cst = 1000;

    public Compteur() {
        totalisateur = 0;
        partiel = 0;
    }

    public double getPartiel() {
        return partiel;
    }

    public double getTotalisateur() {
        return totalisateur;
    }

    public void setPartiel(double partiel) {
        this.partiel = partiel;
    }

    public void setTotalisateur(double totalisateur) {
        this.totalisateur = totalisateur;
    }

    public void resetPartiel() {
        partiel = 0.0;
    }

    public void add(double i) {
        totalisateur += i;
        partiel += i;
        if(partiel>=cst){
            partiel%=cst;
        }
    }

    public String toString() {
        return "Compteur = [ totalisateur ="+totalisateur+" | Partiel = "+partiel+"]";
    }
}
//test