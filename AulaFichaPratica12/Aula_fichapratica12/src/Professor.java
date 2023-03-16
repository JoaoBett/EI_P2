import java.util.LinkedList;

public class Professor  {

    private String nome;
    private long numero;
    private LinkedList<Aula> aula;

    public Professor(String nome, long numero){
        this.nome = nome;
        this.numero = numero;
        aula = new LinkedList<>();
    }

    public void preencherSumario(Aula aula){

    }

    public void adicionar(Aula aulas){
        if(aulas == null || aula.contains(aulas)){
            return;
        }
        aula.add(aulas);
        aulas.setProfessor(this);
    }

    public String getNome(){
        return this.nome;
    }

    public long getNumero(){
        return this.numero;
    }

    public void setNumero(long numero){
        this.numero = numero;
    }

    public void remover(Aula aulas){
        if(aulas == null || aula.contains(aulas)){
            return;
        }
        aula.remove(aulas);
        aulas.desassociarProfessor();
    }

    public void desassociarProfessor(){

    }


}
