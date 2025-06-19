package Esercizi.entities;

import Esercizi.entities.enums.Dipartimento;

public class Dirigente extends Dipendente {
    //ESERCIZIO2
    //non servono attributi extra
    //estendo costruttore da superclasse
    //elimino lo stipendio dai parametri per poterlo calcolare
    public Dirigente(Dipartimento dipartimento) {
        super(dipartimento);
    }
    //setto metodo per calcolo stipendio
    //30% in più del full time (4sett*36h/sett*paga oraria)

    @Override
    public double calcStipendio() {
        return 1.50 * (4 * 36 * pagaOra);
    }
}
