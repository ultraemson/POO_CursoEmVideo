package aulaPratica07;

public class Lutador {
    //atributios
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    //métodos especiais
    public Lutador() {
        this.nome="-----";
        this.nacionalidade="desconhecida";
        this.idade = 0;
        this.altura = 0;
        this.peso = 0;
        this.vitorias = 0;
        this.derrotas = 0 ;
         this.empates = 0;
    }
   
    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso,
            int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        //this.peso = peso;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }
    //métodos get's e set's
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNacionalidade() {
        return nacionalidade;
    }
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria(categoria);
    }
    public String getCategoria() {
        return categoria;
    }

    private void setCategoria(String categoria) {
        
        if(this.peso < 52.2){
            this.categoria = "Grilo";
        }
        else if(this.getPeso() <= 70.3f){
            this.categoria = "Leve";
        }
        else if(this.getPeso() <= 83.9f){
            this.categoria = "Médio";
        }
        else if(this.getPeso() <= 120.2f){
            this.categoria = "Pesado";
        }
        else {
            this.categoria = "Inválido";
        }

    }
    public int getVitorias() {
        return vitorias;
    }
    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }
    public int getDerrotas() {
        return derrotas;
    }
    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }
    public int getEmpates() {
        return empates;
    }
    public void setEmpates(int empates) {
        this.empates = empates;
    }


    //metodos publicos 
    public void apresenta(){
        System.out.println("**************************************************");
        System.out.println("CHEGOU A HORA! PRESENTAMOS O Lutador: "+this.getNome());
        System.out.print("Diretamente de "+this.getNacionalidade());
        System.out.print(" com "+this.getIdade()+" anos ");
        System.out.println(this.getAltura()+"m de altura");
        System.out.println("Pesando: "+this.getPeso()+" KG");
        System.out.println("Vitorias:"+this.getVitorias());
        System.out.println("Derrotas: "+this.getDerrotas());
        System.out.println("Empates: "+this.getEmpates());
        System.out.println("**************************************************");
    }
    public void status(){
        System.out.println("**************************************************");
        System.out.println(this.getNome() + " é peso " + this.getCategoria());
        System.out.println("Ganhou "+this.getVitorias()+" vezes");
        System.out.println("Perdeu "+this.getDerrotas()+" vezes");
        System.out.println("Empatou "+this.getEmpates()+" vezes");
        System.out.println("**************************************************");
    }
    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
    }
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
    }
    public void empatarLuta(){
        this.setEmpates(this.getEmpates() + 1);
    }
}
