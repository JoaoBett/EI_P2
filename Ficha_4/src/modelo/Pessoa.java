package modelo;

import java.util.LinkedList;

public abstract class Pessoa extends Identificador implements RepositorioAulas {

    private LinkedList<Aula> aulas;

    public Pessoa(String nome, long numero) {
        super(nome, numero);
        aulas = new LinkedList<>(); 
    }


    public void preencherSumario (Aula aula) {
        if (aula != null || !aulas.contains(aula)){ return;}
        aula.adicionarLinhaSumario(aula.getNome());
        aula.adicionarLinhaSumario(String.valueOf(aula.getNumero()));
        aula.adicionarLinhaSumario(nome);
        for (Aluno aluno : aula.getAlunos()) {
            aluno.preencherSumario(aula);
        }
    }


    @Override
    public void adicionar (Aula aula){
        if (aula == null || aulas.contains(aula)) { 
            return;
        }
        aulas.add(aula);
        associar(aula);  // parte distinta as classes Aluno e Professor
    }
    
    protected abstract void associar(Aula aula);
    
    @Override
    public void remover(Aula aula){
        if (aula == null || !aulas.contains(aula) ) {
            return;
        }
        aulas.remove(aula);
        desassociar(aula);
    }

    protected abstract void desassociar(Aula aula);


    @Override
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

    protected void escreverSumario(Aula aula){
        if (aula != null || !aulas.contains(aula)){ return;}
        aula.adicionarLinhaSumario(aula.getNome());
        aula.adicionarLinhaSumario(String.valueOf(aula.getNumero()));
        aula.adicionarLinhaSumario(nome);
        for (Aluno aluno : aula.getAlunos()) {
            aluno.preencherSumario(aula);
        }
    }

    protected void assinarSumario(Aula aula) {
        aula.adicionarLinhaSumario(nome);
    }
}
