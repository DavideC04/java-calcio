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
    private Squadra squadraCasa;
    private Squadra squadraOspite;
    private Arbitro arbitro;
    private boolean partitaIniziata;
    private int goal;

    // COSTRUTTORI

    public Partita(Squadra casa, Squadra ospite, Arbitro arbitro, boolean partitaIniziata, int goal) {
        this.squadraCasa = casa;
        this.squadraOspite = ospite;
        this.arbitro = arbitro;
        // inizializzo la booleana come false
        this.partitaIniziata = false;
        // inizializzo il contatore dei goal uguale a 0
        this.goal = 0;
    }


    // GETTER E SETTER


    public Squadra getSquadraCasa() {
        return squadraCasa;
    }

    public Squadra getSquadraOspite() {
        return squadraOspite;
    }

    // METODI
    public void aumentaGoal(){
        goal++;
    }

    public void partitaIniziata(){
        this.partitaIniziata = true;
        System.out.println("la partita è iniziata!");
    }

    // non è possibile segnare un goal se la partita non è ancora iniziata! In questo caso il sistema deve restituire un messaggio d’errore
    public void  goalCasuale(){
        // se la partita non è iniziata, mpm è possibile fare goal
        if (!partitaIniziata){
            System.out.println("Errore: la partita non è ancora iniziata!");

        }
        // goal segnato da una squadra casuale
        Random random = new Random();
        boolean goalSquadraDiCasa = random.nextBoolean();
        // se la squadra di casa ha segnato, stampo sul terminale
        if (goalSquadraDiCasa){
            System.out.println("Gooooaaaaaalllll!!!!!! Ha segnato la squadra di casa: " + squadraCasa.getNomeSquadra());
            // incremento il contatore dei goal
            squadraCasa.aumentaGoal();
        } else {
            // altrimenti, stampo che ha segnato la squadra ospite
            System.out.println("Gooooaaaaaalllll!!!!!! Ha segnato la squadra ospite: " + squadraOspite.getNomeSquadra());
            // incremento il contatore dei goal
            squadraOspite.aumentaGoal();
        }
        goal++;


    }

        // metodo per concludere la partita
    public void partitaConclusa(){
        this.partitaIniziata = false;
        System.out.println("La partita è terminata!");
          }





}
