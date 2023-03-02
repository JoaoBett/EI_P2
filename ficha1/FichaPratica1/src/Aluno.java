public class Aluno extends Aula{

    String name;
    int num;

    public Aluno(){}

    public Aluno (String name, int num ){
        this.name = name;
        this.num = num;
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
}
