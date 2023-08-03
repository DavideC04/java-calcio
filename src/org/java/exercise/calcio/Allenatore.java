package org.java.exercise.calcio;

/*
ogni allenatore ha la sua strategia (es: difensiva o offensiva)
 */

public class Allenatore extends Persona{
    // CAMPI
    private  String strategia;

    // COSTRUTTORI

    public Allenatore(String nome, int eta, String strategia) {
        super(nome, eta);
        this.strategia = strategia;
    }


    // GETTER E SETTER

    // METODI




    @Override
    public String toString() {
        return super.toString() + " Strategia= " + strategia;
    }
}
