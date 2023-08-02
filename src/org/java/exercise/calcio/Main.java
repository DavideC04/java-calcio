package org.java.exercise.calcio;

import java.util.Arrays;
import java.util.Random;

public class Main {
    // creo un array di nomi
    private static final String[] NOMI = {"Pippo", "Paolo", "Roberto", "Filippo", "Pietro", "Emanuele", "Virgilio", "Davide", "Alessandro", "Salvatore", "Armando" };
    // creo un array di ruoli
    private static final String[] RUOLI ={"Portiere", "Difensore", "Centrocampista", "Attaccante"};

    public static void main(String[] args) {
        Random random = new Random();
        Giocatore[] giocatori = new Giocatore[11];

        // itero un ciclo for
        for (int i = 0; i < NOMI.length; i++) {
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




        // stampo la squadra
        // uso un for-each
        for (Giocatore giocatore : giocatori){
            System.out.println(giocatore);
        }

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
