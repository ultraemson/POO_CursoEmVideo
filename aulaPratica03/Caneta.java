package aulaPratica03;

public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;

    public void status(){
        System.out.println("Modelo: "+ this.modelo);
        System.out.println("Ponta: "+ this.ponta);
        System.out.println("Carga da caneta: " + this.carga + "%");
        System.out.println("Uma caneta "+ this.cor);
        System.out.println("Esta tampada? "+ this.tampada);
    }

    public void rabisca(){
        if(this.tampada == true){
            System.out.println("Erro! caneta tampada");
        }else{
            System.out.println("Estou rabiscando");
        }
    }
    private void tampar(){
        this.tampada = true;
    }
    private void destampar(){
        this.tampada = false;
    }
}
