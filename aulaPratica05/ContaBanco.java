package aulaPratica05;



public class ContaBanco {
    public int numConta;
    protected String tipoConta;
    private String dono;
    private float saldo;
    private boolean status;

    public ContaBanco() {
        this.saldo = 0;
        this.status = false;
    }
 
    public int getNumConta() {
        return numConta;
    }
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
    public String getTipoConta() {
        return tipoConta;
    }
    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }
    public String getdono() {
        return dono;
    }
    public void setdono(String dono) {
        this.dono = dono;
    }
    public float getSaldo() {
        return saldo;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    public boolean getStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
    //Métodos Personalisados
    public void abrirConta(String tipoConta){
        this.setTipoConta(tipoConta);
        this.setStatus(true);
        if(tipoConta == "CC"){
            this.setSaldo(50);
        }
        else if(tipoConta == "CP"){
            this.setSaldo(150);
        }
        else{
            System.out.println("Tipo de conta inválida");
        }
    }

    public void fecharConta(){
        if(this.getSaldo() > 0){
            System.out.println("Conta com dinherio.");
        }
        else if(this.getSaldo() < 0 ){
            System.out.println("Conta negativada.");
        }
        else{
            this.setStatus(false);
        }
    }

    public void depositar(float saldo){
        if(this.getStatus()){
            this.setSaldo(this.getSaldo()+saldo);
        }
        else{
            System.out.println("Impossivel depositar.");
        }
    }

    public void sacar(float saldo){
        if(this.getStatus()){
            if(this.getSaldo() >= saldo){
                this.setSaldo(this.getSaldo() - saldo);
                System.out.println("Saque realizado na conta de "+this.getdono());
            }
            else {
                System.out.println("Saldo insuficiente.");
            }
        }
    }

    public void pagarMensal(){

        float valorMensal = 0;

        if(this.tipoConta == "CC"){
            valorMensal = 12;
        }
        else if(this.tipoConta == "CP"){
            valorMensal = 20;
        }
        
        if(this.getStatus()){
            if(this.getSaldo() > valorMensal){
                this.saldo -= valorMensal;
                System.out.println("mensalidade paga com sucesso");
            }
            else{
                System.out.println("Saldo Insuficiente.");
            }
        }
    }

    @Override
    public String toString() {
        return "Conta [numConta=" + numConta + "\ntipoConta=" + tipoConta + "\ndono=" + dono + "\nsaldo=" + saldo
                + "\nstatus=" + status + "]";
    }

}







