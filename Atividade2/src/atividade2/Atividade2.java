package atividade2;


public class Atividade2 {

    
    public static void main(String[] args) {
        Produto produto1 = new Produto();
        produto1.setnome("Garrafa");
        produto1.setpreco(-15.99);
        produto1.exibir();
        produto1.setpreco(12.99);
        produto1.exibir();
        
    }
}
