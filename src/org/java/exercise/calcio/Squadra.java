package org.java.exercise.calcio;

/*
Definire una classe Squadra che contiene una lista di oggetti di tipo Giocatore e un Allenatore.
 */

import java.util.ArrayList;
import java.util.List;

public class Squadra {
    // CAMPI
    private String nomeSquadra;
    private List<Giocatore> giocatori;
    Allenatore allenatore;





    // COSTRUTTORI
    public Squadra(){
        giocatori = new ArrayList<>();
    }

    public Squadra(String nomeSquadra, List<Giocatore> giocatori, Allenatore allenatore) {
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




    // METODI

}
