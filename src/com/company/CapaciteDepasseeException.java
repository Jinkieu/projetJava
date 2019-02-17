package com.company;

/*
 * Exception utilisée dans la classe Vehicule
 * Utilisée dans la méthode mettreDeLessence()
 */
public class CapaciteDepasseeException extends Exception{
    String _Message;
    public CapaciteDepasseeException() {
        super("Exception Error in 'Essence'");
    }
    public CapaciteDepasseeException(String Message) {
        _Message=Message;
    }

    public String getMessage() {
        return _Message;
    }
}

