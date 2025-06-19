import Esercizi.entities.*;
import Esercizi.entities.enums.Dipartimento;


public class Main {
    public static void main(String[] args) {

        //ESERCIZIO 1

        //CREO I TRE DIPENDENTI

        //ESERCIZIO 2 - creo un contatore per gli stipendi e elimino lo stipendio dai parametri

        double totaleStipendi = 0.0;

        Dipendente d1 = new DipendenteFullTime(Dipartimento.PRODUZIONE);
        Dipendente d2 = new Dirigente(Dipartimento.AMMINISTRAZIONE);
        Dipendente d3 = new DIpendentePartTime(Dipartimento.VENDITE);

        //CREO L'ARRAY IN CUI INSERIRLI
        Dipendente[] dipendenti = {d1, d2, d3};

        //ESERCIZIO 3 - creo i volontari
        Volontario v1 = new Volontario("Marco", 19, "Studente");
        Volontario v2 = new Volontario("Gloria", 28, "Biotecnologa");
        Volontario v3 = new Volontario("Elisabetta", 26, "Soccorritrice");

        //CREO L'ARRAY MISTO IN CUI INSERIRLI
        CheckIn[] operatori = {d1, d2, d3, v1, v2, v3};

        //CICLO PER EFFETTUARE CHECKIN
        for (CheckIn operatore : operatori) {
            operatore.checkIn();
        }

        //ESERCIZIO 2 - CICLO PER STAMPATRE LE MATRICOLE
        for (int i = 0; i < dipendenti.length; i++) {

            //ESERCIZIO 2 - calcolo l'ammontare dello stipendio del singolo oggetto nell'array
            //usando il polimorfismo non importa che i tipi di dipendenti siano diversi
            //perchè il metodo in astratto è stato settato nella superclasse
            //quindi nel ciclo ciascun oggetto userà il suo metodo

            double stipendio = dipendenti[i].calcStipendio();
            //sommo gli stipendi per calcolare il totale
            totaleStipendi += stipendio;
            System.out.println("Dipendente " + (i + 1) + ", matricola: " + dipendenti[i].getMatricola() + " stipendio: " + dipendenti[i].calcStipendio());
        }
        System.out.println("Totale stipendi: " + totaleStipendi + " €");
    }
}