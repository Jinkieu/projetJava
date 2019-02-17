package com.company;



import java.util.*;


/**
 * Classe Garage
 */

public class Garage implements Iterable<Vehicule>{

    private ArrayList<Vehicule> listGarage;
    private TreeSet<Vehicule> garageTreeSet;
    /**
     * Constructeur de la classe
     */
    public Garage() {
        listGarage = new ArrayList<Vehicule>();
    }

    /**
     * Getter de l'attribut ArrayList listGarage
     * @return listGarage
     */
    public ArrayList getListGarage() {
        return listGarage;
    }

    /**
     * Setter de l'attribut ArrayList
     * @param listGarage
     */

    public void setListGarage(ArrayList listGarage) {
        this.listGarage = listGarage;
    }

    /**
     * Methode qui permet d'ajouter un vehicule dans l'attribut listGarage
     * @param v1
     */
    public void add(Vehicule v1) {
        listGarage.add(v1);
    }

    /**
     * Methode Iterator de l'ArrayList
     * @return listGarage.iterator()
     */

    public Iterator<Vehicule> iterator(){
        return listGarage.iterator();
    }

    public void sortImmatriculation() {

    }

    /**
     *  Methode qui permet de mettre la jauge de tous les vehicules du garage au maximum en utilisant la methode de la
     *  classe Vehicule faireLePlein()
     */

    public void faireLePleinAll () {

        for(Vehicule a : listGarage)
        {
            a.faireLePlein();
        }

    }

    /**
     *  Methode qui permet réinitialiser  tous les compteurs des vehicules du garage  en utilisant la methode de la
     *  classe Compteur resetPartiel()
     */

    public void resetPartielAll() {

        for(Vehicule a : listGarage)
        {
            a.compteur.resetPartiel();
        }

    }



    /**
     * treeSet initialisation
     */






    public  TreeSet triNoImmatriculion2() {
         TreeSet set = new TreeSet(listGarage);
         garageTreeSet = set;
         return garageTreeSet;
     }

     public  TreeSet triCompteur2(){
        TreeSet ts = new TreeSet<>(Vehicule.distanceComparator);
        ts.addAll(listGarage);
        garageTreeSet = ts;
        return garageTreeSet;
     }



    public ArrayList triCompteur()
    {
        Collections.sort(listGarage,Vehicule.distanceComparator);
        return listGarage;
    }

    public ArrayList triNoImmatriculion()
    {
        Collections.sort(listGarage);
        return listGarage;
    }

    public String toString(){
        String str = new String();
        for(Vehicule a : listGarage)
        {
             str += a.toString() + "\n";
        }
        return str;
    }
    public String toStringTreeSet(){
        String str = new String();
        for(Vehicule a : garageTreeSet)
        {
            str += a.toString() + "\n";
        }
        return str;
    }
}

