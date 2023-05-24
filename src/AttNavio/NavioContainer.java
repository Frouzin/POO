package AttNavio;

public class NavioContainer extends Navio {
    private int quantidadeGuindaste;


    private int quantidadeCamadas;

    public NavioContainer(int id, String nome,double capacidadeCarga,int quantidadePoroes, int quantidadeGuindaste, int quantidadeCamadas) {
        super(id, nome, capacidadeCarga, quantidadePoroes);
        this.quantidadeCamadas = quantidadeCamadas;
        this.quantidadeGuindaste = quantidadeGuindaste;
    }

    public int getQuantidadeGuindaste() {
        return quantidadeGuindaste;
    }

    public int getQuantidadeCamadas() {
        return quantidadeCamadas;
    }
    public void setQuantidadeGuindaste(int quantidadeGuindaste) {
        this.quantidadeGuindaste = quantidadeGuindaste;
    }

    public void setQuantidadeCamadas(int quantidadeCamadas) {
        this.quantidadeCamadas = quantidadeCamadas;
    }
}
