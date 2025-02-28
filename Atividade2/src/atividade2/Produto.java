package atividade2;

public class Produto {
    private String nome;
    private double preco;
    
    public Produto(){
         
     }
    
    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }
    
    public void exibir(){
        System.out.println("Nome de produto: " + nome);
        if(preco < 0){
            System.out.println("ERRO! O valor está negativo");
        }else{
        System.out.println("Preço do produto: " + preco);
        }
    }
    
    public String getnome(){
        return nome;
    }
    public void setnome(String nome){
        this.nome = nome;
    }
    
    public double getpreco(){
        return preco;
    }
    public void setpreco(double preco){
        this.preco = preco;
    }
}
