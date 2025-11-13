package Estrutura_de_Dados.ED01Listas;

public class Aluno extends Pessoa {

    private String universidade;
    private String curso;
    private String matricula;
    private double nota;
    private String situacao;
    

    public Aluno(){

    }
    
    public Aluno(String nome, int idade, String email, String telefone, String endereco, 
    String universidade, String curso, String matricula, double nota, String situacao) {
        
        super(nome, idade, email, telefone, endereco);

        this.universidade= universidade;
        this.curso = curso;
        this.matricula = matricula;
        this.nota = nota;
        this.situacao = situacao;
    }

    public String getUniversidade(){ return this.universidade;}
    public void setUniversidade(String universidade){ this.universidade = universidade;}

    public String getCurso(){ return this.curso;}
    public void setCurso(String curso){ this.curso = curso;}

    public String getMatricula(){ return this.matricula;}
    public void setMatricula(String matricula){ this.matricula = matricula;}

    public double getNota(){ return this.nota;}
    public void setNota(double nota){ this.nota = nota;}
    
    public String getSituacao(){ return this.situacao;}
    public void setSituacao(String situacao){ this.situacao = situacao;}


    public String toString() {
        return "Aluno{"                                  +  "\n"  +
                "Nome         : " + getNome()            +  "\n"  +
                "Idade        : " + getIdade()           +  "\n"  +
                "E-mail       : " + getEmail()           +  "\n"  +
                "Telefone     : " + getTelefone()        +  "\n"  +
                "Endereco     : " + getEndereco()        +  "\n"  +
                "Universidade : " + getUniversidade()    +  "\n"  +
                "Curso        : " + getCurso()           +  "\n"  +
                "Matricula    : " + getMatricula()       +  "\n"  +
                "Nota         : " + getNota()            +  "\n"  +
                "Situacao     : " + getSituacao()        +  "\n"  +
                '}';
    }
}