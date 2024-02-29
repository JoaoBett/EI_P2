import java.util.LinkedList;

public class Aluno extends Aula{

    private String name;
    private int num;
    private LinkedList<Aula> aulas;

    public Aluno(){}

    public Aluno (String name, int num ){
        this.name = name;
        this.num = num;
        this.aulas = new LinkedList<>();
    }

    //Adicionar o num do estudante e mostrá-lo
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    //Adicionar o num do estudante e mostrá-lo
    public void setNum(int num){
        this.num = num;
    }

    public int getNum(){
        return this.num;
    }

    //Funcao para mostrar as informações dos alunos
    public void showAluno(){
        System.out.println("Nome: " + this.name);
        System.out.println("Numero: " + this.num);
    }

    public void adicionarAluno(){

    }

    //Funcao para preencherSumario
    public void preencherSumario(){

    }
}
