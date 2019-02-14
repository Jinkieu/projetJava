package com.company;



import java.util.*;





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

    /**
     * treeSet initialisation
     */


    private static final TreeSet<Vehicule> sortTotalisateur = new TreeSet<Vehicule>(new Comparator<Vehicule>() {

        public int compare(Vehicule o1, Vehicule o2) {

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
             str += a.toString();
             str+= "\n";
        }
        return str;
    }
}

