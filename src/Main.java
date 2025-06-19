import Esercizi.entities.Dipendente;
import Esercizi.entities.enums.Dipartimento;


public class Main {
    public static void main(String[] args) {

        //ESERCIZIO 1

        //CREO I TRE DIPENDENTI
        Dipendente d1 = new Dipendente(1700, Dipartimento.PRODUZIONE);
        Dipendente d2 = new Dipendente(2300, Dipartimento.AMMINISTRAZIONE);
        Dipendente d3 = new Dipendente(1900, Dipartimento.VENDITE);

        //CREO L'ARRAY IN CUI INSERIRLI
        Dipendente[] dipendenti = {d1, d2, d3};

        //CICLO PER STAMPATRE LE MATRICOLE
        for (int i = 0; i < dipendenti.length; i++) {
            System.out.println("Dipendente " + (i + 1) + ", matricola: " + dipendenti[i].getMatricola());
        }

    }
}