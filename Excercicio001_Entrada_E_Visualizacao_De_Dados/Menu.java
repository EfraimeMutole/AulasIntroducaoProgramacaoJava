package Excercicio001_Entrada_E_Visualizacao_De_Dados;
public class Menu {
    
    public void menu(){


        Validacoes validacoes = new Validacoes();
        Visualizacoes visualizacoes = new Visualizacoes();
        int opcao = 0;
        String mensagem="";
        int numero=0;
        do{

            try{

                System.out.println("||==================Menu===================||");
                System.out.println("|| 01.  Introduzir Mensagem                ||");
                System.out.println("|| 02.  Introduzir um Numero               ||");
                System.out.println("|| 03.  Visualizar Mensagem                ||");
                System.out.println("|| 04.  Visualizar Numero                  ||");
                System.out.println("|| 05.  Sair                               ||");
                System.out.println("||=========================================||");
                opcao = validacoes.validarOpcao();
                switch (opcao){
                    case 1:
                        System.out.println("Introduza uma mensagem:");
                        mensagem = validacoes.validarString();
                        break;
                    case 2:
                    numero = validacoes.validarOpcao();
                        break;
                    case 3:
                         visualizacoes.exibirMensagem(mensagem);
                        break;
                    case 4:
                       visualizacoes.exibirNumero(numero);
                       break;
                    case 5:
                       System.out.println("Volte sempre!");
                                                            
                }
                
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }while(opcao!=5);
        
    }
}
