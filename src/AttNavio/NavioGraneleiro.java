package AttNavio;

public class NavioGraneleiro  extends Navio {
    private int quantidadeEscotilhas;

    public NavioGraneleiro(int id, String nome, double capacidadeCarga, int quantidadePoroes,int quantidadeEscotilhas) {
        super(id, nome, capacidadeCarga, quantidadePoroes);
        this.quantidadeEscotilhas = quantidadeEscotilhas;
    }

    public int getQuantidadeEscotilhas() {
        return quantidadeEscotilhas;
    }

    public void setQuantidadeEscotilhas(int quantidadeEscotilhas) {
        this.quantidadeEscotilhas = quantidadeEscotilhas;
    }

}
