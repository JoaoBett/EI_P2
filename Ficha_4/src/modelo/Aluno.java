package modelo;

import java.util.LinkedList;
public class Aluno extends Pessoa {

    private LinkedList<Aula> aulas;


    public Aluno(String nome, long numero) {
        super(nome, numero);
        aulas = new LinkedList<>();
    }
    @Override
    protected void associar(Aula aula) {
        aula.adicionar(this);
    }

    @Override
    protected void desassociar(Aula aula) { aula.remover(this); }
}
