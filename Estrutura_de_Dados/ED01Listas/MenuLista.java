package Estrutura_de_Dados.ED01Listas;

public class MenuLista {


    public MenuLista(){}

    public void menuOpcoes(){

        // Variáveis da pessoa
        String nome;
        int idade;
        String email;
        String telefone;
        String endereco;

        // Variáveis do aluno
        String universidade;
        String curso;
        String matricula;
        double nota;
        String situacao;

        int opcao = 0;
        Validacoes validacoes = new Validacoes();
        OPeracoesAluno operacoesAluno = new OPeracoesAluno();
        Aluno alunos = new Aluno();

        try {
            do{

                System.out.println("\n----- Menu de Opções -----");
                System.out.println("1 - Inserir elemento no início da lista");
                System.out.println("2 - Inserir elemento no final da lista");
                System.out.println("3 - Inserir elemento em qualquer lugar da lista");
                System.out.println("4 - Remover elemento do início da lista");
                System.out.println("5 - Remover elemento do final da lista");
                System.out.println("6 - Remover elemento em qualquer lugar da lista");
                System.out.println("7 - Exibir elementos qualquer da lista");
                System.out.println("7 - Exibir elementos da lista");
                System.out.println("8 - Sair");
                System.out.print("Escolha uma opção: ");
                
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
                        situacao = operacoesAluno.situacaoAprovado(alunos);
                        alunos = new Aluno(nome, idade, email, telefone, endereco, universidade, curso, matricula, nota, situacao);
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
                        System.out.println("Saindo do menu...");
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
