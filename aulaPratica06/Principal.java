package aulaPratica06;

public class Principal {
    public static void main(String[] args) {
        ControleRemoto c = new ControleRemoto();
        c.play();
        c.maisVolume();
        c.abrirMenu();
        c.fechaMenu();
        System.out.println(c.toString());
    }
}
