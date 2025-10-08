package Basico.Exercicio002_Classe_Vs_Objetos;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Validacoes {
    
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    //Metodo para validar textos introduzidos do teclado
    public String validarString(String mensagem1){
        String mensagem="";
        boolean valido = false;

        do{
            try {
                  System.out.println(mensagem1);
                  mensagem = bf.readLine();
                  if(mensagem!=null && mensagem.length()>=3){
                      valido = true;
                  }else{
                     System.out.println("Entrada invalida");
                  }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }while(!valido);
        return mensagem;
    }

    public int validarNumero(String mensagem){
        int numero=0;
        try {
            System.out.println(mensagem);
            numero = Integer.parseInt(bf.readLine());
        } catch (Exception e) {
            
            System.out.println(e.getMessage());
        }
        return numero;
    }

    public boolean validarBoolean(String mensagem){
        String tampada;
        boolean tampada1;
        
            System.out.println(mensagem);
            tampada = validarString("Sim ou Nao");
            if(tampada == "Sim"){
                tampada1= true;
            }else{
                tampada1 = false;
            }
       
        return tampada1;
    }
}
