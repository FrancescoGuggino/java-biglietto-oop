package org.java.biglietto.oop;

import java.math.BigDecimal;

public class Biglietto {

    // attributi

    private int km;

    private int eta;

    private static final BigDecimal chilometraggio = new BigDecimal("0.21");
    private static final BigDecimal scontoSenior = new BigDecimal("0.40");
    private static final BigDecimal scontoMin = new BigDecimal("0.20");

    // costruttore

    public Biglietto(int km, int eta) throws RuntimeException {

        if (km < 0 ){
            throw new RuntimeException("Km must not be negative!");
        }

        if (eta < 0){
            throw new RuntimeException("Età must not be 0 or negative!");
        }

        this.km = km;
        this.eta = eta;

    }


    // getter setter

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    // metodi

    public BigDecimal calcolaPrezzo() {
        BigDecimal kmDecimal = new BigDecimal(km);
        BigDecimal prezzoBase = kmDecimal.multiply(chilometraggio);

        if (eta >= 65) {
            BigDecimal sconto = prezzoBase.multiply(scontoSenior);
            BigDecimal prezzoScontato = prezzoBase.subtract(sconto);
            return prezzoScontato;
        } else if (eta < 18) {
            BigDecimal sconto = prezzoBase.multiply(scontoMin);
            BigDecimal prezzoScontato = prezzoBase.subtract(sconto);
            return prezzoScontato;
        } else {
            return prezzoBase;

        }

    }
    @Override
    public String toString() {
        return "Biglietto{" +
                "km=" + km +
                ", eta=" + eta +
                '}';
    }
}








