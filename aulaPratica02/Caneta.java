package aulaPratica02;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    void status(){
        System.out.println("Modelo: "+ this.modelo);
        System.out.println("Ponta: "+ this.ponta);
        System.out.println("Carga da caneta: " + this.carga + "%");
        System.out.println("Uma caneta "+ this.cor);
        System.out.println("Esta tampada? "+ this.tampada);
    }

    void rabisca(){
        if(this.tampada == true){
            System.out.println("Erro! caneta tampada");
        }else{
            System.out.println("Estou rabiscando");
        }
    }
    void tampar(){
        this.tampada = true;
    }
    void destampar(){
        this.tampada = false;
    }
}
