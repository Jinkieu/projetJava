package com.company;

public class Main {

    public static void main(String[] args) {
        /*Vehicule s = new Vehicule();
        s.setConsommation(5);
        s.setJauge(50);
        rouler(1000);*/

        Compteur C = new Compteur();
        System.out.println("Test Des Compteurs");
        System.out.println(C.toString());
        C.add(500);
        System.out.println(C.toString());
        C.add(500);
        System.out.println(C.toString());
        C.add(150);
        System.out.println(C.toString());
        C.add(900);
        System.out.println(C.toString());

        System.out.println("re test 3");
    }
}
