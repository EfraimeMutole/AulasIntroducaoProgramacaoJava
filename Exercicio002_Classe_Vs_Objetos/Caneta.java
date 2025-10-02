package Exercicio002_Classe_Vs_Objetos;

public class Caneta {
    
    private String modelo;
    private String cor="";
    private double ponta;
    private int carga;
    private boolean tampada;

    public Caneta(String modelo, String cor, double ponta, int carga,boolean tampada){
        this.modelo  = modelo;
        this.cor =cor;
        this.ponta = ponta;
        this.carga= carga;
        this.tampada = tampada;
    }

    public String getModelo(){return this.modelo;}
    public void setModelo(String modelo){ this.modelo = modelo;}
}
