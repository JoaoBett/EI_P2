public class Professor extends Aula{
    String name;
    int num;

    public Professor(){}

    public Professor(String name, int num){
        this.name = name;
        this.num = num;
    }

    public String getName(){
        return this.name;
    }

    public void setName(){
        this.name = name;
    }

    public int getNum(int num){
        return this.num;
    }

    public void setNum(){
        this.num = num;
    }
}