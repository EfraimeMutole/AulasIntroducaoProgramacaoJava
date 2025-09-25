package Excercicio1;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Validacoes {

   BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

   public String validarString(){


    String mensagem = "";
    boolean valido = false;

    do{

        try{

            
            mensagem = reader.readLine();
            if(mensagem!=null && mensagem.length()>=3){

                valido = true;
            }else{
                System.out.println("Mensagem invalida! A mensagem deve ter pelo menos 3 caracteres e conter apenas letras.");
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }while(!valido);
     
      return mensagem;
   }

   public int validarOpcao(){
      int numero = 0;
        try{
            numero = Integer.parseInt(reader.readLine());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
      return numero;
   }
}
