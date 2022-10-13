package aulaPratica06;

//implementando a interface da Classe Controlador
public class ControleRemoto implements Controlador {
    //atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;
    //Métodos Especiais
     public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }
    private int getVolume() {
        return volume;
    }
   
    private void setVolume(int volume) {
        this.volume = volume;
    }
    public boolean getLigado() {
        return ligado;
    }
    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
    public boolean getTocando() {
        return tocando;
    }
    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
    //******************************************************** */
    //sobrescrevento Métodos abstratos
    @Override
    public String toString() {
        return "ControleRemoto [volume=" + volume + ", ligado=" + ligado + ", tocando=" + tocando + "]";
    }
    @Override
    public void ligar() {
        // TODO Auto-generated method stub
        //passando verdadeiro pra ligar o controle
        this.setLigado(true);
        
    }
    @Override
    public void deligar() {
        // TODO Auto-generated method stub
        //passando falso pra desligar o controle
        this.setLigado(false);
    }
    @Override
    public void abrirMenu() {
        // TODO Auto-generated method stub
        System.out.println("******************************");
        System.out.println("Esta ligado: "+getLigado());
        System.out.println("Está tocando? "+getTocando());
        System.out.println("Volume: "+this.getVolume());
        for(int i = 0; i <= this.getVolume(); i += 10){
            System.out.print(" | ");
        }
        System.out.println("\n******************************");
    }
    @Override
    public void fechaMenu() {
        // TODO Auto-generated method stub
        System.out.println("Fechando Menu");
    }
    @Override
    public void maisVolume() {
        // TODO Auto-generated method stub
        if(this.getLigado()){
            this.setVolume(this.getVolume() + 5);
        }
    }
    @Override
    public void menosVolume() {
        // TODO Auto-generated method stub
        if(this.getLigado()){
            this.setVolume((this.getVolume() - 5 ));
        }
    }
    @Override
    public void ligarMundo() {
        // TODO Auto-generated method stub
        if(this.getLigado() && this.getVolume() > 0){
            this.setVolume(0);
        }
    }
    @Override
    public void desligarMudo() {
        // TODO Auto-generated method stub
        if(this.getLigado() && this.getVolume() == 0){
            this.setVolume(50);
        }
    }
    @Override
    public void play() {
        // TODO Auto-generated method stub
        //!(informação) = não
        if(this.getLigado() && !(this.getTocando())){
            this.setTocando(true);
        }
    }
    @Override
    public void pause() {
        // TODO Auto-generated method stub
        if(this.getLigado() && this.getTocando()){
            this.setTocando(false);
        }
    }
   
}
