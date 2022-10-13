package aulaPratica06;

public class Principal {
    public static void main(String[] args) {
        //criando um construtor vazio do tipo ControleRemoto
        ControleRemoto c = new ControleRemoto();
        //acessando com o objeto c da classe ControleRemoto
        c.play();
        c.maisVolume();
        c.abrirMenu();
        c.fechaMenu();
    }
}
