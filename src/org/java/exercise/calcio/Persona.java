package org.java.exercise.calcio;

/*
Creare una classe Persona con gli attributi nome ed età.
Estendere la classe Persona con una classe Giocatore e una classe Allenatore:
ogni giocatore ha un ruolo e ogni allenatore ha la sua strategia (es: difensiva o offensiva).
 */

public class Persona {
    // CAMPI
    private String nome;
    private int eta;


    // COSTRUTTORI

    public Persona(String nome, int eta) {
        this.nome = nome;
        this.eta = eta;
    }


    // GETTER E SETTER

    public String getNome() {
        return nome;
    }

    public int getEta() {
        return eta;
    }


    // METODI


    @Override
    public String toString() {
        return "Persona{" +
                "nome= '" + nome + '\'' +
                ", eta= " + eta +
                '}';
    }
}
