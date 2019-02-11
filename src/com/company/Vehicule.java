package com.company;

import java.util.Scanner;

public class Vehicule extends Compteur {
    private static int registre=0;
    private final int numeroImmatriculation;
    private double jauge;
    private double consommation;
    final double capacite = 50.0;
    private static int i = 1;

    public Vehicule(int consommationVehicule) {
        numeroImmatriculation=registre;
        registre++;
        consommation=consommationVehicule;
        //compteur=new Compteur();
        //super();
        //this.numeroImmatriculation = i++;
    }

    public int get_immatriculation(){
        return numeroImmatriculation;
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
    public double fairePlein() {

        Scanner kb = new Scanner(System.in);

        System.out.println("Combien de litres voulez vous mettre (50.0 max)?");
        double choix = kb.nextDouble(); // input user
        jauge = choix;

        return jauge;

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
                add((tmp*100)/consommation);
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
                add((jauge*100)/consommation);
                fairePlein();
            }




        }

        return jauge;
    }

    public boolean compareTo(Vehicule v){
        if(this.numeroImmatriculation == v.get_immatriculation()){
            System.out.println("C'est le même véhicule!");
            return true;
        } else{
            System.out.println("Ce sont des véhicules différents!");
            return false;
        }
    }


    public String toString() {
        return "Vehicule" +numeroImmatriculation+" [ totalisateur ="+totalisateur+" | Partiel = "+partiel+"]"+";; jauge = "+jauge;
    }
}
