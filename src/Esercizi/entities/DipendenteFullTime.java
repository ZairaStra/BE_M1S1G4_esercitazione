package Esercizi.entities;

import Esercizi.entities.enums.Dipartimento;

public class DipendenteFullTime extends Dipendente {
    //ESERCIZIO2

    //ATTRIBUTI
    //non servono attributi extra

    //COSTRUTTORI
    //estendo costruttore da superclasse
    //elimino lo stipendio dai parametri per poterlo calcolare
    public DipendenteFullTime(Dipartimento dipartimento) {
        super(dipartimento);
    }


    //METODI
    //RICORDA: NELLE SOTTOCLASSI NON DEVI RIDEFINIRE GETTER E SETTER SE LI HAI NELLA SUPERCLASSE
    //A MENO DI VOLERLI SOVRASCRIVERE IN QUALCHE MODO

    //setto metodo per calcolo stipendio
    //4sett*36h/sett*paga oraria

    @Override
    public double calcStipendio() {
        return 4 * 36 * pagaOra;
    }
}
