package com.company;

public class Main {

    public static void main(String[] args) {

        /*Vehicule v1 = new Vehicule();

        v1.setConsommation(5);
        v1.setJauge(50);
        //System.out.println(v1.getJauge());
        v1.rouler(1100.0);
        System.out.println(v1.getJauge());
        System.out.println("a");*/
        Garage test = new Garage();
        Vehicule v1 = new Vehicule();
        Vehicule v2 = new Vehicule();
        v1.setJauge(50.0);
        v2.setJauge(10);
        test.addVehicule(v1);
        test.addVehicule(v2);
       /* for(int index=0;index<test.listGarage.size();index++)
        {
            System.out.println(test.listGarage);
        }*/
       System.out.println(test.toString());

    }
}
