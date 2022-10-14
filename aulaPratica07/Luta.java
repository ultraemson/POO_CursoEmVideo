package aulaPratica07;

public class Luta {
    private String desafiante;
    private String desafiando;
    private int rounds;
    private boolean aprovada;

    public Luta() {
    }
    public Luta(String desafiante, String desafiando, int rounds, boolean aprovada) {
        this.desafiante = desafiante;
        this.desafiando = desafiando;
        this.rounds = rounds;
        this.aprovada = aprovada;
    }
    public String getDesafiante() {
        return desafiante;
    }
    public void setDesafiante(String desafiante) {
        this.desafiante = desafiante;
    }
    public String getDesafiando() {
        return desafiando;
    }
    public void setDesafiando(String desafiando) {
        this.desafiando = desafiando;
    }
    public int getRounds() {
        return rounds;
    }
    public void setRounds(int rounds) {
        this.rounds = rounds;
    }
    public boolean getAprovada() {
        return aprovada;
    }
    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    //metodos 
    public void marcarLuta(){

    }
    public void lutar(){
        
    }
}
