package modelo;

import java.util.LinkedList;

public class Aula extends Identificador{

    // PROPRIEDADES / ATRIBUTOS ---> sempre privados

    //private String nome;
    //private long numero;
    private StringBuilder sumario;
    private Professor professor;
    private LinkedList<Aluno> alunos;

    private Horario horario;


    // CONSTRUTOR
    // vamos passar a ter 2 construtores, para caso se quizermos ja criar uma modelo.Aula com alunos/professor
    public Aula(String nome, long numero, Horario horario) { // ALT + INSERT  // -------- aula passa a ter um horario na sua criacao
        // como diz no PDF --> "O horário deve ser definido na criação da aula..."
        this(nome, numero, horario, null, new LinkedList<>()); // vai chamar o construtor abaixo
    }

    public Aula(String nome, long numero, Horario horario, Professor professor, LinkedList<Aluno> alunos) { // -> é o construtor mais geral
        //this.nome = nome;
        //this.numero = numero;
        super(nome, numero);
        this.sumario = new StringBuilder();
        this.horario = horario; // ---------------------------------- new horario
        this.professor = professor;   //setProfessor(professor);
        this.alunos = new LinkedList<>(); // copia da lista de alunos
        // fazer um 'for' para inserir/associar os alunos a esta aula
        for (Aluno aluno : alunos) {
            adicionar(aluno); // é o mesmo que --> this.adicionar(alunos)
        }
    }

    // -------------------------------
    // FUNCIONALIDADES ----> publicas

    public void adicionar(Aluno aluno) {
        if (aluno == null || alunos.contains(aluno)) { // se for null OU se aluno ja esta na lista de alunos
            return;
        }
        alunos.add(aluno); // adicionar aluna ha lista de alunos
        aluno.adicionar(this); // dizer ao aluno que tem esta aula
    }

    /*public void atribuir(modelo.Professor professor) { // 'atribuir' passa a ser um SET --> setProfessor(Professsor)
    } */

    public void adicionarLinhaSumario(String linha) {
        sumario.append(linha).append("\n");
    }

    //public String getNome(){return nome; }
    //public long getNumero() {return numero; }
    //public void setNumero(long numero) { this.numero = numero; }

    public String getSumario() {
        return sumario.toString();
    }

    // ----- relacionado com modelo.Professor -----
    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        // 'this.professor' é o professor que esta na aula ---- o 'professor' é o que vem por referencia
        if (professor == null || this.professor == professor) { // se o professor for NULL ou ja o professor a inserir é o mesmo
            return;
        }
        if (this.professor != null) { // se  professor for  NAO nULL -- se existe um professor para associar
            this.professor.remover(this);
        }
        // o 'this' referece ah modelo.Aula
        this.professor = professor;
        this.professor.adicionar(this); // dizer ao professor que passa a ter esta aula
    }

    public void desassociarProfessor(){
        if (professor == null) { // caso nao exista professor
            return;
        }
        Professor professorARemover = professor; // criar uma copia do rofessor
        professor = null; // meter a null o professor atual --- antes de remover colocar o professor a null
        professorARemover.remover(this); // remover (a copia) do professor da aula

    }

    // ----- realcionado com Alunos -----        o Adiconar(modelo.Aluno) está lá em cima
    public void remover(Aluno aluno){
        if (aluno == null || !alunos.contains(aluno) ) { // se for NULL ou se aluno nao existe na lista
            return;
        }
        alunos.remove(aluno);
        aluno.remover(this);
    }
    public LinkedList<Aluno> getAlunos() {
        return new LinkedList<>(alunos); // devolver uma copia da lista de alunos
    }


    // -------------------------------------------

    public Horario getHorario() {
        return horario;
    }


    public boolean isSobre(Horario horario){ // saber se um horario esta sobre outro
        return this.horario.isSobre(horario);
    }




}
