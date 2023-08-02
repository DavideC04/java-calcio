package org.java.exercise.calcio;

import java.util.Arrays;
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

    public static void main(String[] args) {
        Random random = new Random();
        Giocatore[] giocatori = new Giocatore[11];

        // itero un ciclo for
        for (int i = 0; i < 11; i++) {
            // inizializzo
            String nomeGiocatore = NOMI[random.nextInt(NOMI.length)];
            int etaGiocatore = random.nextInt(17, 40);
            String ruoloGiocatore = RUOLI[random.nextInt(RUOLI.length)];
            giocatori[i] = new Giocatore(nomeGiocatore, etaGiocatore, ruoloGiocatore);
            
        }
            // informazioni allenatore
        String nomeAllenatore = NOMI[random.nextInt(NOMI.length)];
        int etaAllenatore = random.nextInt(36, 65);
        boolean strategiaGioco = random.nextBoolean();
        Allenatore allenatore = new Allenatore(nomeAllenatore, etaAllenatore, strategiaGioco);
         String strategiaFinale = allenatore.getStrategia();


        // creo l'oggetto squadra
        Squadra squadra = new Squadra(giocatori, allenatore);


        System.out.println("Dream Team");

        // stampo la squadra
        // uso un for-each
        for (Giocatore giocatore : giocatori){
            System.out.println(giocatore);
        }

        // stampo i dati dell'allenatore
        System.out.println(allenatore);
        System.out.println("La strategia dell'allenatore è: " + strategiaFinale);


        /*
        System.out.println(Arrays.toString(NOMI));
        int i = random.nextInt(0, NOMI.length);
        System.out.println(i);
        System.out.println(NOMI[i]);
        */

    }
}
