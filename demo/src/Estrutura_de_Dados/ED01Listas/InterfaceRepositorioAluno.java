package Estrutura_de_Dados.ED01Listas;


public interface InterfaceRepositorioAluno {


    public void adicionarQualquerAluno(Aluno aluno);

    public void adicionarAlunoPosicao(int posicao, Aluno aluno);

    public Aluno pegarAluno(int posicao);

    public void removerAluno(int posicao);

    public String situacaoAprovado(double nota);

    public boolean existiAluno(Aluno aluno);
        
    public int tamanho();
            
    public void visualizar();

    public String toString();

} 