package com.company;

/*
 * Exception utilisée dans la classe Vehicule
 * Utilisée dans la méthode mettreDeLessence()
 */
public class ExceptionEssence extends Exception{
    public ExceptionEssence() {
        super("Exception Error in 'Essence'");
    }

    public ExceptionEssence(String Message) {
        super(Message);
    }
}

//test