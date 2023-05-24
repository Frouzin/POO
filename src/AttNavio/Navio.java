package AttNavio;

public abstract class Navio {
    private int id;
    private String nome;
    private int quantidadePoroes;
    private double capacidadeCarga;
    private String disponibilidade;

    public Navio(int id, String nome,double capacidadeCarga,int quantidadePoroes) {
        this.id = id;
        this.nome = nome;
        this.quantidadePoroes = quantidadePoroes;
        this.capacidadeCarga = capacidadeCarga;
        this.disponibilidade = "vazio";

    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidadePoroes() {
        return quantidadePoroes;
    }

    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public String getDisponibilidade() {
        return disponibilidade;
    }
    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQuantidadePoroes(int quantidadePoroes) {
        this.quantidadePoroes = quantidadePoroes;
    }

    public void setCapacidadeCarga(double capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    public void  iniciarCarregamento(String disponibilidade) {
        this.disponibilidade = "carregando";
    }
    public void bloqueiaCarregamento(String disponibilidade) {
        this.disponibilidade = "Lotado";
    }
}
