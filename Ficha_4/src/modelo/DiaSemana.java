package modelo;

public enum DiaSemana {
    SEGUNDA_FEIRA("2º feira"),
    TERCA_FEIRA("3º feira"),
    QUARTA_FEIRA("4º feira"),
    QUINTA_FEIRA("5º feira"),
    SEXTA_FEIRA("6º feira"),
    SABADO("Sábado"),
    DOMINGO("Domingo");

    private final String nome; // assuciar um 'nome' a casa obketo/ENUM ao criar um construtor e isso...

    DiaSemana(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
