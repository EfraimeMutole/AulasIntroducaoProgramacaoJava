package Estrutura_de_Dados.ED20Menu;
import Estrutura_de_Dados.ED01Listas.Aluno;
import Estrutura_de_Dados.ED01Listas.OPeracoesAluno;
import Estrutura_de_Dados.ED01Listas.Validacoes;

public class MenuGeral {
    


    public MenuGeral(){}

    public void menuGeral(){

        try {

              // Variáveis da pessoa
        String nome="";
        int idade =0;
        String email ="";
        String telefone ="";
        String endereco ="";

        // Variáveis do aluno
        String universidade ="";
        String curso ="";
        String matricula ="";
        double nota =0;
        String situacao ="";

        int opcao = 0;
        Validacoes validacoes = new Validacoes();
        OPeracoesAluno operacoesAluno = new OPeracoesAluno();
        //Visualizacoes visualizacoes = new Visualizacoes();
        //Aluno alunos = new Aluno();

            do{

                System.out.println("||======||    Menu de Opções || ==============||");
                System.out.println("|| 01.  Introduzir os dados                   ||");
                System.out.println("|| 02.  Vectores                              ||");
                System.out.println("|| 03.  Listas                                ||");
                System.out.println("|| 04.  Sair                                  ||");
                System.out.println("||============================================||");
                
                opcao = validacoes.validarNumero("");
                switch(opcao){
                    case 1:
                          //alunos.setNome(validacoes.validarString("Insira o nome do aluno: ", 10, 20));
                        nome = validacoes.validarString("Insira o nome do aluno: ", 10, 20);
                        idade = validacoes.validarNumero("Insira a idade do aluno: ");
                        email = validacoes.validarString("Insira o email do aluno: ", 10, 30);
                        telefone = validacoes.validarString("Insira o telefone do aluno:", 10, 15);
                        endereco = validacoes.validarString("Insira o endereco do aluno:", 10,50);
                        universidade = validacoes.validarString("Insira a universidade do aluno:", 5,30);
                        curso = validacoes.validarString("Insira o curso do aluno:", 5,30);
                        matricula = validacoes.validarString("Insira a matricula do aluno:", 5,15);
                        nota = validacoes.validarNumero("Insira a nota do aluno:");
                        situacao = operacoesAluno.situacaoAprovado(nota);
                        break;
                    case 2:
                        Aluno aluno =new Aluno(nome, idade, email, telefone, endereco, universidade, curso, matricula, nota, situacao);
                        MenuVector menuVector = new MenuVector();
                        menuVector.menuVector(aluno);
                        break;
                        
                    case 3:
                         Aluno aLuno =new Aluno(nome, idade, email, telefone, endereco, universidade, curso, matricula, nota, situacao);
                        MenuLista menuLista = new MenuLista();
                        menuLista.menuLista(aLuno);
                        break;
                    case 4:
                        System.out.println("Saindo do programa...");
                        break;
                    default:
                        System.out.println("Opção inválida! Tente novamente.");
                }

            }while(opcao != 4);

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }


    }
}
