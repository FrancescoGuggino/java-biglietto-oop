package org.java.biglietto.oop;

import java.math.BigDecimal;
import java.util.Scanner;

public class Biglietteria {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        try {
            System.out.println("Inserisci il numero di km: ");
            int km = Integer.parseInt(scan.nextLine());
            System.out.println("Inserisci l'età del passeggero: ");
            int eta = Integer.parseInt(scan.nextLine());


            Biglietto biglietto = new Biglietto(km,eta);

            BigDecimal prezzo = biglietto.calcolaPrezzo();
            System.out.println("Il costo del biglietto è : " + prezzo + "€");
        } catch (RuntimeException e){

            System.out.println("km must not be negative!");
        }

    }
    }

