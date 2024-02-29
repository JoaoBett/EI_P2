package Modelo;

public enum DiaSemana {
    SEGUNDA_FEIRA("2 feira"), TERCA_FEIRA("3 feira"), QUARTA_FEIRA("4 feira"), QUINTA_FEIRA("5 feira"), SEXTA_FEIRA("6 feira"), SÁBADO("Sábado"), DOMINGO("Domingo");

    private final String nome;

    DiaSemana(String nome) {
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }
}
