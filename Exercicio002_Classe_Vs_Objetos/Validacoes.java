package Exercicio002_Classe_Vs_Objetos;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Validacoes {
    
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    //Metodo para validar textos introduzidos do teclado
    public String validarString(){
        String mensagem="";
        boolean valido = false;

        do{
            try {
                  mensagem = bf.readLine();
                  if(mensagem!=null && mensagem.length()>=10){
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

    public double validarNumero(){
        double numero=0;
        try {
            numero = Double.parseDouble(bf.readLine());
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
        return numero;
    }
}
