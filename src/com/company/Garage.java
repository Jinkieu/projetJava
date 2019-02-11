package com.company;


import java.util.ArrayList;
import java.util.Iterator;

public class Garage implements Iterable<Vehicule>{
    private ArrayList<Vehicule> listGarage = new ArrayList<Vehicule>();

    public ArrayList getListGarage() {
        return listGarage;
    }

    public void setListGarage(ArrayList listGarage) {
        this.listGarage = listGarage;
    }

    public Garage() {

    }

    public void addVehicule(Vehicule v1) {
        listGarage.add(v1);
    }
    public Iterator<Vehicule> iterator(){
        return listGarage.iterator();
    }

    public void sortImmatriculation() {

    }

    public String toString(){
        String str = new String();
        for(Vehicule a : listGarage)
        {
             str += a.toString();
             str+= "\n";
        }
        return str;
    }
}
