package Esercizi.entities;

import Esercizi.entities.enums.Dipartimento;

import java.util.Random;

public abstract class Dipendente {

    protected static final double pagaOra = 15.0;
    //ATTRIBUTI
    private final int matricola;
    //ESERCIZIO2 - commento lo stipendio per poterlo calcolare
    // private double stipendio;

    //ESERCIZIO2 - per calcolare coerentemente i vari stipendi, stabilisco la paga oraria che userò poi nelle classi
    //uso protected così possono agevolmente usarla le classi che estendono la superclasse ma non si può modificare nel main
    private Dipartimento dipartimento;

    //COSTRUTTORE
    public Dipendente(Dipartimento dipartimento) {
        Random rndm = new Random();
        this.matricola = rndm.nextInt(100000);
        //this.stipendio = stipendio;
        this.dipartimento = dipartimento;
    }

    //METODI

    //GETTER

    //matricola
    public int getMatricola() {
        return matricola;
    }

    //stipendio
//    public double getStipendio() {
//        return stipendio;
//    }

    //dipartimento
    public Dipartimento getDipartimento() {
        return dipartimento;
    }

    //SETTER

    //dipartimento
    public void setDipartimento(Dipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }

    //ESERCIZIO2.metodo astratto per calcolare lo stipendio
    public abstract double calcStipendio();

}
