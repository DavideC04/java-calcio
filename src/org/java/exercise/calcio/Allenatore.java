package org.java.exercise.calcio;

/*
ogni allenatore ha la sua strategia (es: difensiva o offensiva)
 */

public class Allenatore extends Persona{
    // CAMPI
    private  boolean strategia;

    // COSTRUTTORI

    public Allenatore(String nome, int eta, boolean strategia) {
        super(nome, eta);
        this.strategia = strategia;
    }


    // GETTER E SETTER

    // METODI
    public String getStrategia(){
        return strategia ? "Difensiva" : "Offensiva";
    }



    @Override
    public String toString() {
        return super.toString() + "strategia: " + strategia;
    }
}
