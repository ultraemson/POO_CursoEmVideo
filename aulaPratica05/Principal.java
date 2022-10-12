package aulaPratica05;

/**
 * Principal
 */
public class Principal {

    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(123456);
        p1.setdono("Emson");
        p1.abrirConta("CC");
        p1.depositar(300);
        p1.pagarMensal();
        System.out.println(p1.toString()); 

        System.out.println();
        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(22222);
        p2.setdono("efson");
        p2.abrirConta("CP");
        p2.depositar(300);
        p2.sacar(100);
        System.out.println(p2.toString()); 

    }
}