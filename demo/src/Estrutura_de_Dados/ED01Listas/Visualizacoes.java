package Estrutura_de_Dados.ED01Listas;

public class Visualizacoes {
    
    public Visualizacoes(){}

    OPeracoesAluno operacoesAluno =new OPeracoesAluno();

    public void exibirAluno(){

        for(int i=0; i<operacoesAluno.tamanho(); i++){
            System.out.println(operacoesAluno.toString());
        }
    }
}
