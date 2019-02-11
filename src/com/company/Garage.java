package com.company;


import java.util.ArrayList;

public class Garage{
    ArrayList<Vehicule> listGarage = new ArrayList<Vehicule>();

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
}
