package org.java.exercise.calcio;

/*
Definire una classe Squadra che contiene una lista di oggetti di tipo Giocatore e un Allenatore.
 */

import java.util.ArrayList;
import java.util.List;

public class Squadra {
    // CAMPI
    private List<Giocatore> giocatori;
    Allenatore allenatore;
    private String nomeSquadra;
    private int goal;



    // COSTRUTTORI
    public Squadra(){
        giocatori = new ArrayList<>();
    }

    public Squadra(List<Giocatore> giocatori, Allenatore allenatore, String nomeSquadra) {
        this.giocatori = giocatori;
        this.allenatore = allenatore;
        this.nomeSquadra = nomeSquadra;
    }

    public void aumentaGoal() {

    }



    // GETTER E SETTER

    public String getNomeSquadra() {
        return nomeSquadra;
    }

    public int getGoal() {
        return goal;
    }


    // METODI

}
