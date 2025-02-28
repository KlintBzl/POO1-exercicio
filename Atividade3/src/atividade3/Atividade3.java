package atividade3;


public class Atividade3 {

    
    public static void main(String[] args) {
        contaBancaria conta1 = new contaBancaria("José Bezerra", 2500);
        conta1.exibirDados();
        conta1.sacar(3000);
        conta1.sacar(2000);
        conta1.depositar(500);
    }
    
}
