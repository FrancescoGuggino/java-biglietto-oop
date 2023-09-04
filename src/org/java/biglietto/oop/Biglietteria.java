package org.java.biglietto.oop;

import java.util.Scanner;

public class Biglietteria {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        boolean isValid = false;

        while (!isValid){
            System.out.println("Inserisci numero di km:");
            int km = Integer.parseInt(scan.nextLine());

        try {
            Biglietto biglietto = new Biglietto(km);
        } catch (RuntimeException e){
            throw new RuntimeException(e);
            System.out.println("km must not be negative!");
        }

    }
    }
}
