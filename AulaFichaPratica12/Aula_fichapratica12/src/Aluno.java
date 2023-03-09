import java.util.LinkedList;

public class Aluno {

    private String nome;
    private long numero;
    private LinkedList<Aula> aula;

    public Aluno(String nome,long numero){
        this.nome = nome;
        this.numero = numero;
        aula = new LinkedList<>();
    }

    public void preencherSumario(Aula aula){

    }

    public void adicionarAula(){

    }
}
