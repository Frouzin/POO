package applicationElevator;

public class Elevador {
    private int codigo;
    private int pessoasTransportadas;
    private int limitePesooas;
    private String status;

    void cadastraElevador(int codigo) {
        this.codigo = codigo;
        this.limitePesooas = 8;
        this.pessoasTransportadas = 0;
        this.status = "Em operação";
    }
    int consultaPessoasTransportadas() {
        return this.pessoasTransportadas;
    }

    void registraEntrada(int qtdePessoas) {
        this.pessoasTransportadas += qtdePessoas;
        if (this.pessoasTransportadas > this.limitePesooas) {
            this.status = "Bloqueado";
        }
    }

    void registraSaida(int qtdePessoas) {
        this.pessoasTransportadas -= qtdePessoas;
        if (this.pessoasTransportadas <= this.limitePesooas) {
            this.status = "Em Operação";
        }

    }
    public int getCodigo(){
        return codigo;
    }

    public int getLimitePesooas() {
        return limitePesooas;
    }
    public int getPessoasTransportadas(){
        return pessoasTransportadas;
    }
    public void setStatus(String novoStatus){
        this.status = novoStatus;
    }
    public String getStatus(){
        return status;
    }

}

