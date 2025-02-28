package atividade10;

public class Atividade10 {
    
    public static void main(String[] args) {
        Carro carro1 = new Carro("Camaro", "Chevrolet", 1995);
        carro1.exibir();
        System.out.println("Marca: " + carro1.getMarca());
        System.out.println("Modelo: " + carro1.getModelo());
        carro1.setMarca("Fiat");
        carro1.setModelo("Strada");
        carro1.exibir();
    }
    
}
