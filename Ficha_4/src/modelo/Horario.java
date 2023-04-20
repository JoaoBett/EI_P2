package modelo;

public class Horario {

    // PROPRIEDADES / ATRIBUTOS ---> sempre privados

    private DiaSemana diaSemana; // vai ser uma Enumeracao
    private int horaInicio;
    private int duracao;

    // CONSTRUTOR

    public Horario(DiaSemana diaSemana, int horaInicio, int duracao) {
        this.diaSemana = diaSemana;
        this.horaInicio = horaInicio;
        this.duracao = duracao;
    }


    // -------------------------------
    // FUNCIONALIDADES ----> publicas

    public DiaSemana getDiaSemana() {
        return diaSemana;
    }

    public int getHoraInicio() {
        return horaInicio;
    }

    public int getDuracao() {
        return duracao;
    }

    public boolean isSobre(Horario horario) {

        int horaFinalHorario = horario.horaInicio + horario.duracao;  // horario que quero comparar -- que quero saber se esta sobreposto
        int horaFinal = this.horaInicio + this.duracao;           // "Meu horario" -> horario da aula

        /*if (this.diaSemana == horario.diaSemana) {
            return !(this.horaInicio >= horarioHoraFinal || horario.horaInicio >= thisHoraFinal);

            //if ( !(this.horaInicio >= horario_HoraFinal || horario.horaInicio >= this_HoraFinal) ) {
            //    return true;
            //}
        }
        return false; */

        // this.horaInicio >= horaFinalHorario || horario.horaInicio >= horaFinal // nao subreposto -- abaixo fazer a negacao disto
        // this.horaInicio < horaFinalHorario && horario.horaInicio < horaFinal

        return this.diaSemana == horario.diaSemana && this.horaInicio < horaFinalHorario && horario.horaInicio < horaFinal;
    }
}
