package atividade3;

public class contaBancaria {
    public String titular;
    private double saldo;
    
    public contaBancaria (String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
    }
    
    public void exibirDados (){
        System.out.println("O titular da conta se chama: " + titular);
        System.out.println("O saldo disponível é: R$" + saldo);
        System.out.println("======================================================");
    }
    
    public void sacar(double valorSaque){
        if(saldo >= valorSaque){
        saldo -= valorSaque;
            System.out.println("Saldo total: " + saldo);
            System.out.println("------------------------------------------------------");
        }else{
            System.out.println("Erro!!! Saldo insuficiente para saque!");
            System.out.println("Saldo total: " + saldo);
            System.out.println("------------------------------------------------------");
        }
    }
    
    public void depositar(double valorDeposito){
        saldo += valorDeposito;
        System.out.println("Saldo total: " + saldo);
        System.out.println("------------------------------------------------------");
    }
    
    public double getSaldo(){
         return saldo;
     }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    
    public String getTitular(){
        return titular;
    }
    
    public void setTitular(String titular){
        this.titular = titular;
    }
}
