package com.company;

import java.util.Comparator;
import java.util.Scanner;

public class Vehicule implements Comparable<Vehicule> {
    private static int registre=0;
    private final int numeroImmatriculation;
    private double jauge;
    protected Compteur compteur;
    private double consommation;    //Consommation du vehicule en km par litre
    final double capacite = 50.0;
    private static int i = 1;

    public Vehicule() {
        numeroImmatriculation=registre;
        registre++;
        consommation=100;
        compteur= new Compteur();
        fairePlein();
    }

    public Vehicule(int consommationVehicule) {
        numeroImmatriculation=registre;
        registre++;
        consommation=consommationVehicule;
        compteur= new Compteur();
        fairePlein();
    }

    public Vehicule(int consommationVehicule, double niveauJauge) {
        numeroImmatriculation=registre;
        registre++;
        consommation=consommationVehicule;
        compteur = new Compteur();
        jauge = niveauJauge;
    }

    public int get_immatriculation(){
        return numeroImmatriculation;
    }

    public Compteur getCompteur(){
        return compteur;
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

    /*
     * Même résultats mais avec les exceptions
     * Besoin de tests
     */
    public double mettreDeLessence(double quantite) throws ExceptionEssence {
        double reste = 0;
        jauge += quantite;
        if (jauge > capacite) {
            reste = jauge - capacite;
            fairePlein();
            System.out.println("Votre reservoir a une capacite insuffisante pour mettre " + reste + " essence.");
            throw new ExceptionEssence();
        }
        return reste;
    }

    public void fairePlein() {
        jauge = capacite;
    }


    public double rouler(double distance)
    {
        double tmp = ((consommation*distance)/100); // en litre
        System.out.println(tmp);
        while (tmp!=0)
        {
            if ( tmp < jauge)
            {
                jauge -= tmp;
                tmp = 0;
                compteur.add((tmp*100)/consommation);
            }
            if (tmp == jauge)
            {
                jauge = 0;
                tmp = 0;
                fairePlein();
            }
            else if (tmp > jauge)
            {
                tmp -= jauge;
                compteur.add((jauge*100)/consommation);
                fairePlein();
            }
        }
        return jauge;
    }

    @Override
    public int compareTo(Vehicule otherVehicule){
        // Trier les voitures selon leur plaques d'immatriculation
        return(this.get_immatriculation() - otherVehicule.get_immatriculation());
    }

    @Override
    public String toString(){
        return "Vehicule" +numeroImmatriculation+ ": " + compteur.toString() + " jauge = " + jauge;
    }

    /**
     * Comparator pour trier les voitures par compteur kilometrique
     */
    ///Comparator permet de trier selon differents/plusieurs criteres
    public static Comparator<Vehicule> distanceComparator = new Comparator<Vehicule>() {
        @Override
         public int compare(Vehicule v1, Vehicule v2) {
             double result = v1.compteur.getTotalisateur() - v2.compteur.getTotalisateur();
             if(result < 0) return -1;
             if(result > 0) return 1;
             return 0;
         }
    };
}
