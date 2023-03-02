import java.util.LinkedList;

public class Professor extends Aula{

    private String name;
    private int num;
    private LinkedList<Aula> aulas;

    public Professor(){}

    public Professor(String name, int num){
        this.name = name;
        this.num = num;
        this.aulas = new LinkedList<>();
    }

    //Adicionar o nome do professor e mostrá-lo
    public String getName(){
        return this.name;
    }

    public void setName(){
        this.name = name;
    }

    //Adicionar o num do professor e mostrá-lo
    public int getNum(int num){
        return this.num;
    }

    public void setNum(){
        this.num = num;
    }

    public void adicionarProfessor(Aula aula){

    }

    public void preencherSumario(Aula aula){

    }
}