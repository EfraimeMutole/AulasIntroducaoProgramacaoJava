package Basico.Exercicio002_Classe_Vs_Objetos;


public class Caneta {
    
    private String modelo;
    private String cor;
    private double ponta;
    private double carga;
    private boolean tampada;

    public Caneta(){}
    
    public Caneta(String modelo, String cor, double ponta, double carga,boolean tampada){
        this.modelo  = modelo;
        this.cor =cor;
        this.ponta = ponta;
        this.carga= carga;
        this.tampada = tampada;
    }

    public String getModelo(){return this.modelo;}
    public void setModelo(String modelo){ this.modelo = modelo;}

    public String getCor(){ return this.cor;}
    public void setCor(String cor){this.cor = cor;}

    public double getPonta(){return this.ponta;}
    public void setPonta(double ponta){this.ponta = ponta;}

    public double getCarga(){return this.carga;}
    public void setCarga(double carga){this.carga = carga;}

    public boolean getTampada(){return this.tampada;}
    public void setTampada(boolean tampada){ this.tampada=tampada;}

    public String ToString(){
        return "Modelo  da Caneta  : "   + this.modelo  +"\n" +
               "Cor     da Caneta  : "   + this.cor     +"\n" +
               "Ponta   da Caneta  : "   + this.ponta   +"\n" +
               "Carga   da Caneta  : "   + this.carga   +"\n" +
               "Tampada da Caneta  : "   + this.tampada +"\n";
    }
}
