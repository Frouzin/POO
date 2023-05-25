package AtvConsumo;
import java.util.Date;

public class Consumo {
    private static int contId=0;
    private int idConsumo;
    private Date data;
    private char tipoConsumo;
    private char tipoCliente;
    private double valorConsumo;
    private double valorConta;

    public Consumo(Double valorConsumo,char tipoCliente) {
        super();
        contId++;
        this.idConsumo = contId;
        this.data = new Date();
        this.tipoConsumo = 'P';
        this.valorConsumo = valorConsumo;
        if(tipoCliente == 'A' || tipoCliente == 'F') {
            fechaConta(valorConsumo, tipoCliente);
            this.tipoCliente = tipoCliente;
        }
    }

    public Consumo(  double valorConsumo) {
        contId++;
        this.idConsumo = contId;
        this.data = new Date();
        this.tipoConsumo = 'C';
        this.tipoCliente = 'P';
        this.valorConsumo = valorConsumo;
        fechaConta(valorConsumo);

    }


    public void fechaConta(double valorConsumo) {
        this.valorConta =  valorConsumo + valorConsumo*0.1;


    }


    public void fechaConta(double valorConsumo, char tipoCliente) {


        if(tipoCliente == 'F')
        {
            this.tipoCliente = 'F';
            this.valorConta = valorConsumo - 10.00;

        }
        else if(tipoCliente == 'A' && valorConsumo <= 30) {
            this.valorConta = valorConsumo - 3.00;
            this.tipoCliente = 'A';
        }
        else if(tipoCliente == 'A' && valorConsumo > 30) {
            this.valorConta = valorConsumo - 5.00;
            this.tipoCliente = 'A';
        }

    }

    public int getIdConsumo() {
        return idConsumo;
    }

    public Date getData() {
        return data;
    }

    public double getValorConsumo() {
        return valorConsumo;
    }

    public double getValorConta() {
        return valorConta;
    }

    public char getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(char tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public char getTipoConsumo() {
        return tipoConsumo;
    }

    public void setTipoConsumo(char tipoConsumo) {
        this.tipoConsumo = tipoConsumo;
    }

    @Override
    public String toString() {
        return "ID do Consumo: " + idConsumo + "\nData: " + data + "\nTipo de Consumo: " + tipoConsumo +
                "\nTipo de Cliente: " + tipoCliente + "\nValor do Consumo: " + valorConsumo +
                "\nValor da Conta: " + valorConta;
    }
}

