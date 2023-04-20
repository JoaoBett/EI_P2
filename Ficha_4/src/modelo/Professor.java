package modelo;

import java.util.LinkedList;

public class Professor extends Pessoa {

    // PROPRIEDADES / ATRIBUTOS ---> sempre privados

    private LinkedList<Aula> aulas;


    // construtor --- permite criar um objeto
    public Professor(String nome, long numero) {
        super(nome, numero);
        // devolve uma referencia para o 'this'
        // o this. -> referece ao atributo -- o = nome -> é o que vem por referencia
        aulas = new LinkedList<>(); // criar lista vazia para depois adicionar as aulas
        // nao precisamos do 'this' pois nao temos o nome em 2 lados
    }



    // -------------------------------
    // FUNCIONALIDADES ----> publicas

    public void preencherSumario (Aula aula) {
        if (aula != null || !aulas.contains(aula)){ return;}
        aula.adicionarLinhaSumario(aula.getNome());
        aula.adicionarLinhaSumario(String.valueOf(aula.getNumero()));
        aula.adicionarLinhaSumario(nome);
        for (Aluno aluno : aula.getAlunos()) {
            aluno.preencherSumario(aula);
        }
    }

    /*public void adicionar (Aula aula){
        if (aula == null || aulas.contains(aula)) { // se for NULL ou Ja contem a aula na lista de aulas
            return;
        }
        aulas.add(aula); // adicionar a aula ah sua lista de aulas
        //aula.setProfessor(this); // ------ o que é diferente so Aluno -----------
    }*/

    @Override
    protected void associar(Aula aula) {
        aula.setProfessor(this);
    }


    /*public void remover(Aula aula){
        if (aula == null || !aulas.contains(aula) ) { // se for NULL ou se aula nao existe na lista
            return;
        }
        aulas.remove(aula);  // remover da lista de aulas
        //aula.desassociarProfessor(); // ------- o que é diferente do Aluno --------
    }*/

    @Override
    protected void desassociar(Aula aula) {
        aula.desassociarProfessor();
    }


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
            if (aula.isSobre(horario)){
                aulasSobreHorario.add(aula);
            }
        }

        return aulasSobreHorario;
    }
}
