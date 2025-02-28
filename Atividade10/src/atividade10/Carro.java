package atividade10;

public class Carro {

    private String modelo, marca;
    public int ano;
    
    public Carro(String modelo, String marca, int ano){
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
    }
    public void exibir(){
        System.out.println("------------------------------------------------------------------");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        if(ano < 1886){
            System.out.println("ERRO! ERRO! ERRO! ERRO!");
            System.out.println("O ano do carro data de antes da data do primeiro automóvel");
            System.out.println("==================================================================");
        }else{
            System.out.println("Ano: " + ano);
            System.out.println("==================================================================");
        }
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    public int getAno(){
         return ano;
     }
    public void setAno( int ano){
        this.ano = ano;
    }
    
}
