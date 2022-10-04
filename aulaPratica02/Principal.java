package aulaPratica02;

public class Principal {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.carga = 50;
        c1.modelo = "Bic";
        c1.tampar();
        c1.status();
        c1.rabisca();

        System.out.println("------------------------------------------------");
        
        Caneta c2 = new Caneta();
        c2.cor = "Azul";
        c2.ponta = 1.0f;
        c2.carga = 100;
        c2.modelo = "Brisanet";
        c2.destampar();
        c2.status();
        c2.rabisca();
    }
}
