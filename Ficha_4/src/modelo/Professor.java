package modelo;

import java.util.LinkedList;

public class Professor extends Pessoa {


    private LinkedList<Aula> aulas;


    public Professor(String nome, long numero) {
        super(nome, numero);
        aulas = new LinkedList<>(); // criar lista vazia para depois adicionar as aulas
    }

    @Override
    protected void associar(Aula aula) {
        aula.setProfessor(this);
    }

    @Override
    protected void desassociar(Aula aula) {
        aula.desassociarProfessor();
    }

    protected void escreverSumario(Aula aula){
        if (aula != null || !aulas.contains(aula)){ return;}
        aula.adicionarLinhaSumario(aula.getNome());
        aula.adicionarLinhaSumario(String.valueOf(aula.getNumero()));
        assinarSumario(aula);
        for (Aluno aluno : aula.getAlunos()) {
            aluno.preencherSumario(aula);
        }
    }

    public void abrir(Sala sala){
        if(sala.isAberta()){
            return;
        }
        sala.abrir();
    }

    public void fechar(Sala sala){
        if(!sala.isAberta()){
            return;
        }
        sala.fechar();
    }
}

