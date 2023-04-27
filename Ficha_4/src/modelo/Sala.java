package modelo;

import java.util.LinkedList;

public class Sala extends Descritor implements RepositorioAulas{

    private LinkedList<Aula> aulas;
    private boolean aberta;

    public Sala(String nome) {
        this(nome, new LinkedList<>(), false);
    }

    public Sala(String nome, LinkedList<Aula> aulas, boolean aberta){
        super(nome);
        this.aulas = new LinkedList<>();
        for(Aula aula: aulas){
            adicionar(aula);
        }
        this.aberta = aberta;
    }

    @Override
    public LinkedList<Aula> getAulas(){
        return new LinkedList<>(aulas);
    }

    public String getNome(){
        return nome;
    }

git st
    @Override
    public void adicionar (Aula aula){
        if (aula == null || aulas.contains(aula)) {
            return;
        }
        aulas.add(aula);
        aula.setSala(this);
    }

    @Override
    public void remover(Aula aula){
        if (aula == null || !aulas.contains(aula) ) {
            return;
        }
        aulas.remove(aula);
        aula.desassociarSala();
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