package org.java.exercise.calcio;

/*
ogni giocatore ha un ruolo
 */

public class Giocatore extends Persona{
    // CAMPI
    private String ruolo;

    // COSTRUTTORI

    public Giocatore(String nome, int eta, String ruolo) {
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
        return super.toString() + "ruolo: " + ruolo;
    }
}
