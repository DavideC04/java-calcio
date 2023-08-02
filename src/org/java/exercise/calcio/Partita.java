package org.java.exercise.calcio;

/*
Creare una classe Partita che contiene al suo interno una Squadra di casa, una Squadra ospite e un Arbitro.
Implementa un metodo per iniziare la partita (che imposti lo stato della partita come "iniziata") e un metodo per segnare un goal:
scegliere in modo casuale quale delle due squadre ha segnato e stampare la stringa “Ha segnato la squadra <nomeSquadra>”.
A prescindere da quale squadra ha segnato, incrementare un contatore con il totale dei goal segnati.
NB: non è possibile segnare un goal se la partita non è ancora iniziata! In questo caso il sistema deve restituire un messaggio d’errore.
 */

import java.util.Random;

public class Partita {
    // CAMPI
    private Squadra casa;
    private Squadra ospite;
    private Arbitro arbitro;
    private boolean iniziata;
    private int goal;

    // COSTRUTTORI

    public Partita(Squadra casa, Squadra ospite, Arbitro arbitro) {
        this.casa = casa;
        this.ospite = ospite;
        this.arbitro = arbitro;
        // inizializzo la booleana come false
        this.iniziata = false;
        // inizializzo il contatore dei goal uguale a 0
        this.goal = 0;
    }


    // GETTER E SETTER


    // METODI
    public void aumentaGoal(){
        goal++;
    }

    public void partitaIniziata(){
        this.iniziata= true;
        System.out.println("la partita è iniziata!");
    }

    // non è possibile segnare un goal se la partita non è ancora iniziata! In questo caso il sistema deve restituire un messaggio d’errore
    public void  goalCasuale(){
        if (!iniziata){
            System.out.println("Errore: la partita non è ancora iniziata!");

        }
        // goal segnato da una squadra casuale
        Random random = new Random();
        boolean goalSquadraDiCasa = random.nextBoolean();
        if (goalSquadraDiCasa){
            System.out.println("Gooooaaaaaalllll!!!!!! Ha segnato la squadra di casa: " + casa.getNomeSquadra());
            casa.aumentaGoal();
        } else {
            System.out.println("Gooooaaaaaalllll!!!!!! Ha segnato la squadra ospite: " + ospite.getNomeSquadra());
            ospite.aumentaGoal();
        }
        goal++;


    }


    public void partitaConclusa(){
        this.iniziata = false;
        System.out.println("La partita è terminata!");
        System.out.println("Risultato finale: " + casa.getNomeSquadra() + " " + casa.getGoal() + " - " + ospite.getGoal() + " " + ospite.getNomeSquadra());    }





}
