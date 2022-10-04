package atividade01;

public class Monitor {
    boolean tela;
    String cor;
    float modelo;
    String marca;

    void status(){
        System.out.println("A tela esta "+this.tela);
        System.out.println("A cor do monitor é "+this.cor);
        System.out.println("O modelo do monitor é "+this.modelo);
        System.out.println("A marca do monitor é "+this.marca);
    }

    void ligar(){
        this.tela = true;
    }
    void desligar (){
        this.tela = false;
    }
    void statusTela(){
        if(this.tela == true){
            System.out.println("Seu monitor está ligado.");
        }else {
            System.out.println("Seu monitor está desligado.");
        }
    }
    void escreve(){
        if(this.tela == true){
            System.out.println("Monitor desponivel pra digitação");
        }else{
            System.out.println("Monitor indesoponivel para digitação");
        }
    }

}
