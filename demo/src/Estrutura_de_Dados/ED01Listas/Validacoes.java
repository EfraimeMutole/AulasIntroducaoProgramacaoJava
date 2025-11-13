package Estrutura_de_Dados.ED01Listas;
import java.io.*;

public class Validacoes {
    
    public Validacoes(){}

    BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));

    public String validarString(String mensagem, int min, int max){
        String mensagem2 ="";
        boolean valido = false;
        do{

            try {
            
                System.out.println(mensagem);
                mensagem2 = leitor.readLine();
                if(mensagem2!=null && mensagem2.length()>=min && mensagem2.length()<=max){
                    valido = true;
                }else{
                    System.out.println("Mensagem invalida! A mensagem deve ter entre "+min+" e "+max+" caracteres.");
                }
           } catch (Exception e) {
            System.out.println(e.getMessage());
          }
        }while(!valido);
        
        return mensagem2;
    }

    public int validarNumero(String mensagem){
        int numero = 0;
        boolean valido = false;
        do{

            try {
            
                System.out.println(mensagem);
                numero = Integer.parseInt(leitor.readLine());
                valido = true;
           } catch (Exception e) {
            System.out.println("Opcao invalida! Digite um numero inteiro.");
          }
        }while(!valido);
        
        return numero;
    }

}
