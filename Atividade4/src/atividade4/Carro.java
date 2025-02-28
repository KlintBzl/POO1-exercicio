package atividade4;

public class Carro extends Veiculo{
    
    public Carro(){
        this.velocidadeMaxima = 100;
    }
    
    public void exibir(){
        System.out.println("Velocidade máxima: " + velocidadeMaxima);
    }
    public double getVelocidadeMaxima(){
         return velocidadeMaxima;
     }
    public void setVelocidadeMaxima(int velocidadeMaxima){
        this.velocidadeMaxima = velocidadeMaxima;
    }
}
