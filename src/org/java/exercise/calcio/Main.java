package org.java.exercise.calcio;

import java.util.List;
import java.util.Random;

public class Main {
    // creo un array di nomi
    private static final String[] NOMI = {"Mario Rossi", "Luca Bianchi", "Andrea Esposito", "Giovanni Russo", "Antonio Ferrari",
            "Roberto Ricci", "Francesco Marino", "Davide Bruno", "Stefano Leone", "Michele Greco", "Fabio Santoro", "Alessandro Conti",
            "Simone Gatti", "Riccardo Lombardi", "Giuseppe Pellegrini", "Carlo Rizzo", "Alberto De Angelis", "Enrico De Santis",
            "Paolo Moretti", "Massimo Pagano", "Angelo Colombo", "Salvatore Ricciardi", "Claudio Romano", "Domenico Villa",
            "Giorgio Serra", "Gianluca Marini", "Marco Riva", "Vincenzo Barone", "Federico Benedetti", "Emanuele Martini",
            "Bruno Ferri", "Alessio Fontana", "Lorenzo Pellegrini", "Daniele Ruggiero", "Filippo Giuliani", "Nicola D'Angelo",
            "Pietro Sorrentino", "Raffaele Farina", "Marcello Monti", "Tommaso Ferretti", "Giacomo Piazza", "Emanuel Vannini",
            "Giovanni Silvestri", "Nicolas Lombardo", "Gabriele Mariani", "Riccardo Testa", "Dario Marchetti", "Vittorio Martino",
            "Adriano Lombardi", "Davide Messina", "Sandro Ferretti", "Enea Vitale", "Andrea Barbieri", "Giulio Gatti",
            "Luigi Valentini", "Federico Costantini", "Angelo Lombardo", "Pasquale Rossetti", "Vittorio Vitale", "Daniele D'Amico",
            "Fabrizio Rizzo", "Carlo Barone", "Alessandro Rizzi", "Alessio Piras", "Gianluca Martino", "Matteo Romano",
            "Roberto Carbone", "Dario Benedetti", "Salvatore Ferri", "Enzo Neri", "Giovanni Montanari", "Stefano Messina",
            "Andrea De Santis", "Piero Ferrara", "Giulio Lombardi", "Emanuele Damico", "Sergio Riva", "Francesco Ferri",
            "Stefano De Luca", "Gianluca Rinaldi", "Gianmarco Vitale", "Claudio Palmieri", "Marco Damico", "Alessio Romano",
            "Alessandro Monti", "Michele Costa", "Nicola Longo", "Domenico Rinaldi", "Roberto Serra", "Alberto De Luca",
            "Giuseppe Mariani", "Filippo Ferretti", "Fabrizio Marino", "Massimo Sorrentino", "Luca De Angelis"};

    // creo un array di ruoli
    private static final String[] RUOLI ={"Portiere", "Difensore", "Centrocampista", "Attaccante"};
    private static final String[] STRATEGIA = {"Difensiva", "Offensiva", "Mista"};

    public static void main(String[] args) {
        // creo l'oggetto random
        Random random = new Random();
        // creo l'oggetto Giocatore
        Giocatore[] giocatori = new Giocatore[11];


        // itero un ciclo for per generare i giocatori con valori casuali
        for (int i = 0; i < 11; i++) {
            // inizializzo
            String nomeGiocatore = NOMI[random.nextInt(NOMI.length)];
            int etaGiocatore = random.nextInt(17, 40);
            String ruoloGiocatore = RUOLI[random.nextInt(RUOLI.length)];
            giocatori[i] = new Giocatore(nomeGiocatore, etaGiocatore, ruoloGiocatore);
        }


            // genero l'allenatore con valori casuali
        String nomeAllenatore = NOMI[random.nextInt(NOMI.length)];
        int etaAllenatore = random.nextInt(36, 65);
        String strategiaDiGioco = STRATEGIA[random.nextInt(STRATEGIA.length)];
        Allenatore allenatore = new Allenatore(nomeAllenatore, etaAllenatore, strategiaDiGioco);


        System.out.println("Dream Team");

        // stampo la squadra
        // uso un for-each
        for (Giocatore giocatore : giocatori){
            System.out.println(giocatore);
        }

        System.out.println();
        // stampo i dati dell'allenatore
        System.out.println("Allenatore:");
        System.out.println(allenatore);



        // creo l'arbitro con valori casuali
        String nomeArbitro = NOMI[random.nextInt(NOMI.length)];
        int etaArbitro = random.nextInt(14, 40);
        String ruoloArbitro = "Arbitro principale";

        // creo l'oggetto arbitro
        Arbitro arbitro = new Arbitro(nomeArbitro, etaArbitro, ruoloArbitro);

        System.out.println();

        // stampo l'arbitro nel terminale
        System.out.println("Arbitro:");
        System.out.println(arbitro);

        // creazione delle squadre
        Squadra squadraCasa = new Squadra("Red Team", List.of(giocatori), allenatore);
        Squadra squadraOspite = new Squadra("Blue team", List.of(giocatori), allenatore);

        // inizializzo una variabile booleana di inizio partita
        boolean inizio = false;
        // inizializzo una variabile di goal a 0
        int goal = 0;


        // partita
        Partita partita = new Partita(squadraCasa, squadraOspite, arbitro, inizio, goal);

        System.out.println();
        // inizio partita
        partita.partitaIniziata();

        System.out.println();
        // inserisco dei goal casuali
        partita.goalCasuale();
        partita.goalCasuale();
        partita.goalCasuale();
        partita.goalCasuale();

        System.out.println();
        // fine partita
        partita.partitaConclusa();

    }
}
