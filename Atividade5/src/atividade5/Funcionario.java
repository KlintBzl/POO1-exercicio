package atividade5;

public class Funcionario {
    private String nome;
    private double salario;
    
    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }
    
    public void exibir(){
        System.out.println("Nome: " + nome);
        System.out.println("Salário: " + salario);
    }
    
    public String getNome(){
         return nome;
     }
    public void setNome( String nome){
        this.nome = nome;
    }
    
    public  double getSalario(){
        return salario;
    }
    
    public void setTitular(double salario){
        this.salario = salario;
    }
}
