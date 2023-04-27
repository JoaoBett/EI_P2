package modelo;

import java.util.LinkedList;

public class Aula extends Identificador{

    private StringBuilder sumario;
    private Professor professor;
    private LinkedList<Aluno> alunos;

    private Horario horario;

    private Sala sala;


    public Aula(String nome, long numero, Horario horario, Sala sala) { // ALT + INSERT  // -------- aula passa a ter um horario na sua criacao
        this(nome, numero, horario, null, new LinkedList<>(), sala); // vai chamar o construtor abaixo
    }

    public Aula(String nome, long numero, Horario horario, Professor professor, LinkedList<Aluno> alunos, Sala sala) { // -> é o construtor mais geral
        super(nome, numero);
        this.sumario = new StringBuilder();
        this.horario = horario; // ---------------------------------- new horario
        this.professor = professor;   //setProfessor(professor);
        this.alunos = new LinkedList<>(); // copia da lista de alunos
        for (Aluno aluno : alunos) {
            adicionar(aluno); // é o mesmo que --> this.adicionar(alunos)
        }
        sala = null;
    }

    public void adicionar(Aluno aluno) {
        if (aluno == null || alunos.contains(aluno)) { // se for null OU se aluno ja esta na lista de alunos
            return;
        }
        alunos.add(aluno); // adicionar aluna ha lista de alunos
        aluno.adicionar(this); // dizer ao aluno que tem esta aula
    }

    public Sala getSala(){
        return sala;
    }

    public void setSala(Sala sala) {
        if (sala == null || this.sala == sala){
            return;
        }
        if (this.sala != null){
            this.sala.remover(this);
        }
        this.sala = sala;
        sala.adicionar(this);
    }

    public void desassociarSala(){
        if (sala == null){
            return;
        }
        Sala salaARemover = sala;
        sala = null;
        salaARemover.remover(this);
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

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        if (professor == null || this.professor == professor) { // se o professor for NULL ou ja o professor a inserir é o mesmo
            return;
        }
        if (this.professor != null) { // se  professor for  NAO nULL -- se existe um professor para associar
            this.professor.remover(this);
        }
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

    public Horario getHorario() {
        return horario;
    }


    public boolean isSobre(Horario horario){ // saber se um horario esta sobre outro
        return this.horario.isSobre(horario);
    }

    public void setSala(Sala sala) {
        if (sala == null || this.sala == sala) { // se o professor for NULL ou ja o professor a inserir é o mesmo
            return;
        }
        if (this.sala != null) { // se  professor for  NAO nULL -- se existe um professor para associar
            this.sala.remover(this);
        }
        this.sala = sala;
        this.sala.adicionar(this); // dizer ao professor que passa a ter esta aula
    }

    public void desassociarSala(){
        if (sala == null) { // caso nao exista professor
            return;
        }
        Sala salaARemover = sala; // criar uma copia do rofessor
        sala = null; // meter a null o professor atual --- antes de remover colocar o professor a null
        salaARemover.remover(this); // remover (a copia) do professor da aula

    }
}
