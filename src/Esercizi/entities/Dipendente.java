package Esercizi.entities;

import Esercizi.entities.enums.Dipartimento;

import java.util.Random;

public class Dipendente {

    //ATTRIBUTI
    private final int matricola;
    private double stipendio;
    private Dipartimento dipartimento;

    //COSTRUTTORE
    public Dipendente(double stipendio, Dipartimento dipartimento) {
        Random rndm = new Random();
        this.matricola = rndm.nextInt(100000);
        this.stipendio = stipendio;
        this.dipartimento = dipartimento;
    }

    //METODI

    //GETTER

    //matricola
    public int getMatricola() {
        return matricola;
    }

    //stipendio
    public double getStipendio() {
        return stipendio;
    }

    //dipartimento
    public Dipartimento getDipartimento() {
        return dipartimento;
    }

    //SETTER

    //dipartimento
    public void setDipartimento(Dipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }

}
