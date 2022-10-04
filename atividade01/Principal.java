package atividade01;

public class Principal {
    public static void main(String[] args) {
        Monitor m = new Monitor();
        m.cor = "Preto";
        m.marca = "Positivo";
        m.modelo = 15000.0f;
        m.tela = false;
        m.statusTela();
        m.status();
        m.escreve();
        System.out.println("--------------------------------");
        Monitor m1 = new Monitor();
        m1.cor = "Branco";
        m1.marca = "Samsung";
        m1.modelo = 22220.5f;
        m1.tela = true;
        m1.statusTela();
        m1.status();
        m1.escreve();
    }
}
