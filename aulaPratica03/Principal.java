package aulaPratica03;

public class Principal {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "BIC Cristal";
        c1.cor = "Vermelha";
        //c1.ponta = 0.5f;
        c1.carga = 50;//pode utilizar o metodo carga pq esta dentro do pacote aulaPratica03
        c1.tampada = true;
        c1.status();
        c1.rabisca();
    }
}
