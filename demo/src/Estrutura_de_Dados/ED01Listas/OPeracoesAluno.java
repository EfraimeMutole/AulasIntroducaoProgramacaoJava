package Estrutura_de_Dados.ED01Listas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OPeracoesAluno implements InterfaceRepositorioAluno {

    public OPeracoesAluno(){}
 
    private List<Aluno> listaAlunos = new ArrayList<>();

    @Override
    public void adicionarQualquerAluno(Aluno aluno){
        listaAlunos.add(aluno);
    }

    public void adicionarAlunoPosicao(int posicao, Aluno aluno){
        listaAlunos.add(posicao, aluno);
    }

    public Aluno pegarAluno(int posicao){
        return listaAlunos.get(posicao);
    }

    public void removerAluno(int posicao){
        listaAlunos.remove(posicao);
    }

    public String situacaoAprovado(double nota){
        if(nota >= 7){
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }

    public boolean existiAluno(Aluno aluno){
        return listaAlunos.contains(aluno);
    }
        
    public int tamanho(){
        return listaAlunos.size();
    }
          
    public void visualizar(){


        for(int i=0;i<tamanho();i++){
            System.out.println(listaAlunos.get(i) +"\n");
        }
       /* 
        for(Aluno aluno : listaAlunos){
            System.out.println(aluno);
        }*/
    }
    public String toString(){
        return Arrays.toString(listaAlunos.toArray());
    }

}
    
