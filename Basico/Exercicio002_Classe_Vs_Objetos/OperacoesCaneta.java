package Basico.Exercicio002_Classe_Vs_Objetos;

public class OperacoesCaneta {
    
    Caneta caneta = new Caneta();

    public void escrever(){
        if(caneta.getTampada()==false){
            System.out.println("A caneta nao esta tampada, entao podemos escrever");
        }else{
            System.out.println("A caneta esta tampada entao nao podemos escrever");
        }
    }

    public void guardarInformacaoCaneta(String modelo, String cor, double ponta, double carga,boolean tampada){
        caneta.setModelo(modelo);
        caneta.setCor(cor);
        caneta.setPonta(ponta);
        caneta.setCarga(carga);
        caneta.setTampada(tampada);
    }

    public void visualizarInformacoes(){
        System.out.println(caneta.ToString());
    }
}
