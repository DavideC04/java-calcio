package org.java.exercise.calcio;

/*
ogni allenatore ha la sua strategia (es: difensiva o offensiva)
 */

public class Allenatore extends Persona{
    // CAMPI
    private  boolean eOffensiva;

    // COSTRUTTORI

    public Allenatore(String nome, int eta, boolean strategia) {
        super(nome, eta);
        this.eOffensiva = strategia;
    }


    // GETTER E SETTER

    // METODI
    public String geteOffensiva(){
        return eOffensiva ? "Difensiva" : "Offensiva";
    }



    @Override
    public String toString() {
        return super.toString();
    }
}
