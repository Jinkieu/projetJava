package com.company;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

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
        Vehicule v3 = new Vehicule();
        Vehicule v4 = new Vehicule();
        Iterator i = test.iterator(); //sait pas a quoi ca sert
        v1.setJauge(50.0);
        v1.compteur.setTotalisateur(150);
        v2.setJauge(10);
        v2.compteur.setTotalisateur(100);
        v3.setJauge(45.0);
        v3.compteur.setTotalisateur(300);
        v4.setJauge(49.0);
        v4.compteur.setTotalisateur(10);
        test.addVehicule(v1);
        test.addVehicule(v3);
        test.addVehicule(v2);
        test.addVehicule(v4);

        /**
         * treeSet
         */
        TreeSet set = Garage.getSort(test.getListGarage());
        Iterator itr = set.iterator();


       /* for(int index=0;index<test.listGarage.size();index++)
        {
            System.out.println(test.listGarage);
        }*/
       //System.out.println(test.toString());
        /*for(Vehicule a : test) {
            System.out.println(a.toString());
        }*/
        System.out.println("Avant le sort\n"+test.toString());
        Collections.sort(test.getListGarage());
        System.out.println("Apres le sort Comparable\n"+test.toString());
        Collections.sort(test.getListGarage(),Vehicule.distanceComparator);
        System.out.println("Apres le sort Comparator\n"+test.toString());

        System.out.println("TreeSet basique :\n");
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

        itr = set.iterator();
        System.out.println("TreeSet basique :\n");
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

        System.out.println("theo le phoque");

    }
}
