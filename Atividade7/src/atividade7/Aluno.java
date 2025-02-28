package atividade7;

public class Aluno extends Pessoa{
    
    public Aluno(){
        this.idade = 27;
    }
    
    public void exibir(){
        System.out.println("A idade do aluno é: " + idade);
    }
    
    public int getIdade(){
         return idade;
     }
    public void setIdade(int idade){
        this.idade = idade;
    }
}
