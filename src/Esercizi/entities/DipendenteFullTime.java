package Esercizi.entities;

import Esercizi.entities.enums.Dipartimento;

public class DipendenteFullTime extends Dipendente {
    //ESERCIZIO2
    //non servono attributi extra
    //estendo costruttore da superclasse
    //elimino lo stipendio dai parametri per poterlo calcolare
    public DipendenteFullTime(Dipartimento dipartimento) {
        super(dipartimento);
    }
    //setto metodo per calcolo stipendio
    //4sett*36h/sett*paga oraria

    @Override
    public double calcStipendio() {
        return 4 * 36 * pagaOra;
    }
}
