package com.company;

import java.util.Comparator;

public interface VehiculeComparator {
    static final Comparator<Vehicule> NO_IMMATRICULATION_ORDER = new Comparator<Vehicule>(){
        @Override
        public int compare (Vehicule o1, Vehicule o2){
            return o1.compareTo(o2);
        }
    };

    static final Comparator<Vehicule> JAUGE_ORDER = new Comparator<Vehicule>(){
        @Override
        public int compare (Vehicule o1, Vehicule o2){
            if(o1.getJauge() > o2.getJauge())
                return 1;
            else if (o1.getJauge()< o2.getJauge())
                return -1;
            else
                return 0;
        }
    };

    static final Comparator<Vehicule> COMPTEUR_ORDER = new Comparator<Vehicule>(){
        @Override
        public int compare (Vehicule o1, Vehicule o2){
            if(o1.getCompteur().getTotalisateur() > o2.getCompteur().getTotalisateur())
                return 1;
            else if (o1.getCompteur().getTotalisateur() < o2.getCompteur().getTotalisateur())
                return -1;
            else
                return 0;
        }
    };


}
