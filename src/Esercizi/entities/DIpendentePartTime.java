package Esercizi.entities;

import Esercizi.entities.enums.Dipartimento;

public class DIpendentePartTime extends Dipendente {
    //ESERCIZIO2
    //non servono attributi extra
    //estendo costruttore da superclasse
    //elimino lo stipendio dai parametri per poterlo calcolare
    public DIpendentePartTime(Dipartimento dipartimento) {
        super(dipartimento);
    }
    //setto metodo per calcolo stipendio
    //4sett*18h/sett*paga oraria

    @Override
    public double calcStipendio() {
        return 4 * 18 * pagaOra;
    }
}

