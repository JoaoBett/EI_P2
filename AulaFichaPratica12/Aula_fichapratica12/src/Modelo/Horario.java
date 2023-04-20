import Modelo.DiaSemana;

public class Horario{
    private DiaSemana diaSemana;
    private int horaInicio;
    private int duracao;

    public Horario(DiaSemana diaSemana, int horaInicio, int duracao){
        this.diaSemana = diaSemana;
        this.horaInicio = horaInicio;
        this.duracao = duracao;
    }

    public DiaSemana getDiaSemana() {
        return diaSemana;
    }

    public int gethoraInicio() {
        return horaInicio;
    }

    public int getDuracao() {
        return duracao;
    }

    public boolean isSobreposto(Horario horarios){
        return this.diaSemana == horarios.diaSemana && this.horaInicio + this.duracao > horarios.horaInicio &&
                this.horaInicio < horarios.horaInicio + horarios.duracao;
    }
}