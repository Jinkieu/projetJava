package com.company;

import java.util.Comparator;
import java.util.Scanner;

/**
 *  Classe Vehicule
 */

public class Vehicule implements Comparable<Vehicule> {
    private static int registre=0;
    private final int numeroImmatriculation;
    private double jauge;
    protected Compteur compteur;
    private double consommation;    //Consommation du vehicule en km par litre
    final double capacite = 50.0;
    private static int i = 1;

    /**
     *  Constructeur véhicule
     */
    public Vehicule() {
        numeroImmatriculation=registre;
        registre++;
        consommation=100;
        compteur= new Compteur();
        jauge=0;
    }

    /**
     *  Constructeur véhicule
     */

    public Vehicule(double consommationVehicule) {
        numeroImmatriculation=registre;
        registre++;
        consommation=consommationVehicule;
        compteur= new Compteur();
        jauge=0;
    }

    /**
     *  Constructeur véhicule
     */

    public Vehicule(double consommationVehicule, double niveauJauge) {
        numeroImmatriculation=registre;
        registre++;
        consommation=consommationVehicule;
        compteur = new Compteur();
        jauge = niveauJauge;
    }

    /**
     * Getter
     * @return numeroImmatriculation
     *      Le numero d'immatriculation
     */

    public int getNoImmatriculation(){
        return numeroImmatriculation;
    }

    /**
     *  Fonction qui renvoie le compteur
     * @return compteur
     *
     */

    public Compteur getCompteur(){
        return compteur;
    }


    /**
     *  Getter de la jauge
     * @return jauge
     */

    public double getJauge() {
        return jauge;
    }

    /**
     * Setter de la jauge
     * @param jauge
     */

    public void setJauge(double jauge) {
        this.jauge = jauge;
    }

    /**
     * Getter de la consommation du vehicule
     * @return  consommation
     */

    public double getConsommation() {
        return consommation;
    }

    /**
     * Setter de la consommation
     * @param consommation
     */

    public void setConsommation(double consommation) {
        this.consommation = consommation;
    }

    /**
     * Méthode qui permet de remplir la jauge d'essence
     * @param quantite
     * @return reste
     * @throws CapaciteDepasseeException
     */

    public double mettreDeLessence(double quantite) throws CapaciteDepasseeException {
        double reste = 0;
        jauge += quantite;
        if (jauge > capacite) {
            reste = jauge - capacite;
            faireLePlein();
            throw new CapaciteDepasseeException("Votre reservoir a une capacite insuffisante pour mettre " + reste + " essence.");
        }
        return reste;
    }

    /**
     * Methode qui remplit la jauge au maximum
     */

    public void faireLePlein() {
        jauge = capacite;
    }

    /**
     * Methode qui permet au vehicule de rouler, qui remplit le réservoir lorsque celui ci est vide et qui incrémente le compteur
     * @param distance
     * @return distance
     */


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
            }
            if (tmp == jauge)
            {
                jauge = 0;
                tmp = 0;
                faireLePlein();
            }
            else if (tmp > jauge)
            {
                tmp -= jauge;
                faireLePlein();
            }
        }
        compteur.add(distance);
        return distance;
    }

    /**
     * Methode qui permet de trier les voitures selon leurs plaques d'immatriculation
     * @param otherVehicule
     * @return
     */

    @Override
    public int compareTo(Vehicule otherVehicule){
        return(this.getNoImmatriculation() - otherVehicule.getNoImmatriculation());
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
//test