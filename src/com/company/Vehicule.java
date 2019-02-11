package com.company;

public class Vehicule extends Compteur {
    private int numeroImmatriculation;
    private double jauge;
    private double consommation;
    final double capacite = 50.0;
    private static int i = 1;

    public Vehicule() {
        super();
        this.numeroImmatriculation = i++;
    }

    public double getJauge() {
        return jauge;
    }

    public void setJauge(double jauge) {
        this.jauge = jauge;
    }

    public double getConsommation() {
        return consommation;
    }

    public void setConsommation(double consommation) {
        this.consommation = consommation;
    }
    public void mettreEssence(double x) {
        jauge += x;
    }
    public void fairePlein() {
        jauge = capacite;
    }
    public void rouler(double distance) {
       double tmp = (distance*consommation)/100;
       while(tmp != 0) {
           if(tmp<=jauge)
           {
               jauge -= tmp;
               if(jauge == 0) fairePlein();
               add((tmp*100)/consommation);
               tmp = 0;
           }
           else if(tmp>jauge)
           {
               tmp -=jauge;
               add((jauge*100)/consommation);
               fairePlein();
           }
       }
    }
    public String toString() {
        return "Vehicule" +numeroImmatriculation+" [ totalisateur ="+totalisateur+" | Partiel = "+partiel+"]"+";; jauge = "+jauge;
    }
}
