package org.java.exercise.calcio;

/*
Creare una classe Arbitro, che estende la classe Persona. Ogni arbitro ha un ruolo.
 */

public class Arbitro extends Persona{
    // CAMPI
    String ruolo;


    // COSTRUTTORI

    public Arbitro(String nome, int eta, String ruolo) {
        super(nome, eta);
        this.ruolo = ruolo;
    }


    // GETTER E SETTER

    public String getRuolo() {
        return ruolo;
    }


    // METODI


    @Override
    public String toString() {
        return super.toString() + " ruolo: " + ruolo;
    }
}
