
package Estrutura_de_Dados.Arrays;

public class Aluno extends Pessoa {

    private String universidade;
    private String curso;
    private String matricula;
    private double nota;
    private String situacao;
    

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


}