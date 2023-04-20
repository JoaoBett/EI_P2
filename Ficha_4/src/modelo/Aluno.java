package modelo;

import java.util.LinkedList;
// CRTL + SHIFT + ENTER -------> preenche o resto
public class Aluno extends Pessoa {

    // PROPRIEDADES / ATRIBUTOS ---> sempre privados

    //private String nome;
    //private long numero;
    private LinkedList<Aula> aulas;


    // CONSTRUTOR
    public Aluno(String nome, long numero) {
        //this.nome = nome;
        //this.numero = numero;
        super(nome, numero);
        aulas = new LinkedList<>();
    }


    // -------------------------------
    // FUNCIONALIDADES ----> publicas

    public void preencherSumario(Aula aula){
        if (aula != null || !aulas.contains(aula)){ return;}
        aula.adicionarLinhaSumario(nome);
    }

    /*public void adicionar(Aula aula) {
        if (aula == null || aulas.contains(aula)) { // se for NULL ou Ja contem a aula na lista de aulas
            return;
        }
        aulas.add(aula); // aluno adicionar a aula ha sua lista de aulas
        //aula.adicionar(this); ------- vai para o 'associar' ------- diferente do Professor --------
    }*/

    @Override
    protected void associar(Aula aula) {
        aula.adicionar(this);
    }

    /*public void remover(Aula aula){
        if (aula == null || !aulas.contains(aula) ) { // se for NULL ou se a aula nao existe na lista
            return;
        }
        aulas.remove(aula); // remove a aula da sua lista de aulas
        //aula.remover(this); //---------- o aue é diferente do Professor --------
    }*/

    @Override
    protected void desassociar(Aula aula) { aula.remover(this); }

    //public String getNome(){return nome; }
    //public long getNumero() {return numero; }
    //public void setNumero(long numero) { this.numero = numero; }


    // -------------------------------------

    public LinkedList<Aula> getAulas() {
        return new LinkedList<>(aulas);
    }

    public LinkedList<Aula> getAulas(Horario horario) {

        LinkedList<Aula> aulasSobreHorario = new LinkedList<>(); // cria lista vazia de aulas -- lista aux.

        if (horario == null) {
            return aulasSobreHorario; // devolve lista vazia
        }

        for (Aula aula : aulas) { // ir a cada aula ver o horario
            //Horario horarioAula = aula.getHorario();
            if (aula.isSobre(horario)){
                aulasSobreHorario.add(aula);
            }
        }

        return aulasSobreHorario;
    }


}
