package Estrutura_de_Dados.ED20Menu;
import Estrutura_de_Dados.ED01Listas.Aluno;
import Estrutura_de_Dados.ED01Listas.OPeracoesAluno;
import Estrutura_de_Dados.ED01Listas.Validacoes;
public class MenuLista {


    public MenuLista(){}

    public void menuLista(Aluno aluno){

        try {

            Validacoes validacoes = new Validacoes();
            OPeracoesAluno operacoesAluno = new OPeracoesAluno();
            int opcao = 0;

            do{

                System.out.println("||=============== ||  Menu Lista  || =================||");
                System.out.println("|| 01. Inserir elemento no início da lista            ||");
                System.out.println("|| 02. Inserir elemento no final da lista             ||");
                System.out.println("|| 03. Inserir elemento em qualquer lugar da lista    ||");
                System.out.println("|| 04. Remover elemento do início da lista            ||");
                System.out.println("|| 05. Remover elemento do final da lista             ||");
                System.out.println("|| 06. Remover elemento em qualquer lugar da lista    ||");
                System.out.println("|| 07. Exibir elementos qualquer da lista             ||");
                System.out.println("|| 08. Exibir elementos da lista                      ||");
                System.out.println("|| 09. Sair                                           ||");
                System.out.println("======================================================||");
                
                opcao = validacoes.validarNumero("");

                switch(opcao){
                    case 1:    
                        operacoesAluno.adicionarQualquerAluno(aluno);
                        break;

                    case 2:
                        System.out.println("Opção 2 selecionada.");
                        break;
                    case 3:
                        System.out.println("Opção 3 selecionada.");
                        break;
                    case 4:
                        System.out.println("Opção 4 selecionada.");
                        break;
                    case 5:
                        System.out.println("Opção 5 selecionada.");
                        break;
                    case 6:
                        System.out.println("Saindo do menu...");
                        break;
                    case 7:
                        System.out.println("Saindo do menu...");
                        break;
                    case 8:
                        operacoesAluno.visualizar();
                         //visualizacoes.exibirAluno();
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }
            }while(opcao!=9);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
