package Esercizi.entities;

//ESERCIZIO 3 - implemento CheckIn in Volontario
public class Volontario implements CheckIn {

    //ATTRIBUTI
    private String nome;
    private int età;
    private String cv;

    //COSTRUTTORI
    public Volontario(String nome, int età, String cv) {
        this.nome = nome;
        this.età = età;
        this.cv = cv;
    }

    //METODI
    //GETTER
    public String getNome() {
        return nome;
    }

    public String getCv() {
        return cv;
    }

    //ESERCIZIO 3 - valorizzo il metodo ereditato dall'interfaccia
    //RICORDATI DI METTERE @Override - stai sovrascrivendo a tutti gli effetti un metodo ereditato da un livello superiore
    @Override
    public void checkIn() {
        System.out.println("Volontario " + this.nome + " ha timbrato il cartellino in ingresso");
    }
}

