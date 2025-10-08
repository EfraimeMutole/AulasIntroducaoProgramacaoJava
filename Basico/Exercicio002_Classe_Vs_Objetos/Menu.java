package Basico.Exercicio002_Classe_Vs_Objetos;

public class Menu {
    public Menu(){}
    int opcao=0;
    String modelo;
    String cor;
    double ponta;
    double carga;
    boolean tampada;

    public void  MenuE(){

        Validacoes vl = new Validacoes();
        OperacoesCaneta opc = new OperacoesCaneta();
        do{

            try {
                
                System.out.println("||========================Menu=====================||");
                System.out.println("|| 01. Introduza os dados da caneta                ||");
                System.out.println("|| 02. Veja se podes ecrever ou nao                ||");
                System.out.println("|| 03. Visualizar os dados da caneta               ||");
                System.out.println("|| 04. Sair do programa                            ||");

                opcao= vl.validarNumero("");
                switch(opcao){
                    case 1:
                           modelo = vl.validarString("Introduza o modelo da caneta");
                           cor=vl.validarString("Introduza a cor da caneta");
                           ponta = vl.validarNumero("Introduza o tamanho da ponta da caneta");
                           carga = vl.validarNumero("Introduza a carga da caneta");
                           tampada= vl.validarBoolean("A caneta esta tampada? Sim/Nao");
                           opc.guardarInformacaoCaneta(modelo, cor, ponta, carga, tampada);
                        break;
                    case 2:
                          opc.escrever();
                        break;
                    case 3:
                          opc.visualizarInformacoes();
                        break;
                    case 6:
                        System.out.println("Volte sempre");
                    
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }while(opcao!=6);
    }
    


}
