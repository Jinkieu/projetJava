package com.company;



import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class Garage implements Iterable<Vehicule>{

    private ArrayList<Vehicule> listGarage;

    public Garage() {
        listGarage = new ArrayList<Vehicule>();
    }

    public ArrayList getListGarage() {
        return listGarage;
    }

    public void setListGarage(ArrayList listGarage) {
        this.listGarage = listGarage;
    }

    public void addVehicule(Vehicule v1) {
        listGarage.add(v1);
    }

    public Iterator<Vehicule> iterator(){
        return listGarage.iterator();
    }

    public void sortImmatriculation() {

    }

    /**
     * treeSet initialisation
     */

     public static TreeSet getSort(ArrayList list) {
         TreeSet set = new TreeSet(list);
         return set;
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
