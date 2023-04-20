package modelo;

import java.util.LinkedList;

public class Sala{

    private String nome;
    private boolean aberta;
    private LinkedList<Aula> aulas;

    public Sala(String nome, boolean aberta) {
    }

    public void adicionar (Aula aula){
        if (aula == null || aulas.contains(aula)) {
            return;
        }
        aulas.add(aula);
        associar(aula);  // parte distinta as classes Aluno e Professor
    }

    public void remover(Aula aula){
        if (aula == null || !aulas.contains(aula) ) {
            return;
        }
        aulas.remove(aula);
        desassociar(aula);
    }

    public boolean isAberta(){
        return aberta;
    }

    public void abrir(){
        aberta = true;
    }

    public void fechar(){
        aberta = false;
    }

}