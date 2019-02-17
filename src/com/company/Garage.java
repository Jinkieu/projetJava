package com.company;



import java.util.*;


/**
 * Classe Garage
 */

public class Garage implements Iterable<Vehicule>{

    private ArrayList<Vehicule> listGarage;

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


    private static final TreeSet<Vehicule> sortTotalisateur = new TreeSet<Vehicule>(new Comparator<Vehicule>() {

        public int CompteurComparator(Vehicule o1, Vehicule o2) {

            if (o1.equals(o2)) {

                return 0;

            }

            if (o1.compteur.getTotalisateur() >= o2.compteur.getTotalisateur()) {

                return 1;

            }

            return -1;

        }

    });



    public static TreeSet getSort(ArrayList list) {
         TreeSet set = new TreeSet(list);
         return set;
     }

     public static TreeSet getSortTot(ArrayList list){
        TreeSet ts = new TreeSet<>(sortTotalisateur);
        ts.addAll(list);
        return ts;
     }




    public String toString(){
        String str = new String();
        for(Vehicule a : listGarage)
        {
             str += a.toString() + "\n";
        }
        return str;
    }
}

